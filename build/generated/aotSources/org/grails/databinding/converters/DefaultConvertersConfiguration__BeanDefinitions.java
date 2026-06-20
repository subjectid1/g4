package org.grails.databinding.converters;

import grails.core.GrailsApplication;
import grails.databinding.TypedStructuredBindingEditor;
import grails.databinding.converters.FormattedValueConverter;
import grails.databinding.converters.ValueConverter;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring1;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring2;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring3;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring4;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring5;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring6;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring7;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring8;
import org.grails.databinding.converters.web.LocaleAwareNumberConverter__Autowiring9;
import org.grails.plugins.databinding.DataBindingConfigurationProperties;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link DefaultConvertersConfiguration}.
 */
@Generated
public class DefaultConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.grails.databinding.converters.DefaultConvertersConfiguration'.
   */
  private static BeanInstanceSupplier<DefaultConvertersConfiguration> getDefaultConvertersConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultConvertersConfiguration>forConstructor(GrailsApplication.class, DataBindingConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> new DefaultConvertersConfiguration$$SpringCGLIB$$0(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'defaultConvertersConfiguration'.
   */
  public static BeanDefinition getDefaultConvertersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultConvertersConfiguration.class);
    beanDefinition.setTargetType(DefaultConvertersConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(DefaultConvertersConfiguration.class);
    beanDefinition.setInstanceSupplier(getDefaultConvertersConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultCurrencyConverter'.
   */
  private static BeanInstanceSupplier<CurrencyValueConverter> getDefaultCurrencyConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CurrencyValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultCurrencyConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultCurrencyConverter());
  }

  /**
   * Get the bean definition for 'defaultCurrencyConverter'.
   */
  public static BeanDefinition getDefaultCurrencyConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CurrencyValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultCurrencyConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultGrailsBigDecimalConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getDefaultGrailsBigDecimalConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultGrailsBigDecimalConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultGrailsBigDecimalConverter());
  }

  /**
   * Get the bean definition for 'defaultGrailsBigDecimalConverter'.
   */
  public static BeanDefinition getDefaultGrailsBigDecimalConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultGrailsBigDecimalConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'offsetDateTimeConverter'.
   */
  private static BeanInstanceSupplier<FormattedValueConverter> getOffsetDateTimeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FormattedValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "offsetDateTimeConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).offsetDateTimeConverter());
  }

  /**
   * Get the bean definition for 'offsetDateTimeConverter'.
   */
  public static BeanDefinition getOffsetDateTimeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FormattedValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getOffsetDateTimeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'offsetDateTimeValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getOffsetDateTimeValueConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "offsetDateTimeValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).offsetDateTimeValueConverter());
  }

  /**
   * Get the bean definition for 'offsetDateTimeValueConverter'.
   */
  public static BeanDefinition getOffsetDateTimeValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getOffsetDateTimeValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'offsetDateTimeStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getOffsetDateTimeStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "offsetDateTimeStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).offsetDateTimeStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'offsetDateTimeStructuredBindingEditor'.
   */
  public static BeanDefinition getOffsetDateTimeStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getOffsetDateTimeStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'offsetTimeConverter'.
   */
  private static BeanInstanceSupplier<FormattedValueConverter> getOffsetTimeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FormattedValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "offsetTimeConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).offsetTimeConverter());
  }

  /**
   * Get the bean definition for 'offsetTimeConverter'.
   */
  public static BeanDefinition getOffsetTimeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FormattedValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getOffsetTimeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'offsetTimeValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getOffsetTimeValueConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "offsetTimeValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).offsetTimeValueConverter());
  }

  /**
   * Get the bean definition for 'offsetTimeValueConverter'.
   */
  public static BeanDefinition getOffsetTimeValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getOffsetTimeValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'offsetTimeStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getOffsetTimeStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "offsetTimeStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).offsetTimeStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'offsetTimeStructuredBindingEditor'.
   */
  public static BeanDefinition getOffsetTimeStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getOffsetTimeStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localDateTimeConverter'.
   */
  private static BeanInstanceSupplier<FormattedValueConverter> getLocalDateTimeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FormattedValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localDateTimeConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localDateTimeConverter());
  }

  /**
   * Get the bean definition for 'localDateTimeConverter'.
   */
  public static BeanDefinition getLocalDateTimeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FormattedValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalDateTimeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localDateTimeValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getLocalDateTimeValueConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localDateTimeValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localDateTimeValueConverter());
  }

  /**
   * Get the bean definition for 'localDateTimeValueConverter'.
   */
  public static BeanDefinition getLocalDateTimeValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalDateTimeValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localDateTimeStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getLocalDateTimeStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localDateTimeStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localDateTimeStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'localDateTimeStructuredBindingEditor'.
   */
  public static BeanDefinition getLocalDateTimeStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalDateTimeStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localDateConverter'.
   */
  private static BeanInstanceSupplier<FormattedValueConverter> getLocalDateConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FormattedValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localDateConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localDateConverter());
  }

  /**
   * Get the bean definition for 'localDateConverter'.
   */
  public static BeanDefinition getLocalDateConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FormattedValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalDateConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localDateValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getLocalDateValueConverterInstanceSupplier() {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localDateValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localDateValueConverter());
  }

  /**
   * Get the bean definition for 'localDateValueConverter'.
   */
  public static BeanDefinition getLocalDateValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalDateValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localDateStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getLocalDateStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localDateStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localDateStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'localDateStructuredBindingEditor'.
   */
  public static BeanDefinition getLocalDateStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalDateStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localTimeConverter'.
   */
  private static BeanInstanceSupplier<FormattedValueConverter> getLocalTimeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FormattedValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localTimeConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localTimeConverter());
  }

  /**
   * Get the bean definition for 'localTimeConverter'.
   */
  public static BeanDefinition getLocalTimeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FormattedValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalTimeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localTimeValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getLocalTimeValueConverterInstanceSupplier() {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localTimeValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localTimeValueConverter());
  }

  /**
   * Get the bean definition for 'localTimeValueConverter'.
   */
  public static BeanDefinition getLocalTimeValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalTimeValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localTimeStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getLocalTimeStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "localTimeStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).localTimeStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'localTimeStructuredBindingEditor'.
   */
  public static BeanDefinition getLocalTimeStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getLocalTimeStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'zonedDateTimeConverter'.
   */
  private static BeanInstanceSupplier<FormattedValueConverter> getZonedDateTimeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FormattedValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "zonedDateTimeConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).zonedDateTimeConverter());
  }

  /**
   * Get the bean definition for 'zonedDateTimeConverter'.
   */
  public static BeanDefinition getZonedDateTimeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FormattedValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getZonedDateTimeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'zonedDateTimeValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getZonedDateTimeValueConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "zonedDateTimeValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).zonedDateTimeValueConverter());
  }

  /**
   * Get the bean definition for 'zonedDateTimeValueConverter'.
   */
  public static BeanDefinition getZonedDateTimeValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getZonedDateTimeValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'zonedDateTimeStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getZonedDateTimeStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "zonedDateTimeStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).zonedDateTimeStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'zonedDateTimeStructuredBindingEditor'.
   */
  public static BeanDefinition getZonedDateTimeStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getZonedDateTimeStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'periodValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getPeriodValueConverterInstanceSupplier() {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "periodValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).periodValueConverter());
  }

  /**
   * Get the bean definition for 'periodValueConverter'.
   */
  public static BeanDefinition getPeriodValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getPeriodValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'instantStringValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getInstantStringValueConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "instantStringValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).instantStringValueConverter());
  }

  /**
   * Get the bean definition for 'instantStringValueConverter'.
   */
  public static BeanDefinition getInstantStringValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getInstantStringValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'instantValueConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getInstantValueConverterInstanceSupplier() {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "instantValueConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).instantValueConverter());
  }

  /**
   * Get the bean definition for 'instantValueConverter'.
   */
  public static BeanDefinition getInstantValueConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getInstantValueConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'instantStructuredBindingEditor'.
   */
  private static BeanInstanceSupplier<TypedStructuredBindingEditor> getInstantStructuredBindingEditorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TypedStructuredBindingEditor>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "instantStructuredBindingEditor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).instantStructuredBindingEditor());
  }

  /**
   * Get the bean definition for 'instantStructuredBindingEditor'.
   */
  public static BeanDefinition getInstantStructuredBindingEditorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypedStructuredBindingEditor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(TypedStructuredBindingEditor.class));
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getInstantStructuredBindingEditorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultUUIDConverter'.
   */
  private static BeanInstanceSupplier<UUIDConverter> getDefaultUUIDConverterInstanceSupplier() {
    return BeanInstanceSupplier.<UUIDConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultuuidConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultuuidConverter());
  }

  /**
   * Get the bean definition for 'defaultUUIDConverter'.
   */
  public static BeanDefinition getDefaultUUIDConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UUIDConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultUUIDConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultGrailsBigIntegerConverter'.
   */
  private static BeanInstanceSupplier<ValueConverter> getDefaultGrailsBigIntegerConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValueConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultGrailsBigIntegerConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultGrailsBigIntegerConverter());
  }

  /**
   * Get the bean definition for 'defaultGrailsBigIntegerConverter'.
   */
  public static BeanDefinition getDefaultGrailsBigIntegerConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValueConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultGrailsBigIntegerConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultDateConverter'.
   */
  private static BeanInstanceSupplier<DateConversionHelper> getDefaultDateConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DateConversionHelper>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultDateConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultDateConverter());
  }

  /**
   * Get the bean definition for 'defaultDateConverter'.
   */
  public static BeanDefinition getDefaultDateConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DateConversionHelper.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultDateConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultLocalDateTimeConverter'.
   */
  private static BeanInstanceSupplier<LocalDateTimeConverter> getDefaultLocalDateTimeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocalDateTimeConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultLocalDateTimeConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultLocalDateTimeConverter());
  }

  /**
   * Get the bean definition for 'defaultLocalDateTimeConverter'.
   */
  public static BeanDefinition getDefaultLocalDateTimeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocalDateTimeConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultLocalDateTimeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'timeZoneConverter'.
   */
  private static BeanInstanceSupplier<TimeZoneConverter> getTimeZoneConverterInstanceSupplier() {
    return BeanInstanceSupplier.<TimeZoneConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "defaultTimeZoneConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).defaultTimeZoneConverter());
  }

  /**
   * Get the bean definition for 'timeZoneConverter'.
   */
  public static BeanDefinition getTimeZoneConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimeZoneConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    beanDefinition.setInstanceSupplier(getTimeZoneConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultShortConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultShortConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "shortConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).shortConverter());
  }

  /**
   * Get the bean definition for 'defaultShortConverter'.
   */
  public static BeanDefinition getDefaultShortConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultShortConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultshortConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultshortConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "primitiveShortConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).primitiveShortConverter());
  }

  /**
   * Get the bean definition for 'defaultshortConverter'.
   */
  public static BeanDefinition getDefaultshortConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultshortConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring1::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultIntegerConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultIntegerConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "integerConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).integerConverter());
  }

  /**
   * Get the bean definition for 'defaultIntegerConverter'.
   */
  public static BeanDefinition getDefaultIntegerConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultIntegerConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring2::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultintConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultintConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "primitiveIntConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).primitiveIntConverter());
  }

  /**
   * Get the bean definition for 'defaultintConverter'.
   */
  public static BeanDefinition getDefaultintConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultintConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring3::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultFloatConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultFloatConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "floatConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).floatConverter());
  }

  /**
   * Get the bean definition for 'defaultFloatConverter'.
   */
  public static BeanDefinition getDefaultFloatConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultFloatConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring4::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultfloatConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultfloatConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "primitiveFloattConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).primitiveFloattConverter());
  }

  /**
   * Get the bean definition for 'defaultfloatConverter'.
   */
  public static BeanDefinition getDefaultfloatConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultfloatConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring5::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultLongConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultLongConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "longConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).longConverter());
  }

  /**
   * Get the bean definition for 'defaultLongConverter'.
   */
  public static BeanDefinition getDefaultLongConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultLongConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring6::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultlongConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultlongConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "primitiveLongConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).primitiveLongConverter());
  }

  /**
   * Get the bean definition for 'defaultlongConverter'.
   */
  public static BeanDefinition getDefaultlongConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultlongConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring7::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultDoubleConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultDoubleConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "doubleConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).doubleConverter());
  }

  /**
   * Get the bean definition for 'defaultDoubleConverter'.
   */
  public static BeanDefinition getDefaultDoubleConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultDoubleConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring8::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultdoubleConverter'.
   */
  private static BeanInstanceSupplier<LocaleAwareNumberConverter> getDefaultdoubleConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleAwareNumberConverter>forFactoryMethod(DefaultConvertersConfiguration$$SpringCGLIB$$0.class, "primitiveDoubleConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.grails.databinding.converters.DefaultConvertersConfiguration", DefaultConvertersConfiguration.class).primitiveDoubleConverter());
  }

  /**
   * Get the bean definition for 'defaultdoubleConverter'.
   */
  public static BeanDefinition getDefaultdoubleConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleAwareNumberConverter.class);
    beanDefinition.setFactoryBeanName("org.grails.databinding.converters.DefaultConvertersConfiguration");
    InstanceSupplier<LocaleAwareNumberConverter> instanceSupplier = getDefaultdoubleConverterInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LocaleAwareNumberConverter__Autowiring9::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
