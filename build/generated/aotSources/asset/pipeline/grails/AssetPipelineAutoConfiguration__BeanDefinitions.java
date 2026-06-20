package asset.pipeline.grails;

import grails.web.mapping.LinkGenerator;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AssetPipelineAutoConfiguration}.
 */
@Generated
public class AssetPipelineAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'assetPipelineAutoConfiguration'.
   */
  public static BeanDefinition getAssetPipelineAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AssetPipelineAutoConfiguration.class);
    InstanceSupplier<AssetPipelineAutoConfiguration> instanceSupplier = InstanceSupplier.using(AssetPipelineAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(AssetPipelineAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'grailsLinkGenerator'.
   */
  private static BeanInstanceSupplier<LinkGenerator> getGrailsLinkGeneratorInstanceSupplier() {
    return BeanInstanceSupplier.<LinkGenerator>forFactoryMethod(AssetPipelineAutoConfiguration.class, "grailsLinkGenerator", AssetProcessorService.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("asset.pipeline.grails.AssetPipelineAutoConfiguration", AssetPipelineAutoConfiguration.class).grailsLinkGenerator(args.get(0)));
  }

  /**
   * Get the bean definition for 'grailsLinkGenerator'.
   */
  public static BeanDefinition getGrailsLinkGeneratorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LinkGenerator.class);
    beanDefinition.setFactoryBeanName("asset.pipeline.grails.AssetPipelineAutoConfiguration");
    beanDefinition.setInstanceSupplier(getGrailsLinkGeneratorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'assetProcessorService'.
   */
  private static BeanInstanceSupplier<AssetProcessorService> getAssetProcessorServiceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AssetProcessorService>forFactoryMethod(AssetPipelineAutoConfiguration.class, "assetProcessorService")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("asset.pipeline.grails.AssetPipelineAutoConfiguration", AssetPipelineAutoConfiguration.class).assetProcessorService());
  }

  /**
   * Get the bean definition for 'assetProcessorService'.
   */
  public static BeanDefinition getAssetProcessorServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AssetProcessorService.class);
    beanDefinition.setFactoryBeanName("asset.pipeline.grails.AssetPipelineAutoConfiguration");
    beanDefinition.setInstanceSupplier(getAssetProcessorServiceInstanceSupplier());
    return beanDefinition;
  }
}
