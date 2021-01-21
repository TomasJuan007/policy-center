package com.github.tomasjuan007.policycenter.vo.nsm;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RuleNode {
    private Long id;
    private Long ruleId;
    private String name;
    private String val;
    private String op;
    private Long rgt;
    private Long lvl;
    private Long pid;
    private Boolean status;
}
