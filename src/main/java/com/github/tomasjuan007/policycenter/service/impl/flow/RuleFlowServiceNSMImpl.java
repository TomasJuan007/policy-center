package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.vo.lane.Conclusion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("NSM")
public class RuleFlowServiceNSMImpl extends AbstractRuleFlowService {
    private List<TbRule> ruleList;

    @Override
    public void setRuleList(List<TbRule> ruleList) {
        this.ruleList = ruleList;
    }

    @Override
    public Conclusion getConclusion(Map<String, String> facts) {
        //TODO
        return null;
    }
}
