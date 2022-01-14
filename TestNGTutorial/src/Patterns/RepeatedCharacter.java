package Patterns;

public class RepeatedCharacter 
{
	public static void main(String args[])
	{
	   String s="likhitha";
	   char[] s2=s.toCharArray();
	   
	   for(int i=0; i<s2.length; i++)
	   {
		   for (int j=i+1; j<s2.length; j++)
		   {
			   if(s2[i]==s2[j])
			   {
				   System.out.println(s2[j]);
			   }
		   }
	   }
	}
}
	