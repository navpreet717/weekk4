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
		String a="NAVPREET";
		String b="GURSAHAB";
		String c="NAVPREET";
		if(a.contentEquals(b))
		{
			System.out.println("a and b are same");
		}
		else if(b.contentEquals(c))
		{
			System.out.println("b and c are same");
		}
		else if(c.contentEquals(c))
		{
			System.out.println("a and c are same");
		}
		//make everything uppercase
		String p="navu";
		System.out.println(p.toUpperCase());
		//make everything lowercase
		
		String d="NAV";
		System.out.println(d.toLowerCase());
	}

}
