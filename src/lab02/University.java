package lab02;
import java.util.ArrayList;
import java.util.List;

public class University implements EmailRecipient {
    
    private String emailAddress;
    private String name;
    List<String> faculties = new ArrayList<>();
    
    public static void main(String[] args) {
        
    }
    
    public University(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
        
    public void addFaculties(String facultie) {
        faculties.add(facultie);
    }
    
    public void getFaculties()
    {
        for(String facultie: faculties){
           System.out.println(facultie);
        }        
    }
}