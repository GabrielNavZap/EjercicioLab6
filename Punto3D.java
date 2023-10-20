import java.util.Random;
public class Punto3D {
    private int x;
    private int y;
    private int z;

    public Punto3D()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punto3D(int x,int y,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getZ()
    {
        return z;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void setZ(int z)
    {
        this.z = z;
    }
    public float calculaDistancia(Punto3D destino)
    {
        float difX = this.x-destino.x;
        float difY = this.y-destino.y;
        float difZ = this.z-destino.z;
        return (float) Math.sqrt((difX*difX)+(difY*difY)+(difZ*difZ));
    }
    public float calculaDistancia()
    {
        return (float) Math.sqrt((x*x)+(y*y)+(z*z));
    }
    @Override
    public String toString()
    {
        return "coordenadas: "+x+", "+y+", "+z+".";
    }

    public static float menorDistancia(Punto3D[] puntos)
    {
        float menorDistancia = 99999;
        for (int i=0;i<puntos.length;i++)
        {
            for(int j=i+1;j<puntos.length;j++)
            {
                float distancia = puntos[i].calculaDistancia(puntos[j]);
                System.out.println(distancia);
                if(distancia<menorDistancia)
                {
                    menorDistancia = distancia;
                }
            }
        }
        return menorDistancia;
    }
    public static void initArr(Punto3D[] puntos)
    {
        Random rand = new Random();

        for (int i=0;i<puntos.length;i++)
        {
            int x = rand.nextInt(30);
            int y = rand.nextInt(30);
            int z = rand.nextInt(30);

            puntos[i] = new Punto3D(x,y,z);
        }
    }
    public static void imprArr(Punto3D[] puntos)
    {
        for(int i=0;i<puntos.length;i++)
        {
            System.out.println("Punto "+(i+1)+": "+puntos[i]);
        }
    }
}