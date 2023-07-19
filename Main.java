import stacks.linear_search.Graph;
import stacks.linear_search.Node;

import java.util.Arrays;
import java.util.Hashtable;

public class Main {

    public static Hashtable<Integer,String> hashTables(){
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(100, "Spring Boot");
        hashtable.put(325, "Spring Security");
        hashtable.put(270, "Spring Data JPA");
        hashtable.put(400, "Spring Framework");
        hashtable.put(345, "Java");
        return  hashtable;
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        int temp = array[end];
        array[end] = array[i];
        array[i] = temp;
        return i;
    }

    public static int factorial(int number) {
        if (number <= 1) return 1;
        return number * factorial(number - 1);
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (array.length > 1) {
            int middle = length / 2;
            int[] left = Arrays.copyOfRange(array, 0, middle);
            int[] right = Arrays.copyOfRange(array, middle, length);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, array);
        }
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }


    }

    public static void main(String[] args) {
//        System.out.println(linearSearch(new int[]{10, 30, 34, 12, 67, 89, 44, 69}, 67));
//        System.out.println(interpolationSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
//
//        int[] arrays = {10, 30, 34, 12, 67, 89, 44, 69, 13, 28, 23, 40, 31};
//        //mergeSort(arrays);
//        quickSort(arrays, 0, arrays.length - 1);
//        System.out.println("Arrays: " + Arrays.toString(arrays));
//        //System.out.println("Bubble Sort: "+ Arrays.toString(insertionSort(arrays)));
//
//        int num = 6;
//        System.out.println("factorial(num) = " + factorial(num));
//
//        //Hashtables
//        Hashtable<Integer,String> hashTables = hashTables();
//        System.out.println("hashTables = " + hashTables);
//
//
        //Graphs
        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,2);
        graph.addEdge(1,4);
        graph.addEdge(4,0);
        //graph.prints();
        graph.breathFirstSearch(3);

    }


    private static int linearSearch(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        while (low <= high) {
            middle = (high + low) / 2;
            if (array[middle] == item) {
                return middle;
            } else if (item < array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;

    }

    private static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high && target >= array[low] && target <= array[high]) {
            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);
            if (array[pos] == target) {
                return pos;
            } else if (target < array[pos]) {
                high = pos - 1;
            } else {
                low = pos + 1;
            }
        }
        return -1;
    }

    private static int[] bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n - 1; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return array;
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
        return array;
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int hole = i;
            while (hole > 0 && value < array[hole - 1]) {
                array[hole] = array[hole - 1];
                hole--;
            }
            array[hole] = value;
        }
        return array;
    }

}