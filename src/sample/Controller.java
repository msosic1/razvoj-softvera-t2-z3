package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField unosRecenice;
    public Button btn;
    public Label novaRecenica;

    public void prepraviRecenicu(ActionEvent actionEvent) {
        String recenica = unosRecenice.getText();
        String recenic2 = new String();
        String najduzaRijec = new String();
        for(String rijec : recenica.split(" ")) {
            if(rijec.length() > najduzaRijec.length()) najduzaRijec = rijec;
        }
        najduzaRijec = najduzaRijec.toUpperCase();
        for(String rijec : recenica.split(" ")) {
            if(rijec.length() == najduzaRijec.length()) recenic2 = recenic2 + " " + najduzaRijec;
            else {
                recenic2 = recenic2 + " " + rijec;
            }
        }
        novaRecenica.setText(recenic2);




    }
}
