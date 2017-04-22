package Heaps;

public class Client_Heap_Sort {
public static void main(String[] args) {
	
	int[] Arr = {4,3,7,1,8,5};
	HeapSort heap_sort = new HeapSort();
	heap_sort.heap_sort(Arr);
	for(int value : Arr)
		System.out.print(" " +value);
}
}
