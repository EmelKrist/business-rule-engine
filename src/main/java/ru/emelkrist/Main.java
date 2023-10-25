package ru.emelkrist;

public class Main {
    public static void main(String[] args) {
        // Создаем факты (окружение движка бизнес правил)
        var env = new Facts();
        env.addFact("name", "Bob");
        env.addFact("jobTitle", "CEO");
        // Создаем движок бизнес правил для фактов
        final var businessRuleEngine = new BusinessRuleEngine(env);
        /* Создаем правило, которое гласит, что, если должность заказчика - CEO,
        то мы отправляем данные заказчика в отдел продаж */
        final Rule ruleSendEmailToSalesWhenCEO =
                RuleBuilder
                        .when(facts -> "CEO".equals(facts.getFact("jobTitle")))
                        .then(facts -> {
                            final String name = facts.getFact("name");
                            System.out.println("Sending email to sales with customer " + name);
                        });
        // Добавляем правило в движок бизнес правил
        businessRuleEngine.addRule(ruleSendEmailToSalesWhenCEO);
        // Запускаем движок на проверку(проверка фактов на удовлетворение правилам)
        businessRuleEngine.run();
    }
}