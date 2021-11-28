public class App {
    public static void main(String[] args) {
        String str1 = "Hello world one more time";
        String str2 = "Anna";
        String str3 = "Hello, worllod!";

        System.out.println(isPolindrom(str2));
        System.out.println(numberOfPatternInString(str1, "llo"));
        System.out.println(numberOfPatternInString(str3, "llo"));
        System.out.println(stringFromNChars(str1, 13)); // Hello world
        System.out.println(stringFromNChars(str1, 26)); // Hello world one more time
        System.out.println(stringFromNChars(str1, 1)); // First word is bigger than...
    }

// 1. Написать метод, который принимает строку, а возвразает boolean - является ли строка палиндромом 
// (игнорируя регистр). 
// Пример: Алла. "А роза упала на лапу Азора" - не палиндром в рамках указанной задачи. 
// Пробелы не игнорируются. (Использовать метод с урока по развороту строки)
    public static boolean isPolindrom (String str){
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(chars.length - 1 - i);
        }
        String str2 = new String(chars);

        return str.equalsIgnoreCase(str2);
    }

// 2. Написать метод, который принимает строку и паттерн, и возвращает 
//количество вхождений паттерна в строку. Пример: ("Hello world", "l") -> 3
    public static int numberOfPatternInString(String str, String pattern){
        int patternLength = pattern.length();
        int counter = 0;

        while(str.contains(pattern)){
            counter++;
            int index = str.indexOf(pattern);

            str = str.substring(index + patternLength);
        }
        return counter;
    }

    // 3. (*) Дана строка, состоящая только из слов и пробелов, и число N. 
    // Вернуть новую строку максимальной длины, состоящую из начала исходной строки, содержащую ТОЛЬКО слова целиком, 
    // при этом длины не больше чем N. 
    // Пример: (Hello world guys, 8 ) -> Hello. (Hello world guys, 12 ) -> Hello world. (Hello world guys, 16+ ) -> Hello world guys.
    public static String stringFromNChars(String str, int index){
        String newString = "";
        String[] stringArray = str.split(" ");
        int indexWithoutSpaces = index - stringArray.length - 1;

        if(stringArray[0].length() <= indexWithoutSpaces){
            for (int i = 0; i < stringArray.length; i++) {
                if(indexWithoutSpaces >= stringArray[i].length()) {
                    newString = newString.concat(stringArray[i]).concat(" ");
                    indexWithoutSpaces -= stringArray[i].length();
                }    
            }
            return newString;
        }
        return "First word is bigger than " + index + " letters";
    }

}
