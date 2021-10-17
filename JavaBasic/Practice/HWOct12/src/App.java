public class App {
    public static void main(String[] args) {
        // 1. Напишите программу для подсчета периметра и площади круга. 
        //Задайте значение радиуса в программе и выведите на экран значение периметра и площади. 
        //Периметр и радиус задайте как тип double. Что будет если изменить тип на float?
            System.out.println(getCircleArea(2.68));
            System.out.println(getCircumference(12.13));
        // Напишите программу для перевода градусов по фаренгейту в шкалу цельсия. Задайте переменные типа double. С=5*(F-32)/9
            System.out.println(reverseToGrad(145));
        //Напишите программу для перевода дюймов в метры. Один дюйм это 0.0254 метра
            System.out.println(reverseToGrad(609));
    }

    static double getCircleArea (double radius) {
        final double Pi = Math.PI;
        return Pi * radius * radius;
    }
    static double getCircumference (double radius) {
        final double Pi = Math.PI;
        return (Pi * radius * 2); 
    }

    static double reverseToGrad(double far) {
        return (far - 32) * 5 / 9;
    }

    static double reverseToMeter (double inch) {
        return inch * 0.0254;
    }
}
