/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package daaproject;

//import java.util.Random;
import java.util.*;
/**
 *
 * @author vnvar
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sizeTF = new javax.swing.JTextField();
        arrayTF = new javax.swing.JTextField();
        manualRB = new javax.swing.JRadioButton();
        randomRB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resTA = new javax.swing.JTextArea();
        displayButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(102, 153, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Size:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Array:");

        sizeTF.setToolTipText("Enter the size of Array");
        sizeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeTFActionPerformed(evt);
            }
        });

        arrayTF.setToolTipText("Enter Space Separated Integers");
        arrayTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrayTFActionPerformed(evt);
            }
        });

        buttonGroup1.add(manualRB);
        manualRB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manualRB.setText("Manual");

        buttonGroup1.add(randomRB);
        randomRB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        randomRB.setText("Random");
        randomRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomRBActionPerformed(evt);
            }
        });

        resTA.setEditable(false);
        resTA.setColumns(20);
        resTA.setRows(5);
        jScrollPane1.setViewportView(resTA);

        displayButton.setBackground(java.awt.Color.lightGray);
        displayButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayButton.setText("Display");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 51));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAA Sorting Algorithms ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("© Varad Nair");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(178, 178, 178)))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(manualRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(randomRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(displayButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearButton)))
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jButton1))
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(sizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(arrayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randomRB)
                    .addComponent(manualRB)
                    .addComponent(jLabel15)
                    .addComponent(sizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(arrayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(displayButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomRBActionPerformed

    arrayTF.setEnabled(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_randomRBActionPerformed

    private void arrayTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrayTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrayTFActionPerformed

    private void sizeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeTFActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed

        try{
        int size = Integer.parseInt(sizeTF.getText());

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
                    resTA.setText("Size of the array is 0.");
                } else if (size > 0) {
                    if (manualRB.isSelected()==true) {
                        try{
                            //input elements
                        String input = arrayTF.getText();
                        String[] splitArray = input.split(" ");
       
        for(int i = 0; i < splitArray.length; i++) {
            inputArray[i] = Integer.parseInt(splitArray[i]);
        }
                        } catch(Exception e) {
                            resTA.setText("Enter only integer values...");
                        }
                    } else {
                        
                        int index = 0;
                        while (index != size) {
                            inputArray[index++] = (int) (Math.random() * 10000);
                        }
                    }
//printing the array on console window instead of Text Area because of limited space
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
                    resTA.append("Time taken for merge sort:  -----------------------------------> " + (endMergeSort - startMergeSort) + " milliseconds\n");

                    long startHeapSort = System.currentTimeMillis();
                    callHeapSort(heapSortArray);
                    long endHeapSort = System.currentTimeMillis();
                    resTA.append("Time taken for heap sort:  -----------------------------------> " + (endHeapSort - startHeapSort) + " milliseconds\n");

                    long startQuickSort1El = System.currentTimeMillis();
                    callQuickSortPivot1stElem(quickSortArray1El);
                    long endQuickSort1El = System.currentTimeMillis();
                    resTA.append("Time taken for quick sort with Pivot 1st Element:  -----------------------------------> " + (endQuickSort1El - startQuickSort1El) + " milliseconds\n");

                   long startQuickSortLast = System.currentTimeMillis();
                    callQuickSortPivotLastElem(quickSortArrayLast,0,quickSortArrayLast.length-1);
                    long endQuickSortLast = System.currentTimeMillis();
                    resTA.append("Time taken for quick sort with Pivot Last Element:  -----------------------------------> " + (endQuickSortLast - startQuickSortLast) + " milliseconds\n");

                    long startQuickSortRandEl = System.currentTimeMillis();
                    callQuickSortPivotRandElem(quickSortArrayRand,0,quickSortArrayRand.length-1);
                    long endQuickSortRandEl = System.currentTimeMillis();
                    resTA.append("Time taken for quick sort with Pivot Random Element:  -----------------------------------> " + (endQuickSortRandEl - startQuickSortRandEl) + " milliseconds\n");

                    
                    
                    long startMedianQuickSort = System.currentTimeMillis();
                    callQuickMedianSort(quickSortMedianArray);
                    long endMedianQuickSort = System.currentTimeMillis();
                    resTA.append("Time taken for median quick sort:  -----------------------------------> " + (endMedianQuickSort - startMedianQuickSort) + " milliseconds\n");

                    long startInsertionSort = System.currentTimeMillis();
                    callInsertionSort(insertionSortArray);
                    long endInsertionSort = System.currentTimeMillis();
                    resTA.append("Time taken for insertion sort:  -----------------------------------> " + (endInsertionSort - startInsertionSort) + " milliseconds\n");

                    long startSelectionSort = System.currentTimeMillis();
                    callSelectionSort(selectionSortArray);
                    long endSelectionSort = System.currentTimeMillis();
                    resTA.append("Time taken for Selection sort:  -----------------------------------> " + (endSelectionSort - startSelectionSort) + " milliseconds\n");

                    long startBubbleSort = System.currentTimeMillis();
                    callBubbleSort(bubbleSortArray);
                    long endBubbleSort = System.currentTimeMillis();
                    resTA.append("Time taken for bubble sort:  -----------------------------------> " + (endBubbleSort - startBubbleSort) + " milliseconds\n");
                } else {
                    resTA.setText("Invalid input!");
                
        }
        }
        catch(Exception e)
        {
              System.out.println("Entered input is invalid...");
        
        }
// TODO add your handling code here:


    }//GEN-LAST:event_displayButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

arrayTF.setEnabled(true);
sizeTF.setText(null);
arrayTF.setText(null);
resTA.setText(null);
//manualRB.setSelected(false);
//randomRB.setSelected(false);
buttonGroup1.clearSelection();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//calling Merge Sort-----------------------------------------
    public static void callMergeSort(int[] mergeSortArray) {
        int leftm = 0;
        int rightm = mergeSortArray.length - 1;
        mergeSortDivide(mergeSortArray, leftm, rightm);
    }

    public static void mergeSortDivide(int[] mergeSortArray, int leftm, int rightm) {
        if (leftm < rightm) {
            int mid = (leftm + rightm) / 2;
            mergeSortDivide(mergeSortArray, leftm, mid);
            mergeSortDivide(mergeSortArray, mid + 1, rightm);
            mergeSort(mergeSortArray, leftm, mid, rightm);
        }
    }

    public static void mergeSort(int[] mergeSortArray, int leftm, int mid, int rightm) {
        int[] leftArray = new int[mid - leftm + 1];
        int[] rightArray = new int[rightm - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = mergeSortArray[leftm + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = mergeSortArray[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = leftm;

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
    int leftChildH = 2 * parent + 1;
    int rightChildH = 2 * parent + 2;
    int largest = parent;
    if (leftChildH < len && array[leftChildH] > array[largest]) {
        largest = leftChildH;
    }
    if (rightChildH < len && array[rightChildH] > array[largest]) {
        largest = rightChildH;
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
        int startQ = low;
        int endQ = high;
        while (startQ < endQ) {
            while (startQ <= high && arrayForSorting[startQ] <= pivot) {
                startQ++;
            }
            while (endQ >= low && arrayForSorting[endQ] > pivot) {
                endQ--;
            }
            if (startQ < endQ) {
                QuickSwap(arrayForSorting, startQ, endQ);
            } else {
                QuickSwap(arrayForSorting, low, endQ);
            }
        }
        return endQ;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField arrayTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton displayButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton manualRB;
    private javax.swing.JRadioButton randomRB;
    private javax.swing.JTextArea resTA;
    private javax.swing.JTextField sizeTF;
    // End of variables declaration//GEN-END:variables
}
