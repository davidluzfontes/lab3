import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 1, 2, 3 };
    int [] reversedArray = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, reversedArray);
  }

  @Test 
  public void testAverageWithoutLowest(){
    double[] inputEmpty = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(inputEmpty), 0.0001);

    double[] input0 = {1.0,1.0,1.0};
    assertEquals((1.0), ArrayExamples.averageWithoutLowest(input0), 0.0001);
    
    double[] input1 = {1.0,1.0,2.0};
    assertEquals((1.5), ArrayExamples.averageWithoutLowest(input1), 0.0001);

    double[] input2 = {1.0,2.0,3.0};
    assertEquals((2.5), ArrayExamples.averageWithoutLowest(input2), 0.0001);
  }
}
