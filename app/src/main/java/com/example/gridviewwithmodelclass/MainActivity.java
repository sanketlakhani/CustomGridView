package com.example.gridviewwithmodelclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ImageView imageView;
    TextView textView;
    ArrayList<Animal> myList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();

    }
    private void initview() {

        gridView=findViewById(R.id.gridView);

        imageView=findViewById(R.id.imganimal);
        textView=findViewById(R.id.txtanimalName);

        Animal a1=new Animal();
        a1.setAnimalName("Lion");
        a1.setAnimalImage(R.drawable.lion);
        myList.add(a1);

        Animal a2=new Animal();
        a2.setAnimalName("King-Kong");
        a2.setAnimalImage(R.drawable.kingkong);
        myList.add(a2);

        Animal a3=new Animal();
        a3.setAnimalName("Tiger");
        a3.setAnimalImage(R.drawable.tiger);
        myList.add(a3);

        Animal a4=new Animal();
        a4.setAnimalName("Bear");
        a4.setAnimalImage(R.drawable.bear);
        myList.add(a4);

        Animal a5=new Animal();
        a5.setAnimalName("Leopard");
        a5.setAnimalImage(R.drawable.leopard);
        myList.add(a5);

        Animal a6=new Animal();
        a6.setAnimalName("Elephant");
        a6.setAnimalImage(R.drawable.elephant);
        myList.add(a6);

        Animal a7=new Animal();
        a7.setAnimalName("Parrot");
        a7.setAnimalImage(R.drawable.popat);
        myList.add(a7);

        Animal a8=new Animal();
        a8.setAnimalName("Peacock");
        a8.setAnimalImage(R.drawable.mor);
        myList.add(a8);

        MyAdapter adapter=new MyAdapter(this,myList);
        gridView.setAdapter(adapter);

    }
}