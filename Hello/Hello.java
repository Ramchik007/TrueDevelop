import java.io.*;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Введите Ваше имя :  ");
        Scanner sc = new Scanner(System.in);
        String S;
        if(sc.hasNextLine()) {
            S = sc.nextLine();
            System.out.println("Привет " + S + "!");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }


}