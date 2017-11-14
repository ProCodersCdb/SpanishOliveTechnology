package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;


public class BiomasaDAO implements GestionDAO<ArrayList<Formulario>>{

    private final static String fileName = "datos.dat";


    @Override
    public void guardarLocal(ArrayList<Formulario> e, Context c) {
        for (Formulario formulario: e) {
            if (formulario.getDate()!=null) {
                e.remove(formulario);
            }
        }
        
        try {
            FileOutputStream fos = c.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
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
        return b;
    }
}

