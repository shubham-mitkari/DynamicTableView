package com.example.dynamictable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class CustomAdapter
        extends RecyclerView.Adapter {

    //declaring modelclass data
    private List<TableData> tableData;

    //creating constructor
    public CustomAdapter(List<TableData> tableData){
        this.tableData=tableData;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.table_list_item,parent,false);
        return new RowViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Log.v("BindViewHolder", "in onBindViewHolder");

        RowViewHolder rowViewHolder=(RowViewHolder) holder;
        int rowpos= rowViewHolder.getAdapterPosition();

        if(rowpos==0){
            rowViewHolder.txtName.setText("Name");
            rowViewHolder.txtAddress.setText("Address");
            rowViewHolder.txtPhone.setText("Phone");

        }else {
            TableData tdata= tableData.get(rowpos-1);
            rowViewHolder.txtName.setText(tdata.getmName());
            rowViewHolder.txtAddress.setText(tdata.getmAddress());
            rowViewHolder.txtPhone.setText(tdata.getmPhone());
        }
    }
    @Override
    public int getItemCount() {
        return tableData.size()+1;//one more to add header
    }
    public class RowViewHolder extends RecyclerView.ViewHolder {

        //hold row view data find all the ChildViews by Id and is attached to each of the row.
        // This is where all the data is bound to the ViewHolder

        protected TextView txtName;
        protected TextView txtAddress;
        protected TextView txtPhone;
        TextView idNum;

        //constuctor
        public RowViewHolder(View itemView) {
            super(itemView);
            Log.v("ViewHolder","in View Holder");
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            txtPhone = itemView.findViewById(R.id.txtPhone);

        }
    }
}

