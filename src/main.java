import java.util.Scanner;
import java.util.Random;

public class main{
    public static void main(String[] args) {
        uwu u = new uwu();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int comp = rand.nextInt(1,3);
            for (int i = 1; i <= 5; i++) {
                u.display();
                System.out.print("User input: ");
                int input = scan.nextInt();
                u.compare(input, comp);
            }
    }
}


