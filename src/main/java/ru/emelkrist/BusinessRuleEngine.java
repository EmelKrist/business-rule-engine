package ru.emelkrist;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс движка бизнес правил
 */
public class BusinessRuleEngine {
    /**
     * Правила движка
     */
    private final List<Rule> rules;
    /**
     * Факты движка
     */
    private final Facts facts;

    public BusinessRuleEngine(Facts facts) {
        this.facts = facts;
        this.rules = new ArrayList<>();
    }

    /**
     * Метод добавления правила.
     *
     * @param rule правило
     */
    public void addRule(final Rule rule) {
        this.rules.add(rule);
    }

    /**
     * Метод для получения количества правил.
     *
     * @return число правил в движке
     */
    public int count() {
        return this.rules.size();
    }

    /**
     * Метод для запуска движка бизнес правил.
     * Проверяет факты на соответствие всем правилам
     */
    public void run() {
        this.rules.forEach(rule -> rule.perform(facts));
    }
}
