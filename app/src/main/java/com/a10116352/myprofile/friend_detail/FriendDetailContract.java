package com.a10116352.myprofile.friend_detail;

import com.a10116352.myprofile.BasePresenter;
import com.a10116352.myprofile.BaseView;

public class FriendDetailContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showFriend();

    }

    interface Presenter extends BasePresenter {

        void loadFriendProfile();

        void editFriendProfile();

        void deleteFriendProfile();
    }
}
