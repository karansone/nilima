package globlevariable;

public class Class1 {
int A=100;
char B = '$';
public void D1() {
	int c=90;
	char d='%';
	System.out.println(c);
	System.out.println(d);
}
public void R2() {
	int e=80;
	char f='&';
	System.out.println(e);
	System.out.println(f);
}
public static void main(String[] args) {
	Class1 S =new Class1();
	S.D1();
	S.R2();
	System.out.println(S.A);
	System.out.println(S.B);
}
}
