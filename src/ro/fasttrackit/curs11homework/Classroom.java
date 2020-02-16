package ro.fasttrackit.curs11homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        StudentGrade studentGrade = new StudentGrade(null, null, 0);
        for (StudentGrade elem : classroom) {
            if (elem.getGrade() > studentGrade.getGrade()) {
                studentGrade = elem;
            }
        }
        return studentGrade;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade studentGrade = new StudentGrade(null, null, 0);
        for (StudentGrade elem : classroom) {
            if (elem.getDiscipline().equals(discipline)) {
                if (elem.getGrade() > studentGrade.getGrade()) {
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
        StudentGrade studentGrade = new StudentGrade(null, null, Integer.MAX_VALUE);
        for (StudentGrade elem : classroom) {
            if (elem.getDiscipline().equals(discipline)) {
                if (elem.getGrade() < studentGrade.getGrade()) {
                    studentGrade = elem;
                }
            }
        }
        return studentGrade;
    }

    public List<StudentGrade> getClassroom() {
        return classroom;
    }

    public void getLetters() throws IOException {
        for (StudentGrade studentGrade : classroom) {
            LetterToStudents.letter(studentGrade);
        }
    }
}
