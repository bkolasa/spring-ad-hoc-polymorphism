package pl.ontodata.springadhoc;

import org.springframework.stereotype.Component;

/**
 * Created by bkolasa on 16.05.17.
 */
@Component
public class StringPlusable implements Plusable<String> {
    public String plus(String t1, String t2) {
        return t1 + t2;
    }

    @Override
    public String identity() {
        return "";
    }
}
