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
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // create a view
        // the inflater object, method inflate on the fragment, passing also a container (every
        // Inflate the layout for this fragment
        // fragment needs a container,
        View aboutView = inflater.inflate(R.layout.fragment_about, container, false);
        // now that we have the view here, we can make changes to it


        // return the view to be displayed in our main activity
        return aboutView;
    }

}
