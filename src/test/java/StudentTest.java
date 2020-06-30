import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

        Student student1 = new Student(1234, "Test Name");
        Student student2 = new Student(6543, "Bat Man");

        @Before
        public void setUp(){
            student1.addGrade(80);
            student1.addGrade(70);
            student2.addGrade(90);
            student2.addGrade(80);
        }

    @Test
    public void testGetId() {
        long testStudent = 1234;
        long getId = student1.getId();
        long getId2 = student2.getId();
        assertEquals(testStudent,getId);
        assertEquals(6543, getId2);
        assertNotEquals("Bat Man",getId2);

    }

    @Test
    public void testGetName() {
        String testStudent = "Test Name";
        String getName = student1.getName();
        String getName2 = student2.getName();
        assertEquals(testStudent, getName);
        assertEquals("Bat Man", getName2);
        assertNotEquals(student2, getName2);
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

    @Test
    public void testWhosSmarter() {

        assertEquals(student2, student1.whosSmarter(student2));


    }


}
