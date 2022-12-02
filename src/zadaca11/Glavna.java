package zadaca11;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
	public static void main(String[] args) {
		List<String> l1 =  new ArrayList<String>();
		l1.add("Zelena");
		l1.add("Zolta");
		l1.add("Crvena");

		List<String> l2 = new ArrayList<String>();
		l2.add("Zelena");
		l2.add("Portokalova");
		l2.add("Zolta");

		l1.retainAll(l2);

		System.out.println(l1);
	}
}


