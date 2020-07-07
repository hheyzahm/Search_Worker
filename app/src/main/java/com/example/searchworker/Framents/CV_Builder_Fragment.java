package com.example.searchworker.Framents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.searchworker.R;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class CV_Builder_Fragment extends Fragment {


    public CV_Builder_Fragment() {
        // Required empty public constructor
    }

    Spinner education_spinner;
    ArrayAdapter<CharSequence> spinner_adapter;
    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_c_v__builder_, container, false);
       //  education_spinner= (Spinner) view.findViewById(R.id.education_Information_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        //spinner_adapter  = ArrayAdapter.createFromResource(getContext(), R.array.education_list, android.R.layout.simple_spinner_item);
        return view;
    }

    @Override
    public void onStart() {


// Specify the layout to use when the list of choices appears
        //spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        //education_spinner.setAdapter(spinner_adapter);
        super.onStart();
    }
}