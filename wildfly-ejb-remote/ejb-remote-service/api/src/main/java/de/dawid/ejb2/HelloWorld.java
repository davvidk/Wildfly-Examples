package de.dawid.ejb2;

import javax.ejb.Remote;

/**
 * @author Dawid Kostrzycki
 */

@Remote
public interface HelloWorld {

    String sayHello();
}
