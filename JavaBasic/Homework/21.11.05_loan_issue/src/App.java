public class App {
    public static void main(String[] args) {
        
        LoanUser youngUser = new LoanUser("Vasya", "Vasin", 25, 40000);
        LoanUser oldUser = new LoanUser("Anatoly", "Tolin", 75, 40000);

        LoanIssuer lazyAndKindIssuer = new LoanIssuer("Maria", "Petrovna", true, true);
        LoanIssuer activeAndKindIssuer = new LoanIssuer("Maria", "Petrovna", false, true);

        System.out.println(lazyAndKindIssuer.toProvide(youngUser)); // the result tells whether the issue provides a loan to the user
        System.out.println(activeAndKindIssuer.toProvide(oldUser));
    }
}
