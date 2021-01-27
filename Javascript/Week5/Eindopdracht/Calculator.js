
function display() {

   return document.getElementById("displayOutput").innerHTML;

}

function nummerinvoeren0() {
   let cijfer0 = document.getElementById("zero").innerHTML;
   let display = document.getElementById("displayOutput").innerHTML;

   if (cijfer0) {


      document.getElementById("displayOutput").innerHTML += cijfer0;


   }


}


function nummerinvoeren1() {
   let cijfer1 = document.getElementById("but[1]").innerHTML;
   let display = document.getElementById("displayOutput").innerHTML;

   if (cijfer1) {


      document.getElementById("displayOutput").innerHTML += cijfer1;

   }


}


function nummerinvoeren2() {

   let cijfer2 = document.getElementById("but[2]").innerHTML;


   if (cijfer2) {
      document.getElementById("displayOutput").innerHTML += cijfer2;
   }

}



function nummerinvoeren3() {

   let cijfer3 = document.getElementById("but[3]").innerHTML;


   if (cijfer3) {
      document.getElementById("displayOutput").innerHTML += cijfer3;
   }

}


function nummerinvoeren4() {

   let cijfer4 = document.getElementById("but[4]").innerHTML;


   if (cijfer4) {
      document.getElementById("displayOutput").innerHTML += cijfer4;
   }

}


function nummerinvoeren5() {

   let cijfer5 = document.getElementById("but[5]").innerHTML;


   if (cijfer5) {
      document.getElementById("displayOutput").innerHTML += cijfer5;
   }

}


function nummerinvoeren6() {

   let cijfer6 = document.getElementById("but[6]").innerHTML;


   if (cijfer6) {
      document.getElementById("displayOutput").innerHTML += cijfer6;
   }

}


function nummerinvoeren7() {

   let cijfer7 = document.getElementById("but[7]").innerHTML;


   if (cijfer7) {
      document.getElementById("displayOutput").innerHTML += cijfer7;
   }

}


function nummerinvoeren8() {

   let cijfer8 = document.getElementById("but[8]").innerHTML;
   console.log(cijfer8);

   if (cijfer8) {
      document.getElementById("displayOutput").innerHTML += cijfer8;
   }

}


function nummerinvoeren9() {

   let cijfer9 = document.getElementById("but[9]").innerHTML;
   console.log(cijfer9);

   if (cijfer9) {
      document.getElementById("displayOutput").innerHTML += cijfer9;
   }

}


function nummerinvoerenpunt() {

   let punt = document.getElementById("punt").innerHTML;

   document.getElementById("displayOutput").innerHTML = display() + punt;


}


function operatorinvoerenplus() {
   const operator = document.getElementById("+").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + operator;


}

function operatorinvoerenminus() {

   const minus = document.getElementById("minus").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + minus;

}

function operatorinvoerenmultiply() {

   const multiply = document.getElementById("multiply").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + multiply;


}

function operatorinvoerendivide() {

   const divide = document.getElementById("divide").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + divide;



}

function operatorinvoerenresult() {

   let resultaat = document.getElementById("displayOutput").innerText;
   resultaat = eval(resultaat);
   // console.log(resultaat);

   document.getElementById("displayOutput").innerText = resultaat;


}

function invoerenplusminus() {

   const minplus = document.getElementById("minplus").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + minplus;
  

}

function invoerenac() {

   const clearbutton = document.getElementById("clear").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() - display();
 


}

function invoerenpercentage() {

   const percentage = document.getElementById("percentage").innerHTML;
   document.getElementById("displayOutput").innerHTML = display() + percentage;

}















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


