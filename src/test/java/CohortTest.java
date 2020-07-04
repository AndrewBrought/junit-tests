import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import java.util.List;

import static org.junit.Assert.*;


public class CohortTest {

//    private List<Student> students;


    private Cohort emptyCohort;
    private Cohort cohortWithOne;
    private Cohort cohortWithThree;

    @Before
    public void setUp() throws Exception {
        Student studentOne = new Student(1L, "John Doe");
        Student studentTwo = new Student(2L, "Jane Smith");
        Student studentThree = new Student(3L, "Olga Otterman");
        Student studentFour = new Student(4L, "Gloria Stein");



        emptyCohort = new Cohort();

        cohortWithOne = new Cohort();
        cohortWithOne.addStudent(studentOne);


        cohortWithThree = new Cohort();
//        cohortWithMany.addStudent(studentOne);
        cohortWithThree.addStudent(studentTwo);
        cohortWithThree.addStudent(studentThree);
        cohortWithThree.addStudent(studentFour);

        studentOne.addGrade(90);

        studentTwo.addGrade(80);

        studentThree.addGrade(75);

        studentFour.addGrade(85);

    }

    @Test
    public void getCohortAverage() {
        assertNotEquals(null,emptyCohort.getCohortAverage(), 0);

        assertEquals(90,cohortWithOne.getCohortAverage(), .1);

        assertEquals(80, cohortWithThree.getCohortAverage(), .1);

    }
//
    @Test
    public void addStudent() {
        Student testStudent = new Student(5L, "Don Juan");
        testStudent.addGrade(100);

        emptyCohort.addStudent(testStudent);
        assertEquals(100, emptyCohort.getCohortAverage(), .1);


        cohortWithOne.addStudent(testStudent);
        assertEquals(95, cohortWithOne.getCohortAverage(), .1);


        cohortWithThree.addStudent(testStudent);
        assertEquals(85, cohortWithThree.getCohortAverage(), .1);



    }

    @Test
    public void getStudents() {
        assertNotNull(emptyCohort.getStudents());

        Student testStudent = new Student(6L, "Davy Jones");
        emptyCohort.addStudent(testStudent);
        assertEquals(1, emptyCohort.getStudents().size());

        cohortWithOne.addStudent(testStudent);
        assertEquals(2, cohortWithOne.getStudents().size());

        cohortWithThree.addStudent(testStudent);
        assertEquals(4, cohortWithThree.getStudents().size());

    }

}
