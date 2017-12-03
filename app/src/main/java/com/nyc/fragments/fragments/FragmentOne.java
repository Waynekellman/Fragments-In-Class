package com.nyc.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.nyc.fragments.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    private EditText editText;
    private Button button;
    private FragmentTwo fragmentTwo;
    private Bundle bundle;
    private FragmentManager fragmentManager;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        fragmentTwo = new FragmentTwo();
        fragmentManager = getActivity().getSupportFragmentManager();
        bundle = new Bundle();
        editText = view.findViewById(R.id.edit_text);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = editText.getText().toString();
                bundle.putString("main", string);
                fragmentTwo.setArguments(bundle);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.replace(R.id.main_container, fragmentTwo);
                fragmentTransaction.addToBackStack("next");
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
