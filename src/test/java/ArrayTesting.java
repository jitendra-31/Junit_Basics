import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {
    @Test
    public void findIndexTest(){
        ArrayMethods obj = new ArrayMethods();
        int result = obj.findIndex(new int[]{1,2,3,4,5,6,7}, 4);
        assertEquals(3, result);
//      assertEquals(4, result);
    }

    @Test
    public void searchNumberTest(){
        ArrayMethods obj = new ArrayMethods();
        boolean result = obj.searchNumber(new int[]{1,2,3,4,5,6,7}, 4);
        assertEquals(true, result);     //1
//      assertEquals(false, result);

        assertTrue(result);                     //2

        String str = "a";                       //3
        assertNull(str);                        //4
        assertNotNull(str);

        fail("Unfinished method");              //5
    }

    @Test
    public void findIndexOfEmptyArray(){
        ArrayMethods obj = new ArrayMethods();
        assertEquals(-1, obj.findIndex(new int[]{}, -1));
    }

    //Test assert
    @Test
    public void testAssert(){
        boolean result = true;
        assertTrue(result); //it(assertTrue()) expects a true value
    }

    @Test
    public void findIndexOutOfBound(){
        ArrayMethods obj = new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> obj.printArray(new int[]{1,2}, 3));    //6
    }

    @Test
    public void findIndexMultiple(){
        ArrayMethods obj = new ArrayMethods();
        assertAll(                                                                          //7
                ()->assertEquals(1, obj.findIndex(new int[]{1,2}, 2)),
                ()->assertEquals(2, obj.findIndex(new int[]{1}, 2))
        );
    }


}
