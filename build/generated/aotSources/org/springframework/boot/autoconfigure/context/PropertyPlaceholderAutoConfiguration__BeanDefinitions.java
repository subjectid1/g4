package org.springframework.boot.autoconfigure.context;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PropertyPlaceholderAutoConfiguration}.
 */
@Generated
public class PropertyPlaceholderAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'propertyPlaceholderAutoConfiguration'.
   */
  public static BeanDefinition getPropertyPlaceholderAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertyPlaceholderAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(PropertyPlaceholderAutoConfiguration::new);
    return beanDefinition;
  }
}
