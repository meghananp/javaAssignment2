package com.stackroute;


public class JavaTestPal {
	
	
	public boolean checkPalendrome(String ip)
	{
		String pattern= "^[a-zA-Z0-9]*$";
		//ip="12321";
		
		if(ip.matches(pattern))
		{
			String rev="";
			
			int len=ip.length();
			
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+ip.charAt(i);
			}
			
			if(ip.equals(rev))
			{
				return true;			
			}
			
			else
			{
				return false;
			}
			
		}
		
		
		else
		{
			return false;
		}
		
		
	}


}
