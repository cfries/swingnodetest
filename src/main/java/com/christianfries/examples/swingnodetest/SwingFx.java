package com.christianfries.examples.swingnodetest;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class SwingFx extends Application {

	@Override
	public void start(Stage stage) {
		System.out.println("JavaFX version: " + com.sun.javafx.runtime.VersionInfo.getRuntimeVersion());

		final SwingNode swingNode = new SwingNode();
		createAndSetSwingContent(swingNode);

		StackPane pane = new StackPane();
		pane.getChildren().add(swingNode);

		stage.setScene(new Scene(pane, 100, 50));
		stage.show();
	}

	private void createAndSetSwingContent(final SwingNode swingNode) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				swingNode.setContent(new JButton("Click me!"));
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
