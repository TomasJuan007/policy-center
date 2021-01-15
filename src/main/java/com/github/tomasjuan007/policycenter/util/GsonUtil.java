package com.github.tomasjuan007.policycenter.util;

import com.google.gson.*;

public class GsonUtil {
    private static final Gson GSON;
    private static final Gson GSON_NULL;

    static {
        GSON = new GsonBuilder().enableComplexMapKeySerialization()
                .registerTypeAdapter(Double.class, (JsonSerializer<Double>) (src, type, context) -> {
                    if (src == src.longValue()) {
                        return new JsonPrimitive(src.longValue());
                    }
                    return new JsonPrimitive(src);
                })
                .setLongSerializationPolicy(LongSerializationPolicy.DEFAULT)
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .disableHtmlEscaping()
                .serializeNulls()
                .create();
        GSON_NULL = new GsonBuilder().enableComplexMapKeySerialization().create();
    }

    private GsonUtil() {}

    public static String gsonString(Object object) {
        return GSON.toJson(object);
    }
}
