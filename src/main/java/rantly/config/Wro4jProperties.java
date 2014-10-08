package rantly.config;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("wro4j")
public class Wro4jProperties {

    private boolean ignoreMissingResources = false;

    private boolean debug = true;

    private int cacheUpdatePeriod = 0;

    private int resourceWatcherUpdatePeriod = 5;

    private String urlPattern = "/assets/*";

    private String uriLocators = "servletContext,classpath,uri";

    private String preProcessors = "cssUrlRewriting,cssImport,semicolonAppender,lessCss";

    private String postProcessors = "cssVariables,cssMinJawr,jsMin";

    private String hashStrategy = "MD5";

    private String namingStrategy = "hashEncoder-CRC32";

    public boolean isDebug() {
        return debug;
    }

    public boolean isDisableCache() {
        return true;
    }

    public int getCacheUpdatePeriod() {
        return cacheUpdatePeriod;
    }

    public int getResourceWatcherUpdatePeriod() {
        return resourceWatcherUpdatePeriod;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public String getUriLocators() {
        return uriLocators;
    }

    public String getPreProcessors() {
        return preProcessors;
    }

    public String getPostProcessors() {
        return postProcessors;
    }

    public String getHashStrategy() {
        return hashStrategy;
    }

    public String getNamingStrategy() {
        return namingStrategy;
    }

    public boolean getIgnoreMissingResources() {
        return ignoreMissingResources;
    }

}