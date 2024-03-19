package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Query implements Predicate<Document> {
    private final Map<String, String> clauses;

    static Query parse(String query) {
        return new Query(Arrays.stream(query.split(","))
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(o -> o[0], o -> o[1]))
        );
    }


    public Query(Map<String, String> clauses) {
        this.clauses = clauses;
    }

    @Override
    public boolean test(Document document) {
        return clauses.entrySet()
                .stream()
                .allMatch(entry -> {
                    String documentValue = document.getAttribute(entry.getKey());
                    String queryValue = entry.getValue();
                    return documentValue != null && documentValue.contains(queryValue);
                });
    }
}
