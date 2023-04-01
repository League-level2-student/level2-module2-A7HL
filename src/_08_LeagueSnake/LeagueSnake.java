package _08_LeagueSnake;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import processing.core.PApplet;

public class LeagueSnake extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
    /*
     * Game variables
     * 
     * Put all the game variables here.
     */
    Segment head;
    int foodX;
    int foodY;
    int direction = UP;
    int numEat = 0;
    ArrayList<Segment> tail = new ArrayList<Segment>();
    
  

    
    /*
     * Setup methods
     * 
     * These methods are called at the start of the game.
     */
    @Override
    public void settings() {
    	//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //frame.setSize(WIDTH, HEIGHT);
    	size(WIDTH,HEIGHT);
        
        
    }

    @Override
    public void setup() {
    	
        head = new Segment(400,400);
        frameRate(20);
        dropFood();
        
    }

    void dropFood() {
        // Set the food in a new random location
    	foodX = ((int)random(80)*10);
    	foodY = ((int)random(80)*10);
    }

    /*
     * Draw Methods
     * 
     * These methods are used to draw the snake and its food
     */

    @Override
    public void draw() {
    	
        background(0,0,0);
        
        drawFood();
        move();
        drawSnake();
        manageTail();
        eat();
        text(numEat,20,20);
        
    }

    void drawFood() {
        // Draw the food
    fill(255,0,0);
       
       rect(foodX,foodY,10,10);
    }

    void drawSnake() {
        // Draw the head of the snake followed by its tail
    	fill(0,255,0);
    	
    	rect(head.x,head.y,10,10);
    	
    	drawTail();
    	
    }

    void drawTail() {
        // Draw each segment of the tail
    
        fill(0,255,0);
        for(int i =0; i< tail.size();i++) {
        	
        	rect(tail.get(i).x,tail.get(i).y,10,10);
        }
    }

    /*
     * Tail Management methods
     * 
     * These methods make sure the tail is the correct length.
     */

    void manageTail() {
        // After drawing the tail, add a new segment at the "start" of the tail and
        // remove the one at the "end"
        // This produces the illusion of the snake tail moving.
    	
    	checkTailCollision();
    	tail.add(new Segment(head.x,head.y));
    	tail.remove(0);

    }

    void checkTailCollision() {
        // If the snake crosses its own tail, shrink the tail back to one segment
        for(int i = 0; i<tail.size();i++) {
        	if(head.x== tail.get(i).x&&head.y==tail.get(i).y) {
        		tail.removeAll(tail);
        		numEat = 0;
        	}
        }
    }

    /*
     * Control methods
     * 
     * These methods are used to change what is happening to the snake
     */

    @Override
    public void keyPressed() {
        // Set the direction of the snake according to the arrow keys pressed
    	
        if(direction != DOWN && (keyCode == 87 || keyCode == 38)) {
        	direction = UP;
        }
        if(direction != UP&&(keyCode == 83 || keyCode == 40)) {
        	direction = DOWN;
        }
        if(direction != RIGHT&&(keyCode == 65 || keyCode == 37)) {
        	direction = LEFT;
        }
        if(direction != LEFT&&(keyCode == 68 || keyCode == 39)) {
        	direction = RIGHT;
        }
        	
    }

    void move() {
        // Change the location of the Snake head based on the direction it is moving.

        checkBoundaries();
        if (direction == UP) {
            // Move head up
            head.y-=10;
        } else if (direction == DOWN) {
            // Move head down
             head.y+=10;
        } else if (direction == LEFT) {
            head.x-=10;
        } else if (direction == RIGHT) {
            head.x+=10;
        }
        
    }

    void checkBoundaries() {
        // If the snake leaves the frame, make it reappear on the other side
        if(head.y<0) {
        	head.y=HEIGHT;
        }
        if(head.y>HEIGHT) {
        	head.y=0;
        }
        if(head.x<0) {
        	head.x=WIDTH;
        }
        if(head.x>WIDTH) {
        	head.x=0;
        }
    }

    void eat() {
        // When the snake eats the food, its tail should grow and more
        // food appear
        if(head.x==foodX&&head.y==foodY) {
        	numEat++;
        	tail.add(new Segment(head.x,head.y));
        	dropFood();
        	System.out.println(numEat);
        	
        }
    }

    static public void main(String[] passedArgs) {
        PApplet.main(LeagueSnake.class.getName());
    }
}
