//creating a package called MainPackage
package MainPackage;




//Creating a class called MyInteger
public class MyInteger {
	
	//creating a data field named value storing the int value
	private int value;
	
	//constructor that creats a MyInteger object for value
	public MyInteger(int NewValue){
		value = NewValue;	
	}
	
	//a get method that returns the int value
	public int getValue(){
		return value;
	}
	
	//method that returns if value is even or not
	public boolean isEven(){
		if (value % 2 == 0)
			return true;
			
		return false;		
		}
			
	//method that returns if value is odd or not
	public boolean isOdd(){
		if (value % 2 == 0)
			return false;			
		
		return true;
	}
		
	//method that returns if value is prime or not
	public boolean isPrime(){
		if (value % 2 == 0)
			return false;
		
		for (int i = 3; i <= value; i += 2 ){
			if (value % i == 0)
				return false;
			}
		return true;		
	}
	
	//static method that returns if value is even or not
	public static boolean isEven(int value){
		if (value % 2 == 0)
			return true;
			
		return false;		
	}
	
	//static method that returns if value is odd or not
	public static boolean isOdd(int value){
		if (value % 2 == 0)
			return false;
		return true;
	}
	
	//static method that returns if value is prime or not
	public static boolean isPrime(int value){
		if (value % 2 == 0)
			return false;
		
		for (int i = 3; i <= value; i += 2 ){
			if (value % i == 0)
				return false;
			}
		return true;	
	}
	
	//static method that returns if the object value of "myinteger" type
	//is even or not
	public static boolean isEven(MyInteger value){
		return isEven(value.getValue());
	} 
	
	//static method that returns if the object value of "myinteger" type
	//is odd or not
	public static boolean isOdd(MyInteger value){
		return isOdd(value.getValue());
	}
	
	//static method that returns if the object value of "myinteger" type
	//is prime or not
	public static boolean isPrime(MyInteger value){
		return isPrime(value.getValue());
	}
	
	//method that returns if value is the same as the object intValue
	public boolean equals(int intValue){
		return value == intValue;
	}

	//returns if object MyInteger of type MyInteger is the same as value
	public boolean equals(MyInteger MyInteger){
		return equals(MyInteger.getValue());
		
	}
	
	public static int parseInt(char[] array){
		String x = "";
		for (int i = 0; i < array.length; i++)
			x = x.concat(Character.toString(array[i]));
		return Integer.parseInt(x);
	}
	
	public static int parseInt(String string){
		return Integer.parseInt(string);
	}
	
}
