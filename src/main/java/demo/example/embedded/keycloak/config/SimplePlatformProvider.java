package demo.example.embedded.keycloak.config;

import org.keycloak.platform.PlatformProvider;
import org.keycloak.services.ServicesLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class SimplePlatformProvider implements PlatformProvider {
    private static final Logger log = LoggerFactory.getLogger(SimplePlatformProvider.class);

    Runnable shutdownHook;

    @Override
    public void onStartup(Runnable startupHook) {
        startupHook.run();
    }

    @Override
    public void onShutdown(Runnable shutdownHook) {
        this.shutdownHook = shutdownHook;
    }

    @Override
    public void exit(Throwable cause) {
        ServicesLogger.LOGGER.fatal(cause);
        log.error("Exiting because of error", cause);
        exit(1);
    }

    @Override
    public File getTmpDirectory() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    private void exit(int status) {
        new Thread(() -> System.exit(status)).start();
    }

}
