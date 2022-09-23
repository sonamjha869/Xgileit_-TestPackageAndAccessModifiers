package com.packages.child; //created a package name is....

import com.packages.parent.Animal; // imported class animal from package com.packages.parent.Animal

public class Dog extends Animal {  // child class dog extends parent class animal
	private String colour;       // created private field colour
	private void speak() {       //created private method speak
		System.out.println("bark"); //printing bark
	}
	public void setColour(String colour) { //setter of field colour
		this.colour= colour;
}
	public String getColour() {   //getter of field colour 
		return this.colour;
	}
	public static void main(String...arg) { // created main method for the execution of code
		Dog d = new Dog();     // created object of dog
		System.out.println(d.eyes); //printing public field eyes from parent animal
		System.out.println(d.legs); //printing protected field legs from parent animal
		d.setName("dog");      // calling public method setName define in parent
		System.out.println(d.getName()); //calling protected method setName define in parent animal
		d.setColour("black");  //calling setter for field colour
		System.out.println(d.getColour()); //calling getter for field colour
		d.speak();  // callinf method speak
		
	}

}
