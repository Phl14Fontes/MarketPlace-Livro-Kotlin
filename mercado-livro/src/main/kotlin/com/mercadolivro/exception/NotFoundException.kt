package com.mercadolivro.exception

import org.flywaydb.core.api.ErrorCode

class NotFoundException(override val message: String, val errorCode: String) : Exception() {

}