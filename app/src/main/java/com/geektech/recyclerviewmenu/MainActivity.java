package com.geektech.recyclerviewmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView MenuListRecyclerView;
    private ArrayList<String> MenuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MenuListRecyclerView = findViewById(R.id.RecyclerViewMenu);
        MenuList.add("БЕШБАРМАК");
        MenuList.add("ШОРПО");
        MenuList.add("МАНТЫ");
        MenuList.add("КУУРДАК");
        MenuList.add("АШ ЛЯН ФУ");
        MenuList.add("МЯСО ПО ФРАСУЗСКИЙ");
        MenuList.add("МЯСО В ГОРШОЧКЕ");
        MenuList.add("ПИЦЦА");
        MenuList.add("ШАУРМА");
        MenuList.add("САЛАТ ЦЕЗАРЬ");
        MenuList.add("ОЛИВЬЕ");
        MenuList.add("ФУНЧОЗА");
        MenuList.add("КАНБЕРРА");
        MenuList.add("ФРИ");
        MenuList.add("КОЛА");
        MenuList.add("ФАНТА");
        MenuList.add("СПРАЙТ");
        MenuList.add("ЧАЙ");
        MenuList.add("ЛЕПОШКА");
        MenuList.add("ДЮШЕС");
        MenuList.add("КОФЕ");
        MenuAdapter adapter = new MenuAdapter();
        MenuListRecyclerView.setAdapter(adapter);
    }
}