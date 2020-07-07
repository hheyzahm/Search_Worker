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

import com.example.searchworker.Entity.Record_of_Resume;
import com.example.searchworker.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class CV_Builder_Fragment extends Fragment {
RelativeLayout outgoing_relative_layout,CV_Builder_personnel_information_relativeLayout,CV_Builder_education_information_relativeLayout,
        CV_Builder_experience_information_relativeLayout;
    TextInputEditText name_Edit_text,father_name_Edit_text,Address_Edit_text,date_Edit_text, Phone_number_Edit_text,CNIC_Edit_text,Email_Edit_text,password_Edit_text,
            subject_Edit_text,institution_Edit_text,obatin_Edit_text,total_Edit_text,scholarship_Edit_text,workPlace_Edit_text,from_Edit_text,to_Edit_text,language_Edit_text;
    String name_string,father_name_string,Address_string,date_string, Phone_number_string,CNIC_string,Email_string,password_string,
    subject_string,education_string,institution_string,obatin_string,total_string,scholarship_string,workPlace_string,from_string,to_string;
    Button clear_button,Add_education_button,clear_button_exper,Add_experiernce_button,cancel_button,next_button;
int count=0;
    private DatabaseReference reference;
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
        reference= FirebaseDatabase.getInstance().getReference(    getString(R.string.database_resume_reference));

        // Create an ArrayAdapter using the string array and a default spinner layout
        spinner_adapter  = ArrayAdapter.createFromResource(getContext(), R.array.education_list, android.R.layout.simple_spinner_item);
        //connecting layput
        outgoing_relative_layout=view.findViewById(R.id.outgoing_relative_layout);
        outgoing_relative_layout.setVisibility(View.GONE);
        CV_Builder_personnel_information_relativeLayout=view.findViewById(R.id.CV_Builder_personnel_information_relativeLayout);
        CV_Builder_education_information_relativeLayout=view.findViewById(R.id.CV_Builder_education_information_relativeLayout);
        CV_Builder_experience_information_relativeLayout=view.findViewById(R.id.CV_Builder_experience_information_relativeLayout);

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

        name_string=null;father_name_string=null;Address_string=null;date_string=null; Phone_number_string=null;CNIC_string=null;Email_string=null;password_string=null;
        subject_string=null;institution_string=null;obatin_string=null;total_string=null;scholarship_string=null;workPlace_string=null;from_string=null;to_string=null;
//connecting button

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
            workPlace_Edit_text.setText("");
            from_Edit_text.setText("");
            to_Edit_text.setText("");
            }
        });
        Add_experiernce_button=view.findViewById(R.id.Add_experiernce_button);
        Add_experiernce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                education_spinner.setAdapter(spinner_adapter);
                subject_Edit_text.setText("");
                obatin_Edit_text.setText("");
                total_Edit_text.setText("");
                scholarship_Edit_text.setText("");
                institution_Edit_text.setText("");
            }
        });
        cancel_button=view.findViewById(R.id.edit_personnel_cancel_button);
        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               clearAllData();
            }
        });
        next_button=view.findViewById(R.id.next_button);

next_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        name_string=name_Edit_text.getText().toString().trim();
        father_name_string=father_name_Edit_text.getText().toString().trim();
        Address_string=Address_Edit_text.getText().toString().trim();
        date_string=date_Edit_text.getText().toString().trim();
        Phone_number_string=Phone_number_Edit_text.getText().toString().trim();
        Email_string=Email_Edit_text.getText().toString().trim();
        password_string=password_Edit_text.getText().toString().trim();
        CNIC_string=CNIC_Edit_text.getText().toString().trim();
        if(name_string.isEmpty())
        { name_Edit_text.setError("Your Name can't be Empty");
        }
        if(father_name_string.isEmpty())
        {
            father_name_Edit_text.setError("Father Name can't be Empty");
        }
        if(Address_string.isEmpty())
        {
            Address_Edit_text.setError("Address can't be Empty");
        }
        if(date_string.isEmpty())
        {
            date_Edit_text.setError("Date of Birth can't be Empty");
        }
        if(Phone_number_string.isEmpty())
        {
            Phone_number_Edit_text.setError("Phone Number can't be Empty");
        }
        if(Email_string.isEmpty())
        {
            Email_Edit_text.setError("Email Address can't be Empty");
        }
        if(password_string.isEmpty() )
        {
            password_Edit_text.setError("Password can't be Empty");
        }
if(CNIC_string.isEmpty())
{
    CNIC_Edit_text.setError("CNIC can't be Empty");
}
       if(!name_string.isEmpty()&&!father_name_string.isEmpty()&&!Address_string.isEmpty()&& ! date_string.isEmpty()&&!Phone_number_string.isEmpty()
               &&!Email_string.isEmpty() &&!password_string.isEmpty()   ) {
           name_Edit_text.setText("");
           father_name_Edit_text.setText("");
           Address_Edit_text.setText("");
           date_Edit_text.setText("");
           Phone_number_Edit_text.setText("");
           Email_Edit_text.setText("");
           password_Edit_text.setText("");
           CNIC_Edit_text.setText("");
            switch (count) {
                case 1: {
                    education_string = education_spinner.getSelectedItem().toString().trim();
                    subject_string = subject_Edit_text.getText().toString().trim();
                    institution_string = institution_Edit_text.getText().toString().trim();
                    obatin_string = obatin_Edit_text.getText().toString().trim();
                    total_string = total_Edit_text.getText().toString().trim();
                    scholarship_string = scholarship_Edit_text.getText().toString().trim();
                        if(education_string.isEmpty()) {
                        }
                        if(!education_string.equals("Middle")||!education_string.equals("Matric")||! education_string.equals("Intermediate")) {
                            if(subject_string.isEmpty()) {
                            subject_Edit_text.setError("Subject can'tbe Empty");
                            }
                        }
                        if(institution_string.isEmpty()) {
                        institution_Edit_text.setError("Institution Address can't be empty");
                        }
                        if(obatin_string.isEmpty()) {
                            obatin_Edit_text.setError("Obtained Marks can't be empty");
                        }
                        if(total_string.isEmpty()) {
                        total_Edit_text.setError("Total Marks can't be empty");
                        }

                        if(!total_string.isEmpty()&&!obatin_string.isEmpty()&& !institution_string.isEmpty()&&!education_string.isEmpty())
                        {
                           CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                              CV_Builder_education_information_relativeLayout.setVisibility(View.VISIBLE);
                               CV_Builder_experience_information_relativeLayout.setVisibility(View.GONE);
                    count++;
                        }
                    break;
                }
                case 2: {
                    workPlace_string = workPlace_Edit_text.getText().toString().trim();
                    from_string = from_Edit_text.getText().toString().trim();
                    to_string = to_Edit_text.getText().toString().trim();
                if(workPlace_string.isEmpty())
                {
                    workPlace_Edit_text.setError("Work Place can't be Empty");
                }
                if(from_string.isEmpty())
                {
                    from_Edit_text.setError("From Date for Work place can't be Empty");
                }
                if(to_string.isEmpty())
                {
                    to_Edit_text.setError("To date for Work place can't be empty");
                }
                if(!workPlace_string.isEmpty() && ! from_string.isEmpty() && !to_string.isEmpty()) {
                    CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                    CV_Builder_education_information_relativeLayout.setVisibility(View.GONE);
                    CV_Builder_experience_information_relativeLayout.setVisibility(View.VISIBLE);
                    next_button.setText("Save");

                }
                break;

                }


            }
        }
    }
});
if(count==2&& next_button.getText().toString().equals("Save"))
{
    String id=reference.push().getKey();

    Record_of_Resume record_of_resume=new Record_of_Resume(workPlace_string, from_string, to_string, subject_string,  education_string, institution_string,
             obatin_string,  total_string, scholarship_string,  name_string,father_name_string,  Address_string,  date_string,  Phone_number_string,  CNIC_string
            , Email_string,  password_string );
    reference.child(id).setValue(record_of_resume);
    clearAllData();
}
        return view;
    }
public void clearAllData()
{
    name_Edit_text.setText("");
    father_name_Edit_text.setText("");
    Address_Edit_text.setText("");
    date_Edit_text.setText("");
    Phone_number_Edit_text.setText("");
    CNIC_Edit_text.setText("");
    Email_Edit_text.setText("");
    password_Edit_text.setText("");
    subject_Edit_text.setText("");
    institution_Edit_text.setText("");
    obatin_Edit_text.setText("");
    total_Edit_text.setText("");
    scholarship_Edit_text.setText("");
    workPlace_Edit_text.setText("");
    from_Edit_text.setText("");
    to_Edit_text.setText("");

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