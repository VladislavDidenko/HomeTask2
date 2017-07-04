import java.util.Scanner;

/*1. Создать новый проект на своем компе
2. Создать новый проект на GitHub и объеденить проекст локальный с проектом на GitHub
3. Написать программу, которая делает следующее:
3.1 спрашивает у пользователя имя (String)
3.2 спрашивает у пользователя город проживания (String)
3.3 спрашивает у пользователя возраст (int)
3.5 спрашивает у пользователя хобби (String)
3.6 перед каждым вводом данных, программа должна вывести информацию пользователю с требованием ввода соответствующей информации.
3.7 прогрмма выводит красиво оформленно всю информацию о пользователе в трех разных вариантах:*/
public class Homework {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Введите имя:");
       String name = in.nextLine();
       System.out.print("Введите город проживания:");
       String city = in.nextLine();
       System.out.print("Введите хобби:");
       String hobby = in.nextLine();
       System.out.print("Введите возраст:");
       int age = in.nextInt();

       System.out.println("\nВариант 1 (табличный):" + "\nИмя: " + name+ "\nГород:" + city  + "\nВозраст:" + age + "\nХобби:" + hobby);


       System.out.println("\nВариант 2 (текстовый):" + "\nЧеловек по имени " + name + " живет в городе " + city + "\nЭтому человеку " + age +
               " лет и любит он заниматься " + hobby);


       System.out.println("\nВариант 3 (иной):" + '\n' + name + " - имя");
       System.out.println(city + " - город");
       System.out.println(age + " - возраст");
       System.out.println(hobby + " - хобби");


   }
}
