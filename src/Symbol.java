//declare symbol class 
public class Symbol {

	//declare symbol properties
	private String name, type, value;
	
	//***********************
	//	methods
	//
	//***********************

	//the constructor	
	public Symbol(String name, String type, String value) {

		this.name = name;
		this.type = type;
		this.value = value;
	}
	
	//checks the name
	public String checkName() {

		return this.name;
	}
	
	//checks the type
	public String checkType() {

		return this.type;
	}
	
	//checks the value
	public String checkValue() {

		return this.value;
	}
	
	//prints a debugging symbol output
	public void printOutput() {

		if(this.type.equals("STRING")) {
			System.out.println("name " + this.name + " type " + this.type + " value " + this.value);
		}
		else {
			System.out.println("name " + this.name + " type " + this.type);
		}
	}
	
	//prints the global declaration output
	public void printTinyCode() {

		if(this.type.equals("STRING")) {
			System.out.println("str " + this.name + " " + this.value);
		}
		else {
			System.out.println("var " + this.name);
		}
	}
}
