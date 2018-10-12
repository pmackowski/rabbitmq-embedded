package pl.pmackowski.rabbitmq.embedded;

public class EmbeddedRabbitMqException extends RuntimeException {

    public EmbeddedRabbitMqException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
