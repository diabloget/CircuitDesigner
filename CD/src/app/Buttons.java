package app;

import java.io.FileNotFoundException;
import javafx.scene.control.Button;
/* import javafx.event.ActionEvent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler; */

public class Buttons {
    private Button button;

    public Button getButton() {
        return button;
    }

    public void setButton(Buttons button, ButtonEnum Type) throws FileNotFoundException {
        Button buttonGeneric = new Button();
        if(Type == ButtonEnum.VButton1){
            Icon IconAND = new Icon();
            IconAND.setImageView(IconAND,IconEnum.AND);
            buttonGeneric.setGraphic(IconAND.getImageView());
        }else if(Type == ButtonEnum.VButton2){
            Icon IconNAND = new Icon();
            IconNAND.setImageView(IconNAND,IconEnum.NAND);
            buttonGeneric.setGraphic(IconNAND.getImageView());
        }else if(Type == ButtonEnum.VButton3){
            Icon IconNOR = new Icon();
            IconNOR.setImageView(IconNOR,IconEnum.NOR);
            buttonGeneric.setGraphic(IconNOR.getImageView());
        }else if(Type == ButtonEnum.VButton4){
            Icon IconNOT = new Icon();
            IconNOT.setImageView(IconNOT,IconEnum.NOT);
            buttonGeneric.setGraphic(IconNOT.getImageView());
        }else if(Type == ButtonEnum.VButton5){
            Icon IconOR = new Icon();
            IconOR.setImageView(IconOR,IconEnum.OR);
            buttonGeneric.setGraphic(IconOR.getImageView());
        }else if(Type == ButtonEnum.VButton6){
            Icon IconXNOR = new Icon();
            IconXNOR.setImageView(IconXNOR,IconEnum.XNOR);
            buttonGeneric.setGraphic(IconXNOR.getImageView());
        }else if(Type == ButtonEnum.VButton7){
            Icon IconXOR = new Icon();
            IconXOR.setImageView(IconXOR,IconEnum.XOR);
            buttonGeneric.setGraphic(IconXOR.getImageView());
        }else if(Type == ButtonEnum.HButton1){
            Icon IconSETTINGS = new Icon();
            IconSETTINGS.setImageView(IconSETTINGS,IconEnum.SETTINGS);
            buttonGeneric.setGraphic(IconSETTINGS.getImageView());
        }else if(Type == ButtonEnum.HButton2){
            Icon IconRESTART = new Icon();
            IconRESTART.setImageView(IconRESTART,IconEnum.RESTART);
            buttonGeneric.setGraphic(IconRESTART.getImageView());
        }else if(Type == ButtonEnum.HButton3){
            Icon IconOPEN = new Icon();
            IconOPEN.setImageView(IconOPEN,IconEnum.OPEN);
            buttonGeneric.setGraphic(IconOPEN.getImageView());
        }else if(Type == ButtonEnum.HButton4){
            Icon IconSAVE = new Icon();
            IconSAVE.setImageView(IconSAVE,IconEnum.SAVE);
            buttonGeneric.setGraphic(IconSAVE.getImageView());
        }else if(Type == ButtonEnum.HButton5){
            Icon IconRUN = new Icon();
            IconRUN.setImageView(IconRUN,IconEnum.RUN);
            buttonGeneric.setGraphic(IconRUN.getImageView());
        }else if(Type == ButtonEnum.HButton6){
            Icon IconHELP = new Icon();
            IconHELP.setImageView(IconHELP,IconEnum.HELP);
            buttonGeneric.setGraphic(IconHELP.getImageView());
        }else {
            buttonGeneric.setText("Fuck");
        }
        this.button = buttonGeneric;
    }
}