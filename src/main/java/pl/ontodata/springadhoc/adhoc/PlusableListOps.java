package pl.ontodata.springadhoc.adhoc;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PlusableListOps<T> implements Plusable<List<T>>{

    @Override
    public List<T> plus(List<T> t1, List<T> t2) {
        LinkedList<T> result = new LinkedList<T>();
        result.addAll(t1);
        result.addAll(t2);
        return result;
    }

    @Override
    public List<T> identity() {
        return Collections.emptyList();
    }
}
