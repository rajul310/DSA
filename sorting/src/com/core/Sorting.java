package com.core;

public class Sorting {

	public void bubbleSort(int arr[]) {
		for (int turn = 0; turn < arr.length - 1; turn++) {
			for (int j = 0; j < arr.length - 1 - turn; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public void selectionSort(int arr[]) {
		for (int turn = 0; turn < arr.length; turn++) {
			int minPos = turn;
			for (int j = turn + 1; j < arr.length; j++) {
				if (arr[minPos] > arr[j]) {
					minPos = j;
				}
			}

			// swap
			int temp = arr[turn];
			arr[turn] = arr[minPos];
			arr[minPos] = temp;
		}
	}
	
	 public  void insertionSort(int arr[]) {
	       for(int i=1; i<arr.length; i++) {
	           int curr = arr[i];
	           int prev = i-1;
	          
	           while(prev >= 0 && arr[prev] > curr) {
	               arr[prev+1] = arr[prev];
	               prev--;
	           }
	           arr[prev+1] = curr;
	       }
	    }
	 
	 public void mergeSort(int arr[], int si, int ei) { 
	        if(si >= ei) {
	            return;
	        }
	        int mid = si + (ei - si)/2; 
	        mergeSort(arr, si, mid);
	        mergeSort(arr, mid+1, ei);

	        merge(arr, si, mid, ei);
	    }

	    public void merge(int arr[], int si, int mid, int ei) {
	        int temp[] = new int[ei-si+1];
	        int i = si; 
	        int j = mid+1; 
	        int k = 0; 

	        while(i <= mid && j <= ei) {
	            if(arr[i] < arr[j]) {
	                temp[k] = arr[i];
	                i++;
	            } else {
	                temp[k] = arr[j];
	                j++;
	            }
	            k++;
	        }

	       
	        while(i <= mid) {
	            temp[k++] = arr[i++];
	        }

	       
	        while(j <= ei) {
	            temp[k++] = arr[j++];
	        }

	        for(k=0, i=si; k<temp.length; k++, i++) {
	            arr[i] = temp[k];
	        }
	    }
	    

	    public  void quickSort(int arr[], int si, int ei) {
	        if(si >= ei) {
	            return;
	        }

	        //pivot variable stores correct idx for pivot element
	        int pIdx = partition(arr, si, ei);
	        quickSort(arr, si, pIdx-1);
	        quickSort(arr, pIdx+1, ei); 
	    }

	    public  int partition(int arr[], int si, int ei) {
	        int pivot = arr[ei];
	        int i = si-1; 

	        for(int j=si; j<ei; j++) {
	            if(arr[j] < pivot) {
	                i++;
	                //swap
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        
	        i++;
	        int temp = arr[i];
	        arr[i] = pivot;
	        arr[ei] = temp; 

	        return i;
	    }
	    public void printArr(int[] arr) {
	    	for(int i=0;i<arr.length;i++) {
	    		System.out.print(arr[i]+" ");	    		
	    	}
	    }
	    

}
