package org.grails.plugins.databinding;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataBindingConfigurationProperties}.
 */
@Generated
public class DataBindingConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'dataBindingConfigurationProperties'.
   */
  public static BeanDefinition getDataBindingConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataBindingConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(DataBindingConfigurationProperties::new);
    return beanDefinition;
  }
}
