package edu.umd.cmsc436.mstestsuite;

import android.content.ActivityNotFoundException;
import android.content.Context;

import edu.umd.cmsc436.mstestsuite.data.ActionsAdapter;

/**
 * Define which part of the app can do what
 */

interface MainContract {

    // things the view can do
    interface View {
        void expandBottomSheet ();
        void collapseBottomSheet ();
        void hideBottomSheet ();
        void loadTestApps (ActionsAdapter adapter);
        void showToast (String message);
        void startActivity (String packageName) throws ActivityNotFoundException;
        Context getContext ();
        void showUserSwitcher (String[] users);
    }

    // things the presenter responds to
    interface Presenter {
        void onDailyStart ();
        void onCloseBottomSheet ();
        void onBottomSheetSlide ();
        void onBottomSheetStateChange (int newState);
        boolean onBackPressed ();
        void onDestroy ();
        void onUserSelected (String patient_id);
    }
}
