package net.jfilesync.jfsmw.core.ui.provider;

import javafx.stage.Stage;
import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface JfsMwUiProvider {
  Stage getMainStage();

  void hide();

  void show();
}
