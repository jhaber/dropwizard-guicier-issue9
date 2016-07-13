package com.hubspot.dropwizard.issue9;

import com.hubspot.dropwizard.guicier.GuiceBundle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<AppConfiguration> {

  public static void main(String... args) throws Exception {
    new App().run(args);
  }

  @Override
  public void initialize(Bootstrap<AppConfiguration> bootstrap) {
    bootstrap.addBundle(GuiceBundle.defaultBuilder(AppConfiguration.class)
        .modules(new ContainerModule())
        .build());
  }

  @Override
  public void run(AppConfiguration configuration, Environment environment) throws Exception {

  }
}
