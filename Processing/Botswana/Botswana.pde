/*
*Sean van Wyk
*02/03/2015
*Botswanan
*Botswanan Flag
*V 1.0
variables Stated*/
final int Flag_W=900;
final int Flag_H=600;
final int Flag_X=0;
final int Flag_Y=0;
//WHITE RECT VARIABLES
int  WIT_Y=(4*(Flag_H/10));
int  WIT_H=(2*(Flag_H/10));
//BLACK RECT VARIABLES
int BLK_H=(Flag_H/7);
int BLK_Y=((Flag_H/2)-BLK_H/2);
//BLUE RECT VARIABLES
size(Flag_W,Flag_H);
fill(#75AADB);
rect(Flag_X,Flag_Y,Flag_W,Flag_H);
fill(#FFFFFF);
rect(Flag_X,WIT_Y,Flag_W,WIT_H);
fill(#000000);
rect(Flag_X,BLK_Y,Flag_W,BLK_H);
