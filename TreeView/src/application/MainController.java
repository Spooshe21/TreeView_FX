/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController.java
 *   Project:  JavaFX TreeView Example
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *             Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Controller class for handling the initialization and interaction with a
 * JavaFX TreeView.
 */
public class MainController implements Initializable {

	@FXML
	TreeView<String> treeView;

	// Image for TreeView nodes
	Image icon = new Image(getClass().getResourceAsStream("/img/Crevavi Open House.png"));

	/**
	 * Initializes the controller class.
	 * 
	 * @param location  The location used to resolve relative paths for the root
	 *                  object, or null if the location is not known.
	 * @param resources The resources used to localize the root object, or null if
	 *                  the root object was not localized.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		root.setExpanded(true);

		TreeItem<String> nodeA = new TreeItem<>("node A");
		TreeItem<String> nodeB = new TreeItem<>("node B");
		TreeItem<String> nodeC = new TreeItem<>("node C");
		root.getChildren().addAll(nodeA, nodeB, nodeC);

		TreeItem<String> nodeA1 = new TreeItem<>("node A1");
		TreeItem<String> nodeB1 = new TreeItem<>("node B1");
		TreeItem<String> nodeC1 = new TreeItem<>("node C1");
		nodeA.getChildren().addAll(nodeA1);
		nodeB.getChildren().addAll(nodeB1);
		nodeC.getChildren().addAll(nodeC1);

		treeView.setRoot(root);
	}

	/**
	 * Handles double-click event on a TreeView item.
	 * 
	 * @param mouseEvent The event that triggers when the mouse is double-clicked.
	 */
	public void mouseClick(MouseEvent mouseEvent) {
		if (mouseEvent.getClickCount() == 2) {
			TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
			System.out.println(item.getValue());
		}
	}
}
