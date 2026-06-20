package org.grails.web.databinding.bindingsource;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link JsonApiDataBindingSourceCreator}.
 */
@Generated
public class JsonApiDataBindingSourceCreator__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static JsonApiDataBindingSourceCreator apply(RegisteredBean registeredBean,
      JsonApiDataBindingSourceCreator instance) {
    AutowiredFieldValueResolver.forField("jsonSlurper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
