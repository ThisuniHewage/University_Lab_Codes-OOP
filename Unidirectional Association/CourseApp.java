package Question01;
//Course class
class Course{
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }
}

//Student class
class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void displayDetails(){
        System.out.println("Student: " + name + ", Enrolled in: " + course.getCourseName());
    }
}


// class with the main method
public class CourseApp {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics");
        Student s1 = new Student("Alice", c1);
        s1.displayDetails();
    }
}
