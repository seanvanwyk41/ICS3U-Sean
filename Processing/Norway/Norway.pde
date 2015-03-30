/*
*Sean van Wyk
*03/03/2014
*Norway
*Norway Flag
*/
//Constants
final int Flag_W=900;
final int Flag_H=600;
final int Flag_X=0;
final int Flag_Y=0;
//White Verticle Rect
int WITV_X=Flag_W/4;
int WITV_W=Flag_W/8;
//White Horizontal Rect
int WITH_Y=3*Flag_H/8;
int WITH_H=Flag_W/8;
//Blue Verticle Rect
int BLUV_X=9*Flag_W/32;
int BLUV_W=Flag_W/16;
//Blue Horizon Rect
int BLUH_Y=27*Flag_H/64;
int BLUH_H=Flag_W/16;

//OUTPUT
noStroke();
size(Flag_W,Flag_H);
fill(#D7141A);
rect(Flag_X,Flag_Y,Flag_W,Flag_H);
fill(#FFFFFF);
rect(WITV_X,Flag_Y,WITV_W,Flag_H);
rect(Flag_X,WITH_Y,Flag_W,WITH_H);
fill(#002868);
rect(BLUV_X,Flag_Y,BLUV_W,Flag_H);
rect(Flag_X,BLUH_Y,Flag_W,BLUH_H);

