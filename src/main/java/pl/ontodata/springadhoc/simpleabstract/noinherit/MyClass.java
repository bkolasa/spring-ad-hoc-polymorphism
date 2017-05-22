package pl.ontodata.springadhoc.simpleabstract.noinherit;

public class MyClass {

    public String doStuff(OwnStuffIface ownStuffIface){
        String ownStuff = ownStuffIface.doOwnStuff();
        return ownStuff.replaceAll("<STH>", "foo bar");
    }
}
