package link.e4mc;

//TODO: convert to a SpeedrunConfig
public class Config {
    public static final Config INSTANCE = new Config();

    //"Whether to use the broker to get the best relay based on location or use a hard-coded relay."
    public final boolean useBroker = true;
    public final String brokerUrl = "https://broker.e4mc.link/getBestRelay";

    public final String relayHost = "test.e4mc.link";
    public final int relayPort = 25575;
}