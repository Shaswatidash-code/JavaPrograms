package assignments;
class Payment
{
	//final void pay()
	void pay()
	{
	System.out.println("With Google pay");
	}
}

class PayFromCash extends Payment
 
{
	void pay()
	{
		System.out.println("Cash On Delivery");
	}
}
	
public class TestMethodFinal extends PayFromCash
{
	public static void main(String[] args) 
	{
		PayFromCash p1 = new PayFromCash();
		p1.pay();
	}
}

//Using final keyword in method

	


