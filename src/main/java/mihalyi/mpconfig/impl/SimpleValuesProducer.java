package mihalyi.mpconfig.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import mihalyi.mpconfig.api.ConfigProperty;

/**
 *
 * @author Ondrej Mihalyi
 */
@ApplicationScoped
public class SimpleValuesProducer {
    
    @Dependent
    @Produces
    @ConfigProperty("")
    public String provideStringProperty() {
            return "";
    }

    @Dependent
    @Produces
    @ConfigProperty("")
    public Boolean provideBooleanProperty() {
            return Boolean.FALSE;
    }

    @Dependent
    @Produces
    @ConfigProperty("")
    public Integer provideIntegerProperty()  {
            return 1;
    }

    @Dependent
    @Produces
    @ConfigProperty("")
    public Long provideLongProperty()  {
            return 1L;
    }

    @Dependent
    @Produces
    @ConfigProperty("")
    public Float provideFloatProperty()  {
            return Float.valueOf(1L);
    }
    
    @Dependent
    @Produces
    @ConfigProperty("")
    public Double provideDoubleProperty()  {
            return Double.valueOf(1L);
    }
    

    @Dependent
    @Produces
    @ConfigProperty("")
    public Date provideDateProperty()  {
            return new Date();
    }
    
    @Dependent
    @Produces
    @ConfigProperty("")
    public LocalDate provideLocalDateProperty()  {
        return LocalDate.MIN;
    }

    @Dependent
    @Produces
    @ConfigProperty("")
    public LocalDateTime provideLocalDateTimeProperty()  {
            return LocalDateTime.MIN;
    }
}
