package nashorn;

import jdk.nashorn.api.scripting.NashornScriptEngineFactory;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptableObject;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by alexfomin on 15.12.17.
 */
public class NashornMain {
    public static void main(String[] args) throws ScriptException {
        NashornScriptEngineFactory factory = new NashornScriptEngineFactory();
        ScriptEngine engine = factory.getScriptEngine();
        engine.eval("var x = 10/2");
        Object result = engine.get("x");
        System.out.println(result);


        Context context = Context.enter();
        context.setOptimizationLevel(9);
        ScriptableObject scope = context.initStandardObjects();
        Object res = context.evaluateString(scope, "10", null, 0, null);
        System.out.println(res);


        Map<String, Integer> map = new HashMap<>();
        map.put("sex", 69);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }

    }
}
