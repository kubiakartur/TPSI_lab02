package lab02;
import java.util.ArrayList;
import java.util.List;

public class Faculty implements EmailRecipient {
    
    String name;
    String emailAddress;
    List<String> teachers = new ArrayList<>();
    
    public static void main(String[] args) {
        
    }
    public Faculty(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }
    
    public void getTeachers()
    {
        for(String teacher: teachers){
           System.out.println(teacher);
        }        
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
}