package pl.ontodata.springadhoc;

import org.springframework.stereotype.Component;

/**
 * Created by bkolasa on 16.05.17.
 */
@Component
public class IntPlusable implements Plusable<Integer> {
    public Integer plus(Integer t1, Integer t2) {
        return t1 + t2;
    }

    @Override
    public Integer identity() {
        return 0;
    }
}
