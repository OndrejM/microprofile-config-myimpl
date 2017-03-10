package org.eclipse.microprofile.config.tck;

import java.time.*;
import java.util.*;
import org.jboss.shrinkwrap.api.Archive;

/**
 *
 * @author Ondrej Mihalyi
 */
public class CDITestsFunctions {

    public static Archive add_implementation_resources(Archive deployment) {
        Iterator<MicroProfileConfigTestConnector> itConnectors = ServiceLoader.load(MicroProfileConfigTestConnector.class).iterator();
        if (itConnectors.hasNext()) {
            return itConnectors.next().modifyDeployment(deployment);
        } else {
            return deployment;
        }
    }

    public static Date toDate(String isoDateTime) {
        return Date.from(ZonedDateTime.parse(isoDateTime).toInstant());
    }

    public static LocalDate toLocalDate(String isoDateTime) {
        return LocalDate.parse(isoDateTime);
    }

    public static LocalDateTime toLocalDateTime(String isoDateTime) {
        return LocalDateTime.parse(isoDateTime);
    }

}
