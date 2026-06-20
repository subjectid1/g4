package org.springframework.boot.servlet.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HttpEncodingAutoConfiguration}.
 */
@Generated
public class HttpEncodingAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'httpEncodingAutoConfiguration'.
   */
  public static BeanDefinition getHttpEncodingAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpEncodingAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HttpEncodingAutoConfiguration::new);
    return beanDefinition;
  }
}
