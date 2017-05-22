package pl.ontodata.springadhoc.adhoc.inherit;

import java.util.Collection;
import org.springframework.stereotype.Component;
import pl.ontodata.springadhoc.adhoc.Plusable;

@Component
public class InheritSumUtil {

    public <T extends Plusable<T>> T plus(T start, Collection<T> elems) {
        return elems.stream().reduce(start, (t1, t2) -> t1.plus(t1, t2));
    }
}
