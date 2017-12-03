package com.nyc.fragments.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nyc.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    private TextView textView;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        Bundle bundle = getArguments();
        String string = bundle.getString("main");
        textView = view.findViewById(R.id.fragment_text);
        textView.setText(string);

        return view;
    }

}
