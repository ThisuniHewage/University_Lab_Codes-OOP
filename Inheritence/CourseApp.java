import org.w3c.dom.ls.LSOutput;

class Course{
    protected String courseID;
    protected String courseName;
    protected int durationWeeks;

    public Course(){}

    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public double calculateTotalFee(){
        return 10000;
    }

    public double calculateTotalPrice(Double DiscountPercentage){
        return calculateTotalFee()-(calculateTotalFee()*(DiscountPercentage/100));
    }

    public void displayCourseDetails(){
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration Weeks: " + durationWeeks);
    }
}

class RegularCourse extends Course{
    private Boolean hasLiveSessions;
    public RegularCourse(){}


    public RegularCourse(String courseID, String courseName, int durationWeeks, Boolean hasLiveSessions) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }

    public double calculateTotalFee(){
        return 100*durationWeeks;
    }

    public void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("Total fee: " + calculateTotalFee());
        System.out.println("Live session status: " + hasLiveSessions);
    }


}

class PremiumCourse extends Course{
    private boolean includeCertificate;

    public PremiumCourse(){}

    public PremiumCourse(String courseID, String courseName, int durationWeeks, boolean includeCertificate) {
        super(courseID, courseName, durationWeeks);
        this.includeCertificate = includeCertificate;
    }

    public double calculateTotalFee(){
        if(includeCertificate == true){
            return (150 * durationWeeks) + 50;
        }

        else {
            return 50;
        }
    }

    public void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("Total fee: " + calculateTotalFee());
        System.out.println("Certificate status: " + includeCertificate);
    }
}

public class CourseApp {
    public static void main(String[] args) {
        RegularCourse r1 = new RegularCourse();
        PremiumCourse p1 = new PremiumCourse("PC202", "Machine Learning", 6,true);
        r1.displayCourseDetails();
        p1.displayCourseDetails();
    }
}
