package com.example.dynamictable;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    int num=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add recyclerview, adapter and layout manager
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        CustomAdapter adapter = new CustomAdapter(getTableData());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<TableData> getTableData() {
        List<TableData> tableDataList = new ArrayList<>();
        tableDataList.add(new TableData("Pirates of the Caribbean", "88888888888", "pune"));
        tableDataList.add(new TableData("Tangled", "88888888888", "pune"));
        tableDataList.add(new TableData("Tangled", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Avengers", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        tableDataList.add(new TableData("Friends", "88888888888", "pune"));
        return tableDataList;
    }

}
