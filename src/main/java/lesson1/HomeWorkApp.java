package lesson1;


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        heckSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void heckSumSign() {
        int a = 5;
        int b=-1;
        int c = a + b;
        System.out.println("c =" + c);
        if (c >= 0) System.out.println("Сумма положительная");
        if (c < 0) {
            System.out.println("Сумма отрицательная");

        }
    }
    public static void printColor(){
        int value = 50;
        if (value <=0){
            System.out.println("Green");
        }
        if (value > 0 && value <=100){
            System.out.println("Blue");
        }
        if(value >100){
            System.out.println("Yellow");
        }

    }
    public static void compareNumbers(){
        int a=10, b=7;
        if (a>=b){
            System.out.println("a>=b");
        }
        if (a<b){
            System.out.println("a<b");
        }
    }
}
