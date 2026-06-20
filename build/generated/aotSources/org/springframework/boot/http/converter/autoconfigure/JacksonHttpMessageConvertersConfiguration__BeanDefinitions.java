package org.springframework.boot.http.converter.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration}.
 */
@Generated
public class JacksonHttpMessageConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonHttpMessageConvertersConfiguration'.
   */
  public static BeanDefinition getJacksonHttpMessageConvertersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.class);
    beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration::new);
    return beanDefinition;
  }
}
