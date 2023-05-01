
let per = new Persist();
let pro = new Process();
let valorS = null; // La variable que quieres asignar

// Selecciona cada botón por su identificador y agrega un evento "click" a cada uno
document.getElementsByClassName("ub1")[0].addEventListener("click", function() {
valorS = 1; // Asigna el valor 1 a la variable
});

document.getElementsByClassName("ub2")[0].addEventListener("click", function() {
valorS = 2;
});

document.getElementsByClassName("ub3")[0].addEventListener("click", function() {
valorS = 3;
});

document.getElementsByClassName("ub4")[0].addEventListener("click", function() {
valorS = 4;
});

document.getElementsByClassName("ub5")[0].addEventListener("click", function() {
valorS = 5;
});

document.getElementsByClassName("ub6")[0].addEventListener("click", function() {
valorS = 6;
});

document.getElementsByClassName("ub7")[0].addEventListener("click", function() {
valorS = 7;
});

document.getElementsByClassName("ub8")[0].addEventListener("click", function() {
valorS = 8;
});

console.log(valorS);

let PZona_Norte = per.Parqueaderos().find(p => p.id === 465);
console.log(PZona_Norte);
let PZona_Sur = per.Parqueaderos().find(p => p.id === 246);
let PEafit_Idiomas = per.Parqueaderos().find(p => p.id === 200);
let PArgos = per.Parqueaderos().find(p => p.id === 101);

let a = Math.floor(Math.random() * 233);
let b = Math.floor(Math.random() * 124);
let c = Math.floor(Math.random() * 101);
let d = Math.floor(Math.random() * 51);

let CantC1 = Math.abs(pro.CeldasParqueadero(PZona_Norte) - a);
document.getElementById("mE1").innerHTML = CantC1;
let CantC2 = Math.abs(pro.CeldasParqueadero(PZona_Sur) - b);
document.getElementById("mE2").innerHTML = CantC2;
let CantC3 = Math.abs(pro.CeldasParqueadero(PEafit_Idiomas) - c);
document.getElementById("mE3").innerHTML = CantC3;
let CantC4 = Math.abs(pro.CeldasParqueadero(PArgos) - d);
document.getElementById("mE4").innerHTML = CantC4;

let MejorParqueaderoU = pro.UbicaMasCerca(valorS);
let MejorParqueaderoD = pro.DispoParqueadero(CantC1, CantC2, CantC3, CantC4);
let celdaR;
document.getElementById(".mc").addEventListener("click", function() {
    celdaR = pro.CeldaReservar(MejorParqueaderoU, PZona_Norte, PZona_Sur, PEafit_Idiomas, PArgos);
  });

document.getElementById(".md").addEventListener("click", function() {
celdaR = pro.CeldaReservar(MejorParqueaderoD, PZona_Norte, PZona_Sur, PEafit_Idiomas, PArgos);
  });
