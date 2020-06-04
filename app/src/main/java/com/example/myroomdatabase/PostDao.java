package com.example.myroomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PostDao {

    @Insert
    public void insert(PostData postData);

    @Query("DELETE FROM post_data")
    public void DeleteAllPostData();

    @Query("SELECT * FROM post_data ")
    public LiveData<List<PostData>> getAllPostData();

}
