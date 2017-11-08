public class palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scan= new Scanner(System.in);
		 String original =scan.nextLine();
	     word(original);
	}
	private static void word(String original) {
		// TODO Auto-generated method stub
		int length = original.length();
		String reverse= "";
		for(int i = length-1;i>=0;i--){
		      reverse = reverse + original.charAt(i);	
		}
		 if(original.equals(reverse)){
			 System.out.println("String is palindrome");
		 }
		 else System.out.println("String is not palindrome");
		}
}
