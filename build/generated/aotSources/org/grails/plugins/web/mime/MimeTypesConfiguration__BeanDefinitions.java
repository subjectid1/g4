package org.grails.plugins.web.mime;

import grails.core.GrailsApplication;
import grails.web.mime.MimeType;
import grails.web.mime.MimeTypeResolver;
import grails.web.mime.MimeUtility;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link MimeTypesConfiguration}.
 */
@Generated
public class MimeTypesConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.grails.plugins.web.mime.MimeTypesConfiguration'.
   */
  private static BeanInstanceSupplier<MimeTypesConfiguration> getMimeTypesConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MimeTypesConfiguration>forConstructor(GrailsApplication.class, List.class)
            .withGenerator((registeredBean, args) -> new MimeTypesConfiguration$$SpringCGLIB$$0(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'mimeTypesConfiguration'.
   */
  public static BeanDefinition getMimeTypesConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MimeTypesConfiguration.class);
    beanDefinition.setTargetType(MimeTypesConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(MimeTypesConfiguration.class);
    beanDefinition.setInstanceSupplier(getMimeTypesConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mimeTypesHolder'.
   */
  private static BeanInstanceSupplier<MimeTypesHolder> getMimeTypesHolderInstanceSupplier() {
    return BeanInstanceSupplier.<MimeTypesHolder>forFactoryMethod(MimeTypesConfiguration$$SpringCGLIB$$0.class, "mimeTypesHolder")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mime.MimeTypesConfiguration", MimeTypesConfiguration.class).mimeTypesHolder());
  }

  /**
   * Get the bean definition for 'mimeTypesHolder'.
   */
  public static BeanDefinition getMimeTypesHolderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MimeTypesHolder.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mime.MimeTypesConfiguration");
    beanDefinition.setInstanceSupplier(getMimeTypesHolderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mimeTypes'.
   */
  private static BeanInstanceSupplier<MimeType[]> getMimeTypesInstanceSupplier() {
    return BeanInstanceSupplier.<MimeType[]>forFactoryMethod(MimeTypesConfiguration$$SpringCGLIB$$0.class, "mimeTypes")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mime.MimeTypesConfiguration", MimeTypesConfiguration.class).mimeTypes());
  }

  /**
   * Get the bean definition for 'mimeTypes'.
   */
  public static BeanDefinition getMimeTypesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MimeType[].class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mime.MimeTypesConfiguration");
    beanDefinition.setInstanceSupplier(getMimeTypesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsMimeUtility'.
   */
  private static BeanInstanceSupplier<MimeUtility> getGrailsMimeUtilityInstanceSupplier() {
    return BeanInstanceSupplier.<MimeUtility>forFactoryMethod(MimeTypesConfiguration$$SpringCGLIB$$0.class, "mimeUtility", MimeTypesHolder.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mime.MimeTypesConfiguration", MimeTypesConfiguration.class).mimeUtility(args.get(0)));
  }

  /**
   * Get the bean definition for 'grailsMimeUtility'.
   */
  public static BeanDefinition getGrailsMimeUtilityBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MimeUtility.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mime.MimeTypesConfiguration");
    beanDefinition.setInstanceSupplier(getGrailsMimeUtilityInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mimeTypeResolver'.
   */
  private static BeanInstanceSupplier<MimeTypeResolver> getMimeTypeResolverInstanceSupplier() {
    return BeanInstanceSupplier.<MimeTypeResolver>forFactoryMethod(MimeTypesConfiguration$$SpringCGLIB$$0.class, "mimeTypeResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.web.mime.MimeTypesConfiguration", MimeTypesConfiguration.class).mimeTypeResolver());
  }

  /**
   * Get the bean definition for 'mimeTypeResolver'.
   */
  public static BeanDefinition getMimeTypeResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MimeTypeResolver.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.web.mime.MimeTypesConfiguration");
    beanDefinition.setInstanceSupplier(getMimeTypeResolverInstanceSupplier());
    return beanDefinition;
  }
}
