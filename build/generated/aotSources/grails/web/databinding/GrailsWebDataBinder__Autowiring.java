package grails.web.databinding;

import grails.databinding.TypedStructuredBindingEditor;
import grails.databinding.converters.FormattedValueConverter;
import grails.databinding.converters.ValueConverter;
import grails.databinding.events.DataBindingListener;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredMethodArgumentsResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link GrailsWebDataBinder}.
 */
@Generated
public class GrailsWebDataBinder__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static GrailsWebDataBinder apply(RegisteredBean registeredBean,
      GrailsWebDataBinder instance) {
    AutowiredMethodArgumentsResolver.forMethod("setStructuredBindingEditors", TypedStructuredBindingEditor[].class).resolve(registeredBean, args -> instance.setStructuredBindingEditors(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setValueConverters", ValueConverter[].class).resolve(registeredBean, args -> instance.setValueConverters(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setFormattedValueConverters", FormattedValueConverter[].class).resolve(registeredBean, args -> instance.setFormattedValueConverters(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setDataBindingListeners", DataBindingListener[].class).resolve(registeredBean, args -> instance.setDataBindingListeners(args.get(0)));
    AutowiredMethodArgumentsResolver.forRequiredMethod("setMessageSource", List.class).resolve(registeredBean, args -> instance.setMessageSource(args.get(0, List.class)));
    return instance;
  }
}
