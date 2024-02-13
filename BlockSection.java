import java.util.*;

public class BlockSection {

    private String blockCode;
    private String description;
    private String adviser;
    private Integer totalStudents;
    private List<Student> studentList;

    // SETTERS
    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public void setTotalStudents(Integer totalStudents) {
        this.totalStudents = totalStudents;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    //GETTERS
    public String getBlockCode() {
        return blockCode;
    }

    public String getDescription() {
        return description;
    }

    public String getAdviser() {
        return adviser;
    }

    public Integer getTotalStudents() {
        return totalStudents;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    //PRINT
    public void printStudent() {
        for (Student student : getStudentList()){
             System.out.println("\nStudent number: " + student.getStudentNumber() +
                        "\nStudent name: " + student.getName() +
                        "\nProgram: " + student.getProgram() +
                        "\nTotal units enrolled: " + student.getTotalUnitsEnrolled());
             student.printCourse();
        }
    }
}
