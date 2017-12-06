package org.nodexy.guice

import com.google.inject.Guice
import com.google.inject.Injector

class App {
    static Injector injector
    static {
        injector = Guice.createInjector(new MyModule())
    }

    static void main(String[] args) {
        CheckoutService checkoutService = injector.getInstance(CheckoutService.class)

        def items = [
                200d,
                300d,
                500d
        ]

        println("Checking out...")
        checkoutService.checkout(items)
    }
}
