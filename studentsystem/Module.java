package studentsystem;
import java.util.Scanner;
import studentsystem.Subject;
/*
 * @author EyaCHAIBNI
*/
public class Module {
    private String name;
    private Subject subject1;
    private Subject subject2;

    public Module(String name, Subject subject1, Subject subject2) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    public void enterScores(Scanner scanner) {
        System.out.println("Enter scores for Module " + name);
        subject1.enterScores(scanner);
        subject2.enterScores(scanner);
    }

    public double calculateAverage() {
        double avgSubject1 = subject1.calculateAverage();
        double avgSubject2 = subject2.calculateAverage();
        return (avgSubject1 + avgSubject2) / 2;
    }
}
