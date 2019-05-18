package com.a10116352.myprofile.contact;


import com.a10116352.myprofile.BasePresenter;
import com.a10116352.myprofile.BaseView;
import com.a10116352.myprofile.Model.Friend;

import java.util.List;

public interface ContactContract {
    interface View extends BaseView<Presenter>{
        void setLoadingIndicator(boolean active);

        void showContact(List<Friend> friends);
    }

    interface Presenter extends BasePresenter {
        void loadContact(Boolean forceUpdate);
    }
}
