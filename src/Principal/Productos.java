package Principal;






/**
 *
 * @author gabriel gonzalez
 */
public class Productos {
    
    String Mesero,Mesa,Codigo,Nombre,Cantidad,Precio;

    public Productos(String Mesero, String NumMesa, String Codigo, String Nombre, String Cantidad, String Precio) {
        this.Mesero = Mesero;
        this.Mesa = NumMesa;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public String getMesero() {
        return Mesero;
    }

    public void setMesero(String Mesero) {
        this.Mesero = Mesero;
    }

    public String getMesa() {
        return Mesa;
    }

    public void setMesa(String Mesa) {
        this.Mesa = Mesa;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

}