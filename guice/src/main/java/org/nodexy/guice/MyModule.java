package org.nodexy.guice;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).to(EarlyBirdDiscount.class);
    }
}
