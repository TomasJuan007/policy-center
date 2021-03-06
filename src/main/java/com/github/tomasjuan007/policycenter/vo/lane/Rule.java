package com.github.tomasjuan007.policycenter.vo.lane;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rule {
    String name;
    String val;
    List<Pattern> patternList;
}
