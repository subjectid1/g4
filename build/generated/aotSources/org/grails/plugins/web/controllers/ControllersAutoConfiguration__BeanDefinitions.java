package org.grails.plugins.web.controllers;

import grails.core.GrailsApplication;
import jakarta.servlet.Filter;
import jakarta.servlet.MultipartConfigElement;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Bean definitions for {@link ControllersAutoConfiguration}.
 */
@Generated
public class ControllersAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'dispatcherServlet'.
   */
  private static BeanInstanceSupplier<DispatcherServlet> getDispatcherServletInstanceSupplier() {
    return BeanInstanceSupplier.<DispatcherServlet>forFactoryMethod(ControllersAutoConfiguration.class, "dispatcherServlet")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).dispatcherServlet());
  }

  /**
   * Get the bean definition for 'dispatcherServlet'.
   */
  public static BeanDefinition getDispatcherServletBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServlet.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getDispatcherServletInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dispatcherServletRegistration'.
   */
  private static BeanInstanceSupplier<DispatcherServletRegistrationBean> getDispatcherServletRegistrationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DispatcherServletRegistrationBean>forFactoryMethod(ControllersAutoConfiguration.class, "dispatcherServletRegistration", GrailsApplication.class, DispatcherServlet.class, MultipartConfigElement.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).dispatcherServletRegistration(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'dispatcherServletRegistration'.
   */
  public static BeanDefinition getDispatcherServletRegistrationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServletRegistrationBean.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getDispatcherServletRegistrationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'controllersAutoConfiguration'.
   */
  public static BeanDefinition getControllersAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ControllersAutoConfiguration.class);
    InstanceSupplier<ControllersAutoConfiguration> instanceSupplier = InstanceSupplier.using(ControllersAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(ControllersAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'characterEncodingFilter'.
   */
  private static BeanInstanceSupplier<CharacterEncodingFilter> getCharacterEncodingFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CharacterEncodingFilter>forFactoryMethod(ControllersAutoConfiguration.class, "characterEncodingFilter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).characterEncodingFilter());
  }

  /**
   * Get the bean definition for 'characterEncodingFilter'.
   */
  public static BeanDefinition getCharacterEncodingFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CharacterEncodingFilter.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getCharacterEncodingFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hiddenHttpMethodFilter'.
   */
  private static BeanInstanceSupplier<FilterRegistrationBean> getHiddenHttpMethodFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FilterRegistrationBean>forFactoryMethod(ControllersAutoConfiguration.class, "hiddenHttpMethodFilter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).hiddenHttpMethodFilter());
  }

  /**
   * Get the bean definition for 'hiddenHttpMethodFilter'.
   */
  public static BeanDefinition getHiddenHttpMethodFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FilterRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(FilterRegistrationBean.class, Filter.class));
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getHiddenHttpMethodFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsWebRequestFilter'.
   */
  private static BeanInstanceSupplier<FilterRegistrationBean> getGrailsWebRequestFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FilterRegistrationBean>forFactoryMethod(ControllersAutoConfiguration.class, "grailsWebRequestFilter", ApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).grailsWebRequestFilter(args.get(0)));
  }

  /**
   * Get the bean definition for 'grailsWebRequestFilter'.
   */
  public static BeanDefinition getGrailsWebRequestFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FilterRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(FilterRegistrationBean.class, Filter.class));
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getGrailsWebRequestFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'multipartConfigElement'.
   */
  private static BeanInstanceSupplier<MultipartConfigElement> getMultipartConfigElementInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MultipartConfigElement>forFactoryMethod(ControllersAutoConfiguration.class, "multipartConfigElement")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).multipartConfigElement());
  }

  /**
   * Get the bean definition for 'multipartConfigElement'.
   */
  public static BeanDefinition getMultipartConfigElementBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MultipartConfigElement.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getMultipartConfigElementInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webMvcConfig'.
   */
  private static BeanInstanceSupplier<ControllersAutoConfiguration.GrailsWebMvcConfigurer> getWebMvcConfigInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ControllersAutoConfiguration.GrailsWebMvcConfigurer>forFactoryMethod(ControllersAutoConfiguration.class, "webMvcConfig")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.controllers.ControllersAutoConfiguration", ControllersAutoConfiguration.class).webMvcConfig());
  }

  /**
   * Get the bean definition for 'webMvcConfig'.
   */
  public static BeanDefinition getWebMvcConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ControllersAutoConfiguration.GrailsWebMvcConfigurer.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.controllers.ControllersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getWebMvcConfigInstanceSupplier());
    return beanDefinition;
  }
}
