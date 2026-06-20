package org.grails.plugins.web.mapping;

import grails.web.UrlConverter;
import grails.web.mapping.cors.GrailsCorsConfiguration;
import grails.web.mapping.cors.GrailsCorsFilter;
import org.grails.web.mapping.mvc.UrlMappingsInfoHandlerAdapter;
import org.grails.web.mapping.servlet.UrlMappingsErrorPageCustomizer;
import org.grails.web.mapping.servlet.UrlMappingsErrorPageCustomizer__Autowiring;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UrlMappingsAutoConfiguration}.
 */
@Generated
public class UrlMappingsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'urlMappingsAutoConfiguration'.
   */
  public static BeanDefinition getUrlMappingsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UrlMappingsAutoConfiguration.class);
    InstanceSupplier<UrlMappingsAutoConfiguration> instanceSupplier = InstanceSupplier.using(UrlMappingsAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(UrlMappingsAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsUrlConverter'.
   */
  private static BeanInstanceSupplier<UrlConverter> getGrailsUrlConverterInstanceSupplier() {
    return BeanInstanceSupplier.<UrlConverter>forFactoryMethod(UrlMappingsAutoConfiguration.class, "camelCaseUrlConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration", UrlMappingsAutoConfiguration.class).camelCaseUrlConverter());
  }

  /**
   * Get the bean definition for 'grailsUrlConverter'.
   */
  public static BeanDefinition getGrailsUrlConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UrlConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration");
    beanDefinition.setInstanceSupplier(getGrailsUrlConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsCorsFilter'.
   */
  private static BeanInstanceSupplier<GrailsCorsFilter> getGrailsCorsFilterInstanceSupplier() {
    return BeanInstanceSupplier.<GrailsCorsFilter>forFactoryMethod(UrlMappingsAutoConfiguration.class, "grailsCorsFilter", GrailsCorsConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration", UrlMappingsAutoConfiguration.class).grailsCorsFilter(args.get(0)));
  }

  /**
   * Get the bean definition for 'grailsCorsFilter'.
   */
  public static BeanDefinition getGrailsCorsFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GrailsCorsFilter.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration");
    beanDefinition.setInstanceSupplier(getGrailsCorsFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'urlMappingsErrorPageCustomizer'.
   */
  private static BeanInstanceSupplier<UrlMappingsErrorPageCustomizer> getUrlMappingsErrorPageCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<UrlMappingsErrorPageCustomizer>forFactoryMethod(UrlMappingsAutoConfiguration.class, "urlMappingsErrorPageCustomizer", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration", UrlMappingsAutoConfiguration.class).urlMappingsErrorPageCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'urlMappingsErrorPageCustomizer'.
   */
  public static BeanDefinition getUrlMappingsErrorPageCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UrlMappingsErrorPageCustomizer.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration");
    InstanceSupplier<UrlMappingsErrorPageCustomizer> instanceSupplier = getUrlMappingsErrorPageCustomizerInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(UrlMappingsErrorPageCustomizer__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'urlMappingsInfoHandlerAdapter'.
   */
  private static BeanInstanceSupplier<UrlMappingsInfoHandlerAdapter> getUrlMappingsInfoHandlerAdapterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<UrlMappingsInfoHandlerAdapter>forFactoryMethod(UrlMappingsAutoConfiguration.class, "urlMappingsInfoHandlerAdapter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration", UrlMappingsAutoConfiguration.class).urlMappingsInfoHandlerAdapter());
  }

  /**
   * Get the bean definition for 'urlMappingsInfoHandlerAdapter'.
   */
  public static BeanDefinition getUrlMappingsInfoHandlerAdapterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UrlMappingsInfoHandlerAdapter.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mapping.UrlMappingsAutoConfiguration");
    beanDefinition.setInstanceSupplier(getUrlMappingsInfoHandlerAdapterInstanceSupplier());
    return beanDefinition;
  }
}
