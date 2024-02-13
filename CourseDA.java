import java.io.*;
import java.util.*;


public class CourseDA {

    private List<Course> courseList;
    public List<Course> getCourseList() {
        return courseList;
    }

    public CourseDA (String studentNumber) throws FileNotFoundException{
        courseList = new ArrayList<>();

        Scanner scheduleInfoFile = new Scanner(new FileReader("scheduleInfo.csv"));

        while(scheduleInfoFile.hasNext()) {
            String scheduleInfoRaw = scheduleInfoFile.nextLine();
            String[] scheduleInfoArray = new String[6];
            scheduleInfoArray = scheduleInfoRaw.split(",");

            if (scheduleInfoArray[0].trim().equals(studentNumber)) {
                Course course = new Course();
                course.setCourseCode(scheduleInfoArray[1]);
                course.setDescription(scheduleInfoArray[2]);

                Integer unit = Integer.parseInt(scheduleInfoArray[3]);
                course.setUnit(unit);

                course.setDay(scheduleInfoArray[4]);
                course.setTime(scheduleInfoArray[5]);



                courseList.add(course);
            }
        } scheduleInfoFile.close();
    }

}
