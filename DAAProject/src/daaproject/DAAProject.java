/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daaproject;
import java.util.*;
/**
 *
 * @author vnvar
 */
public class DAAProject {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose the mode of input data:\n1. Manual Mode\n2. Random Mode");
            int choice = scanner.nextInt();

            try {
                Scanner arraySizeScanner = new Scanner(System.in);
                System.out.println("Enter the size of the array");
                int size = Integer.parseInt(arraySizeScanner.nextLine());

                int[] inputArray = new int[size];
                int[] mergeSortArray = new int[size];
                int[] bubbleSortArray = new int[size];
                int[] insertionSortArray = new int[size];
                int[] quickSortArray1El = new int[size];
                int[] quickSortArrayLast = new int[size];
                int[] quickSortArrayRand = new int[size];
                int[] quickSortMedianArray = new int[size];
                int[] heapSortArray = new int[size];
                int[] selectionSortArray = new int[size];

                if (size == 0) {
                    System.out.println("Size of the array is 0.");
                } else if (size > 0) {
                    if (choice == 1) {
                        try (Scanner inputScanner = new Scanner(System.in)) {
                            System.out.println("Enter elements...");
                            for (int i = 0; i < size; i++) {
                                inputArray[i] = inputScanner.nextInt();
                            }
                        } catch (Exception e) {
                            System.out.println("Enter only integer values...");
                        }
                    } else {
                        int index = 0;
                        while (index != size) {
                            inputArray[index++] = (int) (Math.random() * 10000);
                        }
                    }

                    System.out.print("Given array: {");
                    printArray(inputArray);
                    System.out.println("}");

                    mergeSortArray = inputArray.clone();
                    insertionSortArray = inputArray.clone(); 
                    quickSortArray1El  = inputArray.clone();
                    quickSortArrayLast = inputArray.clone();
                    quickSortArrayRand = inputArray.clone();
                    quickSortMedianArray = inputArray.clone();
                    heapSortArray = inputArray.clone();
                    bubbleSortArray = inputArray.clone();
                    selectionSortArray = inputArray.clone();

                    long startMergeSort = System.currentTimeMillis();
                    callMergeSort(mergeSortArray);
                    long endMergeSort = System.currentTimeMillis();
                    System.out.println("Time taken for merge sort: " + (endMergeSort - startMergeSort) + " milliseconds");

                    long startHeapSort = System.currentTimeMillis();
                    callHeapSort(heapSortArray);
                    long endHeapSort = System.currentTimeMillis();
                    System.out.println("Time taken for heap sort: " + (endHeapSort - startHeapSort) + " milliseconds");

                    long startQuickSort1El = System.currentTimeMillis();
                    callQuickSortPivot1stElem(quickSortArray1El);
                    long endQuickSort1El = System.currentTimeMillis();
                    System.out.println("Time taken for quick sort with Pivot 1st Element: " + (endQuickSort1El - startQuickSort1El) + " milliseconds");

                   long startQuickSortLast = System.currentTimeMillis();
                    callQuickSortPivotLastElem(quickSortArrayLast,0,quickSortArrayLast.length-1);
                    long endQuickSortLast = System.currentTimeMillis();
                    System.out.println("Time taken for quick sort with Pivot Last Element: " + (endQuickSortLast - startQuickSortLast) + " milliseconds");

                    long startQuickSortRandEl = System.currentTimeMillis();
                    callQuickSortPivotRandElem(quickSortArrayRand,0,quickSortArrayRand.length-1);
                    long endQuickSortRandEl = System.currentTimeMillis();
                    System.out.println("Time taken for quick sort with Pivot Random Element: " + (endQuickSortRandEl - startQuickSortRandEl) + " milliseconds");

                    
                    
                    long startMedianQuickSort = System.currentTimeMillis();
                    callQuickMedianSort(quickSortMedianArray);
                    long endMedianQuickSort = System.currentTimeMillis();
                    System.out.println("Time taken for median quick sort: " + (endMedianQuickSort - startMedianQuickSort) + " milliseconds");

                    long startInsertionSort = System.currentTimeMillis();
                    callInsertionSort(insertionSortArray);
                    long endInsertionSort = System.currentTimeMillis();
                    System.out.println("Time taken for insertion sort: " + (endInsertionSort - startInsertionSort) + " milliseconds");

                    long startSelectionSort = System.currentTimeMillis();
                    callSelectionSort(selectionSortArray);
                    long endSelectionSort = System.currentTimeMillis();
                    System.out.println("Time taken for Selection sort: " + (endSelectionSort - startSelectionSort) + " milliseconds");

                    long startBubbleSort = System.currentTimeMillis();
                    callBubbleSort(bubbleSortArray);
                    long endBubbleSort = System.currentTimeMillis();
                    System.out.println("Time taken for bubble sort: " + (endBubbleSort - startBubbleSort) + " milliseconds");
                } else {
                    System.out.println("Invalid input!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        } catch (Exception e) {
            System.out.println("Entered input is invalid...");
        }
    }
//calling Merge Sort-----------------------------------------
    public static void callMergeSort(int[] mergeSortArray) {
        int left = 0;
        int right = mergeSortArray.length - 1;
        mergeSortDivide(mergeSortArray, left, right);
    }

    public static void mergeSortDivide(int[] mergeSortArray, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortDivide(mergeSortArray, left, mid);
            mergeSortDivide(mergeSortArray, mid + 1, right);
            mergeSort(mergeSortArray, left, mid, right);
        }
    }

    public static void mergeSort(int[] mergeSortArray, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = mergeSortArray[left + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = mergeSortArray[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                mergeSortArray[k++] = leftArray[i++];
            } else {
                mergeSortArray[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            mergeSortArray[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            mergeSortArray[k++] = rightArray[j++];
        }
    }

//calling heap sort-----------------------------------------------------
    
    public static void callHeapSort(int[] array) {
    int len = array.length;
    int parentStart = (len - 1) / 2;

    // Heapify the input array
    for (int i = parentStart; i >= 0; i--) {
        Heapify(array, len, i);
    }

    // Deleting elements from the heap
    for (int end = len - 1; end >= 0; end--) {
        HeapSwaps(array, 0, end);
        Heapify(array, end, 0);
    }
}

public static void Heapify(int[] array, int len, int parent) {
    int leftChild = 2 * parent + 1;
    int rightChild = 2 * parent + 2;
    int largest = parent;
    if (leftChild < len && array[leftChild] > array[largest]) {
        largest = leftChild;
    }
    if (rightChild < len && array[rightChild] > array[largest]) {
        largest = rightChild;
    }
    if (largest != parent) {
        HeapSwaps(array, parent, largest);
        Heapify(array, len, largest);
    }
}

public static void HeapSwaps(int[] array, int child, int parent) {
    int temp = array[child];
    array[child] = array[parent];
    array[parent] = temp;
}



//calling Quick Sort with pivot at 1st element-----------------------------------------------------

    public static void callQuickSortPivot1stElem(int arrayForSorting[]) {
        int low = 0;
        int high = arrayForSorting.length - 1;
        QSort(arrayForSorting, low, high);
    }

    public static void QSort(int arrayForSorting[], int low, int high) {
        if (low < high) {
            int pivotPosition = QPartition(arrayForSorting, low, high);
            QSort(arrayForSorting, low, pivotPosition - 1);
            QSort(arrayForSorting, pivotPosition + 1, high);
        }
    }

    public static void QuickSwap(int arrayForSorting[], int low, int high) {
        int temp = 0;
        temp = arrayForSorting[low];
        arrayForSorting[low] = arrayForSorting[high];
        arrayForSorting[high] = temp;
    }

    public static int QPartition(int arrayForSorting[], int low, int high) {
        int pivot = arrayForSorting[low];
        int start = low;
        int end = high;
        while (start < end) {
            while (start <= high && arrayForSorting[start] <= pivot) {
                start++;
            }
            while (end >= low && arrayForSorting[end] > pivot) {
                end--;
            }
            if (start < end) {
                QuickSwap(arrayForSorting, start, end);
            } else {
                QuickSwap(arrayForSorting, low, end);
            }
        }
        return end;
    }
    
    // calling Quick Sort with Pivot as Last element-----------------------------------------
    
   public static int divide(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = (left - 1); 
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

   public static void callQuickSortPivotLastElem(int arr[], int left, int right) {
        if (left < right) {
            // Get the partition index
            int partitionIndex = divide(arr, left, right);

            // Recursively sort elements before and after partition
            callQuickSortPivotLastElem(arr, left, partitionIndex - 1);
            callQuickSortPivotLastElem(arr, partitionIndex + 1, right);
        }
    }
    
    //calling Quick Sort with Random element as Pivot----------------------------------------
    
    


    public static void selectRandomElemArray(int arr[], int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low) + low;

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        selectRandomElemArray(arr, low, high);
        int pivot = arr[high];

        int i = (low - 1); // Index of the smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void callQuickSortPivotRandElem(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            callQuickSortPivotRandElem(arr, low, partitionIndex - 1);
            callQuickSortPivotRandElem(arr, partitionIndex + 1, high);
        }
    }


    
    //calling Quick Sort with Median---------------------------------------------------------

public static void callQuickMedianSort(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    QuickSortMedian(arr, low, high);
}

public static void QuickSortMedian(int[] arr, int low, int high) {
    int size = high - low + 1;
    if (size <= 3) {
        SortForLessThanThree(arr, low, high);
    } else {
        int median = MedianOfThree(arr, low, high);
        int position = PartitionMedian(arr, low, high, median);
        QuickSortMedian(arr, low, position - 1);
        QuickSortMedian(arr, position + 1, high);
    }
}

public static int MedianOfThree(int[] arr, int left, int right) {
    int center = (left + right) / 2;

    if (arr[left] > arr[center]) {
        SwapMedian(arr, left, center);
    }

    if (arr[center] > arr[right]) {
        SwapMedian(arr, center, right);
    }

    if (arr[center] > arr[left]) {
        SwapMedian(arr, center, left);
    }

    return arr[center];
}

public static void SwapMedian(int[] arr, int low, int high) {
    int temp = arr[low];
    arr[low] = arr[high];
    arr[high] = temp;
}

public static int PartitionMedian(int[] arr, int low, int high, int median) {
    int pivot = median;
    int start = low;
    int end = high;

    while (start < end) {
        while (start <= high && arr[start] <= pivot) {
            start++;
        }

        while (end >= low && arr[end] > pivot) {
            end--;
        }

        if (start < end) {
            SwapMedian(arr, start, end);
        } else {
            SwapMedian(arr, low, end);
        }
    }

    return end;
}

public static void SortForLessThanThree(int[] arr, int left, int right) {
    int size = right - left + 1;
    if (size <= 1) {
        return;
    }

    if (size == 2) {
        if (arr[left] > arr[right]) {
            SwapMedian(arr, left, right);
        }
        return;
    } else {
        if (arr[left] > arr[right - 1]) {
            SwapMedian(arr, left, right - 1);
        }
        if (arr[left] > arr[right]) {
            SwapMedian(arr, left, right);
        }
        if (arr[right - 1] > arr[right]) {
            SwapMedian(arr, right - 1, right);
        }
    }
}


//Insertion Sort --------------------------------------------------------


public static void callInsertionSort(int arrayToSort[]) {
    int i, min, temp, j;
    for (i = 1; i < arrayToSort.length; i++) {
        min = arrayToSort[i];
        for (j = i; j > 0; j--) { // decreasing function
            if (arrayToSort[j - 1] > min) {
                temp = arrayToSort[j - 1];
                arrayToSort[j - 1] = min;
                arrayToSort[j] = temp;
            }
        }
    }
}

//Selection Sort-------------------------------------------------------


public static void callSelectionSort(int[] arrayToSort) {
    int minValue, i, index = 0, j, temp = 0;

    for (j = 0; j < arrayToSort.length; j++) {
        minValue = arrayToSort[j];
        index = j;

        for (i = j; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i + 1] < minValue) {
                index = i + 1;
                minValue = arrayToSort[i + 1];
            }
        }

        if (index != j) {
            temp = arrayToSort[j];
            arrayToSort[j] = arrayToSort[index];
            arrayToSort[index] = temp;
        }
    }
}


//Bubble Sort------------------------------------------------------------

public static void callBubbleSort(int[] array) {
    int temp;
    int pass = 0;
    while(pass < array.length) {
        for(int i = 0; i < array.length - 1; i++) 
        {
            // Compare adjacent elements
            if(array[i+1] < array[i]) {
                // Swap if they are in the wrong order
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        pass++;
    }
}



//printing array method--------------------------------------------------
    public static void printArray(int[] arr) {
        int index = 0;
        int size = arr.length;

        while (index != size) {
            System.out.print(arr[index++]);
            if (index != size)
                System.out.print(", ");
        }
    }
}
 

