import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class South_Africa extends PApplet {
  public void setup() {
/*
*Sean van Wyk
*03/03/2014
*South Africa
*South Africa Flag
*V 1.0
*/
//Constants
final int Flag_H=600;
final int Flag_X=0;
//Full flag Variables
int Flag_W= 3*(Flag_H/2);
int Flag_Y= Flag_X;
//Half Flag Variables
int HLF_H=Flag_H/2;
int HLF_W=Flag_W/2;
//White Triangle Varaibles
int WITT1_Y=Flag_X-(Flag_H/4);
int WITT2_Y=Flag_H+(Flag_H/4);
int WITT3_X= 5*(Flag_W/8);
//Green Triangle Variables
int GRNT1_Y= WITT1_Y+(Flag_H/15);
int GRNT2_Y= WITT2_Y-(Flag_H/15);
int GRNT3_X= WITT3_X-(Flag_H/15);
//Gold Triangle Variables
int GLDT1_Y= GRNT1_Y+(3*Flag_H/10);
int GLDT2_Y= GRNT2_Y-(3*Flag_H/10);
int GLDT3_X= GRNT3_X-(3*Flag_H/10);
//Black Triangle Variables
int BLKT1_Y= GLDT1_Y+(Flag_H/15);
int BLKT2_Y= GLDT2_Y-(Flag_H/15);
int BLKT3_X= GLDT3_X-(Flag_H/15);
//White Rect Variables
int WITR_H=Flag_H/3;
int WITR_Y=Flag_H/2-Flag_H/6;
int WITR_X=Flag_W/2-Flag_W/30;
//Green Rect Variables
int GRNR_H=21*Flag_H/80;
int GRNR_Y=Flag_H/2-(21*Flag_H/160);
int GRNR_X=3*Flag_W/8;
int GRNR_W=WITT3_X+Flag_H/15;
//OUTPUT
noStroke();
size(Flag_W,Flag_H);
fill(0xffE23D28);
rect(Flag_X,Flag_Y,Flag_W,HLF_H);
fill(0xff0C1C8C);
rect(Flag_X,HLF_H,Flag_W,HLF_H);
fill(0xffFFFFFF);
triangle(Flag_X,WITT1_Y,Flag_X,WITT2_Y,WITT3_X,HLF_H);
fill(0xff007C59);
triangle(Flag_X,GRNT1_Y,Flag_X,GRNT2_Y,GRNT3_X,HLF_H);
fill(0xffFCB514);
triangle(Flag_X,GLDT1_Y,Flag_X,GLDT2_Y,GLDT3_X,HLF_H);
fill(0xff000000);
triangle(Flag_X,BLKT1_Y,Flag_X,BLKT2_Y,BLKT3_X,HLF_H);
fill(0xffFFFFFF);
rect(WITR_X,WITR_Y,WITT3_X,WITR_H);
fill(0xff007C59);
rect(GRNR_X,GRNR_Y,GRNR_W,GRNR_H);

    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "South_Africa" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
