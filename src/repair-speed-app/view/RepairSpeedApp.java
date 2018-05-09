package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Artigiano;
import model.Intervento;
import model.RelazioneTecnica;
import model.RichiestaIntervento;
import model.Sistema;
import model.TipoArtigiano;

public class RepairSpeedApp extends Application{
	private Sistema dittaRiparazioni;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public Tab createClientTab(){
		// Create Tab
		Tab tab = new Tab("Client");
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		// Inserisce i pane nella posizione colonna, riga
		pane.add(new Label("First Name"),0,0);
		TextField fname = new TextField();
		pane.add(fname,1,0);	
		pane.add(new Label("Last Name"),0,1);
		TextField lname = new TextField();
		pane.add(lname,1,1);
		
		
		// Craete a ChoiceBox
		ChoiceBox cb = new ChoiceBox();
		// create a collections of observable element.
		cb.getItems().setAll(TipoArtigiano.values());
		// Aggiungi la lista alla choice box
		//cb.setItems(oblist);
		// Aggiungiamo la choicebox al layout
		pane.add(new Label("Tipo Intervento"),0,2);
		pane.add(cb,1,2);
		cb.setPrefWidth(200);
		
		pane.add(new Label("Indirizzo"),0,3);
		pane.add(new TextField(),1,3);
		pane.add(new Label("e-mail"),0,4);
		pane.add(new TextField(),1,4);
		pane.add(new Label("Telefono"),0,5);
		pane.add(new TextField(),1,5);
			
		Button bt = new Button("Send");
		
		pane.add(bt,1,6);
		GridPane.setHalignment(bt, HPos.RIGHT);
		tab.setContent(pane);
		return tab;
	}
	
	public Tab createSecretaryTab(){
		Tab tab = new Tab("Secretary");
		return tab;
		
	}
	
	public Tab createArtisanTab(Artigiano a){
		
		Tab tab = new Tab("Artisan");
		// root
		HBox hboxArtisan = new HBox();
		// Set il padding (la distanza dai 4 bordi del rettangolo
		hboxArtisan.setPadding(new Insets(5,5,5,5));
		// Set Alignment
		hboxArtisan.setAlignment(Pos.CENTER);
		hboxArtisan.setSpacing(5.0);
		// Parte destra
		GridPane compilaIntervento = new GridPane();
		compilaIntervento.setAlignment(Pos.CENTER);
		compilaIntervento.setHgap(5.5);
		compilaIntervento.setVgap(5.5);
		// Inserisce i compilaIntervento nella posizione colonna, riga
		compilaIntervento.add(new Label("Intervento Num. "),0,0);
		compilaIntervento.add(new Label(""),1,0);
		compilaIntervento.add(new Label("Cliente "),0,1);
		compilaIntervento.add(new Label(""),1,1);
		compilaIntervento.add(new Label("Artigiano "),0,2);
		compilaIntervento.add(new Label(""),1,2);

		TextArea relazione = new TextArea();
		relazione.setMaxWidth(200);
		
		compilaIntervento.add(new Label("Relazione "),0,3);
		compilaIntervento.add(relazione,1,3);
		
		TextArea materiale = new TextArea();
		materiale.setMaxWidth(200);
		
		compilaIntervento.add(new Label("Materiale "),0,4);
		compilaIntervento.add(materiale,1,4);
		
		compilaIntervento.add(new Button("Save"),0,5);
		compilaIntervento.add(new Button("Close"),1,5);
		
		// Parte Sinistra
		// Istanzio un treeitem
		TreeItem<String> rootItem = new TreeItem<String> ("Interventi");
		rootItem.setExpanded(true);
				
		TreeItem<String> inboxItem = new TreeItem<String> ("Open");
		// Istanzio diversi tree item
		//for (int i = 1; i < 3; i++) {
		 //   TreeItem<String> item = new TreeItem<String> ("Intervento" + i);
		 //   inboxItem.getChildren().add(item);
	//	}
		TreeItem<String> sentItem = new TreeItem<String> ("Closed");
				
		// Istanzio diversi tree item
		//for (int i = 1; i < 6; i++) {
		 //  TreeItem<String> item = new TreeItem<String> ("Intervento" + i);
		 //   sentItem.getChildren().add(item);
		//}
			
		rootItem.getChildren().add(inboxItem);
		rootItem.getChildren().add(sentItem);

		// Istanzio il tree view
		TreeView<String> tree = new TreeView<String> (rootItem);
		VBox rootTree = new VBox();
		rootTree.setMaxWidth(150);
		rootTree.getChildren().add(tree);
		
		hboxArtisan.getChildren().addAll(rootTree,compilaIntervento);
		tab.setContent(hboxArtisan);
		return tab;
	}
	
	
	public void start(Stage primaryStage){
		Sistema ditta = new Sistema("DITTA ESEMPIO", "1010101010");
		Artigiano a = ditta.getArtigiano(3);
				
		// Creiamo un layout cone le tre Pane
		TabPane tabpane = new TabPane();
		
		Tab artisanTab = createArtisanTab(a);
		Tab secretaryTab = createSecretaryTab();
		Tab clientTab = createClientTab();
		tabpane.getTabs().addAll(clientTab,secretaryTab,artisanTab);
		
		
		Scene scene = new Scene(tabpane,500,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Repair Speed-App");
		primaryStage.show();		
			
	}
}
