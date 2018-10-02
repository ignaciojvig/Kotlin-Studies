fun main(args: Array<String>){
    // In Kotlin, 'val' cannot be changed, so it remains constant since your creation
    val example1 = 12%5

    // Trying to change the value from the 'val example1' will raise an error, possible to see by uncommenting the
    // line below:
    // example1 = 534

    // Still, in order to use variables, we can use 'var'
    // 'var' will allow us to change it's value
    var example2 = 2

    example2 += 100

}