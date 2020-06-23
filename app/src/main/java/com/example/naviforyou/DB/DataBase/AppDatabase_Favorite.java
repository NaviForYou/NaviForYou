package com.example.naviforyou.DB.DataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.naviforyou.DB.Data.Favorite;

@Database(entities = {Favorite.class}, version = 2)
public abstract class AppDatabase_Favorite extends RoomDatabase {
    public abstract FavoriteDao favoriteDao();

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.
        }
    };
}
