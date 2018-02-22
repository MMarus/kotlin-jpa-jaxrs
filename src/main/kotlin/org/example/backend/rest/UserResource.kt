package org.example.backend.rest

import org.example.backend.persistence.PersistenceHelper
import org.example.backend.persistence.User
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType.APPLICATION_JSON

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 2/15/18.
 */
@Path("users")
@Produces(APPLICATION_JSON)
class UserResource {
    private val users : MutableList<User>

    init {
        val ph = PersistenceHelper()
        users = ph.fetchUsers()

        users.add(User(4, "Gerard", "New", "personalId", "email", "Date",
                1, "pass", "phone"))
    }

    @GET
    fun getUsers(): List<User> {
        return users
    }

    @GET @Path("{id}")
    fun getUser(@PathParam("id") id: Int): User? {
        return users[id]
    }
}
