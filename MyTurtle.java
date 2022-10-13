
public class MyTurtle extends BaseTurtle{
	
	public void draw(){
		pen.setStrokeWidth(10000);
		pen.setColor(0,0,0);
		this.moveTo(1, 0);
		this.moveTo(0, 0);
	
		this.moveTo(3, 0);
		this.setDelay(1);
		pen.setStrokeWidth(3);
		for (int i = 0; i < 600; i++) {
			pen.setRandomColor();
			this.forward(3);
			this.turn(90);
			this.forward(0.05);
			this.turn(90);
			this.forward(3);
			this.turn(180.6);
			//this.moveTo(0, 0);	// Draw a square (NOT a built-in turtle command; t's defined later in this file!).
			//this.forward(8);
			//this.turn(4);  	// Turn 6 degrees before drawing the next square.
		}
		
		pen.setColor(0,0,0);
		this.moveTo(-0.65, 0);
		pen.setStrokeWidth(1);
		
		for (int i = 0; i < 300; i++) {
			pen.setRandomColor();
			this.forward(1.5);
			this.turn(90);
			this.forward(0.025);
			this.turn(90);
			this.forward(1.5);
			this.turn(181.2);
			//this.moveTo(0, 0);	// Draw a square (NOT a built-in turtle command; t's defined later in this file!).
			//this.forward(8);
			//this.turn(4);  	// Turn 6 degrees before drawing the next square.
		}
	}
	
}
