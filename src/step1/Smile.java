package step1;

import processing.core.PApplet;
import processing.core.PImage;

public class Smile extends PApplet {
	PImage img;
	public void setup(){
		size(500,500);
		background(255);
		stroke(0);
		img = loadImage("E://Unfoldingmaps.project//unfolding_app_template_with_examples_0.9.6//src//ammu.jpg", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
		//background(255,0,0);*/
		
	}
	
	public void draw(){
		
		//ellipse(200, 200, 200, 200);
		//fill(255, 0, 0);
		int[] color= suncolorset(second()); 
		fill(color[0],color[1],color[2]);
		ellipse(200,200,50,50);
		//fill(0,0,0);
	}

	private int[] suncolorset(float seconds) {
		// TODO Auto-generated method stub
		
		int[] rgb=new int[3];
		float difffrom30=Math.abs(30-seconds);
		float ratio=difffrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		
		return rgb;
	}
	
	
}
