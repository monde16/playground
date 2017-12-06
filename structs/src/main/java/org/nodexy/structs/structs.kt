package org.nodexy.structs

import java.util.*
import kotlin.streams.toList

/**
 * Created by phoenix on 4/13/17.
 */

data class Pair<E,F>(var first: E?, var second: F?)

data class Tuple<out T> (val values: List<T>)

fun main(args: Array<String>) {
	g()
}

fun g() {
	val lst = Random().ints(16, 0, 100).toList().toMutableList()

	println(lst.joinToString(", ", "[", "]"))
}