/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        double MULTA = 60.00;
        int DIAS_DESCUENTO = 30;
        int TIPO_DESCUENTO = 20;

        //Variables
        int diasSCN;
        double descuento = 0;
        double importeFinal;
        boolean OK;

        try{
            
            //Cabecera
            System.out.printf("Alternativa de Multa %n============%n");
            
            //Scanner
            System.out.print("Días de demora ...........: ");
            diasSCN = SCN.nextInt();
            
            //Separador
            System.out.println("---");
            
            //Comparación
            OK = diasSCN <= DIAS_DESCUENTO;
            
            //Calculas descuento
            if(OK){
                descuento = MULTA * TIPO_DESCUENTO / 100;
            }
            
            //Calculo importe final
            importeFinal = MULTA - descuento;
            
            //Mensaje
            System.out.printf(Locale.ENGLISH, "Importe inicial multa ....: %.2f €%n---%n", MULTA);
            System.out.printf("Plazo con descuento ......: %d días%n", DIAS_DESCUENTO);
            System.out.printf(Locale.ENGLISH, "Importe descuento ........: %.2f € %n---%n", descuento);
            System.out.printf(Locale.ENGLISH, "Importe final multa ......: %.2f € %n", importeFinal);
                                
        }catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
            
        }finally{
             SCN.nextLine();
        }
    }
}
