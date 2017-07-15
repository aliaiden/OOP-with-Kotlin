/**
 * Created by ali on 7/15/17.
 */

fun main(args: Array<String>) {
    var personObj = Person("Ali Haider", 23, "QBHHSS", "a.haider@engineer.com")
    println(personObj.name + " is " + personObj.age + " years old and he studied in " + personObj.college + " contact him at " + personObj.email
    + " and can he vote? " + personObj.isElligibleToVote())
}
