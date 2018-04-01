package android.example.com.myportfolio.views;


import android.os.Bundle;
// changed this one to this support fragment
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.example.com.myportfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkillsFragment extends Fragment {


    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View skillsView = inflater.inflate(R.layout.fragment_skills, container, false);
        // Inflate the layout for this fragment
        return skillsView;
    }

}
