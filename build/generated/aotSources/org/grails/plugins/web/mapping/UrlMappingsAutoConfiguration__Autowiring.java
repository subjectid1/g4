package org.grails.plugins.web.mapping;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UrlMappingsAutoConfiguration}.
 */
@Generated
public class UrlMappingsAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UrlMappingsAutoConfiguration apply(RegisteredBean registeredBean,
      UrlMappingsAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("cacheUrls").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("serverURL").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
