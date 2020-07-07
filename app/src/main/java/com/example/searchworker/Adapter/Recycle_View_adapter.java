package com.example.searchworker.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.searchworker.Entity.Record_of_Resume;
import com.example.searchworker.R;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Recycle_View_adapter extends RecyclerView.Adapter<Recycle_View_adapter.ViewHolder>
{
    private ArrayList<Record_of_Resume> list;
    private Activity context;

    public Recycle_View_adapter(ArrayList<Record_of_Resume> list, Activity context)
    {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(context).inflate(R.layout.fragment_search_worker_,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {

        holder.name.setText(list.get(position).getName_string());
        holder.cnic.setText(list.get(position).getCNIC_string());
        holder.contact.setText(list.get(position).getPhone_number_string());
        String education="",date="",estr="";
        education=list.get(position).getEducation_string();
        date=list.get(position).getDate_string();

        StringTokenizer tokenizereducation=new StringTokenizer(education,";");
        StringTokenizer tokenizerdate=new StringTokenizer(date,";");
        while (tokenizereducation.hasMoreTokens())
        {
            estr+=tokenizereducation.nextToken()+" "+tokenizerdate.nextToken()+"\n";
        }
        holder.education.setText(estr);




        holder.skills.setText(list.get(position).getWorkPlace_string());


    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView username,name,cnic,contact,education,research,projects,skills;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);


            name=itemView.findViewById(R.id.show_resume_rv_layout_name);
            cnic=itemView.findViewById(R.id.show_resume_rv_layout_cnic);
            contact=itemView.findViewById(R.id.show_resume_rv_layout_contact);
            education=itemView.findViewById(R.id.show_resume_rv_layout_education);
            skills=itemView.findViewById(R.id.show_resume_rv_layout_skills);
        }
    }
}
