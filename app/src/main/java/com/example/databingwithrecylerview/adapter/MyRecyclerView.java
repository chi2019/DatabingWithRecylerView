package com.example.databingwithrecylerview.adapter;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.example.databingwithrecylerview.BR;
import com.example.databingwithrecylerview.viewModel.MyViewModel;

public class MyRecyclerView extends RecyclerView.Adapter<MyRecyclerView.MyViewHolder>{


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ViewDataBinding binding;
        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(MyViewModel viewModel){
            binding.setVariable(BR.model,viewModel) ;
            binding.executePendingBindings();
        }
    }

}
