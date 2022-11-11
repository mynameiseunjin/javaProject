package com.yedam.homework;

public class StandardWeightInfo extends Human {

	//생성자
	
	
	
	public StandardWeightInfo(String name, int hi, int we) {
		super(name, hi, we); //부모생성자
		
	}
	

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("표준체중 : " );
	}
	

	public double getStandardWeight() {
		double result = double((hi-100)*0.9);
				
	}
	
	
	
}
