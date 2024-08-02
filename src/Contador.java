import java.util.Scanner;

public class Contador {    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int segundoParametro = terminal.nextInt();

        try {

            if (segundoParametro > primeiroParametro) {
                contar(primeiroParametro, segundoParametro);
            }else {
                throw new Exception();
            }
            
        } catch (Exception e) {
            
                System.out.println("O segundo parametro deve ser maior que o primeiro");
            
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) {
       
        int contagem = segundoParametro - primeiroParametro;

        for(int i = primeiroParametro; i < (contagem + primeiroParametro); i++){
            System.out.println("Imprimindo o número: " + (i+1));
        }

    }
    
}
