package com.Vaishnavi.todoister.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.Vaishnavi.todoister.model.Task;

import java.util.List;

@Dao
public interface TaskDao {


    @Insert
    public void insertTask(Task task);

    @Query("DELETE FROM task_table")
    public void deleteAllTasks();

    @Delete
    public void deleteTask(Task task);

    @Query("SELECT * FROM task_table")
    LiveData<List<Task>> getAllTasks();

    @Query("SELECT * FROM task_table WHERE task_table.task_id == :id")
    LiveData<Task> getTask(long id);

    @Update
    void updateTask(Task task);
}
