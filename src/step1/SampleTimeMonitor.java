package step1;

import processing.core.PApplet;
import processing.core.PImage;

public class SampleTimeMonitor extends PApplet {
	
	  PImage Photo; 
	public void setup(){
		
		Photo=loadImage("E:\\Unfoldingmaps.project\\unfolding_app_template_with_examples_0.9.6\\src\\ammu.jpg");
	}

	
	public void Draw(){
		Photo.resize(0, height);
		image(Photo, 50, 50);
		fill(255, 0, 0);
		ellipse(width/4, height/5, height/5, height/5);
		
	}
	
}
