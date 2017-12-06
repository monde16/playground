package org.nodexy.guice.module;

import com.google.inject.AbstractModule;
import org.nodexy.guice.discount.Discountable;
import org.nodexy.guice.provider.DiscountProvider;

public class DiscountModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).toProvider(DiscountProvider.class);
    }
}
