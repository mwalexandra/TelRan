public class App {
    public static void main(String[] args) {
        
        Student studentPetya = new Student("Petya", 1);
        Student studentVasya = new Student("Vasya", 2);
        Student studentMasha = new Student("Masha", 3);        
    
        System.out.println(studentPetya.getNumber() + " student is " + studentPetya.getName());
        System.out.println(studentVasya.getNumber() + " student is " + studentVasya.getName());
        System.out.println(studentMasha.getNumber() + " student is " + studentMasha.getName());
    }
}
