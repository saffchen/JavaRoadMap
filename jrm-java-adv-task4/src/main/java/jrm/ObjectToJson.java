package jrm;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJson {
    public String convertToJson(Object o){
        try {
            return getJsonToString(o);
        } catch (Exception e){
            throw new RuntimeException("converting has been broken");
        }
    }
    private String getJsonToString(Object o){
        Class<?> clas = o.getClass();
        Map<String, String> jsonElements = new HashMap<>();
        for (Field field : clas.getDeclaredFields()){
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)){
                jsonElements.put();
            }
        }
    }
}
