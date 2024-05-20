package dane;

import java.util.Scanner;

public class DANE {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Indicar cantidad nacimiento mensuales");
        Scanner sc = new Scanner(System.in);
        int NacimientosMensuales = sc.nextInt();
        double NiñosMuertosMensuales = 2,
                NacimientosPromedioMensual = 10,
                TotalParcialNiñosMuertos,
                TotalMensualNiñosMuertos,
                TotalNiñosMuertosMensuales,
                NacidosAnualmente=0,
                MuertosAnuales=0;

        TotalParcialNiñosMuertos = NacimientosMensuales / NacimientosPromedioMensual;
        TotalMensualNiñosMuertos = TotalParcialNiñosMuertos * NiñosMuertosMensuales;
        TotalNiñosMuertosMensuales = TotalMensualNiñosMuertos;

        NacidosAnualmente = NacimientosMensuales * 12;
        MuertosAnuales = TotalNiñosMuertosMensuales * 12;

        if (MuertosAnuales >= 100) {
            System.out.println("----------------------------------------------------");
            System.out.println("------------------ESTADO DE ALERTA------------------");
            System.out.println("Ninos nacidos por mes: " + NacimientosMensuales);
            System.out.println("Ninos nacidos por año: " + NacidosAnualmente);
            System.out.println("Ninos muertos por mes: " + TotalMensualNiñosMuertos);
            System.out.println("Ninos muertos por año: " + MuertosAnuales);
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("-------------------Alerta Apagada-------------------");
            System.out.println("----------------------------------------------------");
        }

    }

}
