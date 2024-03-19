package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.Map;


public class ReportImporter implements Importer {
    private static final String NAME_PREFIX = "Patient: ";

    @Override
    public Document importFile(File file) throws IOException {
        Map<String, String> attributes;
        TextFile textFile = new TextFile(file);
        textFile.addLineSuffix(NAME_PREFIX, AttributeConstants.PATIENT);
        textFile.addLines(2, s -> false, AttributeConstants.BODY);
        attributes = textFile.getAttributes();
        attributes.put(AttributeConstants.TYPE, "REPORT");
        return new Document(attributes);
    }
}
