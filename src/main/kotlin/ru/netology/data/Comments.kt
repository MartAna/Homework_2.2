package ru.netology.data

data class Comments(
    val id: Int = 0,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String? = null,
    val donut: Any? = null,
    val replayToUser: Int = 0,
    val replayToComment: Int = 0,
    val attachment: Attachment? = null,
    val parentsStack: Any? = null,
    val thread: Any? = null
)