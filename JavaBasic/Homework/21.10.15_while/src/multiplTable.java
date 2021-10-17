public class multiplTable {

    public static void main(String[] args) {
        int a = 1;
        
        while (a < 10) {
            int b = 1;
            while (b < 10) {
                System.out.println(a + "x" + b + "=" + (a*b));
                b++;
            }
            a++;
        }
    } 
}
