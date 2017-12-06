package org.nodexy.guice.modules;

import com.google.inject.AbstractModule;
import org.nodexy.guice.discount.Discountable;
import org.nodexy.guice.discount.EarlyBirdDiscount;

public class DiscountModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).to(EarlyBirdDiscount.class);
    }
}
