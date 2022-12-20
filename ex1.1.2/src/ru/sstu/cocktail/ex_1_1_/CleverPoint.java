package ru.sstu.cocktail.ex_1_1_;

import java.util.LinkedHashMap;
import java.util.Map;

public class CleverPoint {
    private final Map<String, Object> attrs;

    public CleverPoint(Map<String, Object> attrs) {
        this.attrs = new LinkedHashMap<>(attrs);
    }

    public <T extends Integer, String, Object> T getAttr(String key) {

        return (T) (attrs.get(key));
    }

    @Override
    public String toString() {
        String res = "{";
        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
            if (entry.getValue() instanceof Integer) {
                res += entry.getValue() + ";";
            } else res += entry.getKey() + ":" + entry.getValue() + ";";
        }
        res += "}" + "\n";
        return res;
    }
}
