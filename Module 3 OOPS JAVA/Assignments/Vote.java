import java.util.*;

public class Vote {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your Age: ");
    int age = scanner.nextInt();

    if(age >= 18 && age <= 100){
        System.out.println("You are eligible to vote");
    }else{
        System.out.println("You are not eligible to vote.");
    }
    scanner.close();
    }
}