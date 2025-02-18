package _6_class_components._2_methods.mvc;

public class CourseMgmtApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.addCourse(null);
        courseController.updateCourse(null);
        courseController.deleteCourse(null);
        courseController.getCourse(1);
    }
}
