import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")){
            System.out.println("Hello " + name);
        }
    }
}
