package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.BiomasaActivity;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class MainController extends Controller  {
    @Override
    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    /**
     * @param activity el controlador recibe este parámetro y trabaja sobre él
     *                 para saber como actuar
     */
    private View view;

    public MainController(final Activity activity,Class destino,View btn) {
        this.activity = activity;
        this.destino=destino;
        view=btn;

    }



}
