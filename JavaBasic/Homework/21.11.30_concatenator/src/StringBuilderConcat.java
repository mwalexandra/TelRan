public class StringBuilderConcat implements Concatenator {

    @Override
    public String concatenate(String[] strings) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            res.append(strings[i]);
        }
        return res.toString();
    }
    
}
