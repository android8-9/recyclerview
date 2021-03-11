package com.cheekupeeku.testrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cheekupeeku.testrecyclerview.databinding.ItemListBinding;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    Context context;
    ArrayList<User> al;
    OnRecyclerClick listener;
    public UserAdapter(Context context,ArrayList<User>al){
        this.context = context;
        this.al = al;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(context),parent,false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = al.get(position);
        holder.binding.imageView.setImageResource(user.getImageId());
        holder.binding.tv.setText(user.getName());
        //holder.binding.tvMobile.setText(user.getMobile());
        if(position == 1 ||position == 4 || position == 7){
            holder.binding.imageView.getLayoutParams().width = 60;
            holder.binding.imageView.getLayoutParams().height = 60;
        }
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
      ItemListBinding binding;
      public UserViewHolder(ItemListBinding binding){
          super(binding.getRoot());
          this.binding = binding;
          binding.getRoot().setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  int position = getAdapterPosition();
                  User user = al.get(position);
                  if(position!=RecyclerView.NO_POSITION && listener !=null){
                      listener.onItemClick(user,position);
                  }
              }
          });
      }
  }
  public interface OnRecyclerClick{
        void onItemClick(User user,int position);
  }
  public void setOnClickListener(OnRecyclerClick listener){
        this.listener = listener;
  }
}
