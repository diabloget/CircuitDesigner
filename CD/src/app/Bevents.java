package app;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private static double PositionSceneX, PositionSceneY;
    static Gates Gate  = new Gates();
    private static double PositionTranslateX, PositionTranslateY;
    public static TableView Tabla = new TableView();
    public static ToolBar BarIns = new ToolBar();

    public static void Ww() {
        Stage stage = new Stage();
        BorderPane Panel = new BorderPane();
        Panel.setLeft(BarIns);
        Panel.setCenter(Tabla);
        Tabla.setPlaceholder(new Label("There is no gates in the diagram"));
        BarIns.setOrientation(Orientation.VERTICAL);
        stage.setTitle("Set Inputs | Truth Table ");
        stage.setScene(new Scene(Panel, 500, 500));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
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
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void AgregarColumnas(TableView TableView) {
        TableView.getItems().clear();
        TableColumn InputsGroupColumn = new TableColumn("Ins");
        InputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
        TableColumn OutputsGroupColumn = new TableColumn("Outs");
        OutputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
        int u = Buttons.TotalIns;
        int temp = u-1;
        int temp1 = 0;
        String [][] Values = new String[u][(int) Math.pow(2, u)];
        for (int x = 0; x < u; x++) {
            double temp2 = Math.pow(2, u)-1;

            String name = "In "+x;
            TableColumn InputColumn = new TableColumn(name);
            InputColumn.setCellValueFactory(new PropertyValueFactory<>("In"+x));
            InputColumn.setStyle("-fx-background-color:#F4F2F5");
            for(int y = 0; y < Math.pow(2,temp1); y++) {

                for(int w = 0; w < Math.pow(2,temp); w++) {

                    Values[temp][(int) temp2] = "1";
                    if(temp2!=0) {
                        temp2--;
                    }
                }
                for(int z = 0; z < Math.pow(2,temp); z++) {

                    Values[temp][(int) temp2] = "0";
                    if(temp2!=0) {
                        temp2--;
                    }
                }
            }
            temp--;
            temp1++;
            InputsGroupColumn.getColumns().add(InputColumn);
        }
        for (int j=0; j < Values.length; j++) {
            for (int h=0; h < Values[j].length; h++) {
            }
        }
        int x = 0;
        for(int y=0;y<Math.pow(2, u);y++) {

            if(u==0) {

            }else if(u==1) {
                TableView.getItems().add(new Booleans(Values[x][y],"","","","","","","","","", null, null));
            }else if(u==2) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],"","","","","","","","", null, null));
            }else if(u==3) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],"","","","","","","", null, null));
            }else if(u==4) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],"","","","","","", null, null));
            }else if(u==5) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],"","","","","", null, null));
            }else if(u==6) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],"","","","", null, null));
            }else if(u==7) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],Values[x+6][y],"","","", null, null));
            }else if(u==8) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],Values[x+6][y],Values[x+7][y],"","", null, null));
            }else if(u==9) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],Values[x+6][y],Values[x+7][y],Values[x+8][y],"", null, null));
            }else if(u==10) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],Values[x+6][y],Values[x+7][y],Values[x+8][y],Values[x+9][y], null, null));
            }else if(u==11) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],Values[x+6][y],Values[x+7][y],Values[x+8][y],Values[x+9][y],Values[x+10][y], null));
            }else if(u==12) {
                TableView.getItems().add(new Booleans(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y],Values[x+5][y],Values[x+6][y],Values[x+7][y],Values[x+8][y],Values[x+9][y], Values[x+10][y], Values[x+11][y]));
            }
        }
        InputsGroupColumn.setStyle("-fx-background-color: ");
        OutputsGroupColumn.setStyle("-fx-background-color: ");
        TableView.getColumns().addAll(InputsGroupColumn, OutputsGroupColumn);
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
        SetIns(0,0, Name);
        if(Name == "NOT"){
            Buttons.TotalIns++;
        }else {
            Buttons.TotalIns++;
            Buttons.TotalIns++;
        }
        AddEntradas(BarIns, Name);
        Main.Group.getChildren().add(rectangle);

    }
    public static void SetIns(int In_1, int In_2 , String Name) {
        if(Name == "AND") {
            Gate.setLogic(Gate, Gates.GEnum.AND, In_1, In_2);
        }else if(Name == "OR") {
            Gate.setLogic(Gate, Gates.GEnum.OR, In_1, In_2);
        }else if(Name == "NOT") {
            Gate.setLogic(Gate, Gates.GEnum.NOT, In_1, In_2);
        }else if(Name == "NAND") {
            Gate.setLogic(Gate, Gates.GEnum.NAND, In_1, In_2);
        }else if(Name == "NOR") {
            Gate.setLogic(Gate, Gates.GEnum.NOR, In_1, In_2);
        }else if(Name == "XOR") {
            Gate.setLogic(Gate, Gates.GEnum.XOR, In_1, In_2);
        }else if(Name == "XNOR") {
            Gate.setLogic(Gate, Gates.GEnum.XNOR, In_1, In_2);
        }
    }


    public static void AddEntradas(ToolBar ToolBar, String Name) {
        Buttons In1 = new Buttons();
        Buttons SetIn1 = new Buttons();
        Buttons SetIn2 = new Buttons();
        In1.SetMenuB(In1, MenuEnum.Ins, SetIn1 , SetIn2, MenuItemType.In_1, MenuItemType.In_2 , Name);

        // ToolBar.setStyle("-fx-background-color: ");
        ToolBar.getItems().add(In1.getMenuB());

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
