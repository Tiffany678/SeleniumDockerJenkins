package base;

public final class AppConstants {
    public static final String platform =
            System.getProperty("platform", "remote").trim();  // <-- trim!
    public static final String browserName =
            System.getProperty("browserName", "chrome").trim();
    public static final String seleniumUrl =
            System.getProperty("seleniumUrl", "http://localhost:4444").trim();

}
