public class Shellsort extends AwesomeSort{

    @Override
    public int[] sort(int[] arr) {
        int[] x = arr.clone();
        int n = x.length;

        for (int h = n / 2; h > 0; h = h / 2) {
            if ((h % 2) == 0) h++;

            for (int i = h; i < n; i++) {
                int CurrentElement = x[i];
                int j = i;
                while (j >= h && x[j - h] > CurrentElement) {
                    x[j] = x[j - h];
                    j = j + h;
                }
                x[j] = CurrentElement;
            }
        }
        return x;
    }
}

