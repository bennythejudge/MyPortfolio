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
public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View workView = inflater.inflate(R.layout.fragment_work, container, false);
        return workView;
    }

}
