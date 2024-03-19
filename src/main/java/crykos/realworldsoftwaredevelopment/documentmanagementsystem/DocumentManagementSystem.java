package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DocumentManagementSystem {

    private final List<Document> documents = new ArrayList<>();
    private final List<Document> documentsView = Collections.unmodifiableList(documents);
}
