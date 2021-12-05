public class StringConcatenator implements Concatenator {

    @Override
    public String concatenate(String[] strings) {
        String resString = "";

        for (int i = 0; i < strings.length; i++) {
            resString = resString.concat(strings[i]);
        }
        return resString;
    }
    
}
