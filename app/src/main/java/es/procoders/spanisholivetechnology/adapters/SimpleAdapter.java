package es.procoders.spanisholivetechnology.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import es.procoders.spanisholivetechnology.R;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class SimpleAdapter extends BaseAdapter {
/*Adaptador usado para cuadros de dialogo emergentes.*/
    private LayoutInflater layoutInflater;
    private boolean isGrid;

    public SimpleAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.isGrid = isGrid;
    }

    @Override
    public int getCount() {
        return 6;
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

        view = layoutInflater.inflate(R.layout.simple_menu_list, parent, false);


            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) view.findViewById(R.id.menuList);
            view.setTag(viewHolder);



        Context context = parent.getContext();
        switch (position) {
            case 0:
                viewHolder.textView.setText(context.getString(R.string.plantacion));
                break;
            case 1:
                viewHolder.textView.setText(context.getString(R.string.almazara));
                break;

            case 2:
                viewHolder.textView.setText(context.getString(R.string.fabricaace));
                break;

            case 3:
                viewHolder.textView.setText(context.getString(R.string.comercioaceite));
                break;

            case 4:
                viewHolder.textView.setText(context.getString(R.string.comercioa));
                break;

            case 5:
                viewHolder.textView.setText(context.getString(R.string.biomasa));
                break;
        }

        return view;
    }

    static class ViewHolder {
        TextView textView;
    }
}
