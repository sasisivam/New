package base;

public class Thissupr extends Basics {
int a = 50;
int s = 60;

public int ad(){
	
	int a = 20;
	int b = 30;
	int c = a+b;
	return c; 
}
void display(){
	System.out.println(super.a);
	System.out.println(this.a);
}

public static void main(String[] args) {
	Thissupr t =new Thissupr();
	
	System.out.println(t.a);
	t.display();
	
}
}

