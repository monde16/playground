package org.nodexy.guice.provider

import com.google.inject.Provider
import org.nodexy.guice.discount.Discountable
import org.nodexy.guice.discount.EarlyBirdDiscount
import org.nodexy.guice.discount.NightOwlDiscount
import org.nodexy.guice.discount.ZeroDiscount

import java.time.LocalTime

/**
 * With a custom provider, we can decide conditions
 * that dictate the provided implementations
 */
class DiscountProvider implements Provider<Discountable> {
    def earlyStart = LocalTime.of(7, 0)
    def zeroStart = LocalTime.of(9, 0)
    def nightStart = LocalTime.of(19, 0)

    @Override
    Discountable get() {
        def now = LocalTime.now()
        if (now >= earlyStart && now < zeroStart) {
            return new EarlyBirdDiscount()
        } else if (now >= zeroStart && now < nightStart) {
            return new ZeroDiscount()
        } else if (now >= nightStart && now < earlyStart) {
            return new NightOwlDiscount()
        } else {
            throw new RuntimeException("Couldn't figure out what to use at time: $now")
        }
    }
}
