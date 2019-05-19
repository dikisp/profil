package com.diki.myprofile.profile;

import com.diki.myprofile.BasePresenter;
import com.diki.myprofile.BaseView;
import com.diki.myprofile.Model.Profile;

import java.util.List;

public class ProfileContract {

    interface View extends BaseView<Presenter>{
        void setLoadingIndicator(boolean active);

        void showProfile(List<Profile> profile);
    }

    interface Presenter extends BasePresenter {
        void loadProfile(boolean forceUpdate);
    }
}
