import java.util.Scanner;

/*Elabore um algoritmo para calcular N! (fatorial de N). O valor inteiro N será fornecido pelo
usuário. Considerar, por definição, que N! = N * (N-1) * (N-2) * ... * 3 * 2 * 1 e 0! = 1 */
public class Lista1Exer6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n, fatorial = 0;
        System.out.println("Digite um numero inteiro");
        n = scan.nextInt();

        for (fatorial = 1; n > 1; n = n - 1) {
            fatorial = fatorial * n;

        }
        System.out.println("O resultado do fatorial é " + fatorial);

        scan.close();
    }
}
