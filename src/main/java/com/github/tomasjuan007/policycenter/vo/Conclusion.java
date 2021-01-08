package com.github.tomasjuan007.policycenter.vo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Conclusion {
    List<Rule> hitList;
    List<Rule> missList;
}
