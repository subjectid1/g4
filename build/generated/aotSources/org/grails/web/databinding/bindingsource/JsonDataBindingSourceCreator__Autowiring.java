package org.grails.web.databinding.bindingsource;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link JsonDataBindingSourceCreator}.
 */
@Generated
public class JsonDataBindingSourceCreator__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static JsonDataBindingSourceCreator apply(RegisteredBean registeredBean,
      JsonDataBindingSourceCreator instance) {
    AutowiredFieldValueResolver.forField("jsonSlurper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
