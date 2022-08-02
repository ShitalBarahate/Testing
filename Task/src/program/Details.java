package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details 
{
 Map<Integer,Employee> map= new HashMap<>();
 public Map setdetails()
 
 {
 
	 Employee e= new Employee();
	 e.setId(11);
	 e.setEname("abc");
	 e.setAddr("xyz");
	 e.setMobno(4567893l);
	 e.setSal(56478);
	 
	 map.put(1, e);
	 
	 return map;
 }

public void getdetails(Map m)
{
System.out.println("Employee infomation");	

Set<Integer> k= map.keySet();
for(int key:k)
{
 System.out.println(key);	
 Employee e=map.get(key);
 System.out.println(e.getId());
 System.out.println(e.getEname());
 System.out.println(e.getAddr());
 System.out.println(e.getMobno());
 System.out.println(e.getSal());
}

}
}
