package me.pisal.badoorecyclerview.service

import me.pisal.badoorecyclerview.R
import me.pisal.badoorecyclerview.model.RelationStatus
import me.pisal.badoorecyclerview.model.User

object UserSevice {

    private var users: ArrayList<User>? = null
    fun getUsers(): ArrayList<User>? {
        users = arrayListOf()
        users?.add(User(1, "AAA", R.drawable.photo_female_1))
        users?.add(User(1, "BBB", R.drawable.photo_female_2, RelationStatus.LIKE))
        users?.add(User(1, "CCC", R.drawable.photo_female_3))
        users?.add(User(1, "DDD", R.drawable.photo_female_4))
        users?.add(User(1, "EEE", R.drawable.photo_female_5))
        users?.add(User(1, "FFF", R.drawable.photo_female_6, RelationStatus.LIKE))
        users?.add(User(1, "GGG", R.drawable.photo_female_7))
        users?.add(User(1, "HHH", R.drawable.photo_female_8))
        users?.add(User(1, "III", R.drawable.photo_male_1))
        users?.add(User(1, "JJJ", R.drawable.photo_male_2))
        users?.add(User(1, "KKK", R.drawable.photo_male_3, RelationStatus.LIKE))
        users?.add(User(1, "LLL", R.drawable.photo_male_4))
        users?.add(User(1, "MMM", R.drawable.photo_male_5, RelationStatus.LIKE))
        users?.add(User(1, "NNN", R.drawable.photo_male_6))
        users?.add(User(1, "OOO", R.drawable.photo_male_7))
        users?.add(User(1, "PPP", R.drawable.photo_male_8))
        return users
    }
}