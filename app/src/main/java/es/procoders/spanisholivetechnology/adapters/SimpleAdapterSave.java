package es.procoders.spanisholivetechnology.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import es.procoders.spanisholivetechnology.R;

/**
 * Created by bjfem on 12/11/2017.
 */
public class SimpleAdapterSave extends BaseAdapter {

    private LayoutInflater layoutInflater;


    public SimpleAdapterSave(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 3;
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
                viewHolder.textView.setText("Guardar");
                break;
            case 1:
                viewHolder.textView.setText("Guardar y enviar");
                break;
            case 2:
                viewHolder.textView.setTextColor(context.getResources().getColor(android.R.color.holo_red_dark));
                viewHolder.textView.setText("Cancelar");
                break;
        }

        return view;
    }

    static class ViewHolder {
        TextView textView;
    }
}
