
import java.util.ArrayList;
import java.util.Scanner;

public class Tree { // class

    public static void main(String[] args) throws Exception { // psv ����� �����
        String S = "^";
        //int height = 40;
        int otstup = 1;
        String Array[];


        System.out.println("������� ������ ��� :  ");
        Scanner sc = new Scanner(System.in);
        int height;
        if(sc.hasNextInt()) {
            height = sc.nextInt();
              if (height>0){
				  
            // ������ � ��������
            Array = new String[height+1];
            for (int k = 0; k < height+1; k++){        //���������� ������� ���������
                Array[k] = " "; }

            // �������� ����� ������ ������ �� �������

            for (int i = height; i > 0; i--) {
                for (int j = 0; j <= height; j++)

                {   Array[height-otstup] ="";
                    Array[height] = "";//������ ��������� ������� ����������
                    System.out.print(Array[j]);
                }

                otstup++;

                if (otstup <= height + 1) {
                    System.out.print(S);
                    S = S + "^" + "^";
                    System.out.println();
                }
                else System.out.println("������");
            }
              
			  } else {System.out.println("������ �����");}
        }
        else {
            System.out.println("������ �����");
        }


    }   //psv �����


} // class