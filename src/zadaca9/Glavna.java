package zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	public static void main(String[] args) {
		List<Fakultet> lista = new ArrayList<Fakultet>();

		Fakultet f =  new Fakultet("TFB",12,1600);
		lista.add(f);
		lista.add(new Fakultet("FIKT", 6, 1000));
		lista.add(new Fakultet("FINKI", 8, 950));
		lista.add(new Fakultet("PMF", 7, 720));
		lista.add(new Fakultet("DIF", 5, 550));

		for(int i=0;i<lista.size();i++){
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getBrojSmerovi());
			System.out.println(lista.get(i).getVkupnoStudenti());
		}
	}
}


