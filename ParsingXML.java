import java.util.Scanner;


public class ParsingXML 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(XML_Parser.class.getResourceAsStream("input.xml"));
		String fileContents = "";
		while(input.hasNextLine())
		{
			fileContents += input.nextLine();
		}
		
	 		String currString = "";
	 		
	 		/*for(int i = 0; i < input.length(); i++)
	 		{
	 			if (input.hasNext() ==  "</")  
	 				
	 			{ 	continue; 
	 			
	 			}
	 			else if (input.hasNext()== "<")	
	 				{
	 				System.out.println(input.hasNext());
	 				}
	 				
	 		}*/
	}

}
