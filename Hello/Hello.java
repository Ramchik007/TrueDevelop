import java.io.*;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("������� ���� ��� :  ");
        Scanner sc = new Scanner(System.in);
        String S;
        if(sc.hasNextLine()) {
            S = sc.nextLine();
            System.out.println("������ " + S + "!");
        }
        else {
            System.out.println("������ �����");
        }
    }


}