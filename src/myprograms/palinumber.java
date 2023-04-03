package myprograms;

public class palinumber {

	public static void main(String[] args) {
		int no=123,temp,sum=0,b;
		temp=no;
		while(no>0)
		{
			b=no%10;
			sum=sum*10+b;
			no/=10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
	}

}
