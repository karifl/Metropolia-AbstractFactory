package abstractFactory;

import adidas.AdidasFactory;
import boss.BossFactory;

public class Main {
	
	public static void main(String[] args) {
	
	Engineer Jasper_old = new Engineer(new AdidasFactory()); 
	Jasper_old.listaaVaatteet();
	
	System.out.println();
	Engineer Jasper = new Engineer(new BossFactory()); 
	Jasper.listaaVaatteet();
	
}
}