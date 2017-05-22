package pl.ontodata.springadhoc.simpleabstract;

import pl.ontodata.springadhoc.simpleabstract.inherit.MyAbstractClass;
import pl.ontodata.springadhoc.simpleabstract.inherit.MyAbstractClassImpl;
import pl.ontodata.springadhoc.simpleabstract.noinherit.MyClass;
import pl.ontodata.springadhoc.simpleabstract.noinherit.OwnStuffIfaceImpl;

public class Usage {

    public void inherit(){
        MyAbstractClass abstractClass = new MyAbstractClassImpl();
        abstractClass.doStuff();
    }

    public void noInherit(){
        MyClass myClass = new MyClass();
        OwnStuffIfaceImpl ownStuffIface = new OwnStuffIfaceImpl();
        myClass.doStuff(ownStuffIface);
    }
}
