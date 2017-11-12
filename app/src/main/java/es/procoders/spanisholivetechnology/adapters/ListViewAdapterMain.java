package es.procoders.spanisholivetechnology.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Respuesta;

/**
 * Created by bjfem on 11/11/2017.
 */


public class ListViewAdapterMain extends ArrayAdapter<Formulario> {


    private Context ctx;
    private ArrayList<Formulario> lista;

    public ListViewAdapterMain(Context ctx, ArrayList<Formulario> lista) {
        super(ctx,0,lista);
        this.ctx = ctx;
        this.lista = lista;


    }
 /*   public ListViewAdapter(){

    }*/

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Formulario getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (getCount()>0) {
            Formulario user = lista.get(position);
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_simple_formulari, parent, false);
            TextView date = (TextView) view.findViewById(R.id.date_formulario);
            TextView name = (TextView) view.findViewById(R.id.mainListView);
            TextView estado = (TextView) view.findViewById(R.id.estado_listView);

            name.setText(user.getTipo().toString());
            if (user.getDate()!=null) {
                date.setText(user.getDate().toString());
                estado.setTextColor(view.getContext().getResources().getColor(R.color.colorAccent));
                estado.setText("Enviado");
            }else{
                estado.setTextColor(view.getContext().getResources().getColor(android.R.color.holo_red_dark));
                estado.setText("No enviado");
            }

        }
        return view;
    }
}

