package com.resteasy.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by hitenpratap on 17/03/17.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user")
public class User implements Serializable {

    @XmlAttribute(name = "id")
    @FormParam("id")
    private int id;

    @XmlElement(name = "firstName")
    @FormParam("firstName")
    private String firstName;

    @XmlElement(name = "lastName")
    @FormParam("lastName")
    private String lastName;

    @XmlElement(name = "emailAddress")
    @FormParam("emailAddress")
    private String emailAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
