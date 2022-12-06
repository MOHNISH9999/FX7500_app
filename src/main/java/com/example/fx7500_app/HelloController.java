package com.example.fx7500_app;

import com.mot.rfid.api3.InvalidUsageException;
import com.mot.rfid.api3.OperationFailureException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class HelloController {
    RFIDSample4App rf=new RFIDSample4App();

    @FXML
    private Button connectbutton;


    @FXML
    private Text deviceconnectedlabel;

    @FXML
    private TextField getid;

    @FXML
    private ListView<String> listtag;

    ObservableList<String> names = FXCollections.observableArrayList(
    );

    @FXML
    void onConnectButtonClick(ActionEvent event) {

//        try {
//            rf.PeriodicInventory();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (InvalidUsageException e) {
//            throw new RuntimeException(e);
//        } catch (OperationFailureException e) {
//            throw new RuntimeException(e);
//        }
        String abc=getid.getText();
        deviceconnectedlabel.setText(abc+" Connected");
        for(int i=1;i<=50000;i++){
            names.add(abc+" Tag "+i);
            listtag.setItems(names);
        }

    }




}