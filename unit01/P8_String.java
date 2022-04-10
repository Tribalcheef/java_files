package P1;

 class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		int r,sum=0,temp;
		int n=75457;
		
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("Yes it is a palindrome");
		else
			System.out.println("No it's not a palindrome");

	}


	void reverseOfAString(String s) {
		// Write Logic Here!
		String string="Paras Bhatt";
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println("String before revesre: "+string);
		System.out.println("String after reverse: "+reverse );

	}
	
	void stringEqualOrNot(String s1,String s2) {
		
		String s3="Sachin";
		String s4="SACHIN";
		String s5="Saurav";
		String s6="SAURAV";
		System.out.println(s3.equals(s5));
		System.out.println(s4.equals(s6));
		
		
		
		
	}
}