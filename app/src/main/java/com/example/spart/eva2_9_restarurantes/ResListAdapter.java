package com.example.spart.eva2_9_restarurantes;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ResListAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] itemtitulo;
    String[] itemdescrip;
    Integer[] integers;
    public ResListAdapter(Activity context, String[] itemtitulo, String[] itemdescrip, Integer[] integers) {
        super(context, R.layout.modelo, itemtitulo);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemtitulo=itemtitulo;
        this.itemdescrip=itemdescrip;
        this.integers=integers;
    }

    public View getView(int posicion, View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.modelo,null,true);
        ImageView imgV_foto = (ImageView) rowView.findViewById(R.id.imgV_foto);
        TextView txtV_titulo=(TextView)rowView.findViewById(R.id.txtV_titulo);
        TextView txtV_descrip=(TextView)rowView.findViewById(R.id.txt_descrip);

        imgV_foto.setImageResource(integers[posicion]);
        txtV_titulo.setText(itemtitulo[posicion]);
        txtV_descrip.setText(itemdescrip[posicion]);

        return rowView;
    }
}
