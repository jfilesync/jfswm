package net.jfilesync.jfsmw.core.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Christoph Graupner <ch.graupner@workingdeveloper.net>
 */
public class JfsMwActivator implements BundleActivator {
  @Override
  public void start(final BundleContext bundleContext) throws Exception {
    System.out.println("Hallo Service");
  }

  @Override
  public void stop(final BundleContext bundleContext) throws Exception {
    System.out.printf("Tschüß");
  }
}
