/*
*Sean van Wyk
*03/03/2014
*Kuwait
*Kuiwait Flag
*V1.0
*/
//Constants
final int Flag_W=900;
final int Flag_H=600;
final int Flag_X=0;
final int Flag_Y=0;
//White
int RED_Y=Flag_H/2;
int  RED_H=(1*(Flag_H/2));
//BLACK RECT VARIABLES
int BLK_3X=Flag_W/3;
int BLK_3Y=Flag_H/2;
//OUTPUT
size(Flag_W,Flag_H);
fill(#FFFFFF);
rect(Flag_X,Flag_Y,Flag_W,Flag_H);
fill(#D7141A);
rect(Flag_X,RED_Y,Flag_W,RED_H);
fill(#11457E);
triangle(Flag_X,Flag_Y,Flag_X,Flag_H,BLK_3X,BLK_3Y);
