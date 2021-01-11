package com.github.tomasjuan007.policycenter.vo.nsm;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RuleNode {
    private Long id;
    private String name;
    private String val;
    private String op;
    private Long lft;
    private Long rgt;
    private Long lvl;
    private List<RuleNode> childNodeList;
}
