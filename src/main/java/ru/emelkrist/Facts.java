package ru.emelkrist;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс - факты
 */
public class Facts {
    /**
     * Факты
     */
    private final Map<String, String> facts = new HashMap<>();

    /**
     * Метод получения факта.
     *
     * @param name имя факта (ключ)
     * @return значение факта
     */
    public String getFact(final String name) {
        return this.facts.get(name);
    }

    /**
     * Метод добавления факта.
     *
     * @param name  имя факта (ключ)
     * @param value значение факта
     */
    public void addFact(final String name, final String value) {
        this.facts.put(name, value);
    }
}
