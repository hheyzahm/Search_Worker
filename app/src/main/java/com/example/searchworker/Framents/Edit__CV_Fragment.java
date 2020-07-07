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
public class Edit__CV_Fragment extends Fragment {
    RelativeLayout edit_outgoing_relative_layout,edit_CV_Builder_personnel_information_relativeLayout,edit_CV_Builder_education_information_relativeLayout,
            edit_CV_Builder_experience_information_relativeLayout;
    TextInputEditText edit_name_Edit_text,edit_father_name_Edit_text,edit_Address_Edit_text,edit_date_Edit_text, edit_Phone_number_Edit_text,edit_CNIC_Edit_text,edit_Email_Edit_text,password_Edit_text,
            edit_subject_Edit_text,edit_institution_Edit_text,edit_obatin_Edit_text,edit_total_Edit_text,edit_scholarship_Edit_text,edit_workPlace_Edit_text,edit_from_Edit_text,edit_to_Edit_text;
                                    TextInputEditText     email_edit_text,TextInputEditText_password ;
    String name_string,father_name_string,Address_string,date_string, Phone_number_string,CNIC_string,Email_string,password_string,
            subject_string,education_string,institution_string,obatin_string,total_string,scholarship_string,workPlace_string,from_string,to_string;
    String Email,Password;
    Button btnSignin,edit_personnel_cancel_button,edit_personnel_button,cancel_button_edit_education,edit_education_button,cancel_button_exper,edit_experiernce_button;

    private DatabaseReference reference;
    //handler for the splash screen
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {

            edit_outgoing_relative_layout.setVisibility(View.VISIBLE);


        }
    };
    Spinner education_spinner;
    ArrayAdapter<CharSequence> spinner_adapter;
    View view,v;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            v=new View(getContext());
        edit_outgoing_relative_layout=v.findViewById(R.id.edit_outgoing_relative_layout);

        //splash screen
        handler.postDelayed(runnable, 500);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_edit___c_v_, container, false);
        education_spinner= (Spinner) view.findViewById(R.id.education_Information_spinner);

        reference= FirebaseDatabase.getInstance().getReference(getString(R.string.database_resume_reference));

        // Create an ArrayAdapter using the string array and a default spinner layout
        spinner_adapter  = ArrayAdapter.createFromResource(getContext(), R.array.education_list, android.R.layout.simple_spinner_item);
        //connecting layput
        edit_outgoing_relative_layout=view.findViewById(R.id.edit_outgoing_relative_layout);
        edit_outgoing_relative_layout.setVisibility(View.GONE);
        edit_CV_Builder_personnel_information_relativeLayout=view.findViewById(R.id.CV_Builder_personnel_information_relativeLayout);
        edit_CV_Builder_education_information_relativeLayout=view.findViewById(R.id.CV_Builder_education_information_relativeLayout);
        edit_CV_Builder_experience_information_relativeLayout=view.findViewById(R.id.CV_Builder_experience_information_relativeLayout);

        //splash screen
        handler.postDelayed(runnable, 500);
        //connecting edit text
        edit_name_Edit_text=view.findViewById(R.id.edit_name_Edit_text);
        edit_father_name_Edit_text=view.findViewById(R.id.edit_father_name_Edit_text);
        edit_Address_Edit_text=view.findViewById(R.id.Address_Edit_text);
        edit_date_Edit_text=view.findViewById(R.id.edit_date_Edit_text);
        edit_Phone_number_Edit_text=view.findViewById(R.id.edit_Phone_number_Edit_text);
        edit_CNIC_Edit_text=view.findViewById(R.id.edit_CNIC_Edit_text);
        edit_Email_Edit_text=view.findViewById(R.id.edit_Email_Edit_text);
        password_Edit_text=view.findViewById(R.id.edit_password_Edit_text);
        edit_subject_Edit_text=view.findViewById(R.id.edit_subject_Edit_text);
        edit_institution_Edit_text=view.findViewById(R.id.edit_institution_Edit_text);
        edit_obatin_Edit_text=view.findViewById(R.id.edit_obatin_Edit_text);
        edit_total_Edit_text=view.findViewById(R.id.edit_total_Edit_text);
        edit_scholarship_Edit_text=view.findViewById(R.id.edit_scholarship_Edit_text);
        edit_workPlace_Edit_text=view.findViewById(R.id.edit_workPlace_Edit_text);
        edit_from_Edit_text=view.findViewById(R.id.edit_from_Edit_text);
        edit_to_Edit_text=view.findViewById(R.id.to_Edit_text);
        TextInputEditText_password=view.findViewById(R.id.TextInputEditText_password);
        email_edit_text=view.findViewById(R.id.email_edit_text);
        name_string=null;father_name_string=null;Address_string=null;date_string=null; Phone_number_string=null;CNIC_string=null;Email_string=null;password_string=null;
        subject_string=null;institution_string=null;obatin_string=null;total_string=null;scholarship_string=null;workPlace_string=null;from_string=null;to_string=null;
//connecting button
        btnSignin=view.findViewById(R.id.btnSignin);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Email=email_edit_text.getText().toString().trim();
             Password=TextInputEditText_password.getText().toString().trim();
             if(Email.isEmpty())
             {
                 email_edit_text.setError("Enter emnail address");
             }
             if(Password.isEmpty())
             {
                 TextInputEditText_password.setError("Enter your account password");
             }
             if(!Email.isEmpty()&&! Password.isEmpty())
             {

             }
            }
        });
        edit_personnel_cancel_button=view.findViewById(R.id.edit_personnel_cancel_button);
        edit_personnel_cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        edit_personnel_button=view.findViewById(R.id.edit_personnel_button);
        edit_personnel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        cancel_button_edit_education=view.findViewById(R.id.cancel_button_edit_education);
        cancel_button_edit_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        edit_education_button=view.findViewById(R.id.edit_education_button);
        edit_education_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        cancel_button_exper=view.findViewById(R.id.clear_button_exper);
        cancel_button_exper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        edit_experiernce_button=view.findViewById(R.id.edit_experiernce_button);
        edit_experiernce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        edit_next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_string=edit_name_Edit_text.getText().toString().trim();
                father_name_string=edit_father_name_Edit_text.getText().toString().trim();
                Address_string=edit_Address_Edit_text.getText().toString().trim();
                date_string=edit_date_Edit_text.getText().toString().trim();
                Phone_number_string=edit_Phone_number_Edit_text.getText().toString().trim();
                Email_string=edit_Email_Edit_text.getText().toString().trim();
                password_string=password_Edit_text.getText().toString().trim();
                CNIC_string=edit_CNIC_Edit_text.getText().toString().trim();
                if(name_string.isEmpty())
                { edit_name_Edit_text.setError("Your Name can't be Empty");
                }
                if(father_name_string.isEmpty())
                {
                    edit_father_name_Edit_text.setError("Father Name can't be Empty");
                }
                if(Address_string.isEmpty())
                {
                    edit_Address_Edit_text.setError("Address can't be Empty");
                }
                if(date_string.isEmpty())
                {
                    edit_date_Edit_text.setError("Date of Birth can't be Empty");
                }
                if(Phone_number_string.isEmpty())
                {
                    edit_Phone_number_Edit_text.setError("Phone Number can't be Empty");
                }
                if(Email_string.isEmpty())
                {
                    edit_Email_Edit_text.setError("Email Address can't be Empty");
                }
                if(password_string.isEmpty() )
                {
                    password_Edit_text.setError("Password can't be Empty");
                }
                if(CNIC_string.isEmpty())
                {
                    edit_CNIC_Edit_text.setError("CNIC can't be Empty");
                }
                if(!name_string.isEmpty()&&!father_name_string.isEmpty()&&!Address_string.isEmpty()&& ! date_string.isEmpty()&&!Phone_number_string.isEmpty()
                        &&!Email_string.isEmpty() &&!password_string.isEmpty()   ) {
                    edit_name_Edit_text.setText("");
                    edit_father_name_Edit_text.setText("");
                    edit_Address_Edit_text.setText("");
                    edit_date_Edit_text.setText("");
                    edit_Phone_number_Edit_text.setText("");
                    edit_Email_Edit_text.setText("");
                    password_Edit_text.setText("");
                    edit_CNIC_Edit_text.setText("");
                    switch (count) {
                        case 1: {
                            education_string = education_spinner.getSelectedItem().toString().trim();
                            subject_string = edit_subject_Edit_text.getText().toString().trim();
                            institution_string = edit_institution_Edit_text.getText().toString().trim();
                            obatin_string = edit_obatin_Edit_text.getText().toString().trim();
                            total_string = edit_total_Edit_text.getText().toString().trim();
                            scholarship_string = edit_scholarship_Edit_text.getText().toString().trim();
                            if(education_string.isEmpty()) {
                            }
                            if(!education_string.equals("Middle")||!education_string.equals("Matric")||! education_string.equals("Intermediate")) {
                                if(subject_string.isEmpty()) {
                                    edit_subject_Edit_text.setError("Subject can'tbe Empty");
                                }
                            }
                            if(institution_string.isEmpty()) {
                                edit_institution_Edit_text.setError("Institution Address can't be empty");
                            }
                            if(obatin_string.isEmpty()) {
                                edit_obatin_Edit_text.setError("Obtained Marks can't be empty");
                            }
                            if(total_string.isEmpty()) {
                                edit_total_Edit_text.setError("Total Marks can't be empty");
                            }

                            if(!total_string.isEmpty()&&!obatin_string.isEmpty()&& !institution_string.isEmpty()&&!education_string.isEmpty())
                            {
                                edit_CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                                edit_CV_Builder_education_information_relativeLayout.setVisibility(View.VISIBLE);
                                edit_CV_Builder_experience_information_relativeLayout.setVisibility(View.GONE);
                                count++;
                            }
                            break;
                        }
                        case 2: {
                            workPlace_string = edit_workPlace_Edit_text.getText().toString().trim();
                            from_string = edit_from_Edit_text.getText().toString().trim();
                            to_string = edit_to_Edit_text.getText().toString().trim();
                            if(workPlace_string.isEmpty())
                            {
                                edit_workPlace_Edit_text.setError("Work Place can't be Empty");
                            }
                            if(from_string.isEmpty())
                            {
                                edit_from_Edit_text.setError("From Date for Work place can't be Empty");
                            }
                            if(to_string.isEmpty())
                            {
                                edit_to_Edit_text.setError("To date for Work place can't be empty");
                            }
                            if(!workPlace_string.isEmpty() && ! from_string.isEmpty() && !to_string.isEmpty()) {
                                edit_CV_Builder_personnel_information_relativeLayout.setVisibility(View.GONE);
                                edit_CV_Builder_education_information_relativeLayout.setVisibility(View.GONE);
                                edit_CV_Builder_experience_information_relativeLayout.setVisibility(View.VISIBLE);
                                edit_next_button.setText("Save");

                            }
                            break;

                        }


                    }
                }
            }
        });
        if(count==2&& edit_next_button.getText().toString().equals("Save"))
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
        edit_name_Edit_text.setText("");
        edit_father_name_Edit_text.setText("");
        edit_Address_Edit_text.setText("");
        edit_date_Edit_text.setText("");
        edit_Phone_number_Edit_text.setText("");
        edit_CNIC_Edit_text.setText("");
        edit_Email_Edit_text.setText("");
        password_Edit_text.setText("");
        edit_subject_Edit_text.setText("");
        edit_institution_Edit_text.setText("");
        edit_obatin_Edit_text.setText("");
        edit_total_Edit_text.setText("");
        edit_scholarship_Edit_text.setText("");
        edit_workPlace_Edit_text.setText("");
        edit_from_Edit_text.setText("");
        edit_to_Edit_text.setText("");

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