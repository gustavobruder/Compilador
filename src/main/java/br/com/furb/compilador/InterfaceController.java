package br.com.furb.compilador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class InterfaceController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // initialize here...
    }

    @FXML
    public Button btnNovo;

    public void onBtnNovoAction() {
        System.out.println("Novo");
    }

    @FXML
    public Button btnAbrir;

    public void onBtnAbrirAction() {
        System.out.println("Abrir");
    }

    @FXML
    public Button btnSalvar;

    public void onBtnSalvarAction() {
        System.out.println("Salvar");
    }

    @FXML
    public Button btnCopiar;

    public void onBtnCopiarAction() {
        System.out.println("Copiar");
    }

    @FXML
    public Button btnColar;

    public void onBtnColarAction() {
        System.out.println("Colar");
    }

    @FXML
    public Button btnRecortar;

    public void onBtnRecortarAction() {
        System.out.println("Recortar");
    }

    @FXML
    public Button btnCompilar;

    public void onBtnCompilarAction() {
        System.out.println("Compilar");
    }

    @FXML
    public Button btnEquipe;

    public void onBtnEquipeAction() {
        System.out.println("Equipe");
    }

    private final KeyCombination keyBtnNovo = new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN);
    private final KeyCombination keyBtnAbrir = new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN);
    private final KeyCombination keyBtnSalvar = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN);
    private final KeyCombination keyBtnCopiar = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN);
    private final KeyCombination keyBtnColar = new KeyCodeCombination(KeyCode.V, KeyCombination.CONTROL_DOWN);
    private final KeyCombination keyBtnRecortar = new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN);
    private final KeyCode keyBtnCompilar = KeyCode.F7;
    private final KeyCode keyBtnEquipe = KeyCode.F1;

    public void handleKeyEvents(KeyEvent event) {
        if (this.keyBtnNovo.match(event)) {
            this.onBtnNovoAction();
        }
        if (this.keyBtnAbrir.match(event)) {
            this.onBtnAbrirAction();
        }
        if (this.keyBtnSalvar.match(event)) {
            this.onBtnSalvarAction();
        }
        if (this.keyBtnCopiar.match(event)) {
            this.onBtnCopiarAction();
        }
        if (this.keyBtnColar.match(event)) {
            this.onBtnColarAction();
        }
        if (this.keyBtnRecortar.match(event)) {
            this.onBtnRecortarAction();
        }
        if (event.getCode().equals(this.keyBtnCompilar)) {
            this.onBtnCompilarAction();
        }
        if (event.getCode().equals(this.keyBtnEquipe)) {
            this.onBtnEquipeAction();
        }
    }
}
