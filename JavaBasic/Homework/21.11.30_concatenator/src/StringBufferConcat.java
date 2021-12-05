public class StringBufferConcat implements Concatenator {

    @Override
    public String concatenate(String[] strings) {
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < strings.length; i++) {
            res.append(strings[i]);
        }
        return res.toString();
    }
    
}
