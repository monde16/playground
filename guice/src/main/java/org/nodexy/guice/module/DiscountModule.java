package org.nodexy.guice.module;

import com.google.inject.AbstractModule;
import org.nodexy.guice.discount.Discountable;
import org.nodexy.guice.discount.*;

public class DiscountModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).to(EarlyBirdDiscount.class);
    }
}
