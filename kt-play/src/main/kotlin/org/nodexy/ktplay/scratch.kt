package org.nodexy.ktplay

/**
 * Created by phoenix on 3/29/17.
 */

class Tree<T> {
    data class Node<T>(val data: T?, val left: Node<T>?, val right: Node<T>?)


}

class LinkedList<T>(var root: Node<T>? = null) {
    private var size = 0

    data class Node<T>(val data: T?, val next: Node<T>?)
}


//function isLeapYear (year):
//  if ((year modulo 4 is 0) and (year modulo 100 is not 0))
//          or (year modulo 400 is 0)
//      then true
//  else false
fun isLeapYear(year: Int): Boolean {
    assert(year>=0)

    return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)
}

fun f() {
    (1900..2020)
            .filter { isLeapYear(it) }
            .forEach { println("\t$it") }
}

fun main(args: Array<String>) {
    f()
}