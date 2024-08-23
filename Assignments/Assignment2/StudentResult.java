public class StudentResult {
    public static void main(String[] args) {
        int grade1 = 45; 
        int grade2 = 38;
        int grade3 = 50; 

        int failedSubjects = 0;
        if (grade1 <= 40) {
            failedSubjects++;
 }
        if (grade2 <= 40) {
            failedSubjects++;
 }
        if (grade3 <= 40) {
            failedSubjects++;
 }

        if (failedSubjects == 0) {
            System.out.println("student is passed.");
 }     
        else {
            System.out.println("student is failed in " + failedSubjects + " subject(s).");
  }
 }
}
