import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test
import ru.netology.data.Post
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

        // выполняем целевое действие
        val result = post.id

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result !=0)


    }

    @Test
    fun updateTrue() {

        val service = WallService()

        service.add(Post(
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
            57,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        ))
        service.add(Post(
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
            57,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        ))
        service.add(Post(
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
            53,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        ))

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

        service.add(Post(
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
            57,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        ))
        service.add(Post(
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
            57,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        ))
        service.add(Post(
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
            53,
            false,
            false,
            false,
            false,
            false,
            false,
            null,
            96
        ))

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
}