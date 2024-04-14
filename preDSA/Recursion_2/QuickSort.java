package Recursion_2;

public class QuickSort {

    public static void quickSort(int []input, int startindex, int endindex){
        // Base Case
        if (startindex >= endindex) return;
        // Pivot Index 
        int pivotPos = pivot(input, startindex, endindex);
        quickSort(input, startindex, pivotPos - 1);
        quickSort(input, pivotPos + 1, endindex);
    }

    public static int pivot(int []arr, int sI, int eI){
        // Find pivot
        int pivotpos = sI;
        // Place pivot at its position
        int count = 0;
        for (int i = sI + 1; i <= eI; i++){
            if (arr[i] <= arr[pivotpos]){
                count++;
            }
        }
        int temp = arr[sI + count];
        arr[sI + count] = arr[pivotpos];
        arr[pivotpos] = temp;
        pivotpos = sI + count;

        // Ensure that elements <= pivot > elements
        int i = sI;
        int j = eI;
        // while (i < pivotpos && j > pivotpos){
        //     if (arr[i] > arr[pivotpos]){
        //         if (arr[j] < arr[pivotpos]){
        //         int tem = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = tem;                    
        //         i++;
        //         j--;
        //         }
        //     }
        //     i++;
        // 
        
        while (i < pivotpos && j >pivotpos) {
            while (arr[i] <= arr[pivotpos]) {
                i++;
            }
            while (arr[j] > arr[pivotpos]) {
                j--;
            }
            if (i < pivotpos && j > pivotpos) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotpos;
    }

    public static void main(String[] args) {
        int [] arr = {6,2,20,8,15,3,4};
        quickSort(arr, 0, arr.length -1);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
