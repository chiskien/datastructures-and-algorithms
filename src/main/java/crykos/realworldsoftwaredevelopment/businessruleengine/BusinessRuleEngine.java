package crykos.realworldsoftwaredevelopment.businessruleengine;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private final List<Action> actions = new ArrayList<>();

    public void addAction(Action action) {
        actions.add(action);
    }

    public void runAction() {
        throw new UnsupportedOperationException();
    }

    public int count() {
        return this.actions.size();
    }
}
