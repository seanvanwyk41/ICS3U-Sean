final int RADIUS = 50;
final int ANGLE = 30;
final float EYE_R=RADIUS/20;
int xLoc=100;
int yLoc=100;
boolean loop= true;
final int SIZE=200;

public void setup() {
  size (SIZE, SIZE);
  smooth();
  noStroke();
  background(#100462);
  frameRate(5);
}

public void draw() {
  erasePacMan();
  if (loop == true) {
    drawPacManRightOpen();
    loop=false;
  } else if (loop==false) {
    drawPacManRightClosed();
    loop=true;
    }
  
}
public void drawPacManRightOpen() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0+ANGLE), radians(360-ANGLE) );

  fill(#000000);
  final float eyeYU=yLoc-yLoc/16+SIZE/2;
  final float eyeXR=xLoc+xLoc/32+SIZE/2;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, radians(0), radians(360));
}

public void drawPacManRightClosed() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0), radians(360));

  fill(#000000);
  final float eyeYU=yLoc-yLoc/8+SIZE/2;
  final float eyeXR=xLoc+xLoc/8+SIZE/2;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

public void erasePacMan() {
  fill(#100462);
  arc(xLoc, yLoc, RADIUS+1, RADIUS+1, radians(0), radians(360));

}

public void drawPacManLeftOpen() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0), radians(180-ANGLE) );
  arc(xLoc,yLoc,RADIUS,RADIUS,radians(180+ANGLE),radians(360));

  fill(#000000);
  final float eyeYU=yLoc-yLoc/8+SIZE/2;
  final float eyeXR=xLoc+xLoc/8-SIZE/2;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

public void drawPacManLeftClosed() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0), radians(360) );

  fill(#000000);
  final float eyeYU=yLoc-yLoc/8+SIZE/2;
  final float eyeXR=xLoc+xLoc/8-SIZE/2;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

public void drawPacManUpOpen() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0), radians(90-ANGLE));
 arc(xLoc, yLoc, RADIUS, RADIUS, radians(90+ANGLE), radians(360));

  fill(#000000);
  
  final float eyeYU=yLoc-yLoc/8+SIZE/2;
  final float eyeXR=xLoc+xLoc/8-SIZE/2;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

public void drawPacManUpClosed() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0), radians(360));

  fill(#000000);
  final float eyeYU=yLoc-yLoc/8+SIZE/2;
  final float eyeXR=xLoc+xLoc/8+SIZE/2;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

 public void drawPacManDownOpen() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0+ANGLE), radians(360-ANGLE) );

  fill(#000000);
  final float eyeYU=yLoc-yLoc/4;
  final float eyeXR=xLoc+xLoc/8;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

public void drawPacManDownClosed() {
  fill(#FFF700);
  arc(xLoc, yLoc, RADIUS, RADIUS, radians(0), radians(360));

  fill(#000000);
  final float eyeYU=yLoc-yLoc/4;
  final float eyeXR=xLoc+xLoc/8;
  arc(eyeXR, eyeYU, EYE_R, EYE_R, 0, 360);
}

