package conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    private static final String url = "jdbc:mysql://localhost/bd_systemEF";
    private static final String user = "root";
    private static final String password = "root";                             //
    //private static final String password = "S01l05s23l07";

    public static Connection getConexao() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!" + e.getMessage());
        }

        return con;
    }
}
