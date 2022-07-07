package edu.xfolex.picteed.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import edu.xfolex.picteed.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    var urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
)