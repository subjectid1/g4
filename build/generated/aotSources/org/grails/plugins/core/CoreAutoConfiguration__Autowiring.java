package org.grails.plugins.core;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CoreAutoConfiguration}.
 */
@Generated
public class CoreAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CoreAutoConfiguration apply(RegisteredBean registeredBean,
      CoreAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("placeholderPrefix").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
