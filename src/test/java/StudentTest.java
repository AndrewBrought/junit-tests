import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

        Student student1 = new Student(1234, "Test Name");

    @Test
    public void testGetId() {
        long testStudent = 1234;
        long getId = student1.getId();
        assertEquals(testStudent,getId);

    }

    @Test
    public void testGetName() {
        String testStudent = "Test Name";
        String getName = student1.getName();
        assertEquals(testStudent, getName);
    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> testGrade = new ArrayList<>();
        testGrade.add(100);

        ArrayList<Integer> didGradeAdd = student1.getGrades();
        student1.addGrade(100);
        assertEquals(testGrade, didGradeAdd);
    }

    @Test
    public void testGetGradeAverage() {
        double testAverage = 75;
        student1.addGrade(100);
        student1.addGrade(50);
        double getGradeAverage = student1.getGradeAverage();
        assertEquals(testAverage, getGradeAverage, 0);
    }


}
