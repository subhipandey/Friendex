package com.subhpandey.android.friendex.data.model

import com.subhpandey.android.friendex.R

data class Friend(
    val id: Int = 0,
    val photo: Int = 0,
    val name: String = "",
    val sex: String= "",
    val color: String = "",
    val occupation: String = "",
    val age: Int = 0,
    val description: String = "",
    val relationship: String = ""
)

fun getFriendId(id: Int): Friend {
    return getFriendList().find { friend ->
        id == friend.id
    } ?: Friend()
}

fun getFriendList(): List<Friend> {
    return listOf(
        Friend(
            id = 1,
            photo = R.drawable.abhinav,
            name = "Abhinav Shrivastava",
            sex = "Male",
            age = 27,
            color = "White",
            description = "Founded tech communities in 10 cities, and an e-learning website, learn.cafe with a mission to raise the bar in technology skills around the world.",
            occupation = "Founder Learn.Café and Firebase Communities Group",
            relationship = "Complicated"
        ),
        Friend(
            id = 2,
            photo = R.drawable.preetam,
            name = "Preetam Rane",
            sex = "Male",
            age = 22,
            color = "White",
            description = "A Codeaholic undergrad working well in the domain of Computer Vision and have a keen interest for moving towards Machine Learning",
            occupation = "Student",
            relationship = "Single"
        ),
        Friend(
            id = 3,
            photo = R.drawable.sagar,
            name = "Sagar Viradiya",
            sex = "Male",
            age = 29,
            color = "White",
            description = "Self-taught android dev. Love to explore new things, open source my experiments and contribute to open source community.",
            occupation = "Lead Android engineer @BookMyShow",
            relationship = "Single"
        ),
        Friend(
            id = 4,
            photo = R.drawable.bharat,
            name = "Bharat Makwana",
            sex = "Male",
            age = 21,
            color = "White",
            description = "Enthusiastic about computer technologies, always ready to learn new things, Udacity Graduate of Android Basics Nanodegree as part of Google India Scholarship",
            occupation = "Mobile Application Developer",
            relationship = "Single"
        ),


    )
}
