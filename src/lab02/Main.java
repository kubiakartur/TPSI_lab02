package lab02;


public class Main {
    
     public static void main(String[] args) {
        Person p1 = new Person("Bill", "Gates", "mail@gmail.com");
        Person p2 = new Person("Gal", "Anonim", "tymtym@gmail.com");
        Student s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        //System.out.println(p1);
        //System.out.println(s1);
        
        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");
        
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");
         
        Faculty elektronika = new Faculty("Wydzial Elektroniki w Szczecinie", "elektryka@gmail.com");
        
        EmailRecipient[] spamList = new EmailRecipient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;
        
        for(EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }
        
        s1.addGrade(5);
        s1.addGrade(2);
        s1.addGrade(3);
        s1.addGrade(2.5);
        s1.getGradesAverage();
        
        zut.addFaculties("Informatyka");
        zut.getFaculties();
        
        elektronika.addTeacher("Jurek");
        elektronika.addTeacher("Burek");
        elektronika.addTeacher("Cokolwiek");
        elektronika.getTeachers();
    }
}