package modelo

class ModeloConexion {

    fun cadenaConexion(): java.sql.Connection?{
        try {
            //cambiar ip dependiendo de la computadora
            val ipDaniel = "jdbc:oracle:thin:@192.168.0.11:1521:xe"
            val ipLaboratorio = "jdbc:oracle:thin:@192.168.56.1:1521:xe"


            val usuario = "Daniel"
            val contrasena = "Daniel2024"

            val conexion = java.sql.DriverManager.getConnection(ipLaboratorio, usuario, contrasena)



            return conexion
        }catch (e: Exception){
            println("El error es este: $e")
            return null
        }
    }

}