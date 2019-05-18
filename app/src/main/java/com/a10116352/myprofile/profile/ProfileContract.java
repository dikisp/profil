package com.a10116352.myprofile.profile;

import com.a10116352.myprofile.BasePresenter;
import com.a10116352.myprofile.BaseView;
import com.a10116352.myprofile.Model.Profile;

import java.util.List;

public class ProfileContract {

    interface View extends BaseView<Presenter> {
        void setLoadingIndicator(boolean active);

        void showProfile(List<Profile> profile);
    }

    interface Presenter extends BasePresenter {
        void loadProfile(boolean forceUpdate);
    }
}
