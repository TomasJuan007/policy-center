package com.github.tomasjuan007.policycenter.vo.lane;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pattern {
    String name;
    String val;
    String op;
}
