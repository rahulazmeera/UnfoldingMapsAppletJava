package step1;

import de.fhpotsdam.unfolding.UnfoldingMap;
import processing.core.PApplet;
import de.fhpotsdam.unfolding.providers.Google;
@SuppressWarnings("serial")
public class One extends PApplet {

	UnfoldingMap map;
	public void setup() {
        size(800, 600);
        map = new UnfoldingMap(this, new Google.GoogleMapProvider());
        //map.zoom(3);
    }
     
    public void draw() {
    	map.draw();
    }
     
}

