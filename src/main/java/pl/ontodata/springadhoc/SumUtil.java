package pl.ontodata.springadhoc;

import com.google.common.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

/**
 * Created by bkolasa on 16.05.17.
 */
@Component
public class SumUtil {

    @Autowired
    private TypeService typeService;

    public <T> T sum(Collection<T> elems,Class<T> tClass) {
        TypeToken<T> typeToken = new TypeToken<T>(elems.getClass()) {};
        Plusable<T> plusable = typeService.getInstance(tClass, Plusable.class);
        return elems.stream().reduce(plusable.identity(), plusable::plus);
    }
}
