package datos.config;
import java.sql.*;
import javax.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;
public class ConexionNew {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/criogas?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="devmasters";
    private static BasicDataSource ds;
    public static DataSource getDataSource(){
        if(ds==null){
            ds=new BasicDataSource();
            ds.setUrl(JDBC_URL);
            ds.setUsername(JDBC_USER);
            ds.setPassword(JDBC_PASSWORD);
            ds.setInitialSize(150);
        }
        return ds;
    }
    public static Connection getConnection()throws SQLException{
        return getDataSource().getConnection();
    }
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Statement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

}
