package funcoes;

/**
 *
 * @author Jerônimo
 */
public class Test {

    public void teste(float num1, float num2) {
        float numero1 = num1;
        float numero2 = num2;

        float soma = numero1 + numero2;

        Mensagem msg = new Mensagem();
        msg.Mensagem("O resultado da soma é: " + soma, "Resultado da soma", -1);

    }

}
