package domain;
public class ProductoDTO {
    private int codigoProducto;
    private String nombreProducto;
    private String modelo;
    private String capacidad;
    private String imagen;
    public ProductoDTO(){}
    public ProductoDTO(int codigoProducto){this.codigoProducto=codigoProducto;}
    public ProductoDTO(
        String nombreProducto,
        String telefomodelono,
        String capacidad,
        String imagen
    ){
        this.nombreProducto=nombreProducto;
        this.modelo=telefomodelono;
        this.capacidad=capacidad;
        this.imagen=imagen;
    }
    public ProductoDTO(
        int codigoProducto,
        String nombreProducto,
        String modelo,
        String capacidad,
        String imagen
    ){
        this.codigoProducto=codigoProducto;
        this.nombreProducto=nombreProducto;
        this.modelo=modelo;
        this.capacidad=capacidad;
        this.imagen=imagen;
    }

    public int getCodigoProducto(){return this.codigoProducto;}
    public void setCodigoProducto(int codigoProducto){
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto(){return this.nombreProducto;}
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getModelo(){return this.modelo;}
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCapacidad(){return this.capacidad;}
    public void setCapacidad(String capacidad){
        this.capacidad = capacidad;
    }

    public String getImagen(){return this.imagen;}
    public void setImagen(String imagen){
        this.imagen=imagen;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoDTO{codigoProducto=").append(codigoProducto);
        sb.append(", nombreProducto=").append(nombreProducto);
        sb.append(", modelo=").append(modelo);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", imagen=").append(imagen);
        sb.append('}');
        return sb.toString();
    }



}
