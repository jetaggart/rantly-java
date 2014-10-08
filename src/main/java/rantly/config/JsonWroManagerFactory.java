package rantly.config;

import org.springframework.core.io.ClassPathResource;
import ro.isdc.wro.extensions.model.factory.JsonModelFactory;
import ro.isdc.wro.manager.factory.ConfigurableWroManagerFactory;
import ro.isdc.wro.model.factory.WroModelFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JsonWroManagerFactory extends ConfigurableWroManagerFactory {

    private final Properties configProperties;

    public JsonWroManagerFactory(Properties configProperties) {
        this.configProperties = configProperties;
    }

    @Override
    protected Properties newConfigProperties() {
        return configProperties;
    }

    @Override
    protected WroModelFactory newModelFactory() {
        return new JsonModelFactory() {
            @Override
            protected InputStream getModelResourceAsStream() throws IOException {
                return new ClassPathResource("wro.json").getInputStream();
            }
        };
    }

}