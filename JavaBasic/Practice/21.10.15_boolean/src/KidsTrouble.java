public class KidsTrouble {

    public static void main(String[] args) {
        System.out.println(kidsTrouble(true, true)); 
        System.out.println(kidsTrouble(false, false)); 
        System.out.println(kidsTrouble(true, false));
    }

    static boolean kidsTrouble (boolean PetyaSmile, boolean VasyaSmile) {
        // return PetyaSmile && VasyaSmile || !PetyaSmile && !VasyaSmile;
        // return !(PetyaSmile^VasyaSmile);
        return PetyaSmile == VasyaSmile;
    }
    
}
