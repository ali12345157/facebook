package com.example.likecomment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    ArrayList<dataclass> settingsItems ;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        createSettings();
        adapter = new Adapter(settingsItems);
        recyclerView.setAdapter(adapter);
    }


    public void createSettings()
    {
        settingsItems=new ArrayList<>();
  for(int i=1;i<=100;i++)
  {

      settingsItems.add(new dataclass(R.drawable.icon,R.drawable.photo,R.drawable.like,R.drawable.love,R.drawable.share,"Unblast","2 hrs","Buckle up, because change is coming to word press"));


  }





    }
}