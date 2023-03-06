import java.text.DecimalFormat;
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

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
            double sum = 0;
            double total;
            List<Integer> x = this.grades;
            for(int i = 0; i < x.size(); i++){
                sum += x.get(i);
            }
            total = sum / x.size();
            DecimalFormat dF = new DecimalFormat("0.##");
                return Double.parseDouble(dF.format(total));
        }
    public void getInfo(){
        System.out.printf("Student Id: %s\nName: %s\nGrades: %s\n",this.id,this.name,this.grades);
        System.out.println("Grade Average: " + this.getGradeAverage());
    }


    public static void main(String[] args) {

        Student s1 = new Student(1,"Jim",new ArrayList<>());
        s1.addGrade(33);
        s1.addGrade(44);
        s1.addGrade(77);
      s1.getInfo();
    }
}
