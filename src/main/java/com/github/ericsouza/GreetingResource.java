package com.github.ericsouza;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.ResourcePath;

@ApplicationScoped
@Path("/")
public class GreetingResource {

    @ResourcePath("index.html")
    Template indexTpl;

    @GET
    public TemplateInstance hello() {
        return indexTpl.data("myHello", "hello world!");
    }
}