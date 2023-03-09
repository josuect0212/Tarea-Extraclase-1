package datosi.calculadorapersonas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class HelloController {
    Integer i = 0;
    Integer j = 0;
    Integer cantPersonas = 0;
    String listaNombres[] = new String[4];
    String[][] listaPersonas = new String[4][3];
    ObservableList<String> provList = FXCollections.observableArrayList("San Jose", "Cartago", "Heredia", "Alajuela", "Puntarenas", "Guanacaste", "Limon");

    @FXML
    private Label result;
    @FXML
    private ChoiceBox provBox;
    @FXML
    private ChoiceBox pers1;
    @FXML
    private ChoiceBox pers2;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField nombre;
    @FXML
    private TextField edad;

    @FXML
    private Button btnSuma;

    @FXML
    private Button btnResta;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnDiv;
    @FXML
    private void initialize(){
        provBox.setValue("San Jose");
        provBox.setItems(provList);

    }

    @FXML
    public void btnAgregar(){
        if(cantPersonas<=4){
            cantPersonas++;
            agregar();
        }
        else{
            System.out.println("Cantidad maxima de personas alcanzada");
        }
    }

    @FXML
    public void btnSuma(){
        suma();
    }

    @FXML
    public void btnResta(){
        resta();
    }

    @FXML
    public void btnMult(){
        mult();
    }

    @FXML
    public void btnDiv(){
        div();
    }

    public void agregar(){
        String persona[] = new String[3];
        persona[0] = nombre.getText();
        listaNombres[i] = nombre.getText();
        ObservableList<String> nombrePersona = FXCollections.observableArrayList(listaNombres);
        pers1.setItems(nombrePersona);
        pers2.setItems(nombrePersona);
        persona[1] = (String) provBox.getSelectionModel().getSelectedItem();
        persona[2] = edad.getText();
        System.out.println(Arrays.toString(persona));
        listaPersonas[i] = persona;
        System.out.println(Arrays.deepToString(listaPersonas));
        i ++;
    }

    public void suma(){
        String p1;
        String p2;
        Integer edad1 = null;
        Integer edad2 = null;
        Integer k;
        p1 = (String) pers1.getSelectionModel().getSelectedItem();
        p2 = (String) pers2.getSelectionModel().getSelectedItem();
        Integer sumaEdad = 0;
        String sumaSTR;
        for(k = 0; k<listaPersonas.length; k++){
            if (listaPersonas[k][0].equals(p1)){
                p1 = listaPersonas[k][2];
                edad1 = Integer.parseInt(p1);
            }
            if (listaPersonas[k][0].equals(p2)){
                p2 = listaPersonas[k][2];
                edad2 = Integer.parseInt(p2);
            }
        }
        sumaEdad = edad1+edad2;
        sumaSTR = Integer.toString(sumaEdad);
        result.setText(sumaSTR);
        System.out.println(sumaEdad);
    }
    public void resta(){
        String p1;
        String p2;
        Integer edad1 = null;
        Integer edad2 = null;
        Integer k;
        p1 = (String) pers1.getSelectionModel().getSelectedItem();
        p2 = (String) pers2.getSelectionModel().getSelectedItem();
        Integer restaEdad = 0;
        String restaSTR;
        for(k = 0; k<listaPersonas.length; k++){
            if (listaPersonas[k][0].equals(p1)){
                p1 = listaPersonas[k][2];
                edad1 = Integer.parseInt(p1);
            }
            if (listaPersonas[k][0].equals(p2)){
                p2 = listaPersonas[k][2];
                edad2 = Integer.parseInt(p2);
            }
        }
        restaEdad = edad1-edad2;
        restaSTR = Integer.toString(restaEdad);
        result.setText(restaSTR);
        System.out.println(restaEdad);
    }
    public void mult(){
        String p1;
        String p2;
        Integer edad1 = null;
        Integer edad2 = null;
        Integer k;
        p1 = (String) pers1.getSelectionModel().getSelectedItem();
        p2 = (String) pers2.getSelectionModel().getSelectedItem();
        Integer multEdad = 0;
        String multSTR;
        for(k = 0; k<listaPersonas.length; k++){
            if (listaPersonas[k][0].equals(p1)){
                p1 = listaPersonas[k][2];
                edad1 = Integer.parseInt(p1);
            }
            if (listaPersonas[k][0].equals(p2)){
                p2 = listaPersonas[k][2];
                edad2 = Integer.parseInt(p2);
            }
        }
        multEdad = edad1*edad2;
        multSTR = Integer.toString(multEdad);
        result.setText(multSTR);
        System.out.println(multEdad);
    }
    public void div(){
        String p1;
        String p2;
        Integer edad1 = null;
        Integer edad2 = null;
        Integer k;
        p1 = (String) pers1.getSelectionModel().getSelectedItem();
        p2 = (String) pers2.getSelectionModel().getSelectedItem();
        Integer divEdad = 0;
        String divSTR;
        for(k = 0; k<listaPersonas.length; k++){
            if (listaPersonas[k][0].equals(p1)){
                p1 = listaPersonas[k][2];
                edad1 = Integer.parseInt(p1);
            }
            if (listaPersonas[k][0].equals(p2)){
                p2 = listaPersonas[k][2];
                edad2 = Integer.parseInt(p2);
            }
        }
        divEdad = edad1/edad2;
        divSTR = Integer.toString(divEdad);
        result.setText(divSTR);
        System.out.println(divEdad);
    }
}