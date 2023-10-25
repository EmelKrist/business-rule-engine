package ru.emelkrist;

/**
 * Класс - правило
 */
public class Rule {
    /**
     * Условие
     */
    private Condition condition;
    /**
     * Действие
     */
    private Action action;

    public Rule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    /**
     * Метод на исполнение проверки фактов на соответствие правилу.
     *
     * @param facts факты
     */
    public void perform(Facts facts) {
        // если условие выражается в фактах (истинно)
        if (condition.evaluate(facts)) {
            action.execute(facts); // совершается действие
        }
    }
}
