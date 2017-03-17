package com.resteasy;

import com.resteasy.controller.UserController;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hitenpratap on 17/03/17.
 */
public class MainApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public MainApplication() {
        singletons.add(new UserController());
    }

    public Set<Object> getSingletons() {
        return singletons;
    }

}
