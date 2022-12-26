import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 26.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Enter a number :");
        number = inp.nextInt();

        System.out.println("--------------------------------");
        System.out.println("-----Power of 4-----");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println("Power of 4 :" + i);
        }
        System.out.println("--------------------------------");
        System.out.println("-----Power of 5-----");
        for (int j = 1; j <= number; j *= 5) {
            System.out.println("Power of 5 :" + j);
        }
    }
}