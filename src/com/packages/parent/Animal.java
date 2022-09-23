package com.packages.parent; //created a package name is....

public class Animal {        // created class name animal
	protected int legs = 4 ; // created protected field legs  
	public int eyes = 2;     // created public field eyes
	private String name ;    //  created private field name
	int nose = 1;             //  created default field nose
	public void setName(String name) { // created public method setName which set the private variable name
		this.name= name;
}
	protected String getName() {    // created protected method getName 
		//which return the value  private variable name 
		return this.name;
	}
	void printNose() {      // created default method printNose which prints the value of default field nose
		System.out.println(this.nose);   
	}
	 private void printEyes() { //created private method printEyes which prints the value of public field eyes
		System.out.println(this.eyes);
	}
	
	
}
