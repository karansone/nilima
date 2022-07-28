package globlevariable;

public class Class3 {
int A=100;
int B=90;
public void R1() {
	int S=30;
	System.out.println(S);
	System.out.println(this.A);
	System.out.println(this.B);
}
public static void main(String[] args) {
	Class3 B=new Class3();
	B.R1();
	System.out.println(B.A);
	System.out.println(B.B);
	
}
}