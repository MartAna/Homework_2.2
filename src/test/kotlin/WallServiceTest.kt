import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test
import ru.netology.data.*
import ru.netology.service.WallService

class WallServiceTest {

    @Test
    fun addId() {

        val service = WallService()

        val post = service.add(
            Post(
                0,
                15,
                89,
                89,
                15022022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                57,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )


        val result = post.id


        assertTrue(result != 0)


    }

    @Test
    fun updateTrue() {

        val service = WallService()

        service.add(
            Post(
                0,
                15,
                89,
                89,
                15022022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                57,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )
        service.add(
            Post(
                0,
                15,
                90,
                85,
                15042022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                57,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )
        service.add(
            Post(
                0,
                17,
                89,
                89,
                15022022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                53,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )

        val update = Post(
            2,
            15,
            89,
            89,
            15022022,
            "example",
            45,
            78,
            true,
            null,
            null,
            null,
            null,
            null,
            "post",
            null,
            null,
            null,
            57,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        )


        val result = service.update(update)


        assertTrue(result)
    }

    @Test
    fun updateFalse() {

        val service = WallService()

        service.add(
            Post(
                0,
                15,
                89,
                89,
                15022022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                57,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )
        service.add(
            Post(
                0,
                15,
                90,
                85,
                15042022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                57,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )
        service.add(
            Post(
                0,
                17,
                89,
                89,
                15022022,
                "example",
                45,
                78,
                true,
                null,
                null,
                null,
                null,
                null,
                "post",
                null,
                null,
                null,
                53,
                false,
                false,
                false,
                false,
                false,
                false,
                null,
                96
            )
        )

        val update = Post(
            5,
            15,
            89,
            89,
            15022022,
            "example",
            45,
            78,
            true,
            null,
            null,
            null,
            null,
            null,
            "post",
            null,
            null,
            null,
            57,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        )


        val result = service.update(update)


        assertFalse(result)
    }

    @Test

    fun addAttachmentTrue() {

        val service = WallService()

        service.add(
            Post(id = 0, ownerId = 15)
        )
        service.add(
            Post(id = 0, ownerId = 15)
        )
        service.add(
            Post(id = 0, ownerId = 17)
        )

        val update = Post(id = 2, ownerId = 15)
        val attachment = PhotoAttachment(Photo())
        val result = service.addAttachment(update, attachment)


        assertTrue(result)

    }

    @Test
    fun addAttachmentTrueWithAttachment() {

        val service = WallService()

        service.add(
            Post(id = 0, ownerId = 15)
        )

        service.add(
            Post(id = 0, ownerId = 15)
        )
        service.add(
            Post(id = 0, ownerId = 17)
        )

        val update = Post(id = 2, ownerId = 15)
        val attachment = VideoAttachment(Video())
        service.addAttachment(update, attachment)
        val attachmentTwo = DocAttachment(Doc())
        service.addAttachment(update, attachmentTwo)
        val newAttachment = LinkAttachment(Link())

        val result = service.addAttachment(update, newAttachment)


        assertTrue(result)

    }

    @Test
    fun addAttachmentFalse() {

        val service = WallService()

        service.add(
            Post(id = 0, ownerId = 15)
        )

        service.add(
            Post(id = 0, ownerId = 15)
        )
        service.add(
            Post(id = 0, ownerId = 17)
        )

        val update = Post(id = 5, ownerId = 15)
        val attachment = AudioAttachment(Audio())
        val result = service.addAttachment(update, attachment)


        assertFalse(result)

    }
}