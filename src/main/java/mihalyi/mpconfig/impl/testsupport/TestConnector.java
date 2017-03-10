package mihalyi.mpconfig.impl.testsupport;

import mihalyi.mpconfig.impl.SimpleValuesProducer;
import org.eclipse.microprofile.config.tck.MicroProfileConfigTestConnector;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

/**
 *
 * @author Ondrej Mihalyi
 */
public class TestConnector implements MicroProfileConfigTestConnector {

    @Override
    public Archive modifyDeployment(Archive deployment) {
        return deployment.as(JavaArchive.class)
                .addPackage(SimpleValuesProducer.class.getPackage());
    }

}
