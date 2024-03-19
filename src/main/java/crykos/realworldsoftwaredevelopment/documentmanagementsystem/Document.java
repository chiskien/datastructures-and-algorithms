package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.util.Map;


public class Document {
    private final Map<String, String> ATTRIBUTES;

    Document(Map<String, String> attributes) {
        ATTRIBUTES = attributes;
    }

    public String getAttribute(final String attributeName) {
        return ATTRIBUTES.get(attributeName);
    }
}
