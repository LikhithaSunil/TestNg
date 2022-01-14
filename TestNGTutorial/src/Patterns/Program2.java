package Patterns;

public class Program2 
{
	public static void main(String[] args) 
	{
		String S="likhitha";
		char ch[]=S.toCharArray();
		
		for(int i =0; i<S.length(); i++)
		{
			
			for(int j=0; j<=i; j++)
			{
		
			System.out.print(ch[j]);
	        }
			System.out.println();
			
			}
             

}
}
