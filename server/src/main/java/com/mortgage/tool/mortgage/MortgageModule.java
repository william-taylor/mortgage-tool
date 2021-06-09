package com.mortgage.tool.mortgage;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.mortgage.tool.javalin.JavalinController;

public class MortgageModule extends AbstractModule {
    protected void configure() {
        Multibinder.newSetBinder(binder(), JavalinController.class)
                .addBinding().to(MortgageController.class);
    }
}