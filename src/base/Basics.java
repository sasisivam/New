package base;

public class Basics {

 int a = 5;
int d =100;
 

public int local(){
	int  c = 15;
	System.out.println("ans"+ c);
	return c;
}

public static void main(String[] args) {
Basics b =  new Basics();
	
int a = 10;
	b.local();
	System.out.println(a);
	System.out.println(b.local());
	System.out.println(a);
	System.out.println(b.d);
}
}
