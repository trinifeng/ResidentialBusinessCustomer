fun main() {

    var customerAdd = true
    do{
        print("Are you a residential or business customer? ")
        var customerType = readln().lowercase()
        if(customerType == "residential"){
            print("Enter your name: ")
            var name = readln()
            print("Enter your phone number: ")
            var phone = readln()
            println(customer(name, phone))
            println("Do you have another customer to add? Type yes or no. ")
            if(readln().lowercase() == "no")
                customerAdd = false
        }
        else if(customerType == "business"){
            print("Enter your business name: ")
            var busname = readln()
            print("Enter your contact name: ")
            var contactname = readln()
            print("Enter your phone number: ")
            var phone = readln()
            println(customer(busname, contactname, phone))
            println("Do you have another customer to add? Type yes or no. ")
            if(readln().lowercase() == "no")
                customerAdd = false
        }
        else{
            println("Invalid input.")
        }
    } while (customerAdd)


}

fun customer(name: String, phone: String): String {
    return "Your name is $name and your phone number is $phone"
}

fun customer(businessName: String, contactName: String, phone: String): String{
    return "Your business name is $businessName, your contact name is $contactName, and your phone number is $phone"
}