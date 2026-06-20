package org.springframework.boot.webmvc.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DispatcherServletAutoConfiguration}.
 */
@Generated
public class DispatcherServletAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dispatcherServletAutoConfiguration'.
   */
  public static BeanDefinition getDispatcherServletAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServletAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(DispatcherServletAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DispatcherServletAutoConfiguration.DispatcherServletConfiguration}.
   */
  @Generated
  public static class DispatcherServletConfiguration {
    /**
     * Get the bean definition for 'dispatcherServletConfiguration'.
     */
    public static BeanDefinition getDispatcherServletConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServletAutoConfiguration.DispatcherServletConfiguration.class);
      beanDefinition.setInstanceSupplier(DispatcherServletAutoConfiguration.DispatcherServletConfiguration::new);
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration}.
   */
  @Generated
  public static class DispatcherServletRegistrationConfiguration {
    /**
     * Get the bean definition for 'dispatcherServletRegistrationConfiguration'.
     */
    public static BeanDefinition getDispatcherServletRegistrationConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration.class);
      beanDefinition.setInstanceSupplier(DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration::new);
      return beanDefinition;
    }
  }
}
