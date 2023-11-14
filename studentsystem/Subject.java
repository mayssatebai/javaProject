package studentsystem;
import java.util.Scanner;
/*
 * @author chifa
*/

public class Subject {
    private String name;
    private double examScore;
    private double tpScore;

    public Subject(String name) {
        this.name = name;
    }

    public void enterScores(Scanner scanner) {
//note examen   	
        System.out.println("Enter exam score for " + name + ": ");
        examScore = scanner.nextDouble();
//note tp ou ds 
        System.out.println("Enter TP/DS score for " + name + ": ");
        tpScore = scanner.nextDouble();
    }
// moyenne 
    public double calculateAverage() {
        return (examScore + tpScore) / 2;
    }
}