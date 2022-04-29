package com.mercadolivro.controller.request

import com.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser informado")
    @field:NotBlank(message = "Nome não pode estar em branco")
    var name: String,

    @field:NotEmpty(message = "Email deve ser informado")
    @field:Email(message = "Email deve ser válido")
    @EmailAvailable
    var email:String
)