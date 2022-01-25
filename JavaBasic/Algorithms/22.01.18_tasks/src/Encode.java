public class Encode {
    public String encode(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                res[i] = i;

            }
        }

        return res.toString();
    }

    // public String decode(String str) {

    // }
}
