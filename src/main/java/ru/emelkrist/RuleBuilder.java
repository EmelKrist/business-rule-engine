package ru.emelkrist;

/**
 * Класс - строитель правил
 */
public class RuleBuilder {
    /**
     * Условие соблюдения правила
     */
    private Condition condition;

    public RuleBuilder(Condition condition) {
        this.condition = condition;
    }

    /**
     * Метод для добавления условия в правило.
     *
     * @param condition условие
     * @return объект строителя правила
     */
    public static RuleBuilder when(Condition condition) {
        return new RuleBuilder(condition);
    }

    /**
     * Метод для добавления действия в правило.
     *
     * @param action действие
     * @return правило с условием и действием
     */
    public Rule then(Action action) {
        return new Rule(condition, action);
    }
}
