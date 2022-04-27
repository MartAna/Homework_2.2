package ru.netology.service

import ru.netology.data.Post

class WallService {

    private var posts = emptyArray<Post>()

    private var property = 0

    fun add(post: Post): Post {
        val newPost = post.copy(id = property + 1)
        posts += newPost
        property++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (item in posts){
            if (item.id == post.id) {
                val number = posts.indexOf(item)
                posts[number]  = post.copy(id = item.id, ownerId = item.ownerId, date = item.date)
               return true
            } else
                continue
        }
        return false
    }

}