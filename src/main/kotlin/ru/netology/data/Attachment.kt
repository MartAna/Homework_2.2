package ru.netology.data

abstract class Attachment(val type: String)

data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class VideoAttachment(val video: Video) : Attachment("video")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class DocAttachment(val doc: Doc) : Attachment("doc")
data class LinkAttachment(val link: Link) : Attachment("link")


data class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String? = null,
    val date: Int = 0,
    val width: Int = 0,
    val height: Int = 0
)

data class Video(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "title",
    val description: String = "-",
    val duration: Int = 0,
    val date: Int = 0,
    val views: Int = 0,
    val comments: Int = 0,
    val width: Int = 0,
    val height: Int = 0
)

data class Audio(
    val id: Int = 0,
    val ownerId: Int = 0,
    val artist: String = "artist",
    val title: String = "title",
    val duration: Int = 0,
    val date: Int = 0
)

data class Doc(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "title",
    val size: Int = 0,
    val ext: String? = null,
    val date: Int = 0,
    val type: Int = 0
)

data class Link(
    val url: String? = null,
    val title: String = "title",
    val caption: String? = null,
    val description: String? = null
)