package ch.so.agi.graalvm;

import java.util.HashMap;
import java.util.Map;

import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.ProxyObject;

public class App {
    
    public void doIt() {
        Context c = Context.create("js");
        c.getBindings("js").putMember("friend", new FriendlyNeighbour());
        c.eval("js", "print(`Live from JavaScript: ${friend.goodMorning('Jim')}`)");
    }
    
    public static void main(String[] args) {
        new App().doIt();
    }
}
