package lab02;


public class Teacher extends Person {

    public static void main(String[] args) {
       
    }
    private String courseName;
    
    public Teacher(String firstName, String lastName, String emailAddress, String courseName) {
        super(firstName, lastName, emailAddress);
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}