package com.ethical_techniques.notemaker.model;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.ethical_techniques.notemaker.R;

/**
 * SettingsFragment extends PreferenceFragmentCompat and manages the applications SharedPreferences
 */
public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}
