import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades){
            total += grade;
        }
        double average = (double) total / grades.size();
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        average = Double.parseDouble(decimalFormat.format(average));
        return average;
    }

//    public static void main(String[] args) {
//
//        Student student1 = new Student(1234, "New Student");
//        System.out.println(student1.getId());
//
//
//    }

    public Student whosSmarter(Student possibleDummy) {
        if(this.getGradeAverage()  > possibleDummy.getGradeAverage()){
            return this;
        } else {
            return possibleDummy;
        }
    }

}
