public class RotacionarVetor {

    public static void main(String[] args) {

        int[] v = {1, 2, 3, 4, 5};
        int k = 2;

        rotacionar(v, v.length, k);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void rotacionar(int[] v, int tam, int k) {

        if (k > 0) {
            for (int r = 0; r < k; r++) {

                int primeiro = v[0];

                for (int i = 0; i < tam - 1; i++) {
                    v[i] = v[i + 1];
                }

                v[tam - 1] = primeiro;
            }
        }

        if (k < 0) {
            k = -k;

            for (int r = 0; r < k; r++) {

                int ultimo = v[tam - 1];

                for (int i = tam - 1; i > 0; i--) {
                    v[i] = v[i - 1];
                }

                v[0] = ultimo;
            }
        }
    }
}