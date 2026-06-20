package org.grails.plugins.i18n;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link I18nAutoConfiguration}.
 */
@Generated
public class I18nAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static I18nAutoConfiguration apply(RegisteredBean registeredBean,
      I18nAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("encoding").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("gspEnableReload").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("cacheSeconds").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("fileCacheSeconds").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
