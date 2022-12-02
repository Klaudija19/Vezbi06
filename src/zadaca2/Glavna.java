package zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Makedonija");
		lista.add("Germanija");
		lista.add("Holandija");
		lista.add("Belgija");
		lista.add("Svedska");

		System.out.println("Listata sodrzhi "+ lista.size()+" elementi.");

		if(lista.size() == 3) {    
			lista.add("Hrvatska");
			lista.add("Norveska");

			System.out.println(lista);
		}
		else {
			System.out.println(lista);
		}
	}
}


