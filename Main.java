/* Описать неизменяемый класс (Неизменяемость должна сохранятся при любых обстоятельствах) */
public class Main {
    public static void main(String[] args) {
        var myCat = new Cat("Васька", 5);

        myCat.sayHi();
    }
}