package org.grails.plugins.domain.support;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DefaultMappingContextFactoryBean}.
 */
@Generated
public class DefaultMappingContextFactoryBean__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DefaultMappingContextFactoryBean apply(RegisteredBean registeredBean,
      DefaultMappingContextFactoryBean instance) {
    AutowiredFieldValueResolver.forField("constraintFactories").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
