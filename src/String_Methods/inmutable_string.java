package String_Methods;

public class inmutable_string {
	
	public static void main(String[] args) {
		
	//	String S = "qlqoqkqeqsqhq_qBqaqrqaqsqkqaqrq";
		String S = "Baraskar";
		 int ln = S.length();
		 System.out.println(ln);
		
		for (int i=0;i<=S.length()-1;i++) {
			
			if (i%2!=0)
			{
				System.out.print(S.charAt(i));
			}
			}
		

	}

}
