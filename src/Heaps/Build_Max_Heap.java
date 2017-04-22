package Heaps;

public class Build_Max_Heap {

	
	public void build_max_heap(int[] Arr ){
		int N = Arr.length;
		
		Max_Heapify max_heapify= new Max_Heapify();
		
		for(int i=(N/2)-1 ; i>=0;i--)
		{
			//System.out.println("i is : " + i);
			max_heapify.max_heapify(Arr, i, N);
		}
		
	}
}
