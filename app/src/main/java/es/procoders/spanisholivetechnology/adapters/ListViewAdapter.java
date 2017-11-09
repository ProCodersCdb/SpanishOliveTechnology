package es.procoders.spanisholivetechnology.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.questions.Options;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class ListViewAdapter extends BaseAdapter {

    private Context ctx;
    private ArrayList<Options> lista;

    public ListViewAdapter(Context ctx, ArrayList<Options> lista) {
        this.ctx = ctx;
        this.lista = lista;

    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_simple_item, viewGroup, false);

        TextView desc = (TextView) view.findViewById(R.id.idDescription);
        TextView name = (TextView) view.findViewById(R.id.mainListView);
        ImageView image = view.findViewById(R.id.imageListView);
        Options nameS = lista.get(i);
        if (nameS.isRequired()){
            image.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_info));
        }
        if (lista.get(i).getDescription() != null){
            desc.setText(lista.get(i).getDescription());
        }
        name.setText(nameS.getTituloOpcion());
        return view;
    }
}

