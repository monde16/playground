package org.nodexy.structs

/**
 * Created by phoenix on 4/13/17.
 */

data class Pair<E,F>(var first: E?, var second: F?)

data class Tuple<out T> (val values: List<T>)
