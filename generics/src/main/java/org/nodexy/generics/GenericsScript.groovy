package org.nodexy.generics

import org.nodexy.generics.entities.Person
import org.nodexy.generics.enums.Gender

/**
 * Created by phoenix on 3/20/17.
 */

def p = new Person(name:'James', surname: 'Maye', gender: Gender.OTHER, dob: new Date())

private static def printPerson(Person p) {
    println "Person{$p.name, $p.surname, $p.gender.displayName}"
}

printPerson(p)
