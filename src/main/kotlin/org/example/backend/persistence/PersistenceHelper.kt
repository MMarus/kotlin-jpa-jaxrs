package org.example.backend.persistence

import javax.persistence.Persistence

/**
 * Created by Marek Marusic <mmarusic></mmarusic>@redhat.com> on 2/22/18.
 */
class PersistenceHelper  {

    fun fetchUsers(): MutableList<User> {
        var entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit")

        val entityManager = entityManagerFactory.createEntityManager()
        entityManager.transaction.begin()
        val result = entityManager.createQuery("from User ", User::class.java).resultList
        for (user in result) {
            println(user.toString())
        }
        entityManager.transaction.commit()
        entityManager.close()

        return result
    }

}
