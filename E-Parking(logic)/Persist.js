class Persist {
  //modulo de persistencia 
  constructor() {
  }
  //guardamos el estado de los parqueaderos 
  guardarDatos() {
    window.requestFileSystem(window.PERSISTENT, 1024 * 1024, function(fs) {
      // Creamos un archivo
      fs.root.getFile('datos.txt', {create: true}, function(fileEntry) {
        // Obtenemos el objeto FileWriter
        fileEntry.createWriter(function(fileWriter) {
          // Convertimos el arreglo a texto y lo escribimos en el archivo
          fileWriter.write(new Blob([this.arr.join('\n')], {type: 'text/plain'}));
          console.log('Arreglo guardado en el archivo datos.txt');
        }, errorHandler);
      }, errorHandler);
    }, errorHandler);
  }
  //creamos un arreglo donde simulamos el estado de los parqueaderos mediante numeros aleatorios
  Parqueaderos(a) {
  let array1 = new Array(a);
  for (let i = 0; i < a; i++) {
    array1[i] = Math.random() < 0.5 ? true : false;
  }
  return array1;
}
//
  errorHandler(error) {
  console.error('Error:', error);
}
}
