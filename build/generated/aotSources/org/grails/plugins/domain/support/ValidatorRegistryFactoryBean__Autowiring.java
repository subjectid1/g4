package org.grails.plugins.domain.support;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ValidatorRegistryFactoryBean}.
 */
@Generated
public class ValidatorRegistryFactoryBean__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ValidatorRegistryFactoryBean apply(RegisteredBean registeredBean,
      ValidatorRegistryFactoryBean instance) {
    AutowiredFieldValueResolver.forRequiredField("mappingContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
