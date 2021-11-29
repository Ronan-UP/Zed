//This is the main file from which the compiler will run


public class Zed
{
	Lexer l = new Lexer();


	public static void main(String[] args)
	{
		String filename;

		try
		{
			if (args.length < 1)
			{
				throw new Exception("No input file provided");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
			return;
		}

	}



}
