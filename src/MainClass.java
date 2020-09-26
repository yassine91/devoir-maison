import java.util.ArrayList;

public class MainClass {
	
	public static ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> liste, Integer taille){
		 
		ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
 
		int i=0,j=0;
		while (i<liste.size())
		{
			list.clear();
			for ( j = 0; j < taille; j++) 
			{
				if((j+i)<liste.size())
					list.add(liste.get(i+j));
			}
			List.add((ArrayList<Integer>) list.clone());
			i+=taille;
		}
 
		return List;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
        list.add(3);
        list.add(4);
        list.add(5); 
		ArrayList<ArrayList<Integer>> mylist = partition(list, 3) ;
		System.out.println(mylist);

	}

}
