package datos;
import static domain.ConsultaDTO.*;
import java.sql.*;
import java.util.*;
import domain.ConsultaDTO;
public interface IConsultaDAO {
    public abstract List<ConsultaDTO> seleccionar()throws SQLException;
    public abstract int insertar(ConsultaDTO producto)throws SQLException;
    public abstract int actualizar(ConsultaDTO producto)throws SQLException;
    public abstract int eliminar(ConsultaDTO producto)throws SQLException;
}
