import java.util.ArrayList;
import java.util.List;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;
    private Student(long id,String name, ArrayList<Integer> grades ){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public void getInfo(){
        System.out.printf("Student Id: %s\nName: %s\nGrades: %s",this.id,this.name,this.grades);
    }


    public static void main(String[] args) {

        Student s1 = new Student(1,"Jim",new ArrayList<>());
        s1.addGrade(33);
        s1.addGrade(44);
        s1.addGrade(77);
      s1.getInfo();
    }
}
