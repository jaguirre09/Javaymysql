import java.sql.Connection;
import javax.swing.JOptionPane;

public class Mysql {

    public static void main(String[] args) {
        Mercado sql = new Mercado();

        Connection con = sql.getConexion();

        JOptionPane.showMessageDialog(null, "la conexion esta " + con);    }
}
