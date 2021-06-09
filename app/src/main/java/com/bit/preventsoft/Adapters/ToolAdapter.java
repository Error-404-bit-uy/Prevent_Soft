package com.bit.preventsoft.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bit.preventsoft.R;
import com.bit.preventsoft.models.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolAdapter extends RecyclerView.Adapter<ToolAdapter.ToolViewHolder>{

    ArrayList<Tool> tools;



    public ToolAdapter(ArrayList<Tool> tools){
        this.tools = tools;
    }


    @NonNull
    @Override
    public ToolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tool_layout, parent, false);

        return new ToolViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ToolViewHolder holder, int position) {
        Tool tool = tools.get(position);
        holder.tool_img.setImageResource(tool.getImage());
        holder.tool_title.setText(tool.getName());


    }

    @Override
    public int getItemCount() {
         return tools.size();
    }

    public static class ToolViewHolder extends RecyclerView.ViewHolder{

        private final ImageView tool_img;
        private final TextView tool_title;

        public ToolViewHolder(@NonNull View itemView) {
            super(itemView);
            tool_img = (ImageView) itemView.findViewById(R.id.tool_img);
            tool_title = (TextView) itemView.findViewById(R.id.tool_title);

        }
    }
}
