package gtp4o.task62;

import org.json.JSONObject;

public class Task62_OPENAI_gpt_4o {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";
        
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject.toString());
    }
}