import java.io.*;

public abstract class LetterToStudents {

    public static void letter(StudentGrade studentGrade) throws IOException {
        String filename = studentGrade.getName() + ".result";
        String str;
        BufferedWriter writer =new BufferedWriter(new FileWriter(filename));
        if (studentGrade.getGrade() > 4) {
            str =String.format("Dear %s you have passed the exam for %s receiving the grade %d\n" +
                    "\n" +
                    "Regards,\n" +
                    "\n" +
                    "Your teacher.",studentGrade.getName(),studentGrade.getDiscipline(),studentGrade.getGrade());
        }else {
            str =String.format("Dear %s you have failed the exam for %s receiving the grade %d\n" +
                    "\n" +
                    "Regards,\n" +
                    "\n" +
                    "Your teacher.",studentGrade.getName(),studentGrade.getDiscipline(),studentGrade.getGrade());
        }
        writer.write(str);
        writer.close();
    }
}
