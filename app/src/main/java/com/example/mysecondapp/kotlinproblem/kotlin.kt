package com.example.mysecondapp.kotlinproblem


import java.util.Scanner
//created userdefined function to call in main method
fun  callMe(input1: String, input2: String): Boolean {  //two string input parameters

    val map = mapOf(1121 to "ACME", 1111 to "ALFA" , 3796 to "AMEX")  //map intialization with key as number and value as company name

    val cardDetails = input1.split("-")  //input1 split by "-" into list of strings

    println(cardDetails)

    val lengthOfCardDetails = cardDetails.size //length of the array

    println(lengthOfCardDetails)

    val companyName = cardDetails[0].toInt() // to compare integer key, i converted string to int

    println(companyName)

    val date = cardDetails[lengthOfCardDetails-1] // last index value retrieved

    println(date)

    val isCardContainCompanyName = map.containsKey(companyName) // checking map contains list first element i.e. company number

    println(isCardContainCompanyName)

    if (isCardContainCompanyName) {

        val cardDate = date.substring(0, 2) + "/" + date.substring(2) // adding "/" to last element in array at index 2

        println(cardDate)

        return cardDate.equals(input2) //checked with given expiry date
    } else {
        return false
    }
}

fun main(args: Array<String>){
    //println( callMe("3796-1111-0000-0412", "04/12") )
    val scanner = Scanner(System.`in`)  //to read the given inut

    println("enter card number")

    val input1 = scanner.next() //read 1st input
    println("enter expiry date")
    val input2 = scanner.next() //read 2nd input

    println( callMe(input1, input2)) //calling callMe() to return output

}
