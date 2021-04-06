package com.bit.preventsoft.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.bit.preventsoft.dao.AprDao;
import com.bit.preventsoft.dao.AprLineDao;
import com.bit.preventsoft.dao.EppDao;
import com.bit.preventsoft.dao.HazardDao;
import com.bit.preventsoft.dao.PrecautionDao;
import com.bit.preventsoft.dao.ToolDao;
import com.bit.preventsoft.dao.UserDao;
import com.bit.preventsoft.models.Apr;
import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Epp;
import com.bit.preventsoft.models.Hazard;
import com.bit.preventsoft.models.Precaution;
import com.bit.preventsoft.models.Tool;
import com.bit.preventsoft.models.User;

@Database(entities={Apr.class, AprLine.class, Epp.class, Hazard.class, Precaution.class, Tool.class, User.class}, version=1)
public abstract class PreventSoftDatabase extends RoomDatabase {
    public abstract AprDao aprDao();
    public abstract AprLineDao aprLineDao();
    public abstract EppDao eppDao();
    public abstract HazardDao hazardDao();
    public abstract PrecautionDao precautionDao();
    public abstract ToolDao toolDao();
    public abstract UserDao userDao();

    private static volatile PreventSoftDatabase INSTANCE;

    public static PreventSoftDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (PreventSoftDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PreventSoftDatabase.class, "PreventSoftDataBase")
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
