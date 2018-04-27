package controller;

import calculations.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextField lengthInput;

    @FXML
    private TextField kitsAmountInput;

    @FXML
    private TextField element1AmountInput;

    @FXML
    private TextField element2AmountInput;

    @FXML
    private TextField element1LengthInput;

    @FXML
    private TextField element2LengthInput;

    @FXML
    private TextField priceInput;

    @FXML
    private Label errorLabel;

    private TaskSolver solver;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    //dodajemy do listy i tabeli obiekt Activity
    @FXML
    void addAction(ActionEvent event) {
       /* String name = "";
        String previous, description;
        double tc = 0, t0 = 0, tp = 0, tm = 0;
        int id = 0;
        List<Activity> previousActivities = null;

        errorLabel.setText("");

        if (!(tpField.getText().trim().isEmpty()|| tmField.getText().trim().isEmpty() || tcField.getText().trim().isEmpty()|| nameField.getText().trim().isEmpty())) {

            if(!previousField.getText().trim().isEmpty()) {
                previousActivities = new ArrayList<>();
                previous = previousField.getText();
                String[] parts = previous.split(";");
                for (String part : parts) {
                    if(Validator.letterMatches(part)) {
                        Activity a = solver.findPrevious(part);
                        if (a != null)
                            previousActivities.add(a);
                    }else{
                        errorLabel.setText("Niepoprawny format pola: Poprzednicy");
                        return;
                    }
                }
            }

            if(!descriptionField.getText().trim().isEmpty())
                description = descriptionField.getText();
            else
                description = "BRAK";

           if(Validator.letterMatches(nameField.getText()) && Validator.doubleOrIntMatches(tcField.getText())&& Validator.doubleOrIntMatches(tpField.getText()) && Validator.doubleOrIntMatches(tmField.getText())){
                name = nameField.getText();
                id = ((int) name.charAt(0)) - 64;
                tc = Double.parseDouble(tcField.getText());
                tp = Double.parseDouble(tpField.getText());
                tm = Double.parseDouble(tmField.getText());

               if(toField.getText().trim().isEmpty()){
                   t0 = solver.calculateT0(tc, tm, tp);
               }else if(Validator.doubleOrIntMatches(toField.getText())) {
                   t0 = Double.parseDouble(toField.getText());
               }else{
                   errorLabel.setText("Niepoprawny format danych.");
               }

            }else{
               errorLabel.setText("Niepoprawny format danych.");
               return;
           }

            Activity newActivity = new Activity(id, name, previousActivities, t0, tp, tm, tc, description);
            tableView.getItems().add(newActivity);
            solver.addActivity(newActivity);


        }else{
            errorLabel.setText("Prosze uzupelnic wymagane dane oraz czas dyrektywny td. (*)");
        }

        tpField.clear();
        toField.clear();
        tmField.clear();
        tcField.clear();
        nameField.clear();
        previousField.clear();
        descriptionField.clear();*/

    }

    //obliczamy ścieżkę krytyczną, wariancję i prawdopodobieństwo
    @FXML
    void calculateAction(ActionEvent event) {
        //ObservableList<Activity> items = tableView.getItems();

        /*if(!items.isEmpty() && solver.getResult().getTd() != 0) {
            solver.solvePERT();

            Stage stage = new Stage();
            Parent root = null;
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Results.fxml"));
            try {
                root = loader.load();
                ResultsController resultsController = loader.getController();
                resultsController.setResult(this.solver.getResult());
                stage.setTitle("PERT RESULTS");
                stage.setScene(new Scene(root, 800, 600));
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Exception with loading the new stage.");
            }

        }else{
            errorLabel.setText("DODAJ CZYNNOSCI ORAZ CZAS DYREKTYWNY!");
        }*/

    }

    @FXML
    public void loadAction(ActionEvent event){
       lengthInput.setText("4.4");
       kitsAmountInput.setText("400");
       element1AmountInput.setText("1");
       element2AmountInput.setText("3");
       element1LengthInput.setText("0.8");
       element2LengthInput.setText("1.1");
       priceInput.setText("20");

    }

    @FXML
    public void deleteAction(ActionEvent event){
    }
}
