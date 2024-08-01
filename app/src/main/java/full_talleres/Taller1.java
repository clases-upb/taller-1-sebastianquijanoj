/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int velocidad_km){
        double velocidad_ms;
        double velocidad_mh;

        double FACTOR_CONV_KH_MS = 0.277777778;
        double FACTOR_CONV_MS_MH = 3600;

        try {
            velocidad_ms = velocidad_km * FACTOR_CONV_KH_MS;
            velocidad_mh = velocidad_ms * FACTOR_CONV_MS_MH;
            return String.format("%f m/s  %f m/h", velocidad_ms, velocidad_mh);
            
        } 
        catch (Exception e) {
            return "error en la conversion";
        }


    }
    
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double cc){
     float lt = 0;
     int centimetros = 0;
     int lt_conv = 1000;
     try{
        lt = centimetros / lt_conv;
        return lt;
     }
     catch (Exception e) {
        return 0;

     }
    }
  
    

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
    public static int Convertir_us_cops (int dolares){
    int TRM = 4170;
    int pesos = 0;
    try{
        pesos = dolares * TRM;
        return pesos;

    }
    catch (Exception e){
        return -1;
        
    }


  }
   
    
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
    public static double Convertir_cent_far (double cc){
    double fahrenheit = 0;

    try{
        fahrenheit = 32 + ( 9 * cc / 5);
        return fahrenheit;
    }
    catch (Exception e){
        return 0;
    }


  }

          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
    public static int Calcular_segs (short dias, short horas, short minutos, short segundos){
    try {
         final short Dias_horas = 24;
         final short horas_minutos = 60;
         final short minutos_segundos = 60;
         int dias_segundos = dias * Dias_horas * horas_minutos * minutos_segundos;
         int horas_segundos = horas * horas_minutos * minutos_segundos;
         int Minutos_a_segundos = minutos * minutos_segundos;
         int Total_segundos = dias_segundos + horas_segundos + Minutos_a_segundos + segundos;
         return Total_segundos;

    } 
    catch (Exception e) {
        return -1; 
    }



  }

   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"
   */
    public static String Calcular_peso_carga (float peso_total_camion_ton, float peso_solo_camion_ton){
    try { 
        float peso_neto_ton = 0;
        float peso_neto_kg = 0;
        final short FACTOR_CONV_TON_KG = 1000;
        peso_neto_ton = peso_total_camion_ton - peso_solo_camion_ton;
        peso_neto_kg = peso_neto_ton * FACTOR_CONV_TON_KG;
        return peso_neto_kg + "kilos - " + peso_neto_ton + "toneladas";
        
    }  
    catch (Exception e) {
        return ("Error en la función Calcular_peso_carga");
    }
   }

   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
    public static float Calcular_horasxviaje (String destino, short distancia, short velocidad){
    try {
        float horas = (float) distancia / velocidad;
        return horas;
    } 
    catch (Exception e) {
        return -1;
    }
  }
    

  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
    public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4){
    float total_combustible = 0;

    final float COMBUSTIBLE_POR_KM = (float) (0.2 / 60.8);
    final float GASTO_DESPEGUE = 1.2F;
    final float GASTO_ATERRIZAJE = 0.4F;

    int[] rutas = new int[4];
    rutas[0] = ruta1;
    rutas[1] = ruta2;
    rutas[2] = ruta3;
    rutas[3] = ruta4;

    try {
        for (int ruta: rutas){
            total_combustible += GASTO_DESPEGUE;
            total_combustible += ruta * COMBUSTIBLE_POR_KM;
            total_combustible += GASTO_ATERRIZAJE;
        }
        return total_combustible;
    }
    catch (Exception e){
        return -1;
    }

}

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
    public static double Calcular_peso_luna (byte peso_tierra_kg){
    double peso_luna = 0;
    final double FACTOR_CONV_KG_NEW = 9.81;
    final double FACTOR_CONV_PESO_LUNA = 0.165;
    try {
        peso_luna = (peso_tierra_kg * FACTOR_CONV_KG_NEW) * FACTOR_CONV_PESO_LUNA;
        return peso_luna;
        
    } 
    catch (Exception e) {
        return 0;
    }
  }
   
   
   
}
