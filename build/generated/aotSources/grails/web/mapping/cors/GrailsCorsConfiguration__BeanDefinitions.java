package grails.web.mapping.cors;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GrailsCorsConfiguration}.
 */
@Generated
public class GrailsCorsConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'grailsCorsConfiguration'.
   */
  public static BeanDefinition getGrailsCorsConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GrailsCorsConfiguration.class);
    beanDefinition.setInstanceSupplier(GrailsCorsConfiguration::new);
    return beanDefinition;
  }
}
