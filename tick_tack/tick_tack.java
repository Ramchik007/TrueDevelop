import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;
  
public class tick_tack {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

                                             //объявление переменных для рэндома
        int a = 1;
        int b = 9;
        int program_choice=11;
        //int d = (int) (Math.random()*a + Math.random()*b);

        int Err = 2;                                      //флаги
        int Win1 = 0;
        int Endplace = 0;                                                // переменные выбора игрока и программы
        int user_choice =0;
        //int program_choice =12;

        String user = "";
        String program = "";
        String toint = "";
        //int dlina = toint.length();                                                // инициализация поля-массива , заполнение элементов
        String Array[][];
        Array = new String [5][4];

                                                                        //0я строка
            Array[0][0] = " 1 |";
            Array[0][1] = " 2 |";
            Array[0][2] = " 3 ";
            Array[0][3] = "";
                                                                            //1я строка
            Array[1][0] = "--- ";
            Array[1][1] = "--- ";
            Array[1][2] = "--- ";
            Array[1][3] = "";
                                                                                //2я строка
            Array[2][0] = " 4 |";
            Array[2][1] = " 5 |";
            Array[2][2] = " 6 ";
            Array[2][3] = "";
                                                                                            //3я строка
            Array[3][0] = "--- ";
            Array[3][1] = "--- ";
            Array[3][2] = "--- ";
            Array[3][3] = "";
                                                                                                    //4я строка
            Array[4][0] = " 7 |";
            Array[4][1] = " 8 |";
            Array[4][2] = " 9 ";
            Array[4][3] = "";


                                                //Тело игры :

        while((user_choice != 10)&(Err != 1) & (Win1 != 1)&(Endplace != 1)) {

                                                     //начало цикла игры
                System.out.println("If you want to EXIT press 10 ");
                System.out.println("Your choice: [1-9] :  ");
				System.out.println();
                printArray(Array);
                System.out.println();                                  //тест рандома
                System.out.println("Your choice: ");

                if (sc.hasNextInt()) {
                     user_choice = sc.nextInt();
                     program_choice = (int) (Math.random()*a + Math.random()*b);
                     //toint = toint + Integer.toString(user_choice);

                     //тестовая проверка на совпадение выбора компьютера и пользователя зацикливание программы !!!
                        while (((user_choice == program_choice)|(program_choice==0)|(toint.contains(Integer.toString(program_choice))))&((toint.length()<8))) {
                            program_choice= (int) (Math.random()*a + Math.random()*b);
                            //toint = toint + Integer.toString(program_choice);
                        }

                        //toint = toint + Integer.toString(program_choice);


                        //int dlina = toint.length();
                    //System.out.println(toint.length());                                                    //


                     if (program_choice!= user_choice) {                                                     //часть крестиков
                         if ((user_choice == 1) && (Array[0][0] != " 0 |"))
                         {Array[0][0] = " X |"; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 2) && (Array[0][1] != " 0 |"))
                         {Array[0][1] = " X |"; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 3) && (Array[0][2] != " 0 "))
                         {Array[0][2] = " X "; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 4) && (Array[2][0] != " 0 |"))
                         {Array[2][0] = " X |"; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 5) && (Array[2][1] != " 0 |"))
                         {Array[2][1] = " X |"; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 6) && (Array[2][2] != " 0 "))
                         {Array[2][2] = " X "; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 7) && (Array[4][0] != " 0 |"))
                         {Array[4][0] = " X |"; toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 8) && (Array[4][1] != " 0 |"))
                         {Array[4][1] = " X |";toint = toint + Integer.toString(user_choice);}
                         else if ((user_choice == 9) && (Array[4][2] != " 0 "))
                         {Array[4][2] = " X ";toint = toint + Integer.toString(user_choice);}
                         //экспериментально


                     }
                                            //проверка на переполнение поля понять в какой части разместить



                    //часть ноликов

                    if ((program_choice == 1) && (Array[0][0] != " X |")&&(Array[0][0] != " 0 |"))
                    {Array[0][0] = " 0 |"; toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 2) && (Array[0][1] != " X |")&&(Array[0][1] != " 0 |"))
                    {Array[0][1] = " 0 |"; toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 3) && (Array[0][2] != " X ")&&(Array[0][2] != " 0 "))
                    {Array[0][2] = " 0 "; toint = toint + Integer.toString(program_choice); }
                    else if ((program_choice == 4) && (Array[2][0] != " X |")&&(Array[2][0] != " 0 |"))
                    {Array[2][0] = " 0 |"; toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 5) && (Array[2][1] != " X |")&&(Array[2][1] != " 0 |"))
                    {Array[2][1] = " 0 |"; toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 6) && (Array[2][2] != " X ")&&(Array[2][2] != " 0 "))
                    {Array[2][2] = " 0 ";toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 7) && (Array[4][0] != " X |")&&(Array[4][0] != " 0 |"))
                    {Array[4][0] = " 0 |"; toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 8) && (Array[4][1] != " X |")&&(Array[4][1] != " 0 |"))
                    {Array[4][1] = " 0 |";toint = toint + Integer.toString(program_choice);}
                    else if ((program_choice == 9) && (Array[4][2] != " X ")&&(Array[4][2] != " 0 "))
                    {Array[4][2] = " 0 ";toint = toint + Integer.toString(program_choice);}
                     //else program_choice = (int) (Math.random()*a + Math.random()*b);



                                                                                          // условия победы пользователя
                           if ((Array[0][0]==" X |")&(Array[0][1]==" X |")&(Array[0][2]==" X "))
                           {
                               System.out.println(" Congratulate, you win! ");
                               System.out.println();
                               printArray(Array);
                               Win1 = 1;
                               break;
                           }

                            if ((Array[2][0]==" X |")&(Array[2][1]==" X |")&(Array[2][2]==" X "))
                            {
                                System.out.println(" Congratulate, you win! ");
                                 System.out.println();
                                    printArray(Array);
                                    Win1 = 1;
                                    break;
                             }

                             if ((Array[4][0]==" X |")&(Array[4][1]==" X |")&(Array[4][2]==" X "))
                            {
                                System.out.println(" Congratulate, you win! ");
                                System.out.println();
                                printArray(Array);
                                Win1 = 1;
                                break;
                            }
                            if ((Array[0][0]==" X |")&(Array[2][1]==" X |")&(Array[4][2]==" X "))
                            {
                                System.out.println(" Congratulate, you win! ");
                                System.out.println();
                                printArray(Array);
                                Win1 = 1;
                                break;
                            }
                                   //1-4-7
                            if ((Array[0][0]==" X |")&(Array[2][0]==" X |")&(Array[4][0]==" X |"))
                              {
                                 System.out.println(" Congratulate, you win! ");
                                System.out.println();
                                printArray(Array);
                                Win1 = 1;
                                break;
                                 }
                                 //2-5-8
                            if ((Array[0][1]==" X |")&(Array[2][1]==" X |")&(Array[4][1]==" X |"))
                                 {
                                    System.out.println(" Congratulate, you win! ");
                                    System.out.println();
                                    printArray(Array);
                                     Win1 = 1;
                                     break;
                                 }
                                  //3-6-9

                            if ((Array[0][2]==" X ")&(Array[2][2]==" X ")&(Array[4][2]==" X "))
                                {
                                    System.out.println(" Congratulate, you win! ");
                                    System.out.println();
                                    printArray(Array);
                                    Win1 = 1;
                                    break;
                                }
                                //3-5-7
                            if ((Array[0][2]==" X ")&(Array[2][1]==" X |")&(Array[4][0]==" X |"))
                                {
                                    System.out.println(" Congratulate, you win! ");
                                    System.out.println();
                                    printArray(Array);
                                    Win1 = 1;
                                    break;
                                }

                                                                                                //условия победы компьютера


                    if ((Array[0][0]==" 0 |")&(Array[0][1]==" 0 |")&(Array[0][2]==" 0 "))
                    {
                        System.out.println(" Sorry, you lose ! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }

                    if ((Array[2][0]==" 0 |")&(Array[2][1]==" 0 |")&(Array[2][2]==" 0 "))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }

                    if ((Array[4][0]==" 0 |")&(Array[4][1]==" 0 |")&(Array[4][2]==" 0 "))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }
                    if ((Array[0][0]==" 0 |")&(Array[2][1]==" 0 |")&(Array[4][2]==" 0 "))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }
                    //1-4-7
                    if ((Array[0][0]==" 0 |")&(Array[2][0]==" 0 |")&(Array[4][0]==" 0 |"))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }
                    //2-5-8
                    if ((Array[0][1]==" 0 |")&(Array[2][1]==" 0 |")&(Array[4][1]==" 0 |"))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }
                    //3-6-9

                    if ((Array[0][2]==" 0 ")&(Array[2][2]==" 0 ")&(Array[4][2]==" 0 "))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }
                    //3-5-7
                    if ((Array[0][2]==" 0 ")&(Array[2][1]==" 0 |")&(Array[4][0]==" 0 |"))
                    {
                        System.out.println(" Sorry, you lose! ");
                        System.out.println();
                        printArray(Array);
                        Win1 = 1;
                    }

                    if(toint.length()>8)
                    {
                        Endplace = 1;
                        System.out.println("End of Game - nobody win!!!");
                        break;
                    }

                }

                else {  System.out.println("IO Error , restart program");
                Err = 1; }
            }
                                                                                            //закрытие цикла игры



    }                                                       //закрытие точки входа в программу

                                                            // функция вывода поля-массива
    public static void printArray(String[][] Array) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }
    }                                                           // конец функции вывода массива


}                                                               // закрытие класса
