
function display() {

   return document.getElementById("displayOutput").innerHTML;


}

function nummerinvoeren0() {
   let cijfer0 = document.getElementById("zero").innerHTML;
   let display = document.getElementById("displayOutput").innerHTML;


   if (cijfer0) {


      document.getElementById("displayOutput").innerHTML += cijfer0;
      document.getElementById("clear").innerHTML = "C";


   }


}


function nummerinvoeren1() {
   let cijfer1 = document.getElementById("but[1]").innerHTML;
   let display = document.getElementById("displayOutput").innerHTML;

   if (cijfer1) {


      document.getElementById("displayOutput").innerHTML += cijfer1;
      document.getElementById("clear").innerHTML = "C";

   }


}


function nummerinvoeren2() {

   let cijfer2 = document.getElementById("but[2]").innerHTML;


   if (cijfer2) {
      document.getElementById("displayOutput").innerHTML += cijfer2;
      document.getElementById("clear").innerHTML = "C";
   }

}



function nummerinvoeren3() {

   let cijfer3 = document.getElementById("but[3]").innerHTML;


   if (cijfer3) {
      document.getElementById("displayOutput").innerHTML += cijfer3;
      document.getElementById("clear").innerHTML = "C";
   }

}


function nummerinvoeren4() {

   let cijfer4 = document.getElementById("but[4]").innerHTML;


   if (cijfer4) {
      document.getElementById("displayOutput").innerHTML += cijfer4;
      document.getElementById("clear").innerHTML = "C";
   }

}


function nummerinvoeren5() {

   let cijfer5 = document.getElementById("but[5]").innerHTML;


   if (cijfer5) {
      document.getElementById("displayOutput").innerHTML += cijfer5;
      document.getElementById("clear").innerHTML = "C";
   }

}


function nummerinvoeren6() {

   let cijfer6 = document.getElementById("but[6]").innerHTML;


   if (cijfer6) {
      document.getElementById("displayOutput").innerHTML += cijfer6;
      document.getElementById("clear").innerHTML = "C";
   }

}


function nummerinvoeren7() {

   let cijfer7 = document.getElementById("but[7]").innerHTML;


   if (cijfer7) {
      document.getElementById("displayOutput").innerHTML += cijfer7;
      document.getElementById("clear").innerHTML = "C";
   }

}


function nummerinvoeren8() {

   let cijfer8 = document.getElementById("but[8]").innerHTML;
   console.log(cijfer8);

   if (cijfer8) {
      document.getElementById("displayOutput").innerHTML += cijfer8;
      document.getElementById("clear").innerHTML = "C";

   }

}


function nummerinvoeren9() {

   let cijfer9 = document.getElementById("but[9]").innerHTML;
   console.log(cijfer9);

   if (cijfer9) {
      document.getElementById("displayOutput").innerHTML += cijfer9;
      document.getElementById("clear").innerHTML = "C";

   }


}


function nummerinvoerenpunt() {

   let punt = document.getElementById("punt").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + punt;


}


function operatorinvoerenplus() {
   const operator = document.getElementById("+").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + operator;
   document.getElementById("+").style.background = "white";
   document.getElementById("+").style.color = "orange";


}





function operatorinvoerenminus() {

   const minus = document.getElementById("minus").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + minus;
   document.getElementById("minus").style.background = "white";
   document.getElementById("minus").style.color = "orange";

}

function operatorinvoerenmultiply() {

   const multiply = document.getElementById("multiply").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + multiply;
   document.getElementById("multiply").style.background = "white";
   document.getElementById("multiply").style.color = "orange";


}

function operatorinvoerendivide() {

   const divide = document.getElementById("divide").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + divide;
   document.getElementById("divide").style.background = "white";
   document.getElementById("divide").style.color = "orange";
   

}

function operatorinvoerenresult() {
   let resultaat = document.getElementById("displayOutput").innerHTML;
// Als hij de eerste string heeft en de laatste string leeg is (2)

   let temp = resultaat.split(/([+,-,*,/])/);
   if (temp.length === 3 && temp[2] === "") {
      resultaat += temp[0];
   }

   resultaat = eval(resultaat);
   // wanneer nummer geen rond getal heeft (zie uitroeptekenNumber)
   if (!Number.isInteger(resultaat)){
      resultaat = resultaat.toFixed(2);
   }
   // console.log(resultaat);

   document.getElementById("displayOutput").innerHTML = resultaat;
   document.getElementById("result").style.background = "white";
   document.getElementById("result").style.color = "orange";
   document.getElementById("clear").innerHTML = "AC";


}



function invoerenac() {

   const clearbutton = document.getElementById("clear").innerHTML;
   document.getElementById("displayOutput").innerHTML = "";

}

function invoerenpercentage() {

   const percentage = document.getElementById("percentage").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + percentage;

}


function invoerenplusminus() {
   minplus = document.getElementById("displayOutput").innerText;
   const min = "-";
   let minerbij = min.concat(minplus);
   let mineraf = minplus.slice(1);
   if (minplus.indexOf("-")) {
      document.getElementById("displayOutput").innerText = minerbij;
   }
   else {
      document.getElementById("displayOutput").innerText = mineraf;
   }
}








// Regex zorgt ervoor dat je eerste invoer wordt meegenomen als tweede input in dezelfde opdracht.
// Dus bijvoorbeeld je typt in 5 + dan 



















// function nummerinvoeren() {
//    const cijfer0 = document.getElementById("zero").innerHTML;
//    const cijfer1 = document.getElementById("but[1]").innerHTML;
//    const cijfer2 = document.getElementById("but[2]").innerHTML;
//    const cijfer3 = document.getElementById("but[3]").innerHTML;
//    const cijfer4 = document.getElementById("but[4]").innerHTML;
//    const cijfer5 = document.getElementById("but[5]").innerHTML;
//    const cijfer6 = document.getElementById("but[6]").innerHTML;
//    const cijfer7 = document.getElementById("but[7]").innerHTML;
//    const cijfer8 = document.getElementById("but[8]").innerHTML;
//    const cijfer9 = document.getElementById("but[9]").innerHTML;


//    const display = document.getElementById("displayOutput").innerHTML;

//    const keersom = document.getElementById("multiplyl").innerHTML;
//    const optellen = document.getElementById("plus").innerHTML;
//    const aftrekken = document.getElementById("minus").innerHTML;
//    const delen = document.getElementById("divide").innerHTML;
//    const nummerKnop = document.getElementsByClassName("buttnum");
//    const operator = document.getElementsByClassName("btn_operator");


