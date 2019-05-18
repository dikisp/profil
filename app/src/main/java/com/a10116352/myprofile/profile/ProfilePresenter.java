package com.a10116352.myprofile.profile;

import com.a10116352.myprofile.Model.Profile;
import com.a10116352.myprofile.repo.Repository;

import java.util.ArrayList;
import java.util.List;

public class ProfilePresenter implements ProfileContract.Presenter {

    private final ProfileContract.View mProfileView;

    private boolean mFirstLoad = true;

    private ArrayList<Profile> repository = new ArrayList<>();

    ProfilePresenter(ProfileContract.View mProfileView) {

        this.mProfileView = mProfileView;

        this.mProfileView.setPresenter(this);
    }

    @Override
    public void start() {
        loadProfile(true);
    }

    @Override
    public void loadProfile(boolean forceUpdate) {
        loadProfile(forceUpdate || mFirstLoad, true);
        mFirstLoad = false;
    }

    private void loadProfile(boolean forceUpdate, final boolean showLoadingUI) {
        if (showLoadingUI) {
            mProfileView.setLoadingIndicator(true);
        }

        if (forceUpdate) {
            repository.clear();
            repository.addAll(Repository.getProfileData());
        }

        if (showLoadingUI) {
            mProfileView.setLoadingIndicator(false);
        }

        processProfile(repository);
    }

    private void processProfile(List<Profile> profiles) {
        mProfileView.showProfile(profiles);
    }
}
