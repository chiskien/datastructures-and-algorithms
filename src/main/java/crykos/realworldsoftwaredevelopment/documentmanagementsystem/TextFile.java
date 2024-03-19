package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author chisk
 */
public class TextFile {

    private final Map<String, String> ATTRIBUTES;
    private final List<String> LINES;

    TextFile(File file) throws IOException {
        ATTRIBUTES = new HashMap<>();
        LINES = Files.lines(file.toPath(), StandardCharsets.UTF_8).toList();
    }

    public Map<String, String> getAttributes() {
        return ATTRIBUTES;
    }

    int addLines(int start, Predicate<String> isEnd, String attributeName) {
        StringBuilder builder = new StringBuilder();
        int lineNumber;
        for (lineNumber = start; lineNumber < LINES.size(); lineNumber++) {
            String line = LINES.get(lineNumber);
            if (isEnd.test(line)) {
                break;
            }
            builder.append(line);
            builder.append("\n");
        }
        ATTRIBUTES.put(attributeName, builder.toString().trim());
        return lineNumber;
    }

    void addLineSuffix(String prefix, String attributeName) {
        for (String line : LINES) {
            if (line.startsWith(prefix)) {
                ATTRIBUTES.put(attributeName, line.substring(prefix.length()));
                break;
            }
        }

    }
}
