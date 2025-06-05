package com.example.hellothegioi.data.repository

import com.example.hellothegioi.R
import com.example.hellothegioi.data.model.Comment

object ExampleComment {
    private val exampleComment = listOf(
        Comment(
            userName = "Nguyễn Duy Hiệu",
            avatar = R.drawable.ic_user_avatar,
            time = "1 min",
            text = "Good idea"
        ),
        Comment(
            userName = "Vũ Đức Minh",
            avatar = R.drawable.ic_user_avatar,
            time = "3 day",
            text = "First Comment",
            likes = 1
        ),
        Comment(
            userName = "Hieu Nguyen",
            avatar = R.drawable.ic_user_avatar,
            time = "30 mins",
            text = "can i cooperate with you"
        ),
        Comment(
            userName = "Minh Vu",
            avatar = R.drawable.ic_user_avatar,
            time = "1 hour",
            text = "Bro, you win",
            likes = 3,
            replies = 2
        ),
        Comment(
            userName = "Thu Thuy",
            avatar = R.drawable.ic_user_avatar,
            time = "2 day",
            text = "He he, thank you"
        ),
        Comment(
            userName = "Donald Trump",
            avatar = R.drawable.ic_user_avatar,
            time = "45 min",
            text = "I can hire you"
        )
    )

    fun getAll(): List<Comment> = exampleComment
}