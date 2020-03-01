package Assignment;

public class Calculator {
	
	int x,y,z;
	
	Calculator(int a,int b){
		x=a;
		y=b;
	}
int add(int x,int y){
	z=x+y;
	return z;
}
int sub(int x,int y){
	z=x-y;
	return z;
}
int mul(int x,int y){
	z=x*y;
	return z;
}
int div(int x,int y){
	z=x/y;
	return z;
}
}