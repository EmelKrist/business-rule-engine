package ru.emelkrist;

@FunctionalInterface
public interface Condition {
    /**
     * Метод выполнения условия.
     * Примечание: условие задается лямбда-выражениями
     *
     * @param facts факты
     */
    boolean evaluate(Facts facts);
}
