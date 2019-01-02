package me.pisal.badoorecyclerview.model

class User(var id: Int?, var name: String?, var imageSrc: Int?, var status: RelationStatus = RelationStatus.NEW)
enum class RelationStatus {
    NEW,
    LIKE
}