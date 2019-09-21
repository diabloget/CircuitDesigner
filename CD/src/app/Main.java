package app;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        primaryStage.setTitle("Circuit Designer");

        // Código de la ToolBar Vertical + botones
        ToolBar toolBarV = new ToolBar();
        toolBarV.setOrientation(Orientation.VERTICAL);

        FileInputStream FIAND = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\And.jpg");
        Image AND = new Image(FIAND);
        ImageView IVAND = new ImageView(AND);
        Button Vbutton1 = new Button("", IVAND);
        toolBarV.getItems().add(Vbutton1);

        toolBarV.getItems().add(new Separator());

        FileInputStream FINAND = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Nand.jpg");
        Image NAND = new Image(FINAND);
        ImageView IVNAND = new ImageView(NAND);
        Button Vbutton2 = new Button("", IVNAND);
        toolBarV.getItems().add(Vbutton2);

        toolBarV.getItems().add(new Separator());

        FileInputStream FINOR = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Nor.jpg");
        Image NOR = new Image(FINOR);
        ImageView IVNOR = new ImageView(NOR);
        Button Vbutton3 = new Button("", IVNOR);
        toolBarV.getItems().add(Vbutton3);

        toolBarV.getItems().add(new Separator());

        FileInputStream FINOT = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Not.jpg");
        Image NOT = new Image(FINOT);
        ImageView IVNOT = new ImageView(NOT);
        Button Vbutton4 = new Button("", IVNOT);
        toolBarV.getItems().add(Vbutton4);

        toolBarV.getItems().add(new Separator());

        FileInputStream FIOR = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Or.jpg");
        Image OR = new Image(FIOR);
        ImageView IVOR = new ImageView(OR);
        Button Vbutton5 = new Button("", IVOR);
        toolBarV.getItems().add(Vbutton5);

        toolBarV.getItems().add(new Separator());

        FileInputStream FIXNOR = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Xnor.jpg");
        Image XNOR = new Image(FIXNOR);
        ImageView IVXNOR = new ImageView(XNOR);
        Button Vbutton6 = new Button("", IVXNOR);
        toolBarV.getItems().add(Vbutton6);

        toolBarV.getItems().add(new Separator());

        FileInputStream FIXOR = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Xor.jpg");
        Image XOR = new Image(FIXOR);
        ImageView IVXOR = new ImageView(XOR);
        Button Vbutton7 = new Button("", IVXOR);
        toolBarV.getItems().add(Vbutton7);

        // Código de la ToolBar Horizontal + botones
        ToolBar toolBarH = new ToolBar();

        FileInputStream FISETTINGS = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIconS\\Settings.png");
        Image SETTINGS = new Image(FISETTINGS);
        ImageView IVSETTINGS = new ImageView(SETTINGS);
        Button Hbutton1 = new Button("", IVSETTINGS);
        toolBarH.getItems().add(Hbutton1);

        toolBarH.getItems().add(new Separator());

        FileInputStream FIRESTART = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIconS\\Restart.png");
        Image RESTART = new Image(FIRESTART);
        ImageView IVRESTART = new ImageView(RESTART);
        Button Hbutton2 = new Button("", IVRESTART);
        toolBarH.getItems().add(Hbutton2);

        toolBarH.getItems().add(new Separator());

        FileInputStream FIOPEN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIconS\\Open.png");
        Image OPEN = new Image(FIOPEN);
        ImageView IVOPEN = new ImageView(OPEN);
        Button Hbutton3 = new Button("", IVOPEN);
        toolBarH.getItems().add(Hbutton3);

        toolBarH.getItems().add(new Separator());

        FileInputStream FISAVE = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIconS\\Save.png");
        Image SAVE = new Image(FISAVE);
        ImageView IVSAVE = new ImageView(SAVE);
        Button Hbutton4 = new Button("", IVSAVE);
        toolBarH.getItems().add(Hbutton4);

        toolBarH.getItems().add(new Separator());

        FileInputStream FIRUN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIconS\\Run.png");
        Image RUN = new Image(FIRUN);
        ImageView IVRUN = new ImageView(RUN);
        Button Hbutton5 = new Button("", IVRUN);
        toolBarH.getItems().add(Hbutton5);

        toolBarH.getItems().add(new Separator());

        FileInputStream FIHELP = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIconS\\Help.png");
        Image HELP = new Image(FIHELP);
        ImageView IVHELP = new ImageView(HELP);
        Button Hbutton6 = new Button("", IVHELP);
        toolBarH.getItems().add(Hbutton6);

        // Separación de los paneles
        BorderPane Pane = new BorderPane();
        Pane.setTop(toolBarH);
        Pane.setLeft(toolBarV);

        Scene scene = new Scene(Pane, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}