package asset.pipeline.grails;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AssetPipelineAutoConfiguration}.
 */
@Generated
public class AssetPipelineAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AssetPipelineAutoConfiguration apply(RegisteredBean registeredBean,
      AssetPipelineAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("cacheUrls").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("serverURL").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
