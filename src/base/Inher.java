package base;
class valu{
	
	int z  = 25; 

}

public class Inher extends valu {

	int z;
	public Inher(int i, int j) {
		this.z = i;
		
	}

	public Inher() {
		// TODO Auto-generated constructor stub
	}

	public int add(){
	int a = 50;
	int b  = 20;
	int value  = a*b;
	return value;
	
	
}
	
public static void main(String[] args) {
	Inher i = new Inher();
	Inher x = new Inher(5,10);
	System.out.println(i.z);
	System.out.println(i.add());
}
}
