public class ConstructorTest
{
	int randRoll;
	String evenOrOdd = null;

	public ConstructorTest()
	{
		randRoll = 1 + (int) ( Math.random() * 6);
		System.out.println(randRoll);

		if (randRoll==1||randRoll==3||randRoll==5)
		{
			evenOrOdd="odd";
		}
		else 
		{
			evenOrOdd="even";
		}
		System.out.println(evenOrOdd);
	}
	public String EvenOrOdd()
	{
		return evenOrOdd; //unfortunately the evenOrOdd variable doesn't correctly return the right result, despite everything else being right. I suspect htis is where I'm going wrong.
	}
}