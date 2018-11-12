package base;

public class Forr {
	
	void Fore(){
		for(int a = 0;a<=10;a++){
			for(int b = 1;b<=a;b++){
				System.out.print(b);
			}
			System.out.println("");
		}
	}
	

public static void main(String[] args) {
	/*for(int i = 0;i<=5;i++){
		for(int j= 0;j<=i;j++){
		System.out.print(j);
	}
System.out.println("");
}*/
Forr f = new Forr();
f.Fore();
}
}
