package com.example.recyclerview191124;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Employee> Emplist;
    private Context context;

    public RecyclerAdapter(List<Employee> emplist, Context context) {
        Emplist = emplist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater L_Inflater = LayoutInflater.from(parent.getContext());
        View view = L_Inflater.inflate(R.layout.recyclerview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Employee employee = Emplist.get(position);

        holder.EmpId.setText(""+employee.getEmpId());
        holder.FirstName.setText(employee.getFirstName());
        holder.LastName.setText(employee.LastName);
        holder.Department.setText(employee.Department);

    }

    @Override
    public int getItemCount() {
        return Emplist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView  FirstName , LastName , Department ,EmpId;
        ImageView del;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            EmpId = itemView.findViewById(R.id.E_id);
            FirstName = itemView.findViewById(R.id.tv_FName);
            LastName = itemView.findViewById(R.id.tv_LName);
            Department = itemView.findViewById(R.id.tv_Department);
            del = itemView.findViewById(R.id.iconDelete);

            del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Emplist.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });

        }
        @Override
        public void onClick(View v) {

        }
    }
}
