package net.jfilesync.jfsmw.core.ui.listener;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public interface JfsMwUIListener {
  void onHidden();

  void onShown();
}
