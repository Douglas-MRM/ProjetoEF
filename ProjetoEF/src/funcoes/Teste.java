package funcoes;

/**
 *
 * @author Jerônimo
 */
public class Teste {

    public static void main(String[] args) {
        Mensagem msg = new Mensagem();

        msg.Mensagem("0", "0", 0);
        msg.Mensagem("1", "1", 1);
        msg.Mensagem("2", "2", 2);
        msg.Mensagem("3", "3", 3);

        String temp = "ja                                                va";
        System.out.print(temp.replace(" ", ""));

    }
   
}
