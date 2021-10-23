public class App {
    public static void main(String[] args) {
        System.out.println(vasiaInTrouble(true, 6)); 
        System.out.println(vasiaInTrouble(true, 7)); 
        System.out.println(vasiaInTrouble(false, 6)); 
    }

    static boolean vasiaInTrouble(boolean isLoudMusic, int time) {
        return isLoudMusic && time < 7 || time > 20;
    }

}
