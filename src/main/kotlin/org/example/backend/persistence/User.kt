package org.example.backend.persistence

import javax.persistence.*

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 2/15/18.
 */
@Entity
@Table(name = "USER") //, schema = "pis"
data class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,

        @Column(name = "firstname")
        val firstname: String,

        @Column(name = "surname")
        val surname: String,

        @Column(name = "personalId")
        val personalId: String,

        @Column(name = "email")
        val email: String,

        @Column(name = "birthDate")
        val birthDate: String,

        @Column(name = "role")
        val role: Int,

        @Column(name = "password")
        val password: String,

        @Column(name = "phone")
        val phone: String
)