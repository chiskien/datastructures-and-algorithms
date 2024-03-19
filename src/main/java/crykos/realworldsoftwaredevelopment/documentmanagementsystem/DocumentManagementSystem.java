package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DocumentManagementSystem {

    private final List<Document> documents = new ArrayList<>();
    private final List<Document> documentsView = Collections.unmodifiableList(documents);

    private final HashMap<String, Importer> extensionImporter = new HashMap<>();

    public DocumentManagementSystem() {
        extensionImporter.put("letter", new LetterImporter());
        extensionImporter.put("report", new ReportImporter());
        extensionImporter.put("jpg", new ImageImporter());
        extensionImporter.put("invoice", new InvoiceImporter());
    }

    public void importFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        int separatorIndex = pathname.lastIndexOf(".");
        if (separatorIndex != -1) {
            String extension = pathname.substring(separatorIndex + 1);
            Importer importer = extensionImporter.get(extension);
            if (importer == null) {
                throw new UnknowFileTypeException("For file: " + pathname);
            }
            Document document = importer.importFile(file);
            documents.add(document);
        } else {
            throw new UnknowFileTypeException("No extension found for file: " + pathname);
        }

    }
}
