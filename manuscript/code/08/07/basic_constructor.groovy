class Person {
    def name
    def email
    def mobile

    //Here's the constructor:
    Person(name) {
        this.name = name
    }
}

def astrid = new Person('Astrid Smithson')
println astrid.dump()

Person gretchen = ['Gretchen Gaul']
println gretchen.dump()

//TODO: Finish
//def alexis = 'Alexis Middleton' as Person
//println alexis.dump()
