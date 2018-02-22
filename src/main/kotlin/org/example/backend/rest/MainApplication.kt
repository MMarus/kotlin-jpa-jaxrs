package org.example.backend.rest

import javax.ws.rs.core.Application

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 2/15/18.
 */
class MainApplication : Application() {
    override fun getSingletons(): MutableSet<Any> {
        return mutableSetOf(UserResource())
    }
}
