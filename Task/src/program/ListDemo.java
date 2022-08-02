package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>();
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
			l.add(i);
			}
		}
		
		/*for(int j:l)
		{
			System.out.println(j);
		}*/
		
		Iterator<Integer> itr= l.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i);
		}
	}

}
