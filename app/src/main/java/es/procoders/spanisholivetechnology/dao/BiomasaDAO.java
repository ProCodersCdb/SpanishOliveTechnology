package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import es.procoders.spanisholivetechnology.beans.BiomasaBean;

public class BiomasaDAO {

    private String fileName = "datos";

    //Método que guarda en local el objeto BiomasaBean
    public void guardar (BiomasaBean b, Context c) {

        try {
            FileOutputStream fos = c.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(b);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Lee, si existe, el archivo local y recupera el contenido previamente guardado
    public BiomasaBean recuperar (Context c) {

        BiomasaBean b = new BiomasaBean();

        try {
            FileInputStream fis = c.openFileInput (fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            b = (BiomasaBean) ois.readObject();

            ois.close();
            fis.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}

