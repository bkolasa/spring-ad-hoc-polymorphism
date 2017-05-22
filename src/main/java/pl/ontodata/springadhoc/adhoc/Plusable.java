package pl.ontodata.springadhoc.adhoc;

/**
 * Created by bkolasa on 16.05.17.
 */
public interface Plusable<T> {
    T plus(T t1,T t2);
    T identity();
}
