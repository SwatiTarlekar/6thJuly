
public class Varargs {

public static void methodOne(int...s)
{
		System.out.println("Var-arg method");
}		
		public static void main(String[] args)
		
		{
	methodOne();
	methodOne(1,2);
	methodOne(1,2,3);
	methodOne(1,2,3,4);
	methodOne(1,2,3,4,5,5,5,5,5,5,5,5,5,5);
	methodOne();
	//consider as one dimensional array
		}

}
