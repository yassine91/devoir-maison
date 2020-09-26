

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	@org.junit.Test
	public void testListe(){
		ArrayList<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			l1.add(i);
		}
	    ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>> ();
        expected.add(new ArrayList<Integer>(Arrays.asList((Integer)0,(Integer)1)));
        expected.add(new ArrayList<Integer>(Arrays.asList((Integer)2,(Integer)3)));
        expected.add(new ArrayList<Integer>(Arrays.asList((Integer)4)));
		assertEquals(expected, MainClass.partition(l1, 2));
 
	}

}
