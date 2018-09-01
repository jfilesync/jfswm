package net.jfilesync.jfsmw.core.ui.impl.listener;

import javafx.event.ActionEvent;
import net.jfilesync.jfsmw.core.ui.listener.EventConsts;
import net.jfilesync.jfsmw.core.ui.listener.UiActionListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Component;

/**
 * @author Christoph Graupner <ch.graupner@workingdeveloper.net>
 */
@Component(service = UiActionListener.class, property = {"event=" + EventConsts.APPLICATION_EXIT})
public class ApplicationExitListener implements UiActionListener<ActionEvent> {

  @Override
  public void handle(final ActionEvent event) {
    System.out.println("Exiting Application");
    try {
      getContext().getBundle(0).stop();
    } catch (BundleException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private BundleContext getContext() {
    return FrameworkUtil.getBundle(this.getClass()).getBundleContext();
  }
}
