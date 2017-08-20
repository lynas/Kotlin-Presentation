package section_5

open class Person

class Employee(val vacationDays : Int) : Person()

class Contractor : Person()

fun validVacation(person: Person) {
    if (person is Employee) {
        if (person.vacationDays < 20) {
            println("You need some more time off!!")
        }
    }
}