package datos;
import java.util.*;
import java.sql.*;
import domain.ConsultaDTO;
import static datos.config.ConexionNew.*;
public class ConsultaDAO implements IConsultaDAO{
    private Connection conexionTransaccional;
    private static final String SQL_SELECT="select "+
        "codigoconsulta,nombre,email,asunto,sugerencia from consulta";
    private static final String SQL_INSERT="insert into "+
        "consulta(nombre,email,asunto,sugerencia) "+
            "values (?,?,?,?)";
    private static final String SQL_UPDATE="update consulta "+
        "set nombre=?,email=?,asunto=?,sugerencia=? "+
            "where codigoconsulta=?";
    private static final String SQL_DELETE="delete from consulta "+
        "where codigoconsulta=?";


    @Override
    public List<ConsultaDTO> seleccionar(){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ConsultaDTO consulta=null;
        List<ConsultaDTO> consultas=new ArrayList<>();
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while(rs.next()){
                int codConsulta=rs.getInt("codigoconsulta");
                String nombre=rs.getString("nombre");
                String email=rs.getString("email");
                String asunto=rs.getString("asunto");
                String sugerencia=rs.getString("sugerencia");
                consulta=new ConsultaDTO(codConsulta,nombre,email,asunto,sugerencia);
                consultas.add(consulta);
            }
        }catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return consultas;
    }
    @Override
    public int insertar(ConsultaDTO consulta){
        Connection conn=null;
        PreparedStatement stmt=null;
        int registros=0;
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,consulta.getNombre());
            stmt.setString(2,consulta.getEmail());
            stmt.setString(3,consulta.getAsunto());
            stmt.setString(4,consulta.getSugerencia());
            registros=stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            close(stmt);
            close(conn);
        }
        return registros;
    }
    @Override
    public int actualizar(ConsultaDTO consulta){
        Connection conn=null;
        PreparedStatement stmt=null;
        int registros=0;
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,consulta.getNombre());
            stmt.setString(2,consulta.getEmail());
            stmt.setString(3,consulta.getAsunto());
            stmt.setString(4,consulta.getSugerencia());
            stmt.setInt(5,consulta.getCodigoConsulta());
            registros=stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            close(stmt);
            close(conn);
        }
        return registros;
    }
    @Override
    public int eliminar(ConsultaDTO consulta){
        Connection conn=null;
        PreparedStatement stmt=null;
        int registros=0;
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,consulta.getCodigoConsulta());
            registros=stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            close(stmt);
            close(conn);
        }
        return registros;
    }
}
