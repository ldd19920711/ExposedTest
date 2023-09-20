package com.lidd.exposedtest.controller

import com.lidd.exposedtest.domain.IdDTO
import com.lidd.exposedtest.domain.User
import com.lidd.exposedtest.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/user")
class UserController(val userService: UserService) {

    @GetMapping("/selectAll")
    fun selectAllUser(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.selectAll())
    }

    @PostMapping("/createUser")
    fun createUser(@RequestBody user: User): ResponseEntity<Int> {
        return ResponseEntity.ok(userService.create(user))
    }

    @PostMapping("/updateUser")
    fun updateUser(@RequestBody user: User): ResponseEntity<Int> {
        return ResponseEntity.ok(userService.updateById(user))
    }

    @PostMapping("/deleteUser")
    fun deleteUser(@RequestBody idDTO: IdDTO): ResponseEntity<Int> {
        return ResponseEntity.ok(userService.deleteById(idDTO.id))
    }
}