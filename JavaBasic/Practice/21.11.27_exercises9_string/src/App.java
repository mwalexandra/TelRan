public class App {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hell";

        System.out.println(compareTwoStrings(str1, str2));
        System.out.println(isContains(str1, str2));
    }

    // 2. Написать метод, возвращающий character на данной позиции в слове
    public char findAChar (String string, int index) {
        return string.charAt(index);
    }

    // 3. написать метод, сравнивающий две строки лексиграфически, игнорирую регистр (А а).
    // метод возвращает тру если первая строка больше и фолс если нет

    public static boolean compareTwoStrings(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) > 0;
    }

    // 4. написать метод, проверяющий содержит ли строка другую строку Привет - При
    public static boolean isContains(String str, String str2){
        return str.contains(str2);
    }

    // 5. написать метод, проверяющий заканчивается ли строка другой строкой
    public boolean isEndsWith (String str, String endStr) {
        return str.endsWith(endStr);
    }

    // 6. написать метод, возвращающий первые n символов строки . (Привет - При)
    public String startOfTheString(String str, int n) {
        return str.substring(n);
    }

    // 7. то же самое что и 6 задача, но но возвращает заглавными буквами
    public String startOfTheStringInUppercase (String str, int n) {
        return str.substring(n).toUpperCase();
    }

    // 8. написать метод, возвращающий подстроку с 2 по 3 позиции заглавными буквами
    public String substringInUppercase(String str){
        return str.substring(2, 4).toUpperCase();
    }

    // 9 Написать метод, возвращающий строку маленькими буквами
    public String stringInLowercase(String str){
        return str.toLowerCase();
    }

    // 10 Метод, заменяющий все вхождения данного слова в строке на другое слово World Hello World -> Evgeny Hello Evgeny
    public String replaceWord(String str, String regex, String replacement) {
        return str.replaceAll(regex, replacement);
    }
}
