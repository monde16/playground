package org.nodexy.guice

import com.google.inject.Inject

class CheckoutService {
    private Discountable discountable

    @Inject
    CheckoutService(Discountable discountable) {
        this.discountable = discountable
    }

    double checkout(List<Double> items) {
        def total = 0d

        items.each {itm -> total += itm}

        println "Total:            ${formatMoney(total)}"
        def discount = discountable.discount*total
        println "Discount @${discountable.discount*100}%:  ${formatMoney(discount)}"
        def finalPrice = (total-discount).round(2)
        println "Discounted Price: ${formatMoney(finalPrice)}"
        finalPrice
    }

    def formatMoney(double x) {
        sprintf('R %,.2f', x)
    }


}
