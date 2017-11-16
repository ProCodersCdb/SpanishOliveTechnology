package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class BiomasaDAO implements GestionDAO<ArrayList<Formulario>>{

    private final static String fileName = "datos.dat";

    @Override
    public void guardarLocal(ArrayList<Formulario> e, Context c) {
        ArrayList<Formulario> g = new ArrayList<>();

            for (int i = 0; i < e.size(); i++) {
                if (e.get(i).getDate() == null) {
                    g.add(e.get(i));
                }
            }
            e.removeAll(e);

        try {
            FileOutputStream fos = c.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(g);
            oos.close();
            fos.close();
        } catch (IOException u) {
            u.printStackTrace();
        }
    }

    public ArrayList<Formulario> recuperarLocal (Context c) {

       ArrayList<Formulario> b = new ArrayList<>();

        try {
            FileInputStream fis = c.openFileInput (fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            b = (ArrayList<Formulario>) ois.readObject();

            ois.close();
            fis.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        GeneralSingleton single = GeneralSingleton.getInstance();
        for (Formulario formulario: b) {
            if (formulario.getUser() ==null) {
                formulario.setUser(single.getUser());
            }
        }
        return b;
    }
}

