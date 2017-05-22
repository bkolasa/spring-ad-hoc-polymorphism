package pl.ontodata.springadhoc.adhoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bkolasa on 17.05.17.
 */
@Service
public class TypeService {

    @Autowired
    private ApplicationContext context;

    public <S,C> S getInstance(Class<C> cClass, Class<S> clazz){
        Collection<S> values = context.getBeansOfType(clazz).values();
        return values.stream().filter(v -> isSameClass(cClass,v)).findFirst().orElseThrow(() -> new IllegalStateException());
    }

    private <S,C> boolean isSameClass(Class<C> cClass, S s) {
        Class<?> resolve = ResolvableType.forInstance(s).getInterfaces()[0].getGeneric(0).resolve();
        return resolve.equals(cClass);
    }
}
