package csc537.week1;
import java.util.Random;

public class Driver {
	public static void main(String[] args) throws Exception
	{
		
		HugeInteger HI1 = new HugeInteger("6347989");
		HugeInteger HI2 = new HugeInteger("42589912");
		HugeInteger answer = HI1.Add(HI2);
		answer.display();
	}

}
