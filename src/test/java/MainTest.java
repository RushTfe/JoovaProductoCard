import Joova.ProductoCardController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainTest extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox();

        ProductoCardController card = new ProductoCardController();
        card.getModel().setNombreProducto("Aspiradora");
        card.getModel().setPrecio(1952.2);
        card.getModel().setTipoProducto("Tipo: My Ass");

        ProductoCardController card1 = new ProductoCardController();
        card1.getModel().setNombreProducto("Aspiradora2");
        card1.getModel().setPrecio(1952.2);
        card1.getModel().setTipoProducto("Tipo: My Ass");

        ProductoCardController card2 = new ProductoCardController();
        card2.getModel().setNombreProducto("Aspiradora3 flhnilf lufh alhf oñasf lasf lkjsvhsahdvhio asñvh ñollvls lhav lah lahv ahvoñrhav ñoasvh");
        card2.getModel().setPrecio(1952.2);
        card2.getModel().setTipoProducto("Tipo: My Ass");

        ProductoCardController card3 = new ProductoCardController();
        card3.getModel().setNombreProducto("Aspiradora3");
        card3.getModel().setPrecio(1952.2);
        card3.getModel().setTipoProducto("Tipo: My Ass");

        ProductoCardController card4 = new ProductoCardController();
        card4.getModel().setNombreProducto("Aspiradora3");
        card4.getModel().setPrecio(1952.2);
        card4.getModel().setTipoProducto("Tipo: My Ass");


        box.getChildren().addAll(card, card1, card2, card3, card4);
        box.setSpacing(20d);
        box.setPadding(new Insets(5, 5, 5, 5));

        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();

    }

    public  static void main(String[] args) {
        launch(args);
    }
}
