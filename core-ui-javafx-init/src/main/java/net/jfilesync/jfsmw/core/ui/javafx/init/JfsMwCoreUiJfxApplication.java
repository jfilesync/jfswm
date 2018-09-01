package net.jfilesync.jfsmw.core.ui.javafx.init;

import javafx.application.Application;
import javafx.stage.Stage;
import net.jfilesync.jfsmw.core.ui.javafx.init.provider.DefaultJavaFXRootStageProvider;
import net.jfilesync.jfsmw.core.ui.provider.JavaFXRootStageProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public class JfsMwCoreUiJfxApplication extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    bc.registerService(JavaFXRootStageProvider.class, new DefaultJavaFXRootStageProvider(primaryStage), null);
    bc.registerService(Application.class, this, null);
    System.out.println("JavaFX Application registered");
  }
}
