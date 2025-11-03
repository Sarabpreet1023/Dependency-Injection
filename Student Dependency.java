public class Student {
    private Course course;

    // Constructor injection
    public Student(Course course) {
        this.course = course;
    }

    public void displayCourse() {
        System.out.println("Enrolled Course: " + course.getCourseName());
    }
}
