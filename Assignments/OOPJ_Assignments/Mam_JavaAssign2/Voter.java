import java.util.Scanner;
public class Voter{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Age: ");
 int age = scanner.nextInt();
 if ( age >= 18 ){
	 System.out.println("Eligible for voting ");
 }
 else{
	 	 System.out.println("Not eligible to voting ");
  }
 }
} 