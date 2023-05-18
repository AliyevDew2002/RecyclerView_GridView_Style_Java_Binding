package com.example.recyclerview_gridview_style_java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.recyclerview_gridview_style_java.R;
import com.example.recyclerview_gridview_style_java.adapter.Member_Adapter;
import com.example.recyclerview_gridview_style_java.databinding.ActivityMainBinding;
import com.example.recyclerview_gridview_style_java.model.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        initViews();
    }
    void initViews(){
        context=this;

        binding.recyclerView.setLayoutManager(new GridLayoutManager(context,2));
        refreshAdapter(context,prepareArrayList());

    }
    ArrayList<Member> prepareArrayList(){
        ArrayList<Member> members=new ArrayList<>();
        for (int i=0; i<=30; i++){
            members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev", "2002-yil"));
        }
        return members;

    }
    void refreshAdapter(Context context, ArrayList<Member> members){
        Member_Adapter adapter= new Member_Adapter(context,members);
        binding.recyclerView.setAdapter(adapter);
    }
}