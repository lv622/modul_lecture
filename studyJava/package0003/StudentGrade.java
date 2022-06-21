package package0003;

public class StudentGrade {
    public String ClassName = "4Class";
    public String name = "";
    public String subject;
    public int grade;

    public StudentGrade(){

    }

    public StudentGrade(String name){
        this.name = name;
    }

    public StudentGrade(String name, String subject, int grade){
        this.name = name;
        this.subject = "none data";
        this.grade = grade;
    }
}
