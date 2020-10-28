package org.nicecotedazur.mylibrary;

import android.app.Activity;
import android.widget.Toast;

public class TestActivity {

    public void presentActivity(Activity activity) {

        if (activity != null) {
            Toast.makeText(activity.getApplicationContext(), "Je suis bien dans l'application haha !",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(activity.getApplicationContext(), "Nope!",
                    Toast.LENGTH_LONG).show();
        }
    }

}