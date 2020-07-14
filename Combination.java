import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Combination {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of strings you would like to enter:");

        count = scan.nextInt();
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the Strings one by one:");

        for(int i = 0; i < count; i++) {

            str[i] = scan2.nextLine();
        }

        scan.close();
        scan2.close();

        Arrays.sort(str, Collections.reverseOrder());

        System.out.println(Arrays.toString(str));

        System.out.print("Strings in Sorted Order:");

        for (int i = 0; i <= count - 1; i++) {

            System.out.print(str[i]);
        }
    }
}
