package jrm;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class ObjectToJson {
    public String convertToJson(Object o) {
        try {
            return getJsonToString(o);
        } catch (Exception e) {
            throw new RuntimeException("converting has been broken");
        }
    }

    private String getJsonToString(Object o) throws Exception {
        Class<?> clas = o.getClass();
        Map<String, String> jsonElements = new HashMap<>();
        for (Field field : clas.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElements.put(getKey(field), String.valueOf(field.get(o)));
            }
        }
        StringJoiner joiner = new StringJoiner(",");
        for (Map.Entry<String, String> entry : jsonElements.entrySet()) {
            String s = "\"" + entry.getKey() + "\":" +
                    "" + entry.getValue() + "\"";
            joiner.add(s);

        }
        String jsonString = joiner.toString();
        return "{" + jsonString + "}";
    }

    private String getKey(Field field) {
        JsonElement jsonElement = field.getAnnotation(JsonElement.class);
        String key = jsonElement.key();
        if (key.equals("")) {
            return field.getName();
        } else {
            return key;
        }
    }
}
