package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.beans.TipoRespuesta;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.questions.Questions;

/**
 * Created by joser on 13/11/2017.
 */

public class FormularioDAO extends DBConnection implements IFormularioDAO {

    //Propiedades
    private String table = "jperez_app.formularios";
    private String insertPlantacion = "INSERT INTO "+table+" (email, tipoFormulario, plantacionQ1, plantacionQ2, plantacionQ3, plantacionQ4, plantacionQ5, plantacionQ6, plantacionQ7, plantacionQ8, plantacionQ9, plantacionQ10, plantacionQ11, plantacionQ12, plantacionQ13, plantacionQ14, plantacionQ15) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String insertAlmazara = "INSERT INTO "+table+" (email, tipoFormulario, almazaraQ1, almazaraQ2, almazaraQ3, almazaraQ4, almazaraQ5, almazaraQ6, almazaraQ7, almazaraQ8, almazaraQ9, almazaraQ10, almazaraQ11, almazaraQ12, almazaraQ13, almazaraQ14, almazaraQ15) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String insertFabricaAceituna = "INSERT INTO "+table+" (email, tipoFormulario, fabricaQ1, fabricaQ2, fabricaQ3, fabricaQ4, fabricaQ5, fabricaQ6, fabricaQ7, fabricaQ8, fabricaQ9, fabricaQ10, fabricaQ11, fabricaQ12, fabricaQ13) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String insertComercioAceite = "INSERT INTO "+table+" (email, tipoFormulario, comercioAceiteQ1, comercioAceiteQ2, comercioAceiteQ3, comercioAceiteQ4, comercioAceiteQ5, comercioAceiteQ6, comercioAceiteQ7, comercioAceiteQ8, comercioAceiteQ9, comercioAceiteQ10, comercioAceiteQ11, comercioAceiteQ12, comercioAceiteQ13, comercioAceiteQ14) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String insertComercioAceituna = "INSERT INTO "+table+" (email, tipoFormulario, comercioAceitunaQ1, comercioAceitunaQ2, comercioAceitunaQ3, comercioAceitunaQ4, comercioAceitunaQ5, comercioAceitunaQ6, comercioAceitunaQ7, comercioAceitunaQ8, comercioAceitunaQ9) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String insertBiomasa = "INSERT INTO "+table+" (email, tipoFormulario, bioQ1, bioQ2, bioQ3, bioQ4, bioQ5, bioQ6, bioQ7, bioQ8) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    //Constructor
    public FormularioDAO() {
        super();
    }

    //Métodos
    @Override
    public Boolean crearFormulario(Formulario formulario) {
        Boolean retVal = false;
        if (formulario.getUser().getEmail() == null){
            formulario.getUser().setEmail(GeneralSingleton.getInstance().getUser().getEmail());
        }
        String email = formulario.getUser().getEmail();

        TipoRespuesta tipoFormulario = (TipoRespuesta) formulario.getTipo();
        ArrayList<Respuesta> respuestas = formulario.getRespuestas();

        switch (tipoFormulario) {
            case PLANTACION:
                consultaSQL = insertPlantacion;
                break;
            case ALMAZARA:
                consultaSQL = insertAlmazara;
                break;
            case FABRICAACEITUNA:
                consultaSQL = insertFabricaAceituna;
                break;
            case COMERCIOACEITE:
                consultaSQL = insertComercioAceite;
                break;
            case COMERCIOACEITUNA:
                consultaSQL = insertComercioAceituna;
                break;
            case BIOMASA:
                consultaSQL = insertBiomasa;
                break;
            default:
                break;
        }
        try {
            conectar();
            preparedStmt = conexionSQL.prepareStatement(consultaSQL);
            preparedStmt.setString(1,email);
            preparedStmt.setString(2,tipoFormulario.toString());
            for (int i = 0; i < respuestas.size(); i++) {
                preparedStmt.setString(i+3, respuestas.get(i).getStr());
            }
            if (preparedStmt.executeUpdate() == 1) {
                retVal = true;
            }
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retVal;
    }


    @Override
    public ArrayList<Formulario> consultarFormularios(Usuario usuario, Context context) {
        ArrayList<Formulario> formularios = new ArrayList<>();


        try {
            conectar();
            consultaSQL = "SELECT * FROM "+table+" WHERE email = '"+usuario.getEmail()+"'";
            stmt = conexionSQL.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()){
                formularios.add(rellenarFormulario(usuario, context));
            }
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return formularios;
    }

    @Override
    public Boolean upgradeForm(Formulario formulario) {
        Boolean retVal = false;
        if (formulario.getUser().getEmail() == null){
            formulario.getUser().setEmail(GeneralSingleton.getInstance().getUser().getEmail());
        }
        String deleteRow = "DELETE FROM "+table+" WHERE fecha = '"+formulario.getDate()+"'";
        String email = formulario.getUser().getEmail();
        TipoRespuesta tipoFormulario = (TipoRespuesta) formulario.getTipo();
        ArrayList<Respuesta> respuestas = formulario.getRespuestas();

        switch (tipoFormulario) {
            case PLANTACION:
                consultaSQL = insertPlantacion;
                break;
            case ALMAZARA:
                consultaSQL = insertAlmazara;
                break;
            case FABRICAACEITUNA:
                consultaSQL = insertFabricaAceituna;
                break;
            case COMERCIOACEITE:
                consultaSQL = insertComercioAceite;
                break;
            case COMERCIOACEITUNA:
                consultaSQL = insertComercioAceituna;
                break;
            case BIOMASA:
                consultaSQL = insertBiomasa;
                break;
            default:
                break;
        }
        try {
            conectar();
            conexionSQL.createStatement().execute(deleteRow);
            preparedStmt = conexionSQL.prepareStatement(consultaSQL);
            preparedStmt.setString(1,email);
            preparedStmt.setString(2,tipoFormulario.toString());
            for (int i = 0; i < respuestas.size(); i++) {
                preparedStmt.setString(i+3, respuestas.get(i).getStr());
            }
            if (preparedStmt.executeUpdate() == 1) {
                retVal = true;
            }
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retVal;
    }

    private Formulario rellenarFormulario(Usuario usuario, Context context) throws SQLException {
        Formulario formulario = new Formulario();
        formulario.setUser(usuario);
        formulario.setDate(rs.getString("fecha"));
        formulario.setEstado(rs.getString("estado"));
        TipoRespuesta tipoFormulario = convertirTipo(rs.getString("tipoFormulario"));
        formulario.setTipo(tipoFormulario);
        Questions qu = new Questions(context);
        switch (tipoFormulario) {
            case ALMAZARA:
                formulario.setRespuestas(qu.getAlmazara());
                for (int i = 0; i < formulario.getRespuestas().size(); i++) {
                    formulario.getRespuestas().get(i).setStr(rs.getString("almazaraQ"+Integer.toString(i+1)));
                }
                break;
            case BIOMASA:
                formulario.setRespuestas(qu.getBiomasa());
                for (int i = 0; i < formulario.getRespuestas().size(); i++) {
                    formulario.getRespuestas().get(i).setStr(rs.getString("bioQ"+Integer.toString(i+1)));
                }
                break;
            case PLANTACION:
                formulario.setRespuestas(qu.getPlantacion());
                for (int i = 0; i < formulario.getRespuestas().size(); i++) {
                    formulario.getRespuestas().get(i).setStr(rs.getString("plantacionQ"+Integer.toString(i+1)));
                }
                break;
            case COMERCIOACEITUNA:
                formulario.setRespuestas(qu.getComercioAceituna());
                for (int i = 0; i < formulario.getRespuestas().size(); i++) {
                    formulario.getRespuestas().get(i).setStr(rs.getString("comercioAceitunaQ"+Integer.toString(i+1)));
                }
                break;
            case COMERCIOACEITE:
                formulario.setRespuestas(qu.getComercioAceite());
                for (int i = 0; i < formulario.getRespuestas().size(); i++) {
                    formulario.getRespuestas().get(i).setStr(rs.getString("comercioAceiteQ"+Integer.toString(i+1)));
                }
                break;
            case FABRICAACEITUNA:
                formulario.setRespuestas(qu.getFabricaAceituna());
                for (int i = 0; i < formulario.getRespuestas().size(); i++) {
                    formulario.getRespuestas().get(i).setStr(rs.getString("fabricaQ"+Integer.toString(i+1)));
                }
                break;
        }
        return formulario;
    }

    private TipoRespuesta convertirTipo (String tipo) {
        TipoRespuesta tipoRespuesta;

        switch (tipo) {
            case ("PLANTACION"):
                tipoRespuesta = TipoRespuesta.PLANTACION;
                break;
            case ("ALMAZARA"):
                tipoRespuesta = TipoRespuesta.ALMAZARA;
                break;
            case ("FABRICAACEITUNA"):
                tipoRespuesta = TipoRespuesta.FABRICAACEITUNA;
                break;
            case ("COMERCIOACEITE"):
                tipoRespuesta = TipoRespuesta.COMERCIOACEITE;
                break;
            case ("COMERCIOACEITUNA"):
                tipoRespuesta = TipoRespuesta.COMERCIOACEITUNA;
                break;
            default:
                tipoRespuesta = TipoRespuesta.BIOMASA;
                break;
        }
        return tipoRespuesta;
    }
}
