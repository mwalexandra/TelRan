import java.util.Collection;
import java.util.Collections;

public class Encode {
    public String encode(String str) {

        if (str.length() == 0)
            return "";

        int count = 1;
        StringBuilder res = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (count > 1) {
                    res.append(count).append(str.charAt(i - 1));
                    count = 1;
                } else {
                    res.append(str.charAt(i - 1));
                }
            } else {
                count++;
            }
        }
        if (count == 1)
            res.append(str.charAt(str.length() - 1));
        else
            res.append(count).append(str.charAt(str.length() - 1));

        return res.toString();
    }

    public String decode(String str) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digitCounter = 0;
            while (Character.isDigit(str.charAt(i + digitCounter))) {
                digitCounter++;
            }
            if (digitCounter > 0) {
                int charNum = Integer.parseInt(str.substring(i, i + digitCounter));

                i += digitCounter;

                for (int j = 0; j < charNum; j++) {
                    res.append(str.charAt(i));
                }

            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
