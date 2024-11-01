import java.util.Scanner;

public class Test{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your favorite color? ");
        String favColor = input.nextLine();
        System.out.println(favColor);
    }
}