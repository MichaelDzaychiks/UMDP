public class Sorting {

    // Selection Sort Maksimum Ascending
    public static void selectionMaxAsc(int data[],int n) {
        for(int i=n-1;i>0;i++){
            int index_max = 0;
            for(int j=1;j<=i;j++){
                if(data[j] > data[index_max]){
                    index_max = j;
                }
            }
            int temp = data[index_max];
            data[index_max] = data[i];
            data[i] = temp;
        }
    }

    public static void selectionSortMaximum_Descending(int[] data, int n) { for (int i=0; i<n; i++) {
        int index_max = i;
        for (int j=i+1; j<n; j++) {
            if (data[j] > data[index_max]) {
                index_max = j;
            }
        }

        int temp = data[index_max];
        data[index_max] = data[i];
        data[i] = temp;
    }

}

    // Selection Sort Minimum Ascending
    public static void selectionMinAsc(int data[],int n) {
        for (int i = n-1; i > 0; i--) {
            int index_max = 0;
            for (int j = i + 1; j <=i; j++) {
                if (data[j] > data[index_max]) {
                    index_max = j;
                }
            }
            int temp = data[index_max];
            data[index_max] = data[i];
            data[i] = temp;
        }
    }

    // Selection Sort Minimum Descending
    public static void selectionMinDesc(int data[], int n) {
        for (int i = n - 1; i > 0; i--) {
            int index_min = 0;
            for (int j = 1; j <= i; j++) {
                if (data[j] < data[index_min]) {
                    min = j;
                }
            }
            int temp = data[index_max];
            data[index_max] = data[i];
            data[i] = temp;
        }
    }

    // Shell Sort Ascending
    public static void shellSortAsc(int data[], int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = data[i];
                int j;
                for (j = i; j >= gap && data[j - gap] > temp; j -= gap) {
                    data[j] = data[j - gap];
                }
                data[j] = temp;
            }
        }
    }

    // Shell Sort Descending
    public static void shellSortDesc(int data[],int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = data[i];
                int j;
                for (j = i; j >= gap && data[j - gap] < temp; j -= gap) {
                    data[j] = data[j - gap];
                }
                data[j] = temp;
            }
        }
    }

    // Method untuk print array
    public static void printArray(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int data[] = {64, 25, 12, 22, 11};

        System.out.println("Data Awal:");
        printArray(data);

        selectionMinAsc(data);
        System.out.println("Selection Minimum Ascending:");
        printArray(data);

        selectionMinDesc(data);
        System.out.println("Selection Minimum Descending:");
        printArray(data);

        selectionMaxAsc(data);
        System.out.println("Selection Maksimum Ascending:");
        printArray(data);

        selectionMaxDesc(data);
        System.out.println("Selection Maksimum Descending:");
        printArray(data);

        shellSortAsc(data);
        System.out.println("Shell Sort Ascending:");
        printArray(data);

        shellSortDesc(data);
        System.out.println("Shell Sort Descending:");
        printArray(data);
    }
}