package app;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.event.Event;

public class Buttons {
    public static int TotalIns = 0;
    private Button button;
    private Stage FCstage;
    private MenuButton menuB;
    private int In1 = 0;
    private int In2 = 0;

    public Button getButton() {
        return button;
    }

    public void setButton(Buttons button, ButtonEnum Type) throws FileNotFoundException {
        Button buttonGeneric = new Button();
        if(Type == ButtonEnum.VButton1){
            Icon IconAND = new Icon();
            IconAND.setImageView(IconAND,IconEnum.AND);
            buttonGeneric.setGraphic(IconAND.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconAND.getImageView(),"AND"));
        }else if(Type == ButtonEnum.VButton2){
            Icon IconNAND = new Icon();
            IconNAND.setImageView(IconNAND,IconEnum.NAND);
            buttonGeneric.setGraphic(IconNAND.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconNAND.getImageView(),"NAND"));
        }else if(Type == ButtonEnum.VButton3){
            Icon IconNOR = new Icon();
            IconNOR.setImageView(IconNOR,IconEnum.NOR);
            buttonGeneric.setGraphic(IconNOR.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconNOR.getImageView(),"NOR"));
        }else if(Type == ButtonEnum.VButton4){
            Icon IconNOT = new Icon();
            IconNOT.setImageView(IconNOT,IconEnum.NOT);
            buttonGeneric.setGraphic(IconNOT.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconNOT.getImageView(),"NOT"));
        }else if(Type == ButtonEnum.VButton5){
            Icon IconOR = new Icon();
            IconOR.setImageView(IconOR,IconEnum.OR);
            buttonGeneric.setGraphic(IconOR.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconOR.getImageView(),"OR"));
        }else if(Type == ButtonEnum.VButton6){
            Icon IconXNOR = new Icon();
            IconXNOR.setImageView(IconXNOR,IconEnum.XNOR);
            buttonGeneric.setGraphic(IconXNOR.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconXNOR.getImageView(),"XNOR"));
        }else if(Type == ButtonEnum.VButton7){
            Icon IconXOR = new Icon();
            IconXOR.setImageView(IconXOR,IconEnum.XOR);
            buttonGeneric.setGraphic(IconXOR.getImageView());
            buttonGeneric.setOnDragDetected(event -> Bevents.DragDetected(event,IconXOR.getImageView(),"XOR"));
        }else if(Type == ButtonEnum.HButton1){
            Icon IconSETTINGS = new Icon();
            IconSETTINGS.setImageView(IconSETTINGS,IconEnum.SETTINGS);
            buttonGeneric.setGraphic(IconSETTINGS.getImageView());
        }else if(Type == ButtonEnum.HButton2){
            Icon IconRESTART = new Icon();
            IconRESTART.setImageView(IconRESTART,IconEnum.RESTART);
            buttonGeneric.setGraphic(IconRESTART.getImageView());
            buttonGeneric.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    Main.Group.getChildren().clear();
                    Bevents.BarIns.getItems().clear();
                    TotalIns = 0;
                }
            });
        }else if(Type == ButtonEnum.HButton3){
            Icon IconOPEN = new Icon();
            IconOPEN.setImageView(IconOPEN,IconEnum.OPEN);
            buttonGeneric.setGraphic(IconOPEN.getImageView());
            buttonGeneric.setOnAction(event -> {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Choose a Logical Gates Diagram to open");
                fileChooser.showOpenDialog(FCstage);
            });

        }else if(Type == ButtonEnum.HButton4){
            Icon IconSAVE = new Icon();
            IconSAVE.setImageView(IconSAVE,IconEnum.SAVE);
            buttonGeneric.setGraphic(IconSAVE.getImageView());
            buttonGeneric.setOnAction(event -> {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Choose where you want to save your Logical Gates Diagram");
                fileChooser.showOpenDialog(FCstage);
            });
        }else if(Type == ButtonEnum.HButton5){
            Icon IconRUN = new Icon();
            IconRUN.setImageView(IconRUN,IconEnum.RUN);
            buttonGeneric.setGraphic(IconRUN.getImageView());
            buttonGeneric.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if(Buttons.TotalIns == 0) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Void");
                        alert.setContentText("Type a Gate");
                        alert.show();
                    }
                    else if(Buttons.TotalIns >12 ) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Insoportable");
                        alert.setContentText("Maximo De Compuertas Alcanzado");
                        alert.show();
                    }else {
                        Bevents.Tabla.getColumns().clear();
                        Bevents.AgregarColumnas(Bevents.Tabla);
                        Bevents.Ww();

                    }

                }
            });


        }else if(Type == ButtonEnum.HButton6){
            Icon IconHELP = new Icon();
            IconHELP.setImageView(IconHELP,IconEnum.HELP);
            buttonGeneric.setGraphic(IconHELP.getImageView());
            buttonGeneric.setOnAction(event -> {
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/diabloget/CircuitDesigner").toURI());
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }

            });
        }else {
            buttonGeneric.setText("Si entra a este else es porque de fijo usted perdió el semestre.");
        }
        this.button = buttonGeneric;
    }

    public MenuButton getMenuB(){
        return menuB;
    }
    public void SetMenuB(Buttons menuB, MenuEnum Type, Buttons MenuItem, Buttons MenuItem2, MenuItemType Type2, MenuItemType Type3, String Name) {

        MenuButton newMenuB = new MenuButton();
        if(Type==MenuEnum.Ins) {
            newMenuB.setText(Name +" Inputs "+ TotalIns);

        }else {
            newMenuB.setText("Default");

        }
        javafx.scene.control.MenuItem newMenuI = new javafx.scene.control.MenuItem();
        if(Type2 == MenuItemType.In_1) {

            newMenuI.setText("Type In1 = "+ In1);
            newMenuI.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if(In1 == 0) {
                        In1 = 1;
                        newMenuI.setText("Type In1 = "+ In1);
                        Bevents.SetIns(In1, In2, Name);
                    }else {
                        In1 = 0;
                        newMenuI.setText("Type In1 = "+ In1);
                        Bevents.SetIns(In1, In2, Name);
                    }
                }
            });

        }else {
            newMenuI.setText("Default");
        }
        javafx.scene.control.MenuItem NewMenuI2 = new MenuItem();
        if(Type3 == MenuItemType.In_2) {
            NewMenuI2.setText("Type In 2 = " + In2);
            NewMenuI2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if(In2 == 0) {
                        In2 = 1;
                        NewMenuI2.setText("Type In2 = " + In2);
                        Bevents.SetIns(In1, In2, Name);
                    }else {
                        In2 = 0;
                        NewMenuI2.setText("Type In2 = " + In2);
                        Bevents.SetIns(In1, In2, Name);
                    }
                }
            });
        }else {
            NewMenuI2.setText("Default");
        }
        if(Name == "NOT" ) {
            newMenuB.getItems().addAll(newMenuI);
        }else {
            newMenuB.getItems().addAll(newMenuI,NewMenuI2);
        }
        this.menuB = newMenuB;
    }
}