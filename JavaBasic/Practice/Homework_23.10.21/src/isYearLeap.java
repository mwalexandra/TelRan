public class isYearLeap {
    public static void main(String[] args) {
        System.out.println(isYearLeap(1653));
    }
    
    static boolean isYearLeap (int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
