import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

////  VISTA

class VistaRequerimientos {
 
    // Consulta numero 1 del reto 3
    public static void requerimiento1(){


    }

    // Consulta numero 4 del reto 3
    public static void requerimiento2(){


    }

    // Consulta numero 4 del reto 3
    public static void requerimiento3(){
	

    }

}

//// CONTROLADOR

class ControladorRequerimientos {
    
    // Metodo Requerimiento 1

	
    // Metodo Requerimiento 2


    // Metodo Requerimiento 3
    public static ArrayList<LideresPromediosVO> consultarLideresPromedios() throws SQLException{
        
    }

}


//// MODELO

/// DAOS

// DAO Requerimiento 1

// DAO Requerimiento 2

// DAO Requerimiento 3
class LideresPromediosDAO {
    
    public ArrayList<LideresPromediosVO> consultarLideresPromedios() throws SQLException{

        // Crear arreglo donde guardaremos los registros que son el resultado de la consulta que vamos a ejecutar
        ArrayList<LideresPromediosVO> respuestaConsulta4 = new ArrayList<LideresPromediosVO>();
	
		try {
		
		} catch (Exception e) {
		
		}
		
        return respuestaConsulta4;
    }

}



/// VOS

// VO Requerimiento 1

// VO Requerimiento 2

// VO Requerimiento 3
class LideresPromediosVO {
    
    public LideresPromediosVO(String Nombre,Double Promedio ){
       
    }
}

// JDBC utilities: Conexion a la base de datos
class JDBCutilities{

    private final static String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
