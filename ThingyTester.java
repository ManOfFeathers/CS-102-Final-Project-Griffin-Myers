package cs102final;

/*
*	CS102 Final Project
*
*	PROGRAMMER: Griffin Myers (4/26/2017)
*	CLASS: CS102
*	SEMESTER: Spring 2017
*	INSTRUCTOR: Tom Jensen
*
*	DESCRIPTION:
*	This project attempts to manipulate the StdDraw code to
*	create abstract 3D images.
*
*	EXTERNAL LIBRARIES:
*	The StdDraw graphic library. Available at:
*	http://introcs.cs.princeton.edu/java/stdlib/
*
*	CREDITS:
*	This program is copyright (c) 2017 Griffin Myers.
*
*/

import cs102final.StdDraw;

public class ThingyTester {
	public static void main(String args[]) {
		int width = 900, height = 900, depth = 900;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		
		StdDraw.enableDoubleBuffering();
		
		Coord2D.focalx = 0;
		Coord2D.focaly = 0;
		
		Coord2D.d = 1.0 / Math.sqrt(width * width + height * height);
		
		double rand1X = Math.random() * width;
		double rand1Y = Math.random() * height;
		double rand1Z = Math.random() * depth;
		
		double rand2X = Math.random() * width;
		double rand2Y = Math.random() * height;
		double rand2Z = Math.random() * depth;
		
		double rand3X = Math.random() * width;
		double rand3Y = Math.random() * height;
		double rand3Z = Math.random() * depth;
		
		double rand4X = Math.random() * width;
		double rand4Y = Math.random() * height;
		double rand4Z = Math.random() * depth;
		
		double rand5X = Math.random() * width;
		double rand5Y = Math.random() * height;
		double rand5Z = Math.random() * depth;
		
		double rand6X = Math.random() * width;
		double rand6Y = Math.random() * height;
		double rand6Z = Math.random() * depth;
		
		double rand7X = Math.random() * width;
		double rand7Y = Math.random() * height;
		double rand7Z = Math.random() * depth;
		
		double rand8X = Math.random() * width;
		double rand8Y = Math.random() * height;
		double rand8Z = Math.random() * depth;
		
		//velocities
		double vel1X = Math.random() - 0.5;
		double vel1Y = Math.random() - 0.5;
		double vel1Z = Math.random() - 0.75;
		
		double vel2X = Math.random() - 0.5;
		double vel2Y = Math.random() - 0.5;
		double vel2Z = Math.random() - 0.75;
		
		double vel3X = Math.random() - 0.5;
		double vel3Y = Math.random() - 0.5;
		double vel3Z = Math.random() - 0.75;
		
		double vel4X = Math.random() - 0.5;
		double vel4Y = Math.random() - 0.5;
		double vel4Z = Math.random() - 0.75;
		
		double vel5X = Math.random() - 0.5;
		double vel5Y = Math.random() - 0.5;
		double vel5Z = Math.random() - 0.75;
		
		double vel6X = Math.random() - 0.5;
		double vel6Y = Math.random() - 0.5;
		double vel6Z = Math.random() - 0.75;
		
		double vel7X = Math.random() - 0.5;
		double vel7Y = Math.random() - 0.5;
		double vel7Z = Math.random() - 0.75;
		
		double vel8X = Math.random() - 0.5;
		double vel8Y = Math.random() - 0.5;
		double vel8Z = Math.random() - 0.75;
	
		for (int i = 0; i < 3 * 360; i++) {
			StdDraw.clear();
			Coord2D.focalx = Math.sin(i * (Math.PI / 180)) * (width / 2) + width / 2;
			Coord2D.focaly = Math.cos(i * (Math.PI / 180)) * (height / 2) + (height / 2);
			int moreNumLines = 12;
			Line moreLines[] = new Line[moreNumLines];
			//default image -- neutral depth
			moreLines[0] = new Line(100,100,0,100,800,0);
			moreLines[1] = new Line(100,800,0,800,800,0);
			moreLines[2] = new Line(800,800,0,800,100,0);
			moreLines[3] = new Line(800,100,0,100,100,0);
			
			//dilated image with z-coordinate depth
			moreLines[4] = new Line(100,100,700,100,800,700);
			moreLines[5] = new Line(100,800,700,800,800,700);
			moreLines[6] = new Line(800,800,700,800,100,700);
			moreLines[7] = new Line(800,100,700,100,100,700);
			
			//lines connecting different depths
			moreLines[8] = new Line(100,100,0,100,100,700);
			moreLines[9] = new Line(100,800,0,100,800,700);
			moreLines[10] = new Line(800,800,0,800,800,700);
			moreLines[11] = new Line(800,100,0,800,100,700);
			for (int j = 0; j < moreNumLines; j++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				moreLines[j].draw();
			}
			Line gridLines[] = Grid.generateLines(75, width, height, depth);
			for (Line line : gridLines) {
				StdDraw.setPenColor(StdDraw.PINK);
				line.draw();
			}
			StdDraw.show();
		}
		
		for (int i = 0; i < 3 * 360; i++) {
			StdDraw.clear();
			Coord2D.focalx = Math.sin(-i * (Math.PI / 180)) * (width / 2) + width / 2;
			Coord2D.focaly = Math.cos(-i * (Math.PI / 180)) * (height / 2) + (height / 2);
			int moreNumLines = 12;
			Line moreLines[] = new Line[moreNumLines];
			//default image -- neutral depth
			moreLines[0] = new Line(100,100,0,100,800,0);
			moreLines[1] = new Line(100,800,0,800,800,0);
			moreLines[2] = new Line(800,800,0,800,100,0);
			moreLines[3] = new Line(800,100,0,100,100,0);
			
			//dilated image with z-coordinate depth
			moreLines[4] = new Line(100,100,700,100,800,700);
			moreLines[5] = new Line(100,800,700,800,800,700);
			moreLines[6] = new Line(800,800,700,800,100,700);
			moreLines[7] = new Line(800,100,700,100,100,700);
			
			//lines connecting different depths
			moreLines[8] = new Line(100,100,0,100,100,700);
			moreLines[9] = new Line(100,800,0,100,800,700);
			moreLines[10] = new Line(800,800,0,800,800,700);
			moreLines[11] = new Line(800,100,0,800,100,700);
			for (int j = 0; j < moreNumLines; j++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				moreLines[j].draw();
			}
			Line gridLines[] = Grid.generateLines(75, width, height, depth);
			for (Line line : gridLines) {
				StdDraw.setPenColor(StdDraw.PINK);
				line.draw();
			}
			StdDraw.show();
		}
		
		for (int i = 0; i < 2160; i++) {
			StdDraw.clear();
			Coord2D.focalx = rand1X;
			Coord2D.focaly = rand8X;
			
			rand1X += vel1X;
			rand1Y += vel1Y;
			rand1Z += vel1Z;
			
			rand2X += vel2X;
			rand2Y += vel2Y;
			rand2Z += vel2Z;

			rand3X += vel3X;
			rand3Y += vel3Y;
			rand3Z += vel3Z;
			
			rand4X += vel4X;
			rand4Y += vel4Y;
			rand4Z += vel4Z;
			
			rand5X += vel5X;
			rand5Y += vel5Y;
			rand5Z += vel5Z;
			
			rand6X += vel6X;
			rand6Y += vel6Y;
			rand6Z += vel6Z;
			
			rand7X += vel7X;
			rand7Y += vel7Y;
			rand7Z += vel7Z;
			
			rand8X += vel8X;
			rand8Y += vel8Y;
			rand8Z += vel8Z;
			
			Coord2D coord1 = new Coord2D(rand1X, rand1Y, rand1Z);
			Coord2D coord2 = new Coord2D(rand2X, rand2Y, rand2Z);
			Coord2D coord3 = new Coord2D(rand3X, rand3Y, rand3Z);
			Coord2D coord4 = new Coord2D(rand4X, rand4Y, rand4Z);
			Coord2D coord5 = new Coord2D(rand5X, rand5Y, rand5Z);
			Coord2D coord6 = new Coord2D(rand6X, rand6Y, rand6Z);
			Coord2D coord7 = new Coord2D(rand7X, rand7Y, rand7Z);
			Coord2D coord8 = new Coord2D(rand8X, rand8Y, rand8Z);
			int moreNumLines = 12;
			Line moreLines[] = new Line[moreNumLines];
			//default image -- neutral depth
			moreLines[0] = new Line(coord1,coord2);
			moreLines[1] = new Line(coord2,coord3);
			moreLines[2] = new Line(coord3,coord4);
			moreLines[3] = new Line(coord4,coord1);
			
			//dilated image with z-coordinate depth
			moreLines[4] = new Line(coord5,coord6);
			moreLines[5] = new Line(coord6,coord7);
			moreLines[6] = new Line(coord7,coord8);
			moreLines[7] = new Line(coord8,coord5);
			
			//lines connecting different depths
			moreLines[8] = new Line(coord1,coord5);
			moreLines[9] = new Line(coord2,coord6);
			moreLines[10] = new Line(coord3,coord7);
			moreLines[11] = new Line(coord4,coord8);
			for (int j = 0; j < moreNumLines; j++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				moreLines[j].draw();
			}
			Line gridLines[] = Grid.generateLines(75, width, height, depth);
			for (Line line : gridLines) {
				StdDraw.setPenColor(StdDraw.PINK);
				line.draw();
			}
			StdDraw.show();
		}
		
		while (true) {
			StdDraw.clear();
			Coord2D.focalx = StdDraw.mouseX();
			Coord2D.focaly = StdDraw.mouseY();
			
			Coord2D coord1 = new Coord2D(rand1X, rand1Y, rand1Z);
			Coord2D coord2 = new Coord2D(rand2X, rand2Y, rand2Z);
			Coord2D coord3 = new Coord2D(rand3X, rand3Y, rand3Z);
			Coord2D coord4 = new Coord2D(rand4X, rand4Y, rand4Z);
			Coord2D coord5 = new Coord2D(rand5X, rand5Y, rand5Z);
			Coord2D coord6 = new Coord2D(rand6X, rand6Y, rand6Z);
			Coord2D coord7 = new Coord2D(rand7X, rand7Y, rand7Z);
			Coord2D coord8 = new Coord2D(rand8X, rand8Y, rand8Z);
			int moreNumLines = 12;
			Line moreLines[] = new Line[moreNumLines];
			//default image -- neutral depth
			moreLines[0] = new Line(coord1,coord2);
			moreLines[1] = new Line(coord2,coord3);
			moreLines[2] = new Line(coord3,coord4);
			moreLines[3] = new Line(coord4,coord1);
			
			//dilated image with z-coordinate depth
			moreLines[4] = new Line(coord5,coord6);
			moreLines[5] = new Line(coord6,coord7);
			moreLines[6] = new Line(coord7,coord8);
			moreLines[7] = new Line(coord8,coord5);
			
			//lines connecting different depths
			moreLines[8] = new Line(coord1,coord5);
			moreLines[9] = new Line(coord2,coord6);
			moreLines[10] = new Line(coord3,coord7);
			moreLines[11] = new Line(coord4,coord8);
			for (int j = 0; j < moreNumLines; j++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				moreLines[j].draw();
			}
			Line gridLines[] = Grid.generateLines(75, width, height, depth);
			for (Line line : gridLines) {
				StdDraw.setPenColor(StdDraw.PINK);
				line.draw();
			}
			StdDraw.show();
		}
	}
}