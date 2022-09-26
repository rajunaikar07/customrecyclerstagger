package com.example.customrecyclerstagger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GAdapter extends RecyclerView.Adapter<GAdapter.GHolder> {
    Context context;
    List<GModel> modelList=new ArrayList<>();
    OnItemClick onClick;

    public GAdapter(Context context, List<GModel> modelList, OnItemClick onItemClick) {
        this.context = context;
        this.modelList = modelList;
        this.onClick = onItemClick;
    }

    @NonNull
    @Override
    public GHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical,parent,false);
        return new GHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull GHolder holder, int position) {
//        holder.name.setText(modelList.get(position).getName());
        holder.image.setImageResource(modelList.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return modelList.size();
    }

    public class GHolder extends RecyclerView.ViewHolder {
        ImageView image;
//        TextView name;
        public GHolder(@NonNull View itemView) {
            super(itemView);
//            name=itemView.findViewById(R.id.name_txt);
            image=itemView.findViewById(R.id.image_1);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {

                    onClick.onClick(getAdapterPosition());
                }
            });
        }
    }
}
