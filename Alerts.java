package task11_calculator;
public class Alerts
{
	public static void hello()
	{
		System.out.println("Welcome to Java console Calculator!");
	}
	
	public static void enterNum(String n_num)
	{
		System.out.println("Enter the " + n_num +" number:");
	}
	
	public static void notNum()
	{
		System.out.println("Not a number, please try again.");
	}
	
	public static void enterOp()
	{
		System.out.println("Enter an operation symbol:\n'*' for Multiplication\n'/' for Division\n'+' for Addition\n'-' for Substraction");
	}
	public static void invalidOp()
	{
		System.out.println("Only the symbols '*', '/', '+' and '-' are allowed \nPlease try again:\n");
	}
	
	public static void printRes(double n1, double n2, String math_symbol, double final_result)
	{
		System.out.println("Your result:\n"+CalcOp.format(n1) + math_symbol + CalcOp.format(n2) + " = " + CalcOp.format(final_result)+"\n");
	}
	
	public static void exitCalc()
	{
		System.out.println("Enter 'out' to exit");
	}
	
	public static void bye()
	{
		System.out.println("Good bye!");
	}	
}
