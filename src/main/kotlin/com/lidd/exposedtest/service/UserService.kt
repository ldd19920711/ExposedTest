package com.lidd.exposedtest.service

import com.lidd.exposedtest.domain.User
import com.lidd.exposedtest.domain.UsersEntity
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insertAndGetId
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.update
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService {

    fun selectAll(): List<User> {
        val users = mutableListOf<User>()
        val selectAll = UsersEntity.selectAll()
        selectAll.forEach { users.add(User(it[UsersEntity.id].value, it[UsersEntity.name])) }
        return users
    }

    fun create(user: User): Int {
        val getId = UsersEntity.insertAndGetId { it[name] = user.name }
        return getId.value
    }

    fun updateById(user: User): Int {
        return UsersEntity.update(where = { UsersEntity.id.eq(user.id) }) {
            it[name] = user.name
        }
    }

    fun deleteById(id: Int): Int {
        return UsersEntity.deleteWhere { UsersEntity.id.eq(id) }
    }
}