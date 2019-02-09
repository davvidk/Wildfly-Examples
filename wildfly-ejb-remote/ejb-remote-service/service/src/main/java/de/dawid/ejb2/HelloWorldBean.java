package de.dawid.ejb2;


import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Dawid Kostrzycki
 */
@Stateless
@Remote(HelloWorld.class)
public class HelloWorldBean implements HelloWorld {

    public String sayHello() {
        return "Hello World Remote EJB";
    }
}
