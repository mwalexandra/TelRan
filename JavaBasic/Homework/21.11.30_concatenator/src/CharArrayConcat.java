public class CharArrayConcat implements Concatenator {

    @Override
    public String concatenate(String[] strings) {
    //4. using char array whose length is the total lenth of all the strings in the String array
    // The implementation should create a char array of the total length, then one by one copy every string into this array.
    // After that create a result string based on this array.
        int totalCharNumber = 0;
        for (int i = 0; i < strings.length; i++) {
            totalCharNumber += strings[i].length();
        }

        char[] charArray = new char[totalCharNumber];
        int numOfChars = 0;

        for (int i = 0; i < strings.length; i++) {
            char[] tempCharArray = strings[i].toCharArray();
            for (int j = 0; j < tempCharArray.length; j++) {
                charArray[numOfChars + j] = tempCharArray[j];
            }
            numOfChars += (tempCharArray.length - 1);
        }
        return charArray.toString();
    }
    
}
