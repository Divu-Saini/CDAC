public class DaysOfWeek {
    public static void main(String[] args) {
    int dayNumber = 3; 
     switch(dayNumber) {
            case 1:
                System.out.println("Monday");
                printDayType(dayNumber);
                break;
            case 2:
                System.out.println("Tuesday");
                printDayType(dayNumber);
                break;
            case 3:
                System.out.println("Wednesday");
                printDayType(dayNumber);
                break;
            case 4:
                System.out.println("Thursday");
                printDayType(dayNumber);
                break;
            case 5:
                System.out.println("Friday");
                printDayType(dayNumber);
                break;
            case 6:
                System.out.println("Saturday");
                printDayType(dayNumber);
                break;
            case 7:
                System.out.println("Sunday");
                printDayType(dayNumber);
                break;
            default:
                System.out.println("Invalid input.. Please enter a number between 1 and 7.");
                break;
   }
 }

    
    public static void printDayType(int dayNumber) {
        switch(dayNumber) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5:
                System.out.println("It's a weekday.");
                break;
            case 6: 
            case 7:
                System.out.println("It's a weekend.");
                break;
  }
 }
}
