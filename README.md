For Best Result: USE NETBEANS 8.2 and JDK 1.8

Introduction: The project consisted of writing a java computer code to build a tank war game. The goal of this game is to destroy the enemy tank. Both players drive his or her own tank.  In the arena, there are breakable and unbreakable walls. Bullets fired by the tanks destroy the breakable walls. Tanks have three lives, with each life having three health levels. The levels have the color codes of green, yellow and red. Health goes down when the tank is hit by a bullet.  For one player the controls for movement are in the arrow keys and the key “ Enter” is to fire a bullet. For the second player the controls are in keys w,a,s,d and space tab is to fire.  Scores are kept. Each life destroyed allows the winner player to score ten points. 
The packages and their respective classes of the project are the following:
Package name: resource
This package contains the files used by the java program for sound and images. It has also a file with the map of the walls and the starting position of the tanks. 

Package name: tank
This package contains the java code.
Classes:
GameStart.java:  It contains the “main” and creates objects of the SoundEffects.java class to call methods that plays background music continuously or just once. It also creates object of the ControlPanel.java class.

SoundEffects.java: It has two methods: ones that plays music continuously and another that plays sound just once.
GamePanel.java:  This class extends JPanel and implements Runnable. It has methods to get the tank position, to do animation and the paintComponent method which draws the background image, including the mini map. 

ControlPanel.java:  This class extends GamePanel.java and implements KeyListener. It has key released, key pressed and run methods. The run method processes the keyboard inputs that moves the tank and does the animation. 

GameAnimation.java: It has methods for the animation of the bullets and explosion. 

GameFrame.java: This class sets the title in the game frame,  gets an object of the type GamePanel.java as an argument, has add, pack, setVisible, and  instantiates an object of type thread  and then calls a thread start method. 
ImageObject.java: This class has methods to get and set the image location and dimension
Wall.java: This class extends the ImageObject.java class. It draws the breakable and unbreakable walls. 

TankBullet.java: This class extends the GameAnimation.java class. It draws the bullet, checks collision of the bullets with the walls and collision the bullets with tank. 

Tank.java:  This class extends ImageObject.java. It loads the tank image, sets the tank movements , checks collision of the tank and walls and tank with tank. 
Player.java:  It has methods to display health, lives and points. 

Icon.java: It has methods to load the images of the sprites. 

Lessons learned: to reuse code (we reused SoundEffects.java). Had more practice with GitHub.
Challenges:  To work with images and frames.
Helpful source: Plane game (wingman) and internet tutorials, such as www.tutorialspoint.com
