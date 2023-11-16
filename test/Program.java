package Test;
import studentsystem.Module;
import studentsystem.Student;
import studentsystem.Subject;
import java.util.Scanner;
/*
 * @author rihab
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.println("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student = new Student(studentName, studentId);

        Subject subject1 = new Subject("subject1");
        Subject subject2 = new Subject("subject2");

        Module module = new Module("module1", subject1, subject2);
    

        System.out.println("Enter scores for this module: ");
        module.enterScores(scanner);
      

       
    }
}
