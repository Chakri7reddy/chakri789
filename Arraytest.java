
public class Arraytest {
	
			public static void main(String[] args)
			{
				System.out.println("The numbers of multiples of 3,4,5 b/w 20&40 are");
				int a[]=new int[30];
				int c1=0,c2=0,c3=0;
		        for(int i=20;i<=40;i++)
		        {
		        	if(i%3==0)
		        	    c1++;
		           	if(i%4==0) 
		        		c2++;
		          	if(i%5==0) 
		          		c3++;
		          	}
		        System.out.println("The number of multiples of 3 are " +c1);
		        System.out.println("The number of multiples of 4 are " +c2);
		        System.out.println("The number of multiples of 5 are " +c3);
			}
	}
