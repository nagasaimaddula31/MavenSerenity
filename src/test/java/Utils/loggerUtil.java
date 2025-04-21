package Utils;

import com.openhtmltopdf.util.LoggerUtil;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;

public class loggerUtil {

	  // Create a logger instance (can be used across all classes)
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtil.class);

    // Provide a public method to get the logger instance
    public static Logger getLogger() {
        return LOGGER;
    }
}
