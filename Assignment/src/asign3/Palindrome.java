package asign3;

public class Palindrome {
	public static boolean display(String s)
	{
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		String rev=s1.toString();
		if(s.equals(rev))
		{
			System.out.println(s);
			System.out.println(rev);
			System.out.println("Palindrome number");
			return true;
		}
		else
		{
			System.out.println(s);
			System.out.println(rev);
			System.out.println("not a Palindrome number");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("check palindrome or not");
		System.out.println(Palindrome.display("java"));
		System.out.println(Palindrome.display("malayalam"));
		
		


	}

}
