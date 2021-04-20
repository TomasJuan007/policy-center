package com.github.tomasjuan007.policycenter.strategy.bitmap;

import org.roaringbitmap.longlong.Roaring64NavigableMap;

public class BlobNinStrategy extends AbstractBitmapOpStrategy {
    @Override
    public boolean execute(String myVal, Object val) {
        try {
            long myValLong = Long.parseLong(myVal);
            Roaring64NavigableMap rr = getBitmap(val);
            return !rr.contains(myValLong);
        } catch (Exception e) {
            return false;
        }
    }
}
