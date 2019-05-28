package prctce;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first program in string
		//create a string
		
		String name="Navpreet Kaur";
		System.out.println(name);
		
		
		//number of characters in the string
		int numberofchars=name.length();
		System.out.println("number of characters:"+numberofchars);
		//geyt a specific character
		char characteratposition4=name.charAt(4);
		System.out.println("position4:"+characteratposition4);
		
		      
		
		//get a substring
		String sub = name.substring (0, 5);
		System.out.println("substring:"+sub);
		
		             //or
		String sub2 = name.substring (4);
		System.out.println("substring:"+sub);
		
		//check if one string is equals to another
		
		//make everything uppercase
		//make everything lowercase
		

	}

}
