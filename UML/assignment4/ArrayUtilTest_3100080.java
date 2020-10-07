//Α.Μ:3100080
//Επώνυμο:Κοσμάς
//Όνομα:Στυλιανός-Ιωάννης

import org.junit.*;

public class ArrayUtilTest{

		@Test
		public void testEmptyArray(){
		ArrayUtil util = new ArrayUtil();
		int [] numbers = {};						
		util.reverse(numbers);
        Assert.assertArrayEquals(new int[]{}, numbers);

        @Test
		public void testNullArray(){
		ArrayUtil util = new ArrayUtil();
		int [] numbers = null ;
		util.reverse(numbers);
        Assert.assertArrayEquals(null, numbers);

        @Test
		public void testOneElementArray(){
		ArrayUtil util = new ArrayUtil();
		int [] numbers = {1};
		util.reverse(numbers);
        Assert.assertArrayEquals(new int[]{1}, numbers);



	}
}