package org.nodexy.guice

import com.google.inject.Inject
import org.nodexy.guice.provider.DiscountProvider

import java.util.logging.Logger

class CheckoutService {
    private static Logger log = Logger.getLogger(CheckoutService.canonicalName)
    private DiscountProvider provider // allows for late instantiation

    @Inject
    CheckoutService(DiscountProvider provider) {
        this.provider = provider
    }

    double checkout(double... items) {
        def discountable = provider.get()
        def total = 0d

        items.each {itm -> total += itm}

        def discount = discountable.discount*total
        def finalPrice = (total-discount).round(2)
        log.info """
Total:            ${formatMoney(total)}
Discount @${discountable.discount*100}%:  ${formatMoney(discount)}
Discounted Price: ${formatMoney(finalPrice)}
"""
        finalPrice
    }

    def formatMoney(double x) {
        sprintf('R %,.2f', x)
    }
}
