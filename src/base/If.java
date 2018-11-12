package base;

public class If {
int a = 5;
int b = 10;
int c = 20;
	

void Pub(){
	if(a==b){
		System.out.println("success");
		
	}else{
		System.out.println("yes");
	}
	
}
void Pubb(){
if(a==5){
	if(b==10){
		System.out.println("b");
		if(c==20){
			System.out.println("c");
		}
	}
}}

void pub1(){
	if(a==2){
		System.out.println("wrong");
	}else if(a==3){
		System.out.println("wroo");
	}else if(a==5){System.out.println("check");}
}
public static void main(String[] args) {
	If i =new If();
	i.Pub();
	i.Pubb();
	i.pub1();
}
}
