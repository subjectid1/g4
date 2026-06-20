package org.springframework.boot.actuate.autoconfigure.info;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.info.GitInfoContributor;
import org.springframework.boot.info.GitProperties;

/**
 * Bean definitions for {@link InfoContributorAutoConfiguration}.
 */
@Generated
public class InfoContributorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'infoContributorAutoConfiguration'.
   */
  public static BeanDefinition getInfoContributorAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(InfoContributorAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(InfoContributorAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'gitInfoContributor'.
   */
  private static BeanInstanceSupplier<GitInfoContributor> getGitInfoContributorInstanceSupplier() {
    return BeanInstanceSupplier.<GitInfoContributor>forFactoryMethod(InfoContributorAutoConfiguration.class, "gitInfoContributor", GitProperties.class, InfoContributorProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration", InfoContributorAutoConfiguration.class).gitInfoContributor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'gitInfoContributor'.
   */
  public static BeanDefinition getGitInfoContributorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GitInfoContributor.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration");
    beanDefinition.setInstanceSupplier(getGitInfoContributorInstanceSupplier());
    return beanDefinition;
  }
}
