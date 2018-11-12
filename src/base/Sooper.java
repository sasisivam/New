package base;

class Parent{
	int a = 5;
	static int b = 10;
}

public class Sooper extends Parent{
	int a = 25 ;
	static int b= 15;
	void V(){
	System.out.println(a);}
public static void main(String[] args) {
Sooper s = new Sooper();
s.V();
}
}
