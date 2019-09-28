package app;

import java.util.ArrayList;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Clase usada para organizar los eventos
 */
public class Bevents {
    private static Rectangle rectangle;
    private static double PositionSceneX,PositionSceneY;
    private static double PositionTranslateX,PositionTranslateY;
    private static int indexPrev = 0;
    private static String values = new String();
    private static int combinations;
    /**
     * Metodo para cuando se detecta que un boton esta siendo arrastrado
     * @param e
     * @param ImageView
     * @param Name
     */
    public static final void DragDetected(MouseEvent e, ImageView ImageView, String Name){
        Dragboard db= ImageView.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        Main.field.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Bevents.OnDragDropped(event, ImageView, Name);
            }
        });
        content.putString(Name);
        db.setContent(content);
        e.consume();
    }
    /**
     * Evento para establecer la compuerta en el panel despues de ser movida
     */
    private static EventHandler<MouseEvent> RectangleOnMouseDraggedEventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent t) {
            double offsetX = t.getSceneX() - PositionSceneX;
            double offsetY = t.getSceneY() - PositionSceneY;
            double newTranslateX = PositionTranslateX + offsetX;
            double newTranslateY = PositionTranslateY + offsetY;

            ((Rectangle)(t.getSource())).setTranslateX(newTranslateX);
            ((Rectangle)(t.getSource())).setTranslateY(newTranslateY);
        }
    };
    /**
     * Metodo para agregar las compuertas al panel
     * @param e
     * @param ImageView
     * @throws Exception
     */

    public static void OnDragDropped(DragEvent e,ImageView ImageView, String Name) {
        rectangle = new Rectangle(140,50);
        rectangle.setFill(new ImagePattern(ImageView.getImage()));
        rectangle.setCursor(Cursor.HAND);
        rectangle.setX(e.getSceneX());
        rectangle.setY(e.getSceneY());
        rectangle.setOnMousePressed(RectangleOnMousePressedEventHandler);
        rectangle.setOnMouseDragged(RectangleOnMouseDraggedEventHandler);
        rectangle.setId(Name);
        System.out.println(Name + " In: 0");
        Main.Group.getChildren().add(rectangle);

    }

    /**
     * Evento para mover una compuerta en el panel
     */
    private static EventHandler<MouseEvent> RectangleOnMousePressedEventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent t) {
            PositionSceneX = t.getSceneX();
            PositionSceneY = t.getSceneY();
            PositionTranslateX = ((Rectangle)(t.getSource())).getTranslateX();
            PositionTranslateY = ((Rectangle)(t.getSource())).getTranslateY();
        }
    };

}
