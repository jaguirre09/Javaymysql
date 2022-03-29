
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Mercado {

    private static final String url = "jdbc:mysql://bjfpfb6vkomngmnvnltt-mysql.services.clever-cloud.com:3306/bjfpfb6vkomngmnvnltt";
    private static final String user = "u82zjd9jjumbbeyr";
    private static final String password = "NKg9qudTy7if5sxzL1VJ";

    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,password);
            if (con != null){
                System.out.println("Conexion Creada");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
