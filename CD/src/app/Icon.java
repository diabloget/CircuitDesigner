package app;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Icon {
    private ImageView IconView;
    private Image Icon;

    /**
     * Metodo para obtener una Image ya establecida
     * @return Image
     */
    public Image getImage() {
        return Icon;
    }
    /**
     * Metodo para establecer una Image
     * @param Icon
     * @param Type
     * @throws FileNotFoundException
     */
    public void setImage(Icon Icon, IconEnum Type) throws FileNotFoundException {
        if(Type == IconEnum.AND) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\And.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.NAND) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Nand.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.NOR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Nor.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.NOT) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Not.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.OR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Or.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.XNOR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Xnor.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.XOR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Xor.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.SETTINGS) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Settings.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.RESTART) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Restart.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.OPEN) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Open.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.SAVE) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Save.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.RUN) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Run.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }else if(Type == IconEnum.HELP) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Help.png");
            Image IconGeneric = new Image(inputFileN);
            this.Icon = IconGeneric;
        }
    }
    /**
     * Metodo para obtener una ImageView ya establecida
     * @return ImageView
     */
    public ImageView getImageView() {
        return IconView;
    }
    /**
     * Metodo para establecer una ImageView
     * @param ImageView
     * @param Type
     * @throws FileNotFoundException
     */
    public void setImageView(Icon ImageView, IconEnum Type) throws FileNotFoundException {
        if(Type == IconEnum.AND) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\And.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.NAND) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Nand.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.NOR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Nor.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.NOT) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Not.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.OR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Or.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.XNOR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Xnor.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.XOR) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gatesIcon\\Xor.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.SETTINGS) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Settings.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.RESTART) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Restart.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.OPEN) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Open.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.SAVE) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Save.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.RUN) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Run.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }else if(Type == IconEnum.HELP) {
            FileInputStream inputFileN = new FileInputStream("C:\\Users\\diabl\\IdeaProjects\\CD\\src\\gIcon\\Help.png");
            Image IconGeneric = new Image(inputFileN);
            ImageView IconViewGeneric = new ImageView(IconGeneric);
            this.IconView = IconViewGeneric;
        }
    }

}
