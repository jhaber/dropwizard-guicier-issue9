package com.hubspot.dropwizard.issue9;

import com.google.inject.Binder;
import com.hubspot.dropwizard.guicier.DropwizardAwareModule;

public class ContainerModule extends DropwizardAwareModule<AppConfiguration> {

  @Override
  public void configure(Binder binder) {
    binder.bind(HealthResource.class);
  }
}
