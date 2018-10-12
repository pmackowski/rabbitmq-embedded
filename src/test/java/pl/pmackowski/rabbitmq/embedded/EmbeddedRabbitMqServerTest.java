package pl.pmackowski.rabbitmq.embedded;

import org.junit.Test;

import java.io.IOException;

public class EmbeddedRabbitMqServerTest {

    @Test
    public void test() throws IOException {
        EmbeddedRabbitMqProperties embeddedRabbitMqProperties = new EmbeddedRabbitMqProperties();
        embeddedRabbitMqProperties.setManagemementPluginEnabled(true);
        embeddedRabbitMqProperties.setNodename("rabbit-dev");

        EmbeddedRabbitMqServer embeddedRabbitMqServer = new EmbeddedRabbitMqServer(embeddedRabbitMqProperties);
        embeddedRabbitMqServer.start();
        embeddedRabbitMqServer.stop();
    }

}