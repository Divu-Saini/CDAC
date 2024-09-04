import java.util.Scanner;
public class BMI{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in m: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
         
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("Category: " + getBMICategory(bmi));

       
        scanner.close();
    }

   
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}