package crykos.realworldsoftwaredevelopment.businessruleengine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BusinessRuleEngineTest {


    @Test
    void shouldHaveNoRulesInitially() {
        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    void shouldAddTwoActions() {
        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        businessRuleEngine.addAction(() -> {
        });
        businessRuleEngine.addAction(() -> {
        });
        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    void shouldExecuteOneAction() {
        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        Action action = mock(Action.class);
        businessRuleEngine.addAction(action);
    }
}