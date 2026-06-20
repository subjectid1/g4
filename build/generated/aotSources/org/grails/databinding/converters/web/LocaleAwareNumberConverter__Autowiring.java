package org.grails.databinding.converters.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link LocaleAwareNumberConverter}.
 */
@Generated
public class LocaleAwareNumberConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static LocaleAwareNumberConverter apply(RegisteredBean registeredBean,
      LocaleAwareNumberConverter instance) {
    AutowiredFieldValueResolver.forField("localeResolver").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
