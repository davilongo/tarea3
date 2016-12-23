package com.erasmus.david.courseratarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.erasmus.david.courseratarea3.Adaptadores.MascotaAdaptador;
import com.erasmus.david.courseratarea3.Clases.Mascota;

import java.util.ArrayList;

public class RankeadasAcitivity extends AppCompatActivity {
    ImageView imgBack;
    private ArrayList mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankeadas_acitivity);
        listaMascotas = (RecyclerView)findViewById(R.id.lstRankeadas);
        imgBack = (ImageView)findViewById(R.id.imgBack);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();


        imgBack.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent i = new Intent(RankeadasAcitivity.this, MainActivity.class);
                startActivity(i);

            }
        });
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList();
        mascotas.add(new Mascota("deivi", "3", R.drawable.deivi));
        mascotas.add(new Mascota("javi", "5", R.drawable.javi));
        mascotas.add(new Mascota("manuel", "7", R.drawable.manuel));
        mascotas.add(new Mascota("paco", "1", R.drawable.paco));
        mascotas.add(new Mascota("pepa", "3", R.drawable.pepa));


    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
}
