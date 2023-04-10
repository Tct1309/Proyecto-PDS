import java.util.Scanner;
import java.util.Random;

public class Main {
  // creamos una funcion que cree un arreglo para almacenar el estado de las
  // celdas de los distintos parqueaderos
  // cada espacio del arreglo representa una celda del parqueadero
  public static boolean[] Parqueaderos(int a) {
    Random rand = new Random();
    boolean[] array1 = new boolean[a];
    // debido a la falta de sensores le asignamos un valor aleatorio entre True y
    // False a un espacio del arreglo
    // siendo True ocupado y False libre
    for (int i = 0; i < a; i++) {
      array1[i] = rand.nextBoolean();
    }
    return array1;
  }

  // creamos una funcion para contar la cantidad de celdas en cada parqueadero
  public static int CeldasParqueadero(boolean[] array) {
    int cont = 0;
    for (int i = 0; i < array.length; i++)
      if (!(array[i])) {
        cont++;
      }

    return cont;
  }

  // creamos una funcion para determinar el parqueadero mas cercano al usuario
  public static int UbicaMasCerca(int num) {
    int P = 0;
    if (num == 1) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Idiomas EAFIT");
      P = 3;
    } else if (num == 2) {
      System.out.println("Parqueadero más cercanoa ti:\nParqueadero Idiomas EAFIT");
      P = 3;
    } else if (num == 3) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Zona Sur (cerca al Bloque 19)");
      P = 2;
    } else if (num == 4) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Zona Sur (cerca al Bloque 19)");
      P = 2;
    } else if (num == 5) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Zona Sur (cerca al Bloque 19)");
      P = 2;
    } else if (num == 6) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Zona Sur (cerca al Bloque 19)");
      P = 2;
    } else if (num == 7) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Centro de innovación argos (solo empleados)");
      P = 4;
    } else if (num == 8) {
      System.out.println("Parqueadero más cercano a ti:\nParqueadero Zona Norte (cerca al bloque 38)");
      P = 1;
    }
    return P;
  }

  // creamos una funcion para determinar el parqueadero con mayor disponibilidad
  public static int DispoParqueadero(int a, int b, int c, int d) {
    int max = a;
    int z = 0;
    if (b > max) {
      if (c > b) {
        if (d > c) {
          max = d;
          z = 4;
          System.out.println("El parqueadero con mayor disponiblidad es\nEl Parqueadero Argos (solo empleados): " + d);
        } else {
          max = c;
          z = 3;
          System.out.println("El parqueadero con mayor disponiblidad es\nEl Parqueadero EAFIT Idiomas: " + c);
        }
      } else {
        if (d > b) {
          max = d;
          z = 4;
          System.out.println("El parqueadero con mayor disponiblidad es\nEl Parqueadero Argos (solo empleados): " + d);
        } else {
          max = b;
          z = 2;
          System.out
              .println("El parqueadero con mayor disponiblidad es\nEl Parqueadero Zona Sur (cerca al bloque 19): " + b);
        }
      }
    } else {
      if (c > max) {
        if (d > c) {
          max = d;
          z = 4;
          System.out.println("El parqueadero con mayor disponiblidad es\nEl Parqueadero Argos (solo empleados): " + d);
        } else {
          max = c;
          z = 3;
          System.out.println("El parqueadero con mayor disponiblidad es\nEl Parqueadero EAFIT Idiomas: " + c);
        }
      } else {
        if (d > max) {
          max = d;
          z = 4;
          System.out.println("El parqueadero con mayor disponiblidad es\nEl Parqueadero Argos (solo empleados): " + d);
        }
      }
    }
    if (a == max) {
      z = 1;
      System.out
          .println("El parqueadero con mayor disponiblidad es\nEl Parqueadero Zona Norte (cerca al bloque 38): " + a);
    }
    return z;
  }

  // creamos una funcion para buscar una celda libre
  public static int CeldaDisponible(boolean[] array) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int i = 0;
    int y = 0;
    int count = 0;
    // debido a la naturales de randomizar 2 variables siempre quedabada una celda
    // disponible en los primeros espacios
    // para evitar esto creamos una variable con un numero aleatorio de veces que se
    // deba encontrar una celda libre
    // asi dando con un numero mas realista
    int z = rand.nextInt(array.length / 2);
    while (i < array.length) {
      if (!(array[i])) {
        y = i;
        count++;
        if (count == z) {
          break;
        }
      }
      i++;
    }
    return y;
  }

  // creamos una funcion para encontrar una celda libre en el parqueadero
  // seleccionado
  public static int CeldaReservar(int k, boolean[] a, boolean[] b, boolean[] c, boolean[] d) {
    int CeldaPDispo = 0;
    if (k == 1) {
      CeldaPDispo = Main.CeldaDisponible(a);
      // cambiamos el valor de libre a ocupado
      a[CeldaPDispo] = true;
    }
    if (k == 2) {
      CeldaPDispo = Main.CeldaDisponible(b);
      b[CeldaPDispo] = true;
    }
    if (k == 3) {
      CeldaPDispo = Main.CeldaDisponible(c);
      c[CeldaPDispo] = true;
    }
    if (k == 4) {
      CeldaPDispo = Main.CeldaDisponible(d);
      d[CeldaPDispo] = true;
    }
    return CeldaPDispo;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    // le preguntamos al usuario su tipo de usuario
    System.out.println("------------------------------------------------");
    System.out.println("Seleccione su tipo de usuario\n1.Usuario Institucional\n2.Usuario Externo");
    int num1 = sc.nextInt();
    // consultamos la ubicacion del usuario
    System.out.println("------------------------------------------------");
    System.out.println("Selecciona tu ubicación más cercana: ");
    // por la falta de conosimientos en gps decidimos preguntarle directamente al usuario cerca
    // de que zona se encuentra
    System.out.println(
        "1: Centro Comercial Oviedo\n2: Clinica Las Vegas\n3: Macrollantas Las Vegas\n4: Barrio Aguacatala\n5: Estación Aguacatala\n6: Colegio San José de las Vegas\n7: Puente Gilberto Echeverria Mejía\n8: Plazoleta Arqueologica");
    int num = 0;
    while (num < 1 || num > 8) {
      num = sc.nextInt();
      if (num < 1 || num > 8) {
        System.out.println("------------------------------------------------");
        System.out.println("Número no valido");
        System.out.println("Seleccione su ubicación más cercana: ");
      }
    }
    System.out.println("------------------------------------------------");
    
    // llamamos las funciones que crean arreglos para los 4 parqueaderos
    boolean[] PZona_Norte = Main.Parqueaderos(465);
    boolean[] PZona_Sur = Main.Parqueaderos(246);
    boolean[] PEafit_Idiomas = Main.Parqueaderos(200);
    boolean[] PArgos = Main.Parqueaderos(101);
    
    // creamos cuatro variables que nos ayudaran a darle un comportamiento mas
    // natural al uso de los parqueaderos
    int a = rand.nextInt(232);
    int b = rand.nextInt(123);
    int c = rand.nextInt(100);
    int d = rand.nextInt(50);
    
    // llamamos la funcion que cuenta las celdas libres de cada parqueadero
    // le restamos un valor aleatorio para simular de mejor forma el uso de los
    // parqueaderos
    int CantCeldas1 = Math.abs(Main.CeldasParqueadero(PZona_Norte) - a);
    int CantCeldas2 = Math.abs(Main.CeldasParqueadero(PZona_Sur) - b);
    int CantCeldas3 = Math.abs(Main.CeldasParqueadero(PEafit_Idiomas) - c);
    int CantCeldas4 = Math.abs(Main.CeldasParqueadero(PArgos) - d);
    
    // le mostramos al usuario la cantidad de celdas disponibles en cada parqueadero
    System.out.println("las celdas disponibles por cada parqueadero son: ");
    System.out.println("Parqueadero Zona Norte: " + CantCeldas1);
    System.out.println("Parqueadero Zona Sur: " + CantCeldas2);
    System.out.println("Parqueadero EAFIT Idiomas: " + CantCeldas3);
    System.out.println("Parqueadero PArgos: " + CantCeldas4);
    System.out.println("------------------------------------------------");
    
    // llamamos a una funcion que le mostrará al usuario el parqueadero mas cercano
    // a su ubicacion
    int MejorParqueaderoU = Main.UbicaMasCerca(num);
    
    System.out.println("------------------------------------------------");
    
    //llamamos a una funcion uqe evaluará cula de todos los parqueaderos iene mayor disponibilidad
    int MejorParqueaderoD = Main.DispoParqueadero(CantCeldas1, CantCeldas2, CantCeldas3, CantCeldas4);
    
    //consultamos el tipo de usuario mediante la variable num
    if (num1 == 1) {
      System.out.println("------------------------------------------------");
    //le damos la oportunidad de reservar una celda al usuario de tipo institucional
      System.out.println("¿quiere reservar una celda en alguno de los parqueaderos? (Escriba SI/NO)");
      String Cons1 = sc.next();
      System.out.println("------------------------------------------------");
     
      if (Cons1.equals("SI")) {
        System.out.println("1.En el parqueadero más cercano\n2.En el parqueadero con mayor disponibilidad");
        int Cons2 = sc.nextInt();
        System.out.println("------------------------------------------------");
        if (Cons2 == 1) {
          System.out.println("Se ha reservado la celda "
              + Main.CeldaReservar(MejorParqueaderoU, PZona_Norte, PZona_Sur, PEafit_Idiomas, PArgos));
          System.out.println("Gracias, por tenernos encuenta\n ¡te esperamos en la U!");
        } else if (Cons2 == 2) {
          System.out.println("Se ha reservado la celda "
              + Main.CeldaReservar(MejorParqueaderoD, PZona_Norte, PZona_Sur, PEafit_Idiomas, PArgos));
          System.out.println("Gracias, por tenernos en cuenta\n  ¡te esperamos en la U!");
        }
      } else {
        System.out.println("Gracias, por tenernos en cuenta\n  ¡te esperamos en la U!");
      }
    }
  }
}
