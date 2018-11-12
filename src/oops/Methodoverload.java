package oops;

public class Methodoverload extends Methodoverrid{
int basic;
int allo;
	
	public int add(){
		int basic = 500;
		int allo = 200;
		int sal = basic+allo;
		return sal;
	}
	public int add(int i,int j){
		int k = i+j;
		return k;
	}
	public int add(int s,int t ,int z){
		this.allo = s;
		this.basic = t;
	int v = s+t+z;
		return v;
	}
	void display(){
		System.out.println(super.add());
	}
	public static void main(String[] args) {
		Methodoverload m = new Methodoverload();
		System.out.println(m.add());
		System.out.println(m.add(5, 10));
		System.out.println(m.add(10, 10, 10));
		m.display();
		
	}
}
