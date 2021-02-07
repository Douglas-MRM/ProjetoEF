package funcoes;

import javax.swing.JOptionPane;

public class Mensagem {

    public void Mensagem(String mensagem, String titulo, int icone) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, icone);
    }
}
