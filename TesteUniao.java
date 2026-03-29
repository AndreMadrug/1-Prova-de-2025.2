public class TesteUniao {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        int[] u = new int[a.length + b.length];
        int tamU = uniao(a, a.length, b, b.length, u);

        for (int i = 0; i < tamU; i++) {
            System.out.print(u[i] + " ");
        }
    }

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            if (!existe(a[i], u, tamU)) {
                u[tamU] = a[i];
                tamU++;
            }
        }

        for (int i = 0; i < tamB; i++) {
            if (!existe(b[i], u, tamU)) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }

    public static boolean existe(int valor, int[] v, int tam) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == valor) {
                return true;
            }
        }
        return false;
    }
}