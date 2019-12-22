import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.nextLine();
        int num1 = Integer.parseInt(num,2);
        System.out.print(num1);

    }
}