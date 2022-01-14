package HomeWork;

public class CountDuplicatesInArray
{
	public static void main(String[] args)
	{
		int[] arr= {20,40,40,30,10,4,5,9};
		 int count=0; 
	     int  find=40;
	    for(int i=0; i<arr.length; i++)
		 {
			 if(find==arr[i])
			 {
				 count++;
			 }
		     }
		 System.out.println(count);
}
}