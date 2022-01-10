package com.example.custombasicadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.custombasicadapter.R;
import com.example.custombasicadapter.modul.User;

import java.util.ArrayList;

public class BasicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<User> userArrayList;

    public BasicAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_view,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = userArrayList.get(position);
        if (holder instanceof UserViewHolder){
            ((UserViewHolder) holder).imageView.setImageResource(user.getProfile());
            ((UserViewHolder) holder).textViewName.setText(user.getFullName());
            ((UserViewHolder) holder).textViewJob.setText(user.getJob());
        }
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    private static class UserViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName, textViewJob;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_profile);
            textViewName = itemView.findViewById(R.id.tv_full_name);
            textViewJob = itemView.findViewById(R.id.tv_job);
        }
    }
}
