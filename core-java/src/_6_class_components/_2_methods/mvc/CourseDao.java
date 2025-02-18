package _6_class_components._2_methods.mvc;

public class CourseDao {

    public void addCourse(Course course) {
        System.out.println("course added - course dao");
    }

    public void updateCourse(Course course) {
        System.out.println("course updated - course dao");
    }

    public void deleteCourse(Course course) {
        System.out.println("course deleted - course dao");
    }

    public Course getCourse(int id) {
        Course course = new Course();
        course.id = 101;
        course.name = "Collection";
        System.out.println("course get - course dao");
        return course;
    }
}
