package exp1;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj=new ArrayList<String>();
		obj.add("Rama");
		obj.add("hari");
		obj.add("geetha");
		obj.add("shruti");
		System.out.println(obj);
		System.out.println(obj.size());
		obj.add(2,"priya");
		obj.add(4,"sirisha");
		System.out.println(obj);
		obj.remove("hari");
		obj.remove("shruti");
		obj.remove(3);
		System.out.println(obj);
		System.out.println(obj.contains("geetha"));

	}

}
