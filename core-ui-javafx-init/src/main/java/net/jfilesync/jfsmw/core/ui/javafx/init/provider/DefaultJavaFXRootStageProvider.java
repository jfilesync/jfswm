package net.jfilesync.jfsmw.core.ui.javafx.init.provider;

import javafx.stage.Stage;
import net.jfilesync.jfsmw.core.ui.provider.JavaFXRootStageProvider;

public class DefaultJavaFXRootStageProvider implements JavaFXRootStageProvider {

  private final Stage primaryStage;

  public DefaultJavaFXRootStageProvider(Stage primaryStage) {
    this.primaryStage = primaryStage;
  }

  @Override
  public Stage getStage() {
    return primaryStage;
  }
}
