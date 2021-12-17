import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(moveTheFirstChar("Hello"));
        System.out.println(moveTheLastChar("Hello"));
        System.out.println(deleteDuplicatesChars("Hello"));
        System.out.println(isMoved("Hello", "lohel"));
        System.out.println(isMoved("Hello", "lehlo"));
        System.out.println(isAnagramm("Hello", "lohel"));
        System.out.println(isAnagramm("Hello", "leklo"));
    }

    // 1. переставить первую букву в конец строки (abcd -> bcda)
    public static String moveTheFirstChar(String str){
        // char first = str.charAt(0);

        // char[] chars = new char[str.length()]; 
        // for (int i = 0; i < chars.length - 1; i++) {
        //     chars[i] = str.charAt(i + 1);
        // }
        // chars[chars.length - 1] = first;
        // return str = new String (chars);

        // другое решение
        String newString = str.substring(1);
        String firstPart = str.substring(0, 1);

        return newString + firstPart;
    }

    // 2. переставить последнюю букву в начало строки (abcd-> dabc)
    public static String moveTheLastChar(String str){
        String newString = str.substring(0, str.length() - 1);
        String firstPart = str.substring(str.length() - 1);

        return firstPart + newString;
    }

    // 3. написать метод, возвращающий массив char содержащий содержимое строки
    static char[] charFromString (String str){
        return str.toCharArray();
    }

    // 4. удалить из строки повторяющиеся буквы
    static String deleteDuplicatesChars(String str) {
        char[] chars = str.toCharArray();
        String res = "";

        for (int i = 0; i < chars.length; i++) {
            if(res.indexOf(chars[i]) == -1)
                res += chars[i];
        }
        return res;
    }

    // 5. написать метод, проверяющий образована ли строка сдвигом букв (abc->cab)
    // abc - cab -bca
    static boolean isMoved(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        int length = str1.length();
        if(length == 0) return true;

        for (int i = 0; i < length; i++) {
            if(str1.equalsIgnoreCase(shiftedString(str2, i))) {
                return true;
            }
        }
        return false;
    }

    private static String shiftedString(String str2, int shift) {
        return str2.substring(shift) + str2.substring(0, shift);
    }

    // или
    static boolean isMoved2 (String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        String str = str1.concat(str1);
        return str.contains(str2);
    }

    // 6. написать метод, проверяющий являются ли одна строка анаграммой другой - женя ежня

    static boolean isAnagramm(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();    

        for (int i = 0; i < str1.length(); i++) {
            if(str2.indexOf(str1.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    static boolean isAnagramm2(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();  
        
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] != chars2[i])
                return false;
        }
        return true;
    }
}
