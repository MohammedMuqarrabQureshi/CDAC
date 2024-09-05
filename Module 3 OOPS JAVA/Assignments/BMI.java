import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if(bmi < 18.5) {
            System.out.println("You are underweight.");
        }else if (bmi >= 18.5 && bmi <24.9) {
            System.out.println("You are a normal weight");
        }else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight");
        }else if(bmi >=30 && bmi < 34.5) {
            System.out.println("You are in Obese class I");
        }else if(bmi >= 35 && bmi <39.9) {
            System.out.println("You are in Obese class II");            
        }else {
            System.out.println("You are in Obesity class III");
        }
        scanner.close();

    }
}