package Patterns;

public class Pattern7 
{
	public static void main(String[] args) 
	{
		String s="likhithar";
		String s2="listYantra";
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s2.length(); j++)
			{
				
			  char[] ch=s.toCharArray();
			  char[] ch1=s2.toCharArray();
				if(ch[i]==ch1[j])
				{
					System.out.println(ch1[j]);
				}
			}
			
		
		}
		
	}
}