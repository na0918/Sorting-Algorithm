public class InsertionSort extends AwesomeSort{

    @Override
    public int[] sort(int[] arr) {
        int[] x = arr.clone();
        int n = x.length;

        for(int i = 1; i < n; i++) {
            int CurrentElement = x[i];
            int j = i - 1;
           while (j >= 0 && x[j] > CurrentElement) {
               int tmp = x[j + 1];
               x[j + 1] = x[j];
               x[j] = tmp;
               j = j - 1;
           }
           x[j + 1] = CurrentElement;
        }
        return x;
    }
}
