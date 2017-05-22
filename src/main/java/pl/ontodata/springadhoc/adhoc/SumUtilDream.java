package pl.ontodata.springadhoc.adhoc;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bkolasa on 16.05.17.
 */
@Component
public class SumUtilDream<T> {

    @Autowired
    private Plusable<T> plusable;

    public T sum(Collection<T> elems) {
        return elems.stream().reduce(plusable.identity(), plusable::plus);
    }
}
