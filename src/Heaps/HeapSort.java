package Heaps;

public class HeapSort {

	
	public void heap_sort(int[] Arr){
		
		int heap_size=Arr.length;
		Build_Max_Heap max_heap=new Build_Max_Heap();
		max_heap.build_max_heap(Arr);
		
		Max_Heapify max_Heapify = new Max_Heapify();
		
		for(int i=heap_size-1; i>=1;i--){
			max_Heapify.swap(0, i, Arr);
			max_Heapify.max_heapify(Arr, 0, i);
		}
	}
}
