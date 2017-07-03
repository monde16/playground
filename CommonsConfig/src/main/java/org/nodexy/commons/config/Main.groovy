package org.nodexy.commons.config

import org.apache.commons.configuration.Configuration
import org.apache.commons.configuration.PropertiesConfiguration

/**
 * Created by phoenix on 7/3/17.
 */
class Main {
    static void main(String[] args) {
        Configuration config = new PropertiesConfiguration("config.properties")
        println("Properties:")
        config.keys.toList().forEach {
            println("$it --> ${config.getProperty(it)}")
        }
    }
}
