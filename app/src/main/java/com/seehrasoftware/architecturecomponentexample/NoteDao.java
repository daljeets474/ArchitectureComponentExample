package com.seehrasoftware.architecturecomponentexample;

import android.view.MotionEvent;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("Delete from note_table")
    void deleteAll();

    @Query("Select * from note_table order by priority Desc")
    LiveData<List<Note>> getAllNotes();

}
