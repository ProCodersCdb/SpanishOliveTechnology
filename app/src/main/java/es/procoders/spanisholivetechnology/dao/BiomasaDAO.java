package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;


public class BiomasaDAO implements GestionDAO<TreeMap<Pregunta, Respuesta>>{

    private final static String fileName = "datos.dat";


    @Override
    public void guardarLocal(TreeMap<Pregunta, Respuesta> e, Context c) {
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

    public TreeMap<Pregunta, Respuesta> recuperarLocal (Context c) {

        TreeMap<Pregunta, Respuesta> b = new TreeMap<>();

        try {
            FileInputStream fis = c.openFileInput (fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            b = (TreeMap<Pregunta, Respuesta>) ois.readObject();

            ois.close();
            fis.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}

