package package1;

public class FinalEx {
	public static void main(String[] args)
	{
	    try {
	      // code that generates exception
	      int b = 5 / 0;
	    }

	    catch (ArithmeticException e)
	    {
	      System.out.println(e);
	    }
	    
	    finally
	    {
	      System.out.println("This is the finally block");
	    }
	  }
}
