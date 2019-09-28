package app;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Buttons {
    private Button button;
    private Stage FCstage;

    public Button getButton() {
        return button;
    }

    public void setButton(Buttons button, ButtonEnum Type) throws FileNotFoundException {
        Button buttonGeneric = new Button();
        if(Type == ButtonEnum.VButton1){
            Icon IconAND = new Icon();
            IconAND.setImageView(IconAND,IconEnum.AND);
            buttonGeneric.setGraphic(IconAND.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconAND.getImageView(),"AND");
                }});
        }else if(Type == ButtonEnum.VButton2){
            Icon IconNAND = new Icon();
            IconNAND.setImageView(IconNAND,IconEnum.NAND);
            buttonGeneric.setGraphic(IconNAND.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconNAND.getImageView(),"NAND");
                }});
        }else if(Type == ButtonEnum.VButton3){
            Icon IconNOR = new Icon();
            IconNOR.setImageView(IconNOR,IconEnum.NOR);
            buttonGeneric.setGraphic(IconNOR.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconNOR.getImageView(),"NOR");
                }});
        }else if(Type == ButtonEnum.VButton4){
            Icon IconNOT = new Icon();
            IconNOT.setImageView(IconNOT,IconEnum.NOT);
            buttonGeneric.setGraphic(IconNOT.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconNOT.getImageView(),"NOT");
                }});
        }else if(Type == ButtonEnum.VButton5){
            Icon IconOR = new Icon();
            IconOR.setImageView(IconOR,IconEnum.OR);
            buttonGeneric.setGraphic(IconOR.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconOR.getImageView(),"OR");
                }});
        }else if(Type == ButtonEnum.VButton6){
            Icon IconXNOR = new Icon();
            IconXNOR.setImageView(IconXNOR,IconEnum.XNOR);
            buttonGeneric.setGraphic(IconXNOR.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconXNOR.getImageView(),"XNOR");
                }});
        }else if(Type == ButtonEnum.VButton7){
            Icon IconXOR = new Icon();
            IconXOR.setImageView(IconXOR,IconEnum.XOR);
            buttonGeneric.setGraphic(IconXOR.getImageView());
            buttonGeneric.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Bevents.DragDetected(event,IconXOR.getImageView(),"XOR");
                }});
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
                }
            });
        }else if(Type == ButtonEnum.HButton3){
            Icon IconOPEN = new Icon();
            IconOPEN.setImageView(IconOPEN,IconEnum.OPEN);
            buttonGeneric.setGraphic(IconOPEN.getImageView());
            buttonGeneric.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    FileChooser fileChooser = new FileChooser();
                    fileChooser.setTitle("Choose a Logical Gates Diagram to open");
                    fileChooser.showOpenDialog(FCstage);
                }
            });

        }else if(Type == ButtonEnum.HButton4){
            Icon IconSAVE = new Icon();
            IconSAVE.setImageView(IconSAVE,IconEnum.SAVE);
            buttonGeneric.setGraphic(IconSAVE.getImageView());
            buttonGeneric.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    FileChooser fileChooser = new FileChooser();
                    fileChooser.setTitle("Choose where you want to save your Logical Gates Diagram");
                    fileChooser.showOpenDialog(FCstage);
                }
            });
        }else if(Type == ButtonEnum.HButton5){
            Icon IconRUN = new Icon();
            IconRUN.setImageView(IconRUN,IconEnum.RUN);
            buttonGeneric.setGraphic(IconRUN.getImageView());
        }else if(Type == ButtonEnum.HButton6){
            Icon IconHELP = new Icon();
            IconHELP.setImageView(IconHELP,IconEnum.HELP);
            buttonGeneric.setGraphic(IconHELP.getImageView());
            buttonGeneric.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    try {
                        Desktop.getDesktop().browse(new URL("https://github.com/diabloget/CircuitDesigner").toURI());
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }

                }
            });
        }else {
            buttonGeneric.setText("Fuck");
        }
        this.button = buttonGeneric;
    }
}