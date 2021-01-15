package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.vo.lane.Conclusion;
import com.github.tomasjuan007.policycenter.vo.lane.Pattern;
import com.github.tomasjuan007.policycenter.vo.lane.Rule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RuleFlowServiceLaneImpl extends AbstractRuleFlowService implements RuleFlowLaneService {
    private List<TbRule> ruleList;

    @Override
    public void setRuleList(List<TbRule> ruleList) {
        this.ruleList = ruleList;
    }

    @Override
    public Conclusion getConclusion(Map<String, String> facts) {
        List<Rule> hitList = new ArrayList<>();
        List<Rule> missList = new ArrayList<>();
        List<Pattern> ruleHitList = new ArrayList<>();
        List<Pattern> ruleMissList = new ArrayList<>();
        long i = 0;
        long j = 0;
        boolean miss = false;
        for (TbRule tbRule : ruleList) {
            j++;
            if (0 == tbRule.getLvl()) {
                long ruleCount = (tbRule.getRgt() - tbRule.getLft() + 1) / 2;
                i++;
                Rule rule = Rule.builder().name(tbRule.getName()).val(tbRule.getVal()).build();
                if (i == ruleCount) {
                    rule.setPatternList(new ArrayList<>(ruleHitList));
                    hitList.add(rule);
                } else {
                    rule.setPatternList(new ArrayList<>(ruleMissList));
                    missList.add(rule);
                }
                ruleHitList.clear();
                ruleMissList.clear();
                i = 0;
                j = 0;
                miss = false;
            } else {
                if (miss) {
                    continue;
                }
                if (i >= j) {
                    continue;
                }
                String op = tbRule.getOp();
                String name = tbRule.getName();
                String val = tbRule.getVal();
                boolean status = doOperate(facts, name, val, op);
                long subRuleCount = (tbRule.getRgt() - tbRule.getLft() + 1) / 2 + tbRule.getLvl() - 1;
                if (status) {
                    ruleHitList.add(Pattern.builder().name(tbRule.getName()).val(tbRule.getVal()).op(tbRule.getOp()).build());
                    i += subRuleCount;
                } else {
                    ruleMissList.add(Pattern.builder().name(tbRule.getName()).val(tbRule.getVal()).op(tbRule.getOp()).build());
                }
                if (!status && subRuleCount == (tbRule.getRgt() - tbRule.getLft() + 1) / 2) {
                    miss = true;
                }
            }
        }
        return Conclusion.builder().missList(missList).hitList(hitList).build();
    }
}
