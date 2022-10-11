import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestLifeCycle {
    private ArrayMethods obj;

    @Test
    public void findIndexTest(){
        int result = obj.findIndex(new int[]{1,2,3,4,5,6,7}, 4);
        assertEquals(3, result);
//      assertEquals(4, result);
    }

    @Test
    public void searchNumberTest() {
        boolean result = obj.searchNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, 4);
        assertEquals(true, result);
//      assertEquals(false, result);
    }

    @BeforeEach     //2
    public void beforeEachTest(){
        System.out.println("First initialized method before each test");
        obj = new ArrayMethods();
    }

    @AfterEach      //3
    public void afterEachTest(){
        System.out.println("Clean up after the test");
    }

    @BeforeAll      //1
    public static void beforeAllTests(){
        System.out.println("Before running all the tests");
    }

    @AfterAll       //4
    public static void afterAllTests(){
        System.out.println("After running all the tests");
    }
}
