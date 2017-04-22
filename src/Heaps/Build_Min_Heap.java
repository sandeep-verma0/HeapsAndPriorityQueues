package Heaps;

public class Build_Min_Heap {

	
	public void build_min_heap(int[] Arr ){
		int N = Arr.length;
		
		Min_Heapify min_heapify= new Min_Heapify();
		
		for(int i=(N/2)-1 ; i>=0;i--)
		{
			//System.out.println("i is : " + i);
			min_heapify.min_heapify(Arr, i, N);
		}
		
	}
}
