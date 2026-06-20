package org.grails.web.mapping.servlet;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UrlMappingsErrorPageCustomizer}.
 */
@Generated
public class UrlMappingsErrorPageCustomizer__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UrlMappingsErrorPageCustomizer apply(RegisteredBean registeredBean,
      UrlMappingsErrorPageCustomizer instance) {
    AutowiredFieldValueResolver.forRequiredField("urlMappings").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
