package net.jfilesync.jfsmw.core.ui.listener;

import javafx.event.Event;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * @author Christoph Graupner <ch.graupner@workingdeveloper.net>
 */
@FunctionalInterface
@ConsumerType
public interface UiActionListener<T extends Event> {
  void handle(T event);
}
