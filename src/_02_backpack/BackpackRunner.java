package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack e = new Backpack();
		Ruler a = new Ruler();
		Pencil b = new Pencil();
		Textbook c = new Textbook();
		e.putInBackpack(a);
		e.putInBackpack(b);
		e.putInBackpack(c);
		e.packAndCheck();
		e.goToSchool();
		
	}
}
