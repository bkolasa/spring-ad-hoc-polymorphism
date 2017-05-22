package pl.ontodata.springadhoc.simpleabstract.inherit;

import pl.ontodata.springadhoc.simpleabstract.MyIface;

public abstract class MyAbstractClass implements MyIface {

    public String doStuff() {
        String ownStuff = doOwnStuff();
        return ownStuff.replaceAll("<STH>", "foo bar");
    }

    protected abstract String doOwnStuff();
}
