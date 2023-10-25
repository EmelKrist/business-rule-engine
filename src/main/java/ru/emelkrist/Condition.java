package ru.emelkrist;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
