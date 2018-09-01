package net.jfilesync.jfsmw.core.ui.impl;

import net.jfilesync.jfsmw.core.ui.provider.JavaFXRootStageProvider;
import net.jfilesync.jfsmw.core.ui.provider.JfsMwUiProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

public class JfsMwUiActivator implements BundleActivator {
  public static boolean started = false;
  JfsMwUiProvider                                                  jfsMwUiProvider;
  ServiceTracker<JavaFXRootStageProvider, JavaFXRootStageProvider> mainStageTracker;
  private ServiceTracker<JfsMwUiProvider, JfsMwUiProvider> jfsMwUiProviderTracker;

  @Override
  public void start(BundleContext context) throws Exception {
    System.out.println("JfsCoreUI Bundle started");

    jfsMwUiProviderTracker =
        new ServiceTracker<JfsMwUiProvider, JfsMwUiProvider>(context, JfsMwUiProvider.class, null) {
          @Override
          public JfsMwUiProvider addingService(final ServiceReference<JfsMwUiProvider> reference) {
            System.out.println("here in");
            return super.addingService(reference);
          }

          @Override
          public void remove(final ServiceReference<JfsMwUiProvider> reference) {
            System.out.println("here out");
            super.remove(reference);
          }
        };
    jfsMwUiProviderTracker.open();
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    jfsMwUiProviderTracker.close();
    System.out.println("JfsCoreUI Bundle stopped");
  }
}
