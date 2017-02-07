package com.example.abdulkarimbarry.bestapp;

/**
 * Created by Abdul Karim Barry on 1/27/2017.
 */

public class UserData {
    private int _id;
    private String _userdatainformation;

    public UserData(String userdatainformation){
        this._userdatainformation = userdatainformation;

    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_userdatainformation(String _userdatainformation) {
        this._userdatainformation = _userdatainformation;
    }

    public int get_id() {
        return _id;
    }

    public String get_userdatainformation() {
        return _userdatainformation;
    }
}
