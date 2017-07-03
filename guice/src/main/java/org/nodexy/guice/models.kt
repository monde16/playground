package org.nodexy.guice.models

import java.util.*

/**
 * Created by phoenix on 5/24/17.
 */

interface BillingService {
    fun bill(amount: Double, id: Int): Boolean
}

class BillingServiceImpl : BillingService {
    val id: Int

    init {
        id = counter++
    }

    override fun bill(amount: Double, id: Int) : Boolean {
        println("[${this.id}]: billed amount: $amount to id: $id")
        return true
    }

    companion object {
        var counter = Random().nextInt()
    }
}

class MockBillingService : BillingService {
    override fun bill(amount: Double, id: Int): Boolean {
        println("[mock]: would've billed amount: $amount to id: $id")
        return true
    }
}

fun main(args: Array<String>) {
    val service = BillingServiceImpl()

    service.bill(1300.toDouble(), 65432)

}