
import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        System.out.println("ведите имя");



        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        System.out.println("ведите город");
        String town = sc.nextLine();


        System.out.println("ведите возраст");
        int age = sc.nextInt();

        System.out.println("Имя:      "+name);
        System.out.println("Город:    "+town);
        System.out.println("Возраст:  "+age);







    }
}