/*
*Sean van Wyk
*15/04/2014
*Pacman
*pacman animations
*V 1.0
*/
//Constants
final int pacManRadius=100;
final int angle=30;
final int size=pacManRadius*5;
noStroke();
//Size
size(size,size*3);

//Pac man Right open

  //pac man body
  fill(#FFF700);
  arc(pacManRadius,pacManRadius,pacManRadius, pacManRadius,radians(0+angle),radians(360-angle),PIE);

  //pac man eye
  fill(#000000);
  final float eyeYU=pacManRadius-pacManRadius/4;
  final float eyeYD=pacManRadius+pacManRadius/4;
  final float eyeXR=pacManRadius+pacManRadius/8;
  final float eyeXL=pacManRadius-pacManRadius/8;
  final float eyeR=pacManRadius/20;
  arc(eyeXR,eyeYU,eyeR,eyeR,0,360);
 
//Pac man right Closed
  
  //pac man body
  fill(#FFF700);
  arc(pacManRadius*2,pacManRadius,pacManRadius, pacManRadius,radians(0),radians(360),PIE);
  
  //pac man eye
  fill(#000000);
  arc(eyeXR*2,eyeYU,eyeR,eyeR,0,360);
  
//Pac man left open
  fill(#FFF700);
  arc(pacManRadius,pacManRadius*3,pacManRadius, pacManRadius,radians(0),radians(180-angle),PIE);
  arc(pacManRadius,pacManRadius*3,pacManRadius, pacManRadius,radians(180+angle),radians(360),PIE);
  
  //pac man eye
  fill(#000000);
  arc(eyeXL,eyeYU*3.6,eyeR,eyeR,0,360);
  
    
//Pac man left Closed
  fill(#FFF700);
  arc(pacManRadius*2,pacManRadius*3,pacManRadius, pacManRadius,radians(0),radians(360),PIE);
  
 //pac man eye
  fill(#000000);
 arc(eyeXL*2,eyeYU*3.6,eyeR,eyeR,0,360);
  
  
//Pac man down open

  //pac man body
  fill(#FFF700);
   arc(pacManRadius,pacManRadius*5,pacManRadius, pacManRadius,radians(0),radians(90-angle),PIE);
  arc(pacManRadius,pacManRadius*5,pacManRadius, pacManRadius,radians(90+angle),radians(360),PIE);
  
  //pac man eye
  fill(#000000);
  arc(eyeXL,eyeYD*4,eyeR,eyeR,0,360);
  
//Pac man down Closed
    fill(#FFF700);
    arc(pacManRadius*2,pacManRadius*5,pacManRadius, pacManRadius,radians(0),radians(360),PIE);

 //pac man eye
    fill(#000000);
    arc(eyeXL*2,eyeYD*4,eyeR,eyeR,0,360);
//Pac man up open

  //pac man body
    fill(#FFF700);
    arc(pacManRadius,pacManRadius*7,pacManRadius, pacManRadius,radians(0),radians(270-angle),PIE);
    arc(pacManRadius,pacManRadius*7,pacManRadius, pacManRadius,radians(270+angle),radians(360),PIE);
  
  //pac man eye
    fill(#000000);
    arc(eyeXL,eyeYD*5.6,eyeR,eyeR,0,360);
  
//Pac man up Closed
    fill(#FFF700);
    arc(pacManRadius*2,pacManRadius*7,pacManRadius, pacManRadius,radians(0),radians(360),PIE);

 //pac man eye
    fill(#000000);
    arc(eyeXL*2,eyeYD*5.6,eyeR,eyeR,0,360);
