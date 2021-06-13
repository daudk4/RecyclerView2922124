package com.example.recyclerview191124;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<Employee> empList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empList.add(new Employee("Daud" ,"Ali" , "CS" , 123));
        empList.add(new Employee("Fahad" , "Bin Sarwar" ,"EE" , 754));
        empList.add(new Employee("Mubashir" , "Ali" , "ME" , 946));
        empList.add(new Employee("Ayesha" , "Ashfaq" ,"FMC" , 256));
        empList.add(new Employee("Aimen" , "Shakeel" , "HUM" , 238));
        empList.add(new Employee("Hafsa" , "Fatima" , "BBA" ,517));
        empList.add(new Employee("Moin" , "Ali" , "CS" ,596));
        empList.add(new Employee("Hassan" , "Hameed" , "IT" ,272));
        empList.add(new Employee("Ahmed " , "Zaheer" ,"CYS" , 516));
        empList.add(new Employee("Alyaan" , "Qudoos " , "AI" ,117));
        empList.add(new Employee("Hamza" , "Ali " , "CE" ,178));

        recyclerView = findViewById(R.id.EmployeeView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerAdapter = new RecyclerAdapter(empList,MainActivity.this);
        recyclerView.setAdapter(recyclerAdapter);
    }
}