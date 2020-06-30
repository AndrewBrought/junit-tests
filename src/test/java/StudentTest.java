import org.junit.Test;
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

    }


}
