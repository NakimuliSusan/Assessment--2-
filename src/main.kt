fun main () {
   var account1 = CurrentAccount("20102034","Marysusan",200.0)
    account1.deposit(500.0)
    account1.deposit(300.0)
    account1.withdraw(200.0)
    var account2 = SavingsAccount("32456783","Joyce",500.0)
    account2.deposit(150.0)
    println( account2.withdraw(6))
    println( account2.withdraw(3))
    account1.details()
    var x = Product("Soap",3.4,120,"hygiene")
    var y = Product("Bread",5.0,300,"glocery")
    var z = Product("gun",32.0,1200,"other")
     var myitems = mutableListOf<Product>(x,y,z)


    println( create("banana"))




}
open class  CurrentAccount (var account_number:String,account_name:String,var balance:Double) {
    open fun deposit (amount:Double) {
       balance+=amount
        println(balance)


    }
    open fun withdraw(amount: Double){

         balance-=amount
        println(balance)
    }
    fun details () {
        println("Account number $account_number with balance $balance ")
    }

}
class SavingsAccount (account_number: String,account_name: String,balance: Double):CurrentAccount(account_number,account_name,balance) {
    override fun deposit(amount: Double) {
//        super.deposit(amount)
        balance+=amount
        println(balance)

    }

    override fun withdraw(amount: Double) {
         balance-=amount
        println(balance)
    }

    fun withdraw (withdrawals:Int) {
        var w = 0
        if (withdrawals>4) {
            println("Allow access to withdraw money from account")
            w++
        }
    }
}
data class Product (var name:String,var weight:Double,var price:Int,var category:String)
fun add (product:Product): List<String> {
    var glocerylist = mutableListOf<String>()
    var hygienelist = mutableListOf<String>()
    var other = mutableListOf<String>()
    when (product.category){
        "glocery" -> println(glocerylist.add(product.name))
        "hygiene" -> println(hygienelist.add(product.name))
        "other" -> println(other.add(product.name))

    }
    return glocerylist
    return hygienelist
    return other
}
fun create (word:String):String {
    var new = ""
    for (character in word) {
        if (word.indexOf(character)%2==0) {
            new+=character
        }
    }
    return new

}
