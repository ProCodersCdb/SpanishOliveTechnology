package es.procoders.spanisholivetechnology.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;

import es.procoders.spanisholivetechnology.R;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class SimpleAdapterCharge extends BaseAdapter {
    /*Adaptador usado para cuadros de dialogo emergentes.*/
    private LayoutInflater layoutInflater;


    public SimpleAdapterCharge(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view = convertView;

        view = layoutInflater.inflate(R.layout.simpleload, parent, false);


            viewHolder = new ViewHolder();
            viewHolder.progressBar =  view.findViewById(R.id.progressDialog);
            view.setTag(viewHolder);



        Context context = parent.getContext();
        switch (position) {
            case 0:
                viewHolder.progressBar.setIndeterminate(true);
                break;
        }

        return view;
    }

    static class ViewHolder {
       ProgressBar progressBar;
    }
}
