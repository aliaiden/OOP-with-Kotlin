/**
 * Created by ali on 7/15/17.
 */
class Person(var name: String, var age: Int, var college: String?) {
    var email: String = ""

    constructor(name: String, age: Int, college: String?, email: String): this(name, age, college){
        this.email = email
    }

    fun isElligibleToVote (): Boolean{
        return age>18
    }

}