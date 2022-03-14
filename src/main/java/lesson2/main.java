package lesson2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int intV=11;

        float floatV=9.1f;

        System.out.println(sum1020(intV,floatV));
        trueFalse(intV);
        System.out.println(otrChislo(intV));

        for (int stroka = 0; stroka < 2; stroka +=1){
            System.out.println("число");
            System.out.println("строка");
            stroka += 1;

        }
    }
    public static boolean sum1020(int a, float b){
        if(a + b <10 || a + b >20 ){
            return false;
        }
        return true;
    }

    public static void trueFalse(int a){
        if(a<0){
            System.out.println("Число отрицательное.");
        }
        else {
            System.out.println("Число положительное.");
        }
    }

    public static boolean otrChislo(int a){
        if(a<0){
            return true;
        } else {
            return false;
        }
    }

}




