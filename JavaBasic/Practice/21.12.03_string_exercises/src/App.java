public class App {
    public static void main(String[] args) {
        System.out.println(moveTheFirstChar("Hello"));
        System.out.println(moveTheLastChar("Hello"));
        System.out.println(deleteDuplicatesChars("Hello"));
        System.out.println(isMove("Hello", "lohel"));
        System.out.println(isMove("Hello", "lehlo"));
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
    static boolean isMove(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char firstOfStr1 = str1.charAt(0);
        int indexInStr2 = str2.indexOf(firstOfStr1);

        if(indexInStr2 > -1) {
            String newStr2 = str2.substring(indexInStr2) + str2.substring(0, indexInStr2);
            return str1.equals(newStr2);
        }
        return false; 
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
                break;
        }
        return true;
    }
}
