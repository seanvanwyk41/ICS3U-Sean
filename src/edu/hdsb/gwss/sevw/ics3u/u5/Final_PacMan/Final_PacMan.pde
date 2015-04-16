final int RADIUS = 50;
final int ANGLE = 30;
int xLoc=100;
int yLoc=100;

public void setup(){
  size (200,200);
  smooth();
  noStroke();
  background(#100462);
  frameRate(5);
}
public void drawPacManRightOpen(){
  fill(#FFF700);
  arc(xLoc,yLoc,RADIUS,RADIUS,radians(0+ANGLE),radians(360-ANGLE) );
  
  fill(#000000);
  final float eyeR=RADIUS/20;
  final float eyeYU=yLoc-yLoc/4;
  final float eyeXR=xLoc+xLoc/8;
  arc(eyeXR,eyeYU,eyeR,eyeR,0,360);
  
}
drawPacManRightOpen()
