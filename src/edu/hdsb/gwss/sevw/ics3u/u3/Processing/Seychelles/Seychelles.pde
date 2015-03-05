/*
*Sean van Wyk
*03/03/2014
*Bahamas
*Bahaman Flag
V 1.0
*/
//Constants
final int Flag_W=900;
final int Flag_H=600;
final int Flag_X=0;
final int Flag_Y=0;
//Yellow Triangle
int YEL1_X=Flag_W/3;
int YEL2_X=2*Flag_W/3;
//Blue Triangle
int BLU2_X=YEL1_X;
// Green Triangle
int GRN2_Y=2*Flag_H/3;
// White Triangle
int WIT1_Y=GRN2_Y;
int WIT2_Y=Flag_H/3;

//OUTPUT
noStroke();
size(Flag_W,Flag_H);
fill(#D7141A);
rect(Flag_X,Flag_Y,Flag_W,Flag_H);
fill(#003F87);
triangle(Flag_X,Flag_Y,Flag_X,Flag_H,BLU2_X,Flag_Y );
fill(#FFCC49);
triangle(YEL1_X,Flag_Y,Flag_X,Flag_H,YEL2_X,Flag_Y );
fill(#008751);
triangle(Flag_W,Flag_H,Flag_X,Flag_H,Flag_W,GRN2_Y);
fill(#FFFFFF);
triangle(Flag_W,WIT2_Y,Flag_X,Flag_H,Flag_W,WIT1_Y);
