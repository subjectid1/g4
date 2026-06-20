package org.grails.web.databinding.bindingsource;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HalJsonDataBindingSourceCreator}.
 */
@Generated
public class HalJsonDataBindingSourceCreator__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HalJsonDataBindingSourceCreator apply(RegisteredBean registeredBean,
      HalJsonDataBindingSourceCreator instance) {
    AutowiredFieldValueResolver.forField("jsonSlurper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
