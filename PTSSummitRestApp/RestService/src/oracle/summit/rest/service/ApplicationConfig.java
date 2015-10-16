package oracle.summit.rest.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/")
public class ApplicationConfig extends Application {
    public Set<Class<?>> getClasses() {
           return new HashSet<Class<?>>(Arrays.asList(SummitRestService.class, SummitRestService.class));
       }
}
