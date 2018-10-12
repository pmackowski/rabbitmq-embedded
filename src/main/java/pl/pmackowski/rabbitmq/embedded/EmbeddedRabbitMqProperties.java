package pl.pmackowski.rabbitmq.embedded;

public class EmbeddedRabbitMqProperties {

    private String host = "localhost";
    private int port = 5672;
    private String username = "guest";
    private String password = "guest";
    private int timeoutInSeconds = 30;
    private String nodename = "rabbit@localhost";
    private boolean managemementPluginEnabled = false;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    public void setTimeoutInSeconds(int timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public boolean isManagemementPluginEnabled() {
        return managemementPluginEnabled;
    }

    public void setManagemementPluginEnabled(boolean managemementPluginEnabled) {
        this.managemementPluginEnabled = managemementPluginEnabled;
    }
}
