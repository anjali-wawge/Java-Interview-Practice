package com.combinePrograms;
//interface practice program
interface CalculateInterface {

	final static int a=1;
	
	public void rotationOfWheels();
}
class Wheels implements CalculateInterface{

	@Override
	public void rotationOfWheels() {
		int b=a*10;
		System.out.println(b);
	}
}
public class Calculate extends Wheels{
	public static void main(String[] args) {
		Calculate calc=new Calculate();
		calc.rotationOfWheels();
	}
}
