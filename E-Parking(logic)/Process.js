 class Process{
 constructor (){}
  CeldasParqueadero(array) {
    let cont = 0;
    for (let i = 0; i < array.length; i++) {
      if (array[i]!= 1) {
        cont++;
      }
    }
    return cont;
  }

   UbicaMasCerca(num) {
    let P = 0;
    if (num === 1 || num === 2) {
      //console.log("Parqueadero más cercano a ti:\nParqueadero Idiomas EAFIT");
      P = 3;
    } else if (num >= 3 && num <= 6) {
      //console.log("Parqueadero más cercano a ti:\nParqueadero Zona Sur (cerca al Bloque 19)");
      P = 2;
    } else if (num === 7) {
      //console.log("Parqueadero más cercano a ti:\nParqueadero Centro de innovación argos (solo empleados)");
      P = 4;
    } else if (num === 8) {
      //console.log("Parqueadero más cercano a ti:\nParqueadero Zona Norte (cerca al bloque 38)");
      P = 1;
    }
    return P;
  }

    DispoParqueadero(a, b, c, d) {
    let max = a;
    let z = 0;
    if (b > max) {
      if (c > b) {
        if (d > c) {
          max = d;
          z = 4;
          //console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero Argos (solo empleados): ${d}`);
        } else {
          max = c;
          z = 3;
          //console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero EAFIT Idiomas: ${c}`);
        }
      } else {
        if (d > b) {
          max = d;
          z = 4;
          //console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero Argos (solo empleados): ${d}`);
        } else {
          max = b;
          z = 2;
          //console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero Zona Sur (cerca al bloque 19): ${b}`);
        }
      }
    } else {
      if (c > max) {
        if (d > c) {
          max = d;
          z = 4;
          console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero Argos (solo empleados): ${d}`);
        } else {
          max = c;
          z = 3;
          console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero EAFIT Idiomas: ${c}`);
        }
      } else {
        if (d > max) {
          max = d;
          z = 4;
          console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero Argos (solo empleados): ${d}`);
        }
      }
    }
    if (a == max) {
      z = 1;
      console.log(`El parqueadero con mayor disponibilidad es\nEl Parqueadero Zona Norte (cerca al bloque 38): ${a}`);
    }
    return z;
  }

  CeldaDisponible(array) {
    const rand = Math.floor(Math.random() * (array.length / 2));
    let i = 0;
    let y = 0;
    let count = 0;
    while (i < array.length) {
    if (!array[i]) {
    y = i;
    count++;
    if (count === rand) {
    break;
    }
    }
    i++;
    }
    return y;
  }
 
  CeldaReservar(k, a, b, c, d) {
        let CeldaPDispo = 0;
        if (k === 1) {
          CeldaPDispo = CeldaDisponible(a);
          a[CeldaPDispo] = true;
        }
        if (k === 2) {
          CeldaPDispo = CeldaDisponible(b);
          b[CeldaPDispo] = true;
        }
        if (k === 3) {
          CeldaPDispo = CeldaDisponible(c);
          c[CeldaPDispo] = true;
        }
        if (k === 4) {
          CeldaPDispo = CeldaDisponible(d);
          d[CeldaPDispo] = true;
        }
        return CeldaPDispo;
  }
}