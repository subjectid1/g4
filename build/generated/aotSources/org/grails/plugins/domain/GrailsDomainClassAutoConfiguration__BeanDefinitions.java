package org.grails.plugins.domain;

import grails.core.GrailsApplication;
import java.util.List;
import org.grails.datastore.mapping.model.MappingContext;
import org.grails.plugins.domain.support.DefaultConstraintEvaluatorFactoryBean;
import org.grails.plugins.domain.support.DefaultMappingContextFactoryBean;
import org.grails.plugins.domain.support.DefaultMappingContextFactoryBean__Autowiring;
import org.grails.plugins.domain.support.ValidatorRegistryFactoryBean;
import org.grails.plugins.domain.support.ValidatorRegistryFactoryBean__Autowiring;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GrailsDomainClassAutoConfiguration}.
 */
@Generated
public class GrailsDomainClassAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.grails.plugins.domain.GrailsDomainClassAutoConfiguration'.
   */
  private static BeanInstanceSupplier<GrailsDomainClassAutoConfiguration> getGrailsDomainClassAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<GrailsDomainClassAutoConfiguration>forConstructor(GrailsApplication.class, List.class)
            .withGenerator((registeredBean, args) -> new GrailsDomainClassAutoConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'grailsDomainClassAutoConfiguration'.
   */
  public static BeanDefinition getGrailsDomainClassAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GrailsDomainClassAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getGrailsDomainClassAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsDomainClassMappingContext'.
   */
  private static BeanInstanceSupplier<DefaultMappingContextFactoryBean> getGrailsDomainClassMappingContextInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultMappingContextFactoryBean>forFactoryMethod(GrailsDomainClassAutoConfiguration.class, "grailsDomainClassMappingContext", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.domain.GrailsDomainClassAutoConfiguration", GrailsDomainClassAutoConfiguration.class).grailsDomainClassMappingContext(args.get(0)));
  }

  /**
   * Get the bean definition for 'grailsDomainClassMappingContext'.
   */
  public static BeanDefinition getGrailsDomainClassMappingContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultMappingContextFactoryBean.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.domain.GrailsDomainClassAutoConfiguration");
    InstanceSupplier<DefaultMappingContextFactoryBean> instanceSupplier = getGrailsDomainClassMappingContextInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(DefaultMappingContextFactoryBean__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'validateableConstraintsEvaluator'.
   */
  private static BeanInstanceSupplier<DefaultConstraintEvaluatorFactoryBean> getValidateableConstraintsEvaluatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultConstraintEvaluatorFactoryBean>forFactoryMethod(GrailsDomainClassAutoConfiguration.class, "validateableConstraintsEvaluator", MappingContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.domain.GrailsDomainClassAutoConfiguration", GrailsDomainClassAutoConfiguration.class).validateableConstraintsEvaluator(args.get(0)));
  }

  /**
   * Get the bean definition for 'validateableConstraintsEvaluator'.
   */
  public static BeanDefinition getValidateableConstraintsEvaluatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultConstraintEvaluatorFactoryBean.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.domain.GrailsDomainClassAutoConfiguration");
    beanDefinition.setInstanceSupplier(getValidateableConstraintsEvaluatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'gormValidatorRegistry'.
   */
  private static BeanInstanceSupplier<ValidatorRegistryFactoryBean> getGormValidatorRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValidatorRegistryFactoryBean>forFactoryMethod(GrailsDomainClassAutoConfiguration.class, "gormValidatorRegistry", MappingContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.domain.GrailsDomainClassAutoConfiguration", GrailsDomainClassAutoConfiguration.class).gormValidatorRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'gormValidatorRegistry'.
   */
  public static BeanDefinition getGormValidatorRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidatorRegistryFactoryBean.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.domain.GrailsDomainClassAutoConfiguration");
    InstanceSupplier<ValidatorRegistryFactoryBean> instanceSupplier = getGormValidatorRegistryInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ValidatorRegistryFactoryBean__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
