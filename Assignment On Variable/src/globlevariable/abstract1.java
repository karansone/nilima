package globlevariable;

public class abstract1 extends Class4{
public void D1() {
	System.out.println("method start");
	
}
public void E1 () {
	System.out.println("method ended");
}
public static void main(String[] args) {
	abstract1 D =new abstract1();
	D.demo();
	D.D1();
	D.E1();
}
}
