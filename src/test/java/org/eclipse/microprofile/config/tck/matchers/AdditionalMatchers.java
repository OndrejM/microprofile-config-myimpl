package org.eclipse.microprofile.config.tck.matchers;

import org.hamcrest.*;
import static org.hamcrest.Matchers.closeTo;

/**
 *
 * @author Ondrej Mihalyi
 */
public class AdditionalMatchers {
    public static Matcher<Float> floatCloseTo(float value, float range) {
        return new BaseMatcher<Float>() {
            
            Matcher<Double> doubleMatcher = null;
            
            @Override
            public boolean matches(Object item) {
                return (doubleMatcher = closeTo(value, range)).matches(item);
            }

            @Override
            public void describeTo(Description description) {
                doubleMatcher.describeTo(description);
            }
        };
    }


}
