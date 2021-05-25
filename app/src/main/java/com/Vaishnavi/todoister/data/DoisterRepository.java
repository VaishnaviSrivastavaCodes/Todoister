package com.Vaishnavi.todoister.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.Vaishnavi.todoister.model.Task;
import com.Vaishnavi.todoister.util.TaskRoomDatabase;

import java.util.List;

public class DoisterRepository {
    private final TaskDao taskDao;
    private final LiveData<List<Task>> allTasks;

    public DoisterRepository(Application application) {
        TaskRoomDatabase database = TaskRoomDatabase.getDatabase(application);
        taskDao = database.taskDao();
        allTasks = taskDao.getAllTasks();
    }
    public LiveData<List<Task>> getAll(){
        return allTasks;
    }
    public void insert(Task task){
        TaskRoomDatabase.databaseWriteExecutor.execute( ()-> taskDao.insertTask(task));
    }

    public LiveData<Task> get(long id){
        return taskDao.getTask(id);
    }
    public void update(Task task){
        TaskRoomDatabase.databaseWriteExecutor.execute(()->taskDao.updateTask(task));
    }
    public void delete(Task task){
        TaskRoomDatabase.databaseWriteExecutor.execute(()->taskDao.deleteTask(task));
    }
    public void deleteAll(){
        TaskRoomDatabase.databaseWriteExecutor.execute(()->taskDao.deleteAllTasks());

    }
}
