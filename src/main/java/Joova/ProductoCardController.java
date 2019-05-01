package Joova;

import javafx.beans.binding.Bindings;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProductoCardController extends HBox implements Initializable {

    @FXML
    private HBox rootHbox;

    @FXML
    private ImageView imagenProducto;

    @FXML
    private VBox cajaProducto;

    @FXML
    private Label nombreProducto;

    @FXML
    private Label tipoServicio;

    @FXML
    private Label labelDescripcion;

    @FXML
    private VBox vboxExtras;

    @FXML
    private Button botonEstadisticas;

    @FXML
    private Label labelPrecio;

    @FXML
    private CheckBox aModificar;

    private ProductoCardModel model;

    public ProductoCardController() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/ProductoView.fxml"));
        loader.setController(this);
        loader.setRoot(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //getStylesheets().add("/ProductoCSS.css");
        model = new ProductoCardModel();

        /********************************************************
         *
         * Bindeos
         *
         ********************************************************/

        model.nombreProductoProperty().bindBidirectional(nombreProducto.textProperty());
        model.tipoProductoProperty().bindBidirectional(tipoServicio.textProperty());
        Bindings.bindBidirectional(labelPrecio.textProperty(), model.precioProperty(), new NumberStringConverter());
        model.rutaImagenProperty().bindBidirectional(imagenProducto.imageProperty());
        model.descripcionProperty().bindBidirectional(labelDescripcion.textProperty());
        aModificar.selectedProperty().bind(model.aModificarProperty());

        aModificar.setDisable(true);

        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (model.isaModificar())
                    model.setaModificar(false);
                else
                    model.setaModificar(true);

                event.consume();
            }
        };

        model.aModificarProperty().addListener(e -> {
            System.out.println(model.isaModificar());
        });
        rootHbox.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

    }

    public HBox getRootHbox() {
        return rootHbox;
    }

    public ProductoCardModel getModel() {
        return model;
    }

    public void setModel(ProductoCardModel model) {
        this.model = model;
    }
}
