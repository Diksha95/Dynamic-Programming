class MergeSortedArrays{

	public static void main(String args[]){
	
		int arr1[] = {1, 3, 4, 5};
		int arr2[] = {2, 4, 6, 8};
		
		mergeSortedArrays(arr1,arr2);
	}

	public static void mergeSortedArrays(int arr1[],int arr2[]){
		
		//Merge sort using extra space
		
		int arr3[] = new int[arr1.length+arr2.length];

		int i=0,j=0,k=0;
		
		//Checking which array has smaller element
		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i]<arr2[j]){
				
				arr3[k++] = arr1[i++];
			
			}else{
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length){
				arr3[k++] = arr1[i++];
			}
			while(j<arr2.length){
				arr3[k++] = arr2[j++];
			}
		
		for(int a = 0;a<arr3.length;a++){
			System.out.print(arr3[a]+" ");
		}
	}

}