package com.diki.myprofile.list_friends;

import com.diki.myprofile.BasePresenter;
import com.diki.myprofile.BaseView;
import com.diki.myprofile.Model.Friend;

public class ListFriendsContract {
    interface View extends BaseView<Presenter>{
        void setLoadingIndicator(boolean active);

        void showListFriends();

        void showFriendDetailUI(String friend_id);
    }

    interface Presenter extends BasePresenter {
        void loadListFriends();

        void addNewFriend();

        void openDetailFriendDetail(Friend requestedFriend);
    }
}
