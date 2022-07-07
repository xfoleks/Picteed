package edu.xfolex.picteed.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.xfolex.picteed.data.local.dao.UnsplashImageDao
import edu.xfolex.picteed.data.local.dao.UnsplashRemoteKeysDao
import edu.xfolex.picteed.models.UnsplashImage
import edu.xfolex.picteed.models.UnsplashRemoteKeys

@Database(
    entities = [UnsplashImage::class, UnsplashRemoteKeys::class],
    version = 1,
    exportSchema = false
)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}