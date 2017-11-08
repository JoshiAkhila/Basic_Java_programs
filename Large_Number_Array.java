public class ArrayOrder {

	public static void main(String[] args) {
		int arr[]= new int[50];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n= scan.nextInt();
		System.out.println("Enter array elements");
		
		for(int i=0;i<n;i++){
			arr[i]= scan.nextInt();
		}
		int large=arr[0];
		
		for(int i=0;i<n;i++){
			if(large<arr[i]){
				large=arr[i];
			}
		}
		System.out.println("largest number is " +large);
	}

}
