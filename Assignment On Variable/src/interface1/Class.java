package interface1;

 public  class Class implements test,test1  {
public void D1(){
	System.out.println("running D1");
}
public void E1(){
	System.out.println("running E2");
}
public void N3(){
	System.out.println("running F3");
}
public void N4(){
	System.out.println("running N");
}
public static void main(String[] args) {
	Class x= new Class();
	x.D1();
	x.E1();
	x.N3();
	x.N4();
}


}

