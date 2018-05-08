package game.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Tutorial{

    public Tutorial(){
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Tutorial");
        stage.getIcons().add(new Image("bilder/icon_bear.png"));

        Label header = new Label("Velkommen til bjørnespillet!\n\n");
        Label info = new Label("- Bruk WASD for å bevege bjørnen \n- Plukk opp honning, unngå bier \n- Pause spillet med Esc, \n  eller ved å trykke på pauseknappen\n\n");

        Button ok = new Button("OK");
        ok.setOnAction(e -> stage.close());

        VBox vBox = new VBox();
        vBox.getChildren().addAll(header, info, ok); // Legger til tekst over knappene
        stage.setScene(new Scene(vBox));

        stage.showAndWait();
    }
}