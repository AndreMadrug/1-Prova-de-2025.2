public class VetorSemRepeticao {

    public static void main(String[] args) {

        int[] v = {5, 2, 5, 3, 3, 8, 3, 8, 2};
        int[] vsr = new int[v.length];

        int tam = gerarVetorSemRepeticao(v, v.length, vsr);

        for (int i = 0; i < tam; i++) {
            System.out.print(vsr[i] + " ");
        }
    }

    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {
            if (!existe(v[i], vsr, tamVSR)) {
                vsr[tamVSR] = v[i];
                tamVSR++;
            }
        }

        return tamVSR;
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