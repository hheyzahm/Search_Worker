package com.example.searchworker.Framents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;

import com.example.searchworker.R;
import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class CV_Builder_Fragment extends Fragment {
RelativeLayout outgoing_relative_layout,CV_Builder_personnel_information_relativeLayout,CV_Builder_education_information_relativeLayout,
        CV_Builder_experience_information_relativeLayout,CV_Builder_skill_information_relativeLayout;
    TextInputEditText name_Edit_text,father_name_Edit_text,Address_Edit_text,date_Edit_text, Phone_number_Edit_text,CNIC_Edit_text,Email_Edit_text,password_Edit_text,
            subject_Edit_text,institution_Edit_text,obatin_Edit_text,total_Edit_text,scholarship_Edit_text,workPlace_Edit_text,from_Edit_text,to_Edit_text,language_Edit_text;
    Button clear_button_skill,Add_skill_button,clear_button,Add_education_button,clear_button_exper,Add_experiernce_button,cancel_button,next_button;
int count=0;

    //handler for the splash screen
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {

            outgoing_relative_layout.setVisibility(View.VISIBLE);


        }
    };
    public CV_Builder_Fragment() {
        // Required empty public constructor
    }

    Spinner education_spinner;
    ArrayAdapter<CharSequence> spinner_adapter;
    View view,v;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v=new View(getContext());
        outgoing_relative_layout=v.findViewById(R.id.outgoing_relative_layout);
count=1;
        //splash screen
        handler.postDelayed(runnable, 500);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_c_v__builder_, container, false);
        education_spinner= (Spinner) view.findViewById(R.id.education_Information_spinner);
count=1;


        // Create an ArrayAdapter using the string array and a default spinner layout
        spinner_adapter  = ArrayAdapter.createFromResource(getContext(), R.array.education_list, android.R.layout.simple_spinner_item);
        //connecting layput
        outgoing_relative_layout=view.findViewById(R.id.outgoing_relative_layout);
        outgoing_relative_layout.setVisibility(View.GONE);
        CV_Builder_personnel_information_relativeLayout=view.findViewById(R.id.CV_Builder_personnel_information_relativeLayout);
        CV_Builder_education_information_relativeLayout=view.findViewById(R.id.CV_Builder_education_information_relativeLayout);
        CV_Builder_experience_information_relativeLayout=view.findViewById(R.id.CV_Builder_experience_information_relativeLayout);
        CV_Builder_skill_information_relativeLayout=view.findViewById(R.id.CV_Builder_skill_information_relativeLayout);

        //splash screen
        handler.postDelayed(runnable, 500);
        //connecting edit text
        name_Edit_text=view.findViewById(R.id.name_Edit_text);
        father_name_Edit_text=view.findViewById(R.id.father_name_Edit_text);
        Address_Edit_text=view.findViewById(R.id.Address_Edit_text);
        date_Edit_text=view.findViewById(R.id.date_Edit_text);
        Phone_number_Edit_text=view.findViewById(R.id.Phone_number_Edit_text);
        CNIC_Edit_text=view.findViewById(R.id.CNIC_Edit_text);
        Email_Edit_text=view.findViewById(R.id.Email_Edit_text);
        password_Edit_text=view.findViewById(R.id.password_Edit_text);
        subject_Edit_text=view.findViewById(R.id.subject_Edit_text);
        institution_Edit_text=view.findViewById(R.id.institution_Edit_text);
        obatin_Edit_text=view.findViewById(R.id.obatin_Edit_text);
        total_Edit_text=view.findViewById(R.id.total_Edit_text);
        scholarship_Edit_text=view.findViewById(R.id.scholarship_Edit_text);
        workPlace_Edit_text=view.findViewById(R.id.workPlace_Edit_text);
        from_Edit_text=view.findViewById(R.id.from_Edit_text);
        to_Edit_text=view.findViewById(R.id.to_Edit_text);
        language_Edit_text=view.findViewById(R.id.laguage_Edit_text);
//connecting button
        clear_button_skill=view.findViewById(R.id.clear_button_skill);
        clear_button_skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Add_skill_button=view.findViewById(R.id.Add_skill_button);
       Add_skill_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });
        clear_button=view.findViewById(R.id.clear_button);
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Add_education_button=view.findViewById(R.id.Add_education_button);
        Add_education_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        clear_button_exper=view.findViewById(R.id.clear_button_exper);

        clear_button_exper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Add_experiernce_button=view.findViewById(R.id.Add_experiernce_button);
        Add_experiernce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        cancel_button=view.findViewById(R.id.cancel_button);
        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        next_button=view.findViewById(R.id.next_button);

next_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        switch(count)
        {
            case 1: {
                CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_education_information_relativeLayout.setVisibility(View.VISIBLE);
                CV_Builder_experience_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_skill_information_relativeLayout.setVisibility(View.GONE);
                count++;
                break;
            }
            case 2: {
                CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_education_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_experience_information_relativeLayout.setVisibility(View.VISIBLE);
                CV_Builder_skill_information_relativeLayout.setVisibility(View.GONE);
                count++;
                break;

            }
            case 3: {
                CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_education_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_experience_information_relativeLayout.setVisibility(View.GONE);
                CV_Builder_skill_information_relativeLayout.setVisibility(View.VISIBLE);
                count=1;
                next_button.setText("Save");
                break;
            }

        }
    }
});

        return view;
    }

    @Override
    public void onStart() {
        count=1;

// Specify the layout to use when the list of choices appears
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        education_spinner.setAdapter(spinner_adapter);
        super.onStart();
    }
}