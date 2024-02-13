import java.util.List;

public class Student {

    private String studentNumber;
    private String name;
    private String program;
    private Integer totalUnitsEnrolled;
    private List<Course> courseList;

    //SETTERS
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public void setTotalUnitsEnrolled(Integer totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //GETTERS
    public String getStudentNumber() {
        return studentNumber;
    }
    public String getName() {
        return name;
    }
    public String getProgram() {
        return program;
    }
    public Integer getTotalUnitsEnrolled() {
        return totalUnitsEnrolled;
    }
    public List<Course> getCourseList() {
        return courseList;
    }

    //PRINT
    public void printCourse() {
        System.out.println("\nCourse code \tDescription \t\t\tUnits \tDay \tTime");
        for (Course course: getCourseList()){
            System.out.println(course.getCourseCode() +"\t" +
                            course.getDescription() + " \t\t" +
                            course.getUnit() + " \t" +
                            course.getDay() + " \t" +
                            course.getTime());
        }
    }
}
