package com.a10116352.myprofile.friend_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oleg.profileapp.R;

public class FriendDetailActivity extends AppCompatActivity implements FriendDetailContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void setPresenter(FriendDetailContract.Presenter presenter) {

    }

    @Override
    public void showFriend() {

    }
}
