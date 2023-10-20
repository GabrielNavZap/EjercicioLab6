public class Main {
    public static void main(String[] args)
    {
        Punto3D origen = new Punto3D();
        Punto3D puntoB = new Punto3D(3,5,9);
        Punto3D puntoC = new Punto3D(3,4,0);
        System.out.println(puntoB.calculaDistancia(origen));
        System.out.println(puntoB.calculaDistancia());
        System.out.println(puntoC.calculaDistancia(origen));

        Punto3D[] puntos = new Punto3D[10];
        Punto3D.initArr(puntos);
        Punto3D.imprArr(puntos);
        System.out.println("La menor distancia entre los puntos es: "
                            +Punto3D.menorDistancia(puntos));

    }
}
