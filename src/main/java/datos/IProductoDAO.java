package datos;
import static domain.ProductoDTO.*;
import java.sql.*;
import java.util.*;
import domain.ProductoDTO;
public interface IProductoDAO {
    public abstract List<ProductoDTO> seleccionar()throws SQLException;
    public abstract int insertar(ProductoDTO producto)throws SQLException;
    public abstract int actualizar(ProductoDTO producto)throws SQLException;
    public abstract int eliminar(ProductoDTO producto)throws SQLException;
}
