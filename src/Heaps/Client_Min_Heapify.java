package Heaps;

public class Client_Min_Heapify {

	public static void main(String[] args) {

		int Arr[] = {4, 5, 1, 6, 7, 3, 2};
		Build_Min_Heap build_min_heap = new Build_Min_Heap();
		build_min_heap.build_min_heap(Arr);
		
		for(int value : Arr)
			System.out.print(" " +value);
	}

}
