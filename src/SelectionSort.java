public class SelectionSort extends AwesomeSort {
    @Override
    public int[] sort(int[] arr) {
        int[] x = arr.clone();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            //최소값을 찾아서
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) min = j;
            }
            int tmp = x[i];
            x[i] = x[min];
            x[min] = tmp;
            //가장 왼쪽 값이랑 교환
        }
        return x;
    }
}
