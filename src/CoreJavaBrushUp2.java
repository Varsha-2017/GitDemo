
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) 
	{
	/*	int[] arr = {1,2,4,15,36,7,8,8,10};
		
		for(int i = 0; i<arr.length; i++)
		{
			if ( arr[i] % 2 ==0)
			{
			
				System.out.println(arr[i]);
				
			}
			else
			{
				System.out.println(arr[i]+"  is not multilple of 2");
			}
		}*/
		/* ArrayList<String> object =new ArrayList<String>();
		 
		 object.add("varsha");
		 object.add("deekshith");
		 object.add("Kavya");
		 object.add("Satya");
		 
	     for(int i = 0;i<object.size(); i++)
	     {
	    	 System.out.println(object.get(i));
	     }
	     System.out.println("***************");
	     
	     for( String val : object)
	     {
	    	 System.out.println(val);
	     }
	     System.out.println(object.contains("varsha"));
	     */
		
		//String[] name = {"Varsha", "Kavya","Nitya"};
		//List nameArrayList = Arrays.asList(name);
		
	//	System.out.println(nameArrayList);
		 
		String s = "Varsha Nagaraj Acharya";
		String[] splittedString = s.split("");
		//System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]); 
		
		for ( int i = s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
