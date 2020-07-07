package com.example.searchworker.Framents;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.searchworker.Adapter.Recycle_View_adapter;
import com.example.searchworker.Entity.Record_of_Resume;
import com.example.searchworker.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class Search_worker_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private DatabaseReference reference;
    private ArrayList<Record_of_Resume> Record_of_resume_list;
    private Recycle_View_adapter recycle_view_adapter;
View v,view;

    public Search_worker_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_search_worker_, container, false);
        recyclerView=view.findViewById(R.id.edit_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        reference= FirebaseDatabase.getInstance().getReference(getString(R.string.database_resume_reference));
        Record_of_resume_list=new ArrayList<>();
        recycle_view_adapter=new Recycle_View_adapter(Record_of_resume_list, (Activity) view.getContext());

        return view;
    }
    @Override
    public void onStart()
    {
        super.onStart();

        reference.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                Record_of_resume_list.clear();
                for(DataSnapshot model:dataSnapshot.getChildren())
                {
                    Record_of_resume_list.add(model.getValue(Record_of_Resume.class));
                }
                recyclerView.setAdapter(recycle_view_adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Toast.makeText(getContext(), "error in downloading the data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
}