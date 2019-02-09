package de.dawid.ejb_remote;

import de.dawid.ejb2.HelloWorld;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author Dawid Kostrzycki
 */
@Stateless
public class HelloBean {
      @EJB(lookup = "java:global/ejb-remote-service-1.0.0-SNAPSHOT/HelloWorldBean!de.dawid.ejb2.HelloWorld")
      private HelloWorld helloworld;

    public String sayHello() {
        return helloworld.sayHello();
    }
}
