package com.github.tomasjuan007.policycenter.strategy.bitmap;

import com.github.tomasjuan007.policycenter.strategy.OpStrategy;
import org.roaringbitmap.longlong.Roaring64NavigableMap;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractBitmapOpStrategy implements OpStrategy {

    Roaring64NavigableMap getBitmap(Object val) {
        if (!(val instanceof byte[])) {
            return null;
        }

        DataInputStream dis = new DataInputStream(new ByteArrayInputStream((byte[]) val));
        Roaring64NavigableMap rr = Roaring64NavigableMap.bitmapOf();
        try {
            rr.deserialize(dis);
        } catch (IOException e) {
            return null;
        }
        return rr;
    }

    @Override
    public abstract boolean execute(String myVal, Object val);

    @Override
    public boolean validate(Object val) {
        return true;
    }
}
