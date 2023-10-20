import random
import math

class Punto3D:
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z

    def calcular_distancia(self, destino=None):
        if destino is None:
            return math.sqrt(self.x ** 2 + self.y ** 2 + self.z ** 2)
        dif_x = self.x - destino.x
        dif_y = self.y - destino.y
        dif_z = self.z - destino.z
        return math.sqrt(dif_x ** 2 + dif_y ** 2 + dif_z ** 2)

    def __str__(self):
        return f"coordenadas: {self.x}, {self.y}, {self.z}"

    @staticmethod
    def menor_distancia(puntos):
        menor_distancia = 99999
        for i in range(len(puntos)):
            for j in range(i + 1, len(puntos)):
                distancia = puntos[i].calcular_distancia(puntos[j])
                print(distancia)
                if distancia < menor_distancia:
                    menor_distancia = distancia
        return menor_distancia

    @staticmethod
    def init_arr(puntos):
        for i in range(len(puntos)):
            x = random.randint(0, 29)
            y = random.randint(0, 29)
            z = random.randint(0, 29)
            puntos[i] = Punto3D(x, y, z)

    @staticmethod
    def impr_arr(puntos):
        for i in range(len(puntos)):
            print(f"Punto {i + 1}: {puntos[i]}")

# Ejemplo de uso
if __name__ == "__main__":
    origen = Punto3D()
    puntoB = Punto3D(3, 5, 9)
    puntoC = Punto3D(3, 4, 0)
    print(puntoB.calcular_distancia(origen))
    print(puntoB.calcular_distancia())
    print(puntoC.calcular_distancia(origen))

    puntos = [Punto3D() for _ in range(10)]
    Punto3D.init_arr(puntos)
    Punto3D.impr_arr(puntos)
    menor_distancia = Punto3D.menor_distancia(puntos)
    print(f"La menor distancia entre los puntos es: {menor_distancia}")
