package com.example.luai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.luai.myapplication.models.User;


public class MainActivity extends AppCompatActivity {

    private TextView mTextViewUserWithId1;
    private TextView mTextViewUserWithId5;
    private TextView mTextViewUserWithId7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (5): Find the 3 text views in the activity and inject them in the variables

        // TODO (7): Execute the AsyncTask and enjoy the show

    }

    // TODO (6): Create an AsyncTask class that fetches list of users and then fill the text views with user data (for ids 1, 5 and 7). Use getStringFromUser method

    public static String getStringFromUser(User user) {

        return  user.getId() + "\n"
                + user.getEmail() + "\n"
                + user.getName() + "\n"
                + user.getUsername();

    }

}
