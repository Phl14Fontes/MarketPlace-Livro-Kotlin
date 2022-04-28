package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {

    //range de 100-199 -> book
    ML100("ML-100", "Book [%s], not exists"),
    ML101("ML-101", "Cannot update book with status [%s]"),

    // range 200-299 -> customer
    ML200("ML-200","Customer [%s] not exists")

}