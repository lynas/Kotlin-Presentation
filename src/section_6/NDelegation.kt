package section_6

import section_2.PersonInKotlin

interface Repo<T : Any> {
    fun getById(id: Int): T
    fun getAll(): List<T>

}

class Controller(repo: Repo<PersonInKotlin>) : Repo<PersonInKotlin> by repo {

    fun personList(): String {
        return getAll().toString()
    }
}