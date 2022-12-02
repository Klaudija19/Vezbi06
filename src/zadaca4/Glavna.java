package zadaca4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(8);
		lista.add(425);
		lista.add(260);
		lista.add(382);
		lista.add(1);
				
		Collections.sort(lista);	
		
		System.out.println(lista);
	}
}


