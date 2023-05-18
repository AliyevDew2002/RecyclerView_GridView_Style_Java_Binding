package com.example.recyclerview_gridview_style_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_gridview_style_java.databinding.MemberListQolipBinding;
import com.example.recyclerview_gridview_style_java.model.Member;

import java.util.ArrayList;

public class Member_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Member> members;

    MemberListQolipBinding binding;

    public Member_Adapter(Context context, ArrayList<Member> members){
        this.members=members;
        this.context=context;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MemberListQolipBinding binding = MemberListQolipBinding.inflate(layoutInflater);
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member=members.get(position);

        if (holder instanceof CustomViewHolder){
            ImageView profile=((CustomViewHolder) holder).binding.ivProfile;
            TextView firstName=((CustomViewHolder) holder).binding.tvFirstname;
            TextView lestName=((CustomViewHolder) holder).binding.tvLestName;
            profile.setImageResource(member.getProfile());
            firstName.setText(member.getFirstName());
            lestName.setText(member.getLestName());
        }

    }




    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private final MemberListQolipBinding binding;

        public CustomViewHolder(MemberListQolipBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }








    @Override
    public int getItemCount() {
        return members.size();
    }
}
