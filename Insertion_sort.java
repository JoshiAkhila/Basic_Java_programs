class Insertion_sort {
	void sort(int array[])
	    {
	        int n = array.length;
	        for (int i=1; i<n; i++)
	        {
	            int key = array[i]; 
	            int j = i-1;
	            
	            while (j>=0 && array[j] > key)
	            {
	                array[j+1] = array[j];
	                j = j-1;
	            }
	            array[j+1] = key;
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int array[]= {3,6,5,7,8,29,18,4,9,13,1,2};
		  
		  Insertion_sort Insort = new  Insertion_sort();
		  Insort.sort(array);
		 
		  int n = array.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(array[i] + " ");
	}
}