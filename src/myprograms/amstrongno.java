package myprograms;

public class amstrongno {

	public static void main(String[] args) {
		int no=153,sum=0,temp,m;
		temp=no;
		while(no>0)
		{
			m=no%10;
			sum=sum+(m*m*m);
			System.out.println(sum);

			no/=10;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("Amstrong no");
		else
			System.out.println("Not amstrong");
	}

}
