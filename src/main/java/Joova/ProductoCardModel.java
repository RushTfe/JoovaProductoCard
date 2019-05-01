package Joova;

import javafx.beans.property.*;
import javafx.scene.image.Image;

public class ProductoCardModel {
    private IntegerProperty codProducto;
    private StringProperty nombreProducto;
    private StringProperty descripcion;
    private StringProperty tipoProducto;
    private ObjectProperty<Image> rutaImagen;
    private DoubleProperty precio;
    private BooleanProperty aModificar;

    public ProductoCardModel() {
        codProducto = new SimpleIntegerProperty(this, "codProducto");
        nombreProducto = new SimpleStringProperty(this, "nombreProducto", "");
        descripcion = new SimpleStringProperty(this, "descripcion", "");
        tipoProducto = new SimpleStringProperty(this, "tipoProducto", "");
        rutaImagen = new SimpleObjectProperty<>(this, "rutaImagen");
        precio = new SimpleDoubleProperty(this, "precio");
        aModificar = new SimpleBooleanProperty(this, "aModificar", false);
    }

    public boolean isaModificar() {
        return aModificar.get();
    }

    public BooleanProperty aModificarProperty() {
        return aModificar;
    }

    public void setaModificar(boolean aModificar) {
        this.aModificar.set(aModificar);
    }

    public double getPrecio() {
        return precio.get();
    }

    public DoubleProperty precioProperty() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio.set(precio);
    }

    public int getCodProducto() {
        return codProducto.get();
    }

    public IntegerProperty codProductoProperty() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto.set(codProducto);
    }

    public String getNombreProducto() {
        return nombreProducto.get();
    }

    public StringProperty nombreProductoProperty() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto.set(nombreProducto);
    }

    public String getDescripcion() {
        return descripcion.get();
    }

    public StringProperty descripcionProperty() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    public String getTipoProducto() {
        return tipoProducto.get();
    }

    public StringProperty tipoProductoProperty() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto.set(tipoProducto);
    }

    public Image getRutaImagen() {
        return rutaImagen.get();
    }

    public ObjectProperty<Image> rutaImagenProperty() {
        return rutaImagen;
    }

    public void setRutaImagen(Image rutaImagen) {
        this.rutaImagen.set(rutaImagen);
    }
}
