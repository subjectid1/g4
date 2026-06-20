package org.grails.plugins.databinding;

import grails.core.GrailsApplication;
import grails.databinding.TypedStructuredBindingEditor;
import grails.databinding.converters.FormattedValueConverter;
import grails.databinding.converters.ValueConverter;
import grails.databinding.events.DataBindingListener;
import grails.web.databinding.GrailsWebDataBinder;
import grails.web.databinding.GrailsWebDataBinder__Autowiring;
import org.grails.databinding.bindingsource.DataBindingSourceCreator;
import org.grails.web.databinding.bindingsource.DataBindingSourceRegistry;
import org.grails.web.databinding.bindingsource.HalJsonDataBindingSourceCreator;
import org.grails.web.databinding.bindingsource.HalJsonDataBindingSourceCreator__Autowiring;
import org.grails.web.databinding.bindingsource.HalXmlDataBindingSourceCreator;
import org.grails.web.databinding.bindingsource.JsonApiDataBindingSourceCreator;
import org.grails.web.databinding.bindingsource.JsonApiDataBindingSourceCreator__Autowiring;
import org.grails.web.databinding.bindingsource.JsonDataBindingSourceCreator;
import org.grails.web.databinding.bindingsource.JsonDataBindingSourceCreator__Autowiring;
import org.grails.web.databinding.bindingsource.XmlDataBindingSourceCreator;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataBindingConfiguration}.
 */
@Generated
public class DataBindingConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.grails.plugins.databinding.DataBindingConfiguration'.
   */
  private static BeanInstanceSupplier<DataBindingConfiguration> getDataBindingConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DataBindingConfiguration>forConstructor(DataBindingConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> new DataBindingConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataBindingConfiguration'.
   */
  public static BeanDefinition getDataBindingConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataBindingConfiguration.class);
    beanDefinition.setInstanceSupplier(getDataBindingConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsWebDataBinder'.
   */
  private static BeanInstanceSupplier<GrailsWebDataBinder> getGrailsWebDataBinderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<GrailsWebDataBinder>forFactoryMethod(DataBindingConfiguration.class, "grailsWebDataBinder", GrailsApplication.class, ValueConverter[].class, FormattedValueConverter[].class, TypedStructuredBindingEditor[].class, DataBindingListener[].class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).grailsWebDataBinder(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'grailsWebDataBinder'.
   */
  public static BeanDefinition getGrailsWebDataBinderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GrailsWebDataBinder.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    InstanceSupplier<GrailsWebDataBinder> instanceSupplier = getGrailsWebDataBinderInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(GrailsWebDataBinder__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'xmlDataBindingSourceCreator'.
   */
  private static BeanInstanceSupplier<XmlDataBindingSourceCreator> getXmlDataBindingSourceCreatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<XmlDataBindingSourceCreator>forFactoryMethod(DataBindingConfiguration.class, "xmlDataBindingSourceCreator")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).xmlDataBindingSourceCreator());
  }

  /**
   * Get the bean definition for 'xmlDataBindingSourceCreator'.
   */
  public static BeanDefinition getXmlDataBindingSourceCreatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XmlDataBindingSourceCreator.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    beanDefinition.setInstanceSupplier(getXmlDataBindingSourceCreatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonDataBindingSourceCreator'.
   */
  private static BeanInstanceSupplier<JsonDataBindingSourceCreator> getJsonDataBindingSourceCreatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JsonDataBindingSourceCreator>forFactoryMethod(DataBindingConfiguration.class, "jsonDataBindingSourceCreator")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).jsonDataBindingSourceCreator());
  }

  /**
   * Get the bean definition for 'jsonDataBindingSourceCreator'.
   */
  public static BeanDefinition getJsonDataBindingSourceCreatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonDataBindingSourceCreator.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    InstanceSupplier<JsonDataBindingSourceCreator> instanceSupplier = getJsonDataBindingSourceCreatorInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(JsonDataBindingSourceCreator__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'halJsonDataBindingSourceCreator'.
   */
  private static BeanInstanceSupplier<HalJsonDataBindingSourceCreator> getHalJsonDataBindingSourceCreatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HalJsonDataBindingSourceCreator>forFactoryMethod(DataBindingConfiguration.class, "halJsonDataBindingSourceCreator")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).halJsonDataBindingSourceCreator());
  }

  /**
   * Get the bean definition for 'halJsonDataBindingSourceCreator'.
   */
  public static BeanDefinition getHalJsonDataBindingSourceCreatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HalJsonDataBindingSourceCreator.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    InstanceSupplier<HalJsonDataBindingSourceCreator> instanceSupplier = getHalJsonDataBindingSourceCreatorInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(HalJsonDataBindingSourceCreator__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'halXmlDataBindingSourceCreator'.
   */
  private static BeanInstanceSupplier<HalXmlDataBindingSourceCreator> getHalXmlDataBindingSourceCreatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HalXmlDataBindingSourceCreator>forFactoryMethod(DataBindingConfiguration.class, "halXmlDataBindingSourceCreator")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).halXmlDataBindingSourceCreator());
  }

  /**
   * Get the bean definition for 'halXmlDataBindingSourceCreator'.
   */
  public static BeanDefinition getHalXmlDataBindingSourceCreatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HalXmlDataBindingSourceCreator.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    beanDefinition.setInstanceSupplier(getHalXmlDataBindingSourceCreatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonApiDataBindingSourceCreator'.
   */
  private static BeanInstanceSupplier<JsonApiDataBindingSourceCreator> getJsonApiDataBindingSourceCreatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JsonApiDataBindingSourceCreator>forFactoryMethod(DataBindingConfiguration.class, "jsonApiDataBindingSourceCreator")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).jsonApiDataBindingSourceCreator());
  }

  /**
   * Get the bean definition for 'jsonApiDataBindingSourceCreator'.
   */
  public static BeanDefinition getJsonApiDataBindingSourceCreatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonApiDataBindingSourceCreator.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    InstanceSupplier<JsonApiDataBindingSourceCreator> instanceSupplier = getJsonApiDataBindingSourceCreatorInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(JsonApiDataBindingSourceCreator__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataBindingSourceRegistry'.
   */
  private static BeanInstanceSupplier<DataBindingSourceRegistry> getDataBindingSourceRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DataBindingSourceRegistry>forFactoryMethod(DataBindingConfiguration.class, "dataBindingSourceRegistry", DataBindingSourceCreator[].class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.grails.plugins.databinding.DataBindingConfiguration", DataBindingConfiguration.class).dataBindingSourceRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataBindingSourceRegistry'.
   */
  public static BeanDefinition getDataBindingSourceRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataBindingSourceRegistry.class);
    beanDefinition.setFactoryBeanName("org.grails.plugins.databinding.DataBindingConfiguration");
    beanDefinition.setInstanceSupplier(getDataBindingSourceRegistryInstanceSupplier());
    return beanDefinition;
  }
}
