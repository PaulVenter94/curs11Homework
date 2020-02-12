import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class MainExtra {
    public static void main(String[] args) throws FileNotFoundException {
        File path = new File("grades.txt");
        Classroom classroom =new Classroom(StudentGrade.getStudents(path));
        System.out.println("Get grades for discipline");
        System.out.println(classroom.getGradesForDiscipline("Mathematics"));
        System.out.println("Get grades for student");
        System.out.println(classroom.getGradesForStudent("Ermingard Tome"));
        System.out.println("Get max grade");
        System.out.println(classroom.getMaxGrade());
        System.out.println("Get max grade discipline");
        System.out.println(classroom.getMaxGrade("Physics"));
        System.out.println("Get average grade");
        System.out.println(classroom.getAverage("Physics"));
        System.out.println("Get worst grade");
        System.out.println(classroom.getWorstGrade("Mathematics"));
    }
}
