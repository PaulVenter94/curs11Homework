package ro.fasttrackit.curs11homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StudentGrade {
    private final String name;
    private final String discipline;
    private final int grade;


    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }


    public static List<StudentGrade> getStudents(File path) throws FileNotFoundException {
        List<StudentGrade> newList = new ArrayList<>();
        String[] arrString = new String[3];
        String line;
        int grade = 0;
        Scanner scanner = new Scanner(path);
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            arrString = line.split("\\|");
            grade = Integer.parseInt(arrString[2]);
            newList.add(new StudentGrade(arrString[0], arrString[1], grade));
        }
        return newList;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentGrade)) return false;
        StudentGrade that = (StudentGrade) o;
        return getGrade() == that.getGrade() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getDiscipline(), that.getDiscipline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDiscipline(), getGrade());
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}' + "\n";
    }
}

