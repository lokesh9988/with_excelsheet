package String;

public class StringPlendrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		System.out.println(s.length());
		for ( int i=s.length()-1;i>=0;i--)
		rev=rev+s.charAt(i);
		if(s.equals(rev))
		{
			System.out.println("it  is pelandrome");
		}
		else
		{
			System.out.println("it  is not pelandrome");	
		}
	
	}

}
