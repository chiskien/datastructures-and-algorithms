package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class InvoiceImporter implements Importer {
    private static final String NAME_PREFIX = "Dear ";
    private static final String AMOUNT_PREFIX = "Amount: ";

    @Override
    public Document importFile(File file) throws IOException {
        TextFile textFile = new TextFile(file);
        textFile.addLineSuffix(NAME_PREFIX, AttributeConstants.PATIENT);
        textFile.addLineSuffix(AMOUNT_PREFIX, AttributeConstants.AMOUNT);
        Map<String, String> attributes = textFile.getAttributes();
        return new Document(attributes);
    }
}
