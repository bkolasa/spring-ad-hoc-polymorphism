package pl.ontodata.springadhoc.simpleabstract.inherit;

import org.testng.annotations.Test;
import pl.ontodata.springadhoc.simpleabstract.inherit.MyAbstractClassImpl;

public class MyAbstractClassImplTest {

    @Test
    public void shouldTest() throws Exception {
        MyAbstractClassImpl abstractClass = new MyAbstractClassImpl();
        abstractClass.doStuff();
    }

}