package Application.GUI.Controller;

import Application.GUI.Model.LoginModel;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private TextField userField;
    @FXML
    private TextField passwordField;

    /*
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userField.setText("nkildahl4@tumblr.com");
        passwordField.setText("lGmd5yh");
    }

    @FXML
    public void handleLogin(ActionEvent event) throws IOException, SQLException {
        LoginModel.getInstance().loginPerson(userField.getText(), passwordField.getText());

        int type = LoginModel.getInstance().getLoggedinPerson().getType();
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

        if (type == 1){
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Application/GUI/View/EmployeeView.FXML"));

            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.show();
        }
        else if (type == 0){
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Application/GUI/View/AdminView.FXML"));

            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.show();
        }
    }

     */
}
