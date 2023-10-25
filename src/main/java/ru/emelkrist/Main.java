package ru.emelkrist;

public class Main {
    public static void main(String[] args) {
        var env = new Facts();
        env.addFact("name", "Bob");
        env.addFact("jobTitle", "CEO");

        final var businessRuleEngine = new BusinessRuleEngine(env);

        final Rule ruleSendEmailToSalesWhenCEO =
                RuleBuilder
                        .when(facts -> "CEO".equals(facts.getFact("jobTitle")))
                        .then(facts -> {
                            final String name = facts.getFact("name");
                            System.out.println("Sending email to sales with customer " + name);
                        });

        businessRuleEngine.addRule(ruleSendEmailToSalesWhenCEO);
        businessRuleEngine.run();
    }
}