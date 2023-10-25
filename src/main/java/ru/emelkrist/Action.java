package ru.emelkrist;

@FunctionalInterface
public interface Action {
    void execute(Facts facts);
}
