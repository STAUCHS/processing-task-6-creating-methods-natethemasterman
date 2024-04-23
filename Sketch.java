import processing.core.PApplet;

public class Sketch extends PApplet {

  public void setup() {
  // Setup code with background size and color
    size(400, 400);
    background(0, 191, 255);
  }
	
  // Calling parameters
  void draw() {
    drawFlower(40, 80, 25);
    drawFlower(80, 80, 25);
    drawFlower(120, 80, 25);
    drawFlower(160, 80, 25);
    drawFlower(200, 80, 25);
    drawFlower(240, 80, 25);
    drawFlower(280, 80, 25);
    drawFlower(320, 80, 25);
    drawFlower(360, 80, 25);
    drawFlower(40, 160, 25);
    drawFlower(80, 160, 25);
    drawFlower(120, 160, 25);
    drawFlower(160, 160, 25);
    drawFlower(200, 160, 25);
    drawFlower(240, 160, 25);
    drawFlower(280, 160, 25);
    drawFlower(320, 160, 25);
    drawFlower(360, 160, 25);
    drawFlower(40, 240, 25);
    drawFlower(80, 240, 25);
    drawFlower(120, 240, 25);
    drawFlower(160, 240, 25);
    drawFlower(200, 240, 25);
    drawFlower(240, 240, 25);
    drawFlower(280, 240, 25);
    drawFlower(320, 240, 25);
    drawFlower(360, 240, 25);
    drawFlower(40, 320, 25);
    drawFlower(80, 320, 25);
    drawFlower(120, 320, 25);
    drawFlower(160, 320, 25);
    drawFlower(200, 320, 25);
    drawFlower(240, 320, 25);
    drawFlower(280, 320, 25);
    drawFlower(320, 320, 25);
    drawFlower(360, 320, 25);
  }

  // Draw Flower
  void drawFlower(float flowerX, float flowerY, float flowerSize) {
    float flowerDistance = flowerSize / 2;

  fill(255, 105, 180);

  // Middle part
  fill(59, 0, 0);
  ellipse(flowerX, flowerY, 
    flowerSize, flowerSize);

  // Upper-left part
  ellipse(flowerX - flowerDistance, flowerY - flowerDistance, 
    flowerSize, flowerSize);

  // Upper-right part
  ellipse(flowerX + flowerDistance, flowerY - flowerDistance, 
    flowerSize, flowerSize);

  // Lower-left part
  ellipse(flowerX - flowerDistance, flowerY + flowerDistance, 
    flowerSize, flowerSize);

  // Lower-right part
  ellipse(flowerX + flowerDistance, flowerY + flowerDistance, 
    flowerSize, flowerSize);
  }
}

