package com.nyc.fragments;
import android.content.Context;

import com.nyc.fragments.R;


public class CheckingInput {
    private String editTextString;
    private String output;
    private Context context;

    public CheckingInput(String editTextString, Context context) {
        this.editTextString = editTextString.toLowerCase();
        this.context = context;
    }


    public String getStringResource(){
        switch (editTextString){
            case "first": return context.getString(R.string.string_one);
            case "second": return context.getString(R.string.string_two);
            case "third": return context.getString(R.string.string_three);
            case "forth": return context.getString(R.string.string_four);
            case "fifth": return context.getString(R.string.string_five);
        }
        return "No resource";
    }

}
