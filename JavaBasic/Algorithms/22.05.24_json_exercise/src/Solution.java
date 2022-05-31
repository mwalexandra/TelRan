import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    // Есть Map<String, Object>, олицетворяющий json.
    // То есть, значениями может быть либо число, либо строка, либо булеан, либо
    // другой Map<String, Object>.
    // Известно, что ключи оформлены в виде snake case, то есть "first_key".
    // Необходимо переделать этот мап таким образом, чтобы ключи стали camelCase.
    // Подсказка:
    // надо проверять велью, являются ли они Map, в этом случае рекурсивно вызвать
    // функцию для него

    public Map<String, Object> keysToCamelCase(Map<String, Object> jsonMap) {
        Map<String, Object> res = new HashMap<>();

        Set<String> keys = jsonMap.keySet();

        for (String key : keys) {

            String newKey = snakeToCamel(key);
            Object value = jsonMap.get(key);

            res.put(newKey, transformValue(value));
        }
        return res;
    }

    List<Object> transformListValue(List<Object> value) {
        List<Object> res = new ArrayList<>();
        for (Object obj : value) {
            res.add(transformValue(obj));
        }
        return res;
    }

    String snakeToCamel(String snake_case) {
        StringBuilder sb = new StringBuilder();

        int length = snake_case.length();

        for (int i = 0; i < length; i++) {
            if (snake_case.charAt(i) == '_') {
                char upperCase = Character.toUpperCase(snake_case.charAt(++i));
                sb = sb.append(upperCase);
            } else
                sb = sb.append(snake_case.charAt(i));
        }
        return sb.toString();
    }

    Object transformValue(Object value) {
        if (value instanceof Map) {
            return keysToCamelCase((Map) value);
        } else if (value instanceof List) {
            return transformListValue((List) value);
        } else {
            return value;
        }
    }
}