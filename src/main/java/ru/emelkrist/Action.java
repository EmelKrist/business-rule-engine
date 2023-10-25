package ru.emelkrist;

@FunctionalInterface
public interface Action {
    /**
     * Метод выполнения действия.
     * Примечание: выполняемое действие задается лямбда-выражениями
     *
     * @param facts факты
     */
    void execute(Facts facts);
}
