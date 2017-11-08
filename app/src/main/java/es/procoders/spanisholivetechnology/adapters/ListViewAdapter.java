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

public class ListViewAdapter extends ArrayAdapter<Options> {


    private Context ctx;
    private ArrayList<Options> lista;

    public ListViewAdapter(Context ctx, ArrayList<Options> lista) {
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
    public Options getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }



   // @Override
 /*   public View getView(int i, View view, ViewGroup viewGroup) {
        super.getView(i,view,viewGroup);
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) viewGroup.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_simple_item, viewGroup, false);
        }

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
    }*/
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get the data item for this position
        Options user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view

            view = LayoutInflater.from(getContext()).inflate(R.layout.list_simple_item, parent, false);

        // Lookup view for data population
        TextView desc = (TextView) view.findViewById(R.id.idDescription);
        TextView name = (TextView) view.findViewById(R.id.mainListView);
        ImageView image = view.findViewById(R.id.imageListView);
        if (user.isRequired()){

            image.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_info));
            image.setVisibility(View.VISIBLE);

        }
        if (lista.get(position).getDescription() != null){
            desc.setText(user.getDescription());
        }else{
            desc.setText("");
        }
        name.setText(user.getTituloOpcion());
     //   TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
       // TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
       // tvName.setText(user.name);
        //tvHome.setText(user.hometown);
        // Return the completed view to render on screen
        return view;
    }
}

