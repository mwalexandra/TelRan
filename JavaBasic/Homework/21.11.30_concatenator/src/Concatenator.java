public interface Concatenator {

    /**
     * The method cocatenates all the elements from "strings"
     * @param strings a String array to concatenate
     * @return concatanated string
     */
    String concatenate(String[] strings);

    //TODO implement this interface 4 ways: 
    //1. with strings, 
    // 2. with stringbuilder, 
    // 3. with stringbuffer, 
    //4. using char array whose length is the total lenth of all the strings in the String array
    // The implementation should create a char array of the total length, then one by one copy every string into this array.
    // After that create a result string based on this array.
}
