public class LoanIssuer {
    
    String name;
    String surname;
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, String surname, boolean isLazy, boolean isKind){
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    // Если работник ленивый, он выдаст кредит в случае, если у клиента зп больше 20000 в год
    // Если работник не ленивый и добрый, то он оформит кредит, если зп больше 20000 и клиенту не больше 70 лет
    // Если работник не ленивый и злой, он выдаст кредит тогда, когда зп больше 20000 и клиенту не больше 50
    public boolean toProvide (LoanUser user){
        if(user.annualSalary < 20000)
            return false;

        if(this.isLazy)    
            return true;

        if(user.age <= 50)
            return true;

        if(this.isKind && user.age <= 70)
            return true;

        return false;
}