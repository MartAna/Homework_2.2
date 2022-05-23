package ru.netology.service

import ru.netology.data.Attachment
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
        for (item in posts) {
            if (item.id == post.id) {
                val number = posts.indexOf(item)
                posts[number] = post.copy(id = item.id, ownerId = item.ownerId, date = item.date)
                return true
            }
        }
        return false
    }


    fun addAttachment(post: Post, attachment: Attachment): Boolean {
        for (item in posts) {
            if (item.id == post.id) {
                val number = posts.indexOf(item)
                return if (item.attachment == null) {
                    val investment: Array<Attachment> = arrayOf(attachment)
                    posts[number] = post.copy(attachment = investment)
                    true
                } else {
                    var invesmentList = emptyArray<Attachment>()
                    invesmentList += item.attachment
                    invesmentList += attachment
                    true
                }
            }

        }
        return false

    }
}



