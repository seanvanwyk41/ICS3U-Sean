/*
*Sean van Wyk
*03/03/2014
*Bahamas
*Bahaman Flag
*/
//Constants
final int Flag_W=900;
final int Flag_H=600;
final int Flag_X=0;
final int Flag_Y=0;
//YELLOW RECT VARIABLES
int  YEL_Y=3*Flag_H/8;
int  YEL_H=(1*(Flag_H/4));
//BLACK RECT VARIABLES
int BLK_3X=Flag_W/3;
int BLK_3Y=Flag_H/2;
//OUTPUT
size(Flag_W,Flag_H);
fill(#00ADC6);
rect(Flag_X,Flag_Y,Flag_W,Flag_H);
fill(#FEFF05);
rect(Flag_X,YEL_Y,Flag_W,YEL_H);
fill(#000000);
triangle(Flag_X,Flag_Y,Flag_X,Flag_H,BLK_3X,BLK_3Y);
