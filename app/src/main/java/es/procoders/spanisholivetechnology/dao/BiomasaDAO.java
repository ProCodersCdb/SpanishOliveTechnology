/*
package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

*/
/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 *//*

public class BiomasaDAO implements GestionDAO<BiomasaBean>{

    private final static String fileName = "datosBiomasa.dat";


    */
/**
     *@see "private final static String fileName" se crea el archivo en el que se guardara el objeto
     * BiomasaBean
     * @param b parámetro que se usa en método guardarLocal. Este método guarda el objeto que se
     *          pasa en forma de parámetro
     * @param c parámetro usado como base para el método recuperarLocal. Lee, si existe, el archivo
     *         local y recupera el contenido previamente guardado.En caso de no existir,
     *         devuelve FileNotFoundException
     *//*


    public void guardarLocal (BiomasaBean b, Context c) {

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


    public BiomasaBean recuperarLocal (Context c) {

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

*/
