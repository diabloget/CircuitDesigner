package app;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    //Panel central.

    public static final Group Group = new Group();
    public static final Pane field = new Pane(Group);

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        Buttons VButton1 = new Buttons();
        Buttons VButton2 = new Buttons();
        Buttons VButton3 = new Buttons();
        Buttons VButton4 = new Buttons();
        Buttons VButton5 = new Buttons();
        Buttons VButton6 = new Buttons();
        Buttons VButton7 = new Buttons();
        Buttons HButton1 = new Buttons();
        Buttons HButton2 = new Buttons();
        Buttons HButton3 = new Buttons();
        Buttons HButton4 = new Buttons();
        Buttons HButton5 = new Buttons();
        Buttons HButton6 = new Buttons();

        Icon IconAND = new Icon();
        IconAND.setImageView(IconAND,IconEnum.AND);
        Icon IconNAND = new Icon();
        IconNAND.setImageView(IconNAND,IconEnum.NAND);
        Icon IconNOR = new Icon();
        IconNOR.setImageView(IconNOR,IconEnum.NOR);
        Icon IconNOT = new Icon();
        IconNOT.setImageView(IconNOT,IconEnum.NOT);
        Icon IconOR = new Icon();
        IconOR.setImageView(IconOR,IconEnum.OR);
        Icon IconXNOR = new Icon();
        IconXNOR.setImageView(IconXNOR,IconEnum.XNOR);
        Icon IconXOR = new Icon();
        IconXOR.setImageView(IconXOR,IconEnum.XOR);
        Icon IconSETTINGS = new Icon();
        IconSETTINGS.setImageView(IconSETTINGS,IconEnum.SETTINGS);
        Icon IconRESTART = new Icon();
        IconRESTART.setImageView(IconRESTART,IconEnum.RESTART);
        Icon IconOPEN = new Icon();
        IconOPEN.setImageView(IconOPEN,IconEnum.OPEN);
        Icon IconSAVE = new Icon();
        IconSAVE.setImageView(IconSAVE,IconEnum.SAVE);
        Icon IconRUN = new Icon();
        IconRUN.setImageView(IconRUN,IconEnum.RUN);
        Icon IconHELP = new Icon();
        IconHELP.setImageView(IconHELP,IconEnum.HELP);

        VButton1.setButton(VButton1,ButtonEnum.VButton1);
        VButton2.setButton(VButton2,ButtonEnum.VButton2);
        VButton3.setButton(VButton3,ButtonEnum.VButton3);
        VButton4.setButton(VButton4,ButtonEnum.VButton4);
        VButton5.setButton(VButton5,ButtonEnum.VButton5);
        VButton6.setButton(VButton6,ButtonEnum.VButton6);
        VButton7.setButton(VButton7,ButtonEnum.VButton7);
        HButton1.setButton(HButton1,ButtonEnum.HButton1);
        HButton2.setButton(HButton2,ButtonEnum.HButton2);
        HButton3.setButton(HButton3,ButtonEnum.HButton3);
        HButton4.setButton(HButton4,ButtonEnum.HButton4);
        HButton5.setButton(HButton5,ButtonEnum.HButton5);
        HButton6.setButton(HButton6,ButtonEnum.HButton6);


        //Toolbars
        ToolBar toolBarV = new ToolBar();
        toolBarV.getItems().addAll(VButton1.getButton(),VButton2.getButton(),VButton3.getButton(),VButton4.getButton(),VButton5.getButton(),VButton6.getButton(),VButton7.getButton());
        ToolBar toolBarH = new ToolBar();
        toolBarH.getItems().addAll(HButton1.getButton(),HButton2.getButton(),HButton3.getButton(),HButton4.getButton(),HButton5.getButton(),HButton6.getButton());
        toolBarH.setStyle("-fx-background-color: #2C3539");
        toolBarH.setOrientation(Orientation.VERTICAL);
        primaryStage.setTitle("Circuit Designer");

        // Evento para recibir en el field (pane)
        field.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent Bevent) {
                Bevent.acceptTransferModes(TransferMode.COPY_OR_MOVE); }
        });


        // Separación de los paneles

        BorderPane Pane = new BorderPane();
        Pane.setLeft(toolBarH);
        Pane.setBottom(toolBarV);
        Pane.setCenter(field);

        Scene scene = new Scene(Pane, 988, 710);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}