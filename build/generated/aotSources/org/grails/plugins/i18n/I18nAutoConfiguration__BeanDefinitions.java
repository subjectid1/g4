package org.grails.plugins.i18n;

import grails.core.GrailsApplication;
import grails.plugins.GrailsPluginManager;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Bean definitions for {@link I18nAutoConfiguration}.
 */
@Generated
public class I18nAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'i18nAutoConfiguration'.
   */
  public static BeanDefinition getInAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(I18nAutoConfiguration.class);
    InstanceSupplier<I18nAutoConfiguration> instanceSupplier = InstanceSupplier.using(I18nAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(I18nAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localeResolver'.
   */
  private static BeanInstanceSupplier<LocaleResolver> getLocaleResolverInstanceSupplier() {
    return BeanInstanceSupplier.<LocaleResolver>forFactoryMethod(I18nAutoConfiguration.class, "localeResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.i18n.I18nAutoConfiguration", I18nAutoConfiguration.class).localeResolver());
  }

  /**
   * Get the bean definition for 'localeResolver'.
   */
  public static BeanDefinition getLocaleResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleResolver.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.i18n.I18nAutoConfiguration");
    beanDefinition.setInstanceSupplier(getLocaleResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localeChangeInterceptor'.
   */
  private static BeanInstanceSupplier<LocaleChangeInterceptor> getLocaleChangeInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleChangeInterceptor>forFactoryMethod(I18nAutoConfiguration.class, "localeChangeInterceptor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.i18n.I18nAutoConfiguration", I18nAutoConfiguration.class).localeChangeInterceptor());
  }

  /**
   * Get the bean definition for 'localeChangeInterceptor'.
   */
  public static BeanDefinition getLocaleChangeInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleChangeInterceptor.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.i18n.I18nAutoConfiguration");
    beanDefinition.setInstanceSupplier(getLocaleChangeInterceptorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'messageSource'.
   */
  private static BeanInstanceSupplier<MessageSource> getMessageSourceInstanceSupplier() {
    return BeanInstanceSupplier.<MessageSource>forFactoryMethod(I18nAutoConfiguration.class, "messageSource", GrailsApplication.class, GrailsPluginManager.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.i18n.I18nAutoConfiguration", I18nAutoConfiguration.class).messageSource(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'messageSource'.
   */
  public static BeanDefinition getMessageSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MessageSource.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.i18n.I18nAutoConfiguration");
    beanDefinition.setInstanceSupplier(getMessageSourceInstanceSupplier());
    return beanDefinition;
  }
}
