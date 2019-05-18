package com.a10116352.myprofile.list_friends;

import com.a10116352.myprofile.BasePresenter;
import com.a10116352.myprofile.BaseView;
import com.a10116352.myprofile.Model.Friend;

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
