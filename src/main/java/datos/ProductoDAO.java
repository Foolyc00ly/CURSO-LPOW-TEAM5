package datos;
import java.util.*;
import java.sql.*;
import domain.ProductoDTO;
import static datos.config.ConexionNew.*;
public class ProductoDAO implements IProductoDAO{
    private Connection conexionTransaccional;
    private static final String SQL_SELECT="select "+
        "Codigo_Producto,Nombre_Producto,Modelo,Capacidad,imagen from Producto";
    private static final String SQL_INSERT="insert into "+
        "Producto(Nombre_Producto,Modelo,Capacidad,imagen) "+
            "values (?,?,?,?)";
    private static final String SQL_UPDATE="update Producto "+
        "set Nombre_Producto=?,Modelo=?,Capacidad=?,imagen=? "+
            "where Codigo_Producto=?";
    private static final String SQL_DELETE="delete from Producto "+
        "where Codigo_Producto=?";

    public ProductoDAO(){}
    public ProductoDAO(Connection conexionTransaccional){
        this.conexionTransaccional=conexionTransaccional;
    }
    @Override
    public List<ProductoDTO> seleccionar(){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ProductoDTO producto=null;
        List<ProductoDTO> productos=new ArrayList<>();
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while(rs.next()){
                int codProducto=rs.getInt("Codigo_Producto");
                String nomProducto=rs.getString("Nombre_Producto");
                String modelo=rs.getString("Modelo");
                String capacidad=rs.getString("Capacidad");
                String imagen=rs.getString("imagen");
                producto=new ProductoDTO(codProducto,nomProducto,modelo,capacidad,imagen);
                productos.add(producto);
            }
        }catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return productos;
    }
    @Override
    public int insertar(ProductoDTO producto){
        Connection conn=null;
        PreparedStatement stmt=null;
        int registros=0;
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,producto.getNombreProducto());
            stmt.setString(2,producto.getModelo());
            stmt.setString(3,producto.getCapacidad());
            stmt.setString(4,producto.getImagen());
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
    public int actualizar(ProductoDTO producto){
        Connection conn=null;
        PreparedStatement stmt=null;
        int registros=0;
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,producto.getNombreProducto());
            stmt.setString(2,producto.getModelo());
            stmt.setString(3,producto.getCapacidad());
            stmt.setString(4,producto.getImagen());
            stmt.setInt(5,producto.getCodigoProducto());
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
    public int eliminar(ProductoDTO producto){
        Connection conn=null;
        PreparedStatement stmt=null;
        int registros=0;
        try{
            conn = getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,producto.getCodigoProducto());
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
