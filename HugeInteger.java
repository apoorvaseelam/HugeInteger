package csc537.week1;

public class HugeInteger 
{
	private LinkedList Number;
	
	public HugeInteger(String num)
	{
		Number = new LinkedList();
		for(int i = 0; i < num.length(); i++)
		{
			Number.addEnd(Integer.parseInt("" + num.charAt(i)));
		}
	}
	
	public HugeInteger Add(HugeInteger HI)
	{
		try
		{
		int carry = 0;
		int currPos1 = this.Number.length()-1;
		int currPos2 = HI.Number.length()-1;
		int currVal;
		int currNode1;
		int currNode2;
		String answer = "";
		do
		{
		if(currPos1 < 0)
		{
			currNode1 = 0;
		}
		else
		{
		currNode1 = this.Number.get(currPos1).getPayload();
		}
		if(currPos2 < 0)
		{
			currNode2 = 0;
		}
		else
		{
			currNode2 = HI.Number.get(currPos2).getPayload();
		}
		
		currVal = currNode1 + currNode2 + carry;
		if(currVal > 9)
		{
			carry = 1;
			currVal = currVal - 10;
		}
		else
		{
			carry = 0;
		}
		answer = currVal + answer;
		currPos1--;
		currPos2--;
		}
		while(currPos1 >= 0 || currPos2 >= 0);
		if(carry == 1)
		{
			answer = carry + answer;
		}
		return new HugeInteger(answer);
			
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public void display() throws Exception
	{
		this.Number.display();
		for (int i = 0; i < this.Number.length(); i++)
		{
			this.Number.get(i).display();
		}
		this.Number.display();
	}

}
