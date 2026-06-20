package org.grails.plugins.codecs;

import grails.core.GrailsApplication;
import org.grails.encoder.CodecLookup;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CodecsConfiguration}.
 */
@Generated
public class CodecsConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'codecsConfiguration'.
   */
  public static BeanDefinition getCodecsConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CodecsConfiguration.class);
    beanDefinition.setTargetType(CodecsConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(CodecsConfiguration.class);
    beanDefinition.setInstanceSupplier(CodecsConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'codecLookup'.
   */
  private static BeanInstanceSupplier<CodecLookup> getCodecLookupInstanceSupplier() {
    return BeanInstanceSupplier.<CodecLookup>forFactoryMethod(CodecsConfiguration$$SpringCGLIB$$0.class, "codecLookup", GrailsApplication.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.codecs.CodecsConfiguration", CodecsConfiguration.class).codecLookup(args.get(0)));
  }

  /**
   * Get the bean definition for 'codecLookup'.
   */
  public static BeanDefinition getCodecLookupBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CodecLookup.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.codecs.CodecsConfiguration");
    beanDefinition.setInstanceSupplier(getCodecLookupInstanceSupplier());
    return beanDefinition;
  }
}
