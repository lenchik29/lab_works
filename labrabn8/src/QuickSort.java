public class QuickSort {
        public static void sort(int[] arr)
        {
            sortRec(arr, 0, arr.length - 1);
        }
        private  static void sortRec(int[] arr, int low, int high)
        {
            if (low < high)
            {
                int middle = partition(arr, low, high);
                sortRec(arr, low, middle - 1);
                sortRec(arr, middle + 1, high);
            }
        }
        private static int partition(int[] arr, int low, int high)
        {
            int middle = arr[high];
            int middle1 = low;
            for (int  i = low; i < high; i++)
            {
                if (arr[i] <= middle)
                {
                    swap(arr, i, middle1);
                    middle1++;
                }
            }
            swap(arr, middle1, high);
            return middle1;
        }
        private static void swap (int[] arr, int x, int y)
        {
            if(x != y)
            {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[x] = temp;
            }
        }
    }

