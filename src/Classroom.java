import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    private List<StudentGrade> classroom;

    public Classroom(List<StudentGrade> classroom) {
        this.classroom = classroom;
    }

    public List<StudentGrade> getGradesForDiscipline(String discipline) {
        List<StudentGrade> newList = new ArrayList<>();
        for (StudentGrade elem : classroom) {
            if (elem.getDiscipline().equals(discipline)) {
                newList.add(elem);
            }
        }
        return newList;
    }

    public StudentGrade getGradesForStudent(String student) {
        for (StudentGrade elem : classroom) {
            if (elem.getName().equals(student)) {
                return elem;
            }
        }
        return null;
    }

    public StudentGrade getMaxGrade() {
        int max = 0;
        StudentGrade studentGrade = new StudentGrade();
        for (StudentGrade elem : classroom) {
            if (elem.getGrade() > max) {
                max = elem.getGrade();
                studentGrade = elem;
            }
        }
        return studentGrade;
    }

    public StudentGrade getMaxGrade(String discipline) {
        int max = 0;
        StudentGrade studentGrade = new StudentGrade();
        for (StudentGrade elem : classroom) {
            if (elem.getDiscipline().equals(discipline)) {
                if (elem.getGrade() > max) {
                    max = elem.getGrade();
                    studentGrade = elem;
                }
            }
        }
        return studentGrade;
    }

    public int getAverage(String discipline) {
        int sum = 0, noOfStuds = 0;
        for (StudentGrade elem : classroom) {
            if (elem.getDiscipline().equals(discipline)) {
                sum += elem.getGrade();
                noOfStuds++;
            }
        }
        return sum / noOfStuds;
    }

    public StudentGrade getWorstGrade(String discipline) {
        int min = Integer.MAX_VALUE;
        StudentGrade studentGrade = new StudentGrade();
        for (StudentGrade elem : classroom) {
            if (elem.getDiscipline().equals(discipline)) {
                if (elem.getGrade() < min) {
                    min = elem.getGrade();
                    studentGrade = elem;
                }
            }
        }
        return studentGrade;
    }

    public List<StudentGrade> getClassroom() {
        return classroom;
    }
}
