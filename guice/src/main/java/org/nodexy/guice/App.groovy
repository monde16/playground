package org.nodexy.guice

import com.google.inject.Guice
import com.google.inject.Injector
import org.nodexy.guice.modules.DiscountModule

import java.util.logging.Logger

class App {
    private static Logger log = Logger.getLogger(App.canonicalName)
    static Injector injector
    static {
        injector = Guice.createInjector(new DiscountModule())
    }

    static void main(String[] args) {
        CheckoutService checkoutService = injector.getInstance(CheckoutService.class)

        def item = 100d

        log.info("Checking out...")
        checkoutService.checkout(item)
    }
}
