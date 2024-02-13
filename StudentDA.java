import java.io.*;
import java.util.*;

public class StudentDA {

    private List<Student> studentList;
    public List<Student> getStudentList() {
        return studentList;
    }
    public StudentDA(String blockCode) throws FileNotFoundException{
        studentList = new ArrayList<>();

        Scanner studentInfoFile = new Scanner(new FileReader("studentInfo.csv"));
        while (studentInfoFile.hasNext()) {
            String studentInfoRaw = studentInfoFile.nextLine();
            String[] studentInfoArray = new String[3];
            studentInfoArray = studentInfoRaw.split(",");

                if (studentInfoArray[0].trim().equals(blockCode)){
            Student student = new Student();
            student.setStudentNumber(studentInfoArray[1].trim());
            student.setName(studentInfoArray[2]);
            student.setProgram(studentInfoArray[0]);

            CourseDA courseDA = new CourseDA(student.getStudentNumber());
                    Integer totalUnits = 0;
                    for(Course course: courseDA.getCourseList()){
                        totalUnits += course.getUnit();
                        student.setTotalUnitsEnrolled(totalUnits);
                    }

            student.setCourseList(courseDA.getCourseList());
            studentList.add(student);
                }
        } studentInfoFile.close();
    }
}
