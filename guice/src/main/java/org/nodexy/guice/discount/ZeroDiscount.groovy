package org.nodexy.guice.discount

class ZeroDiscount implements Discountable {
    @Override
    double getDiscount() { return 0 }
}
