package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class LetterImporter implements Importer {
    private static final String PREFIX_NAME = "Dear ";

    @Override
    public Document importFile(File file) throws IOException {
        TextFile textFile = new TextFile(file);
        textFile.addLineSuffix(PREFIX_NAME, AttributeConstants.PATIENT);
        int lineNumber = textFile.addLines(2, String::isEmpty, AttributeConstants.ADDRESS);
        textFile.addLines(lineNumber + 1, s -> s.startsWith("regard,"), AttributeConstants.BODY);
        Map<String, String> attributes = textFile.getAttributes();
        attributes.put(AttributeConstants.TYPE, "LETTER");
        return new Document(attributes);

    }
}
