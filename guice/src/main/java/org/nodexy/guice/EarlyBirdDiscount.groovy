package org.nodexy.guice

class EarlyBirdDiscount implements Discountable {
    @Override
    double getDiscount() { 0.25 }
}
