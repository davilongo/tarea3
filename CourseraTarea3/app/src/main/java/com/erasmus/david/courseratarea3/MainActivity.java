package com.erasmus.david.courseratarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.erasmus.david.courseratarea3.Clases.Mascota;

import com.erasmus.david.courseratarea3.Adaptadores.MascotaAdaptador;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ArrayList mascotas;
    private RecyclerView listaMascotas;
    private ImageView imgStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listaMascotas = (RecyclerView)findViewById(R.id.lstMascotas);
        imgStar = (ImageView)findViewById(R.id.imgStar);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        imgStar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, RankeadasAcitivity.class);
                startActivity(i);

            }
        });






    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList();
        mascotas.add(new Mascota("deivi", "0", R.drawable.deivi));
        mascotas.add(new Mascota("javi", "0", R.drawable.javi));
        mascotas.add(new Mascota("manuel", "0", R.drawable.manuel));
        mascotas.add(new Mascota("paco", "0", R.drawable.paco));
        mascotas.add(new Mascota("pepa", "0", R.drawable.pepa));


    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
}
