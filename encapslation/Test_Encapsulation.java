package encapslation;
class Amazon_info
{
	private String emailid="contct@grotechminds.com";

	public String getEmailid()
	{
		return emailid;
	}
	
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	private String password = "contact@proPassword";

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	//how to find broken links in the web page
	
	
	
}

public class Test_Encapsulation {

	public static void main(String[] args)
	{
		Amazon_info a1 = new Amazon_info();
		a1.setEmailid("stbymkt@gmail.com");
		System.out.println(a1.getEmailid());		
	}

}

//Assignment 74: WAP for Encapsulation
