public class ConcatenationTester {

    /**
     * The method test the performance of concatenation using "concatenator", adding the "string" "number" times to itself
     *
     * @param concatenator - the way (implementation) to test performance with
     * @param string       to concatenate
     * @param number       times to concatenate
     * @return the time taken for the concatenation with "concatenator"
     */

    public long test(Concatenator concatenator, String string, int number){
        long currentTimeMillis = System.currentTimeMillis();
        String[] strings = composeStrings(string, number);
        return System.currentTimeMillis() - currentTimeMillis;
    }

    private String[] composeStrings(String string, int number) {
        String[] newStringArray = new String[number];
        for (int i = 0; i < number; i++) {
            newStringArray[i] = string;
        }
        return newStringArray;
    }
}
