package com.example.arjun.kotlinoreilly.inheritance

class RepositoryImpl<T> : Repository<T> {

    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface Repo{
    fun<T> getById(id:Int):T
    fun<R> getAll():List<R>
}


class Myrepo:Repo{
    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <R> getAll(): List<R> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}