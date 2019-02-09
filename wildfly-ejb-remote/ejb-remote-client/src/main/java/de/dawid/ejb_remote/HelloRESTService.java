package de.dawid.ejb_remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Dawid Kostrzycki
 */

@Path("/")
public class HelloRESTService {
    Logger LOGGER = LoggerFactory.getLogger(HelloRESTService.class);

    @Inject
    private HelloBean helloBean;

    @GET
    public String hello() {
        LOGGER.info("Hello Rest called...");
        return helloBean.sayHello();
    }
}
