import java.util.HashMap;
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

        for (String string : keys) {

            // if (jsonMap.get(string) instanceof Map) { проверка вложенности
            // Map<String, Object> map = jsonMap.get(string);
            // keysToCamelCase(map);
            // }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '_') {
                    char upperCase = Character.toUpperCase(string.charAt(++i));
                    sb = sb.append(upperCase);
                } else
                    sb = sb.append(string.charAt(i));
            }
            res.put(sb.toString(), jsonMap.get(string));
        }
        return res;
    }
}
