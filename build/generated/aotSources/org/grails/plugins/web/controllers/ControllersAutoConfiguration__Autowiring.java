package org.grails.plugins.web.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ControllersAutoConfiguration}.
 */
@Generated
public class ControllersAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ControllersAutoConfiguration apply(RegisteredBean registeredBean,
      ControllersAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("filtersEncoding").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("filtersForceEncoding").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("resourcesCachePeriod").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("resourcesEnabled").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("resourcesPattern").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("uploadTmpDir").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("maxFileSize").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("maxRequestSize").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("fileSizeThreshold").resolveAndSet(registeredBean, instance);
    instance.grailsServletPath = AutowiredFieldValueResolver.forRequiredField("grailsServletPath").resolve(registeredBean);
    return instance;
  }
}
