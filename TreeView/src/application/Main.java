/********************************************************************************************
 * COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD The reproduction,
 * transmission or use of this document/file or its contents is not permitted
 * without written authorization. Offenders will be liable for damages. All
 * rights reserved.
 * ---------------------------------------------------------------------------
 * Purpose:  Entry point for the JavaFX application. 
 * Project:  JavaFX Application
 * Platform: Cross-platform(Windows, macOS, Linux) 
 * Compiler: JDK-22 
 * IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *           Version: 2024-03 (4.31.0) 
 *           Build id: 20240307-1437
 ********************************************************************************************/
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main class for launching the JavaFX application.
 */
public class Main extends Application {

	/**
	 * Start method overridden from Application class. Sets up the primary stage,
	 * loads the FXML file, and displays the scene.
	 * 
	 * @param primaryStage The primary stage of the application.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml")); // Load FXML file
			Scene scene = new Scene(root, 400, 400); // Create scene with specified dimensions
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Add CSS
			// stylesheet to
			// scene
			primaryStage.setScene(scene); // Set the scene on the primary stage
			primaryStage.show(); // Display the primary stage
		} catch (Exception e) {
			e.printStackTrace(); // Print stack trace if an exception occurs
		}
	}

	/**
	 * Main method to launch the JavaFX application.
	 * 
	 * @param args Command-line arguments (not used in this application).
	 */
	public static void main(String[] args) {
		launch(args); // Launch the JavaFX application
	}
}
