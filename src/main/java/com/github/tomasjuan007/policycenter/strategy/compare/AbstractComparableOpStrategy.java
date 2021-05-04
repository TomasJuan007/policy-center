package com.github.tomasjuan007.policycenter.strategy.compare;

import com.github.tomasjuan007.policycenter.strategy.OpStrategy;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractComparableOpStrategy implements OpStrategy {

    private static final int SUPPORT_VERSION_NUM = 4;

    List<Double> evalList(List<String> values) {
        boolean useVersion = false;
        for (String value : values) {
            useVersion = useVersion || isVersionFormat(value);
        }
        if (useVersion) {
            return values.stream()
                    .map(this::versionEval)
                    .collect(Collectors.toList());
        }
        try {
            return values.stream()
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            return null;
        }
    }

    private boolean isVersionFormat(String myVal) {
        String[] ver = myVal.split("\\.");
        int part = ver.length;
        if (part<=2 || part>SUPPORT_VERSION_NUM) {
            return false;
        }
        for (String v : ver) {
            if (v.length()>2) {
                return false;
            }
        }
        return true;
    }

    double versionEval(String myVal) {
        String[] ver = myVal.split("\\.");
        double sum = 0;
        for (int i=0; i<SUPPORT_VERSION_NUM; i++) {
            int n = 0;
            if (i<ver.length) {
                String num = ver[i];
                n = Integer.parseInt(num);
            }
            sum=n+100*sum;
        }
        return sum;
    }

    @Override
    public abstract boolean execute(String myVal, Object val);

    @Override
    public boolean validate(Object val) {
        if (!(val instanceof String)) {
            return false;
        }
        String value = (String) val;

        //所有字符需要是数字或小数点
        if (!isAllNumericChar(value)) {
            return false;
        }

        //符合数值格式
        try {
            Double.parseDouble((String) val);
            return true;
        } catch (Exception e) {
        }

        //符合版本号格式
        if (isVersionFormat(value)) {
            return true;
        }

        return false;
    }

    private static boolean isAllNumericChar(String cs) {
        if (cs != null && cs.length() != 0) {
            int sz = cs.length();

            for (int i = 0; i < sz; ++i) {
                if (!Character.isDigit(cs.charAt(i)) && cs.charAt(i)!='.') {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
