package com.lidd.exposedtest.domain

import org.jetbrains.exposed.dao.id.IntIdTable

object UsersEntity : IntIdTable(name = "users") {
    val name = varchar("name", 255)
}