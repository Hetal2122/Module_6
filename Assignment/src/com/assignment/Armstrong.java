package com.assignment;
/*5 W.A.J.P to check given number is Armstrong or not? */

public class Armstrong {
	public static void main(String[] args) {
      int i, num = 3, status = 1;
		
		System.out.println("First 100 Prime Numbers are ");
		System.out.print(2 + " ");

		for(i = 2 ; i <= 100; ) 
		{
			for(int j = 2; j <= Math.sqrt(num); j++)
			{
				if(num % j == 0)
				{
					status = 0;
					break;
				}
			}
			
			if(status != 0)  
			{
				System.out.print(num + " ");
				i++;
			}
			status = 1;
			num++;
		}
		
		
	}

}
