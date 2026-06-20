package org.grails.plugins.core;

import grails.config.ConfigProperties;
import grails.core.GrailsApplication;
import java.lang.ClassLoader;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Bean definitions for {@link CoreAutoConfiguration}.
 */
@Generated
public class CoreAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'coreAutoConfiguration'.
   */
  public static BeanDefinition getCoreAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CoreAutoConfiguration.class);
    InstanceSupplier<CoreAutoConfiguration> instanceSupplier = InstanceSupplier.using(CoreAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(CoreAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'classLoader'.
   */
  private static BeanInstanceSupplier<ClassLoader> getClassLoaderInstanceSupplier() {
    return BeanInstanceSupplier.<ClassLoader>forFactoryMethod(CoreAutoConfiguration.class, "classLoader", GrailsApplication.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.core.CoreAutoConfiguration", CoreAutoConfiguration.class).classLoader(args.get(0)));
  }

  /**
   * Get the bean definition for 'classLoader'.
   */
  public static BeanDefinition getClassLoaderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClassLoader.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.core.CoreAutoConfiguration");
    beanDefinition.setInstanceSupplier(getClassLoaderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsConfigProperties'.
   */
  private static BeanInstanceSupplier<ConfigProperties> getGrailsConfigPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConfigProperties>forFactoryMethod(CoreAutoConfiguration.class, "grailsConfigProperties", GrailsApplication.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.core.CoreAutoConfiguration", CoreAutoConfiguration.class).grailsConfigProperties(args.get(0)));
  }

  /**
   * Get the bean definition for 'grailsConfigProperties'.
   */
  public static BeanDefinition getGrailsConfigPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConfigProperties.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.core.CoreAutoConfiguration");
    beanDefinition.setInstanceSupplier(getGrailsConfigPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'propertySourcesPlaceholderConfigurer'.
   */
  private static BeanInstanceSupplier<PropertySourcesPlaceholderConfigurer> getPropertySourcesPlaceholderConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PropertySourcesPlaceholderConfigurer>forFactoryMethod(CoreAutoConfiguration.class, "propertySourcesPlaceholderConfigurer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.core.CoreAutoConfiguration", CoreAutoConfiguration.class).propertySourcesPlaceholderConfigurer());
  }

  /**
   * Get the bean definition for 'propertySourcesPlaceholderConfigurer'.
   */
  public static BeanDefinition getPropertySourcesPlaceholderConfigurerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertySourcesPlaceholderConfigurer.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.core.CoreAutoConfiguration");
    beanDefinition.setInstanceSupplier(getPropertySourcesPlaceholderConfigurerInstanceSupplier());
    return beanDefinition;
  }
}
