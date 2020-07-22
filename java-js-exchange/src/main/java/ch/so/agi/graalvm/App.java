package ch.so.agi.graalvm;

import java.util.HashMap;
import java.util.Map;

import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.ProxyObject;

public class App {
    public static void main(String[] args) {
        Context polyglot = Context.create();
        polyglot.eval("js", "var PI = 3.141592; var E = 2.71828;");
        System.out.println("Current contents of Binding objects: " + polyglot.getBindings("js").getMemberKeys());
        Double pi = polyglot.getBindings("js").getMember("PI").asDouble();
        System.out.println("PI according to JavaScript = " + pi);
        
        // ProxyObject makes it accessible as 'regular' JavaScript object to JavaScript code. 
//        Map<String, Object> backingMap = new HashMap<String, Object>();
//        backingMap.put("myKey", "myValue");
//        backingMap.put("myQuestion", "2*3");
//        polyglot.getBindings("js").putMember("hostObject", ProxyObject.fromMap(backingMap));
//        polyglot.eval("js", "print(`your key = ${hostObject.myKey}`);"
//                + "hostObject.yourAnswer = eval(hostObject.myQuestion);");
//        System.out.println("The Answer to " + backingMap.get("myQuestion") + " = " + backingMap.get("yourAnswer"));
    }
}
