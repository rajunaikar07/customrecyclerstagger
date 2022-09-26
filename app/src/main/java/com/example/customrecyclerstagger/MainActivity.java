package com.example.customrecyclerstagger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    RecyclerView vertical_r;
    GModel gModel;
    GAdapter gAdapter;
    List<GModel> gModelList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vertical_r=findViewById(R.id.vertical_r);
        vertical_r.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
       vertical_r.setLayoutManager(gridLayoutManager);
      //  vertical_r.setLayoutManager(gridLayoutManager);
        //vertical_r.setLayoutManager(new LinearLayoutManager(this));
        gAdapter=new GAdapter(getApplicationContext(),gModelList,this);
        vertical_r.setAdapter(gAdapter);
        loadverticalmethod();

    }catch (Exception e) {
            e.printStackTrace();
        }
        }

    private void loadverticalmethod(){
        gModel=new GModel(R.drawable.img_10,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_1,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_2,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_3,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_4,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_5,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_2,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_7,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_8,"india");
        gModelList.add(gModel);
        gModel=new GModel(R.drawable.img_9,"india");
        gModelList.add(gModel);
//        gAdapter.notifyDataSetChanged();



    }

    @Override
    public void onClick(int adapterPosition) {

    }
}
