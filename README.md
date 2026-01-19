Donkey Pong is a classic arcade-style 2-D game. It demonstrates key OOP principles such as:
* Inheritance: All objects inherit from common GameObject class
* Encapsulation: All object field use private accesss modifiers and getter/setter methods
* Interfaces: PlayerMovement and UseHammer define character abilities
* Method Overriding: Characters each override their own speak() method
* Method Overloading: There are multiple Mario constructors allowing the user to specify the number of lives

Game Objects include:

* GameObject : Abstract base class for all other game objects to inherit with positions x and y, as well as update() method
* GameMap : The map for the game that holds all other game objects and provides boundaries for positions
* Character : Abstract class for other characters to inherit with speak() method
* Mario : Implements PlayerMovement and UseHammer
* DonkeyKong : Enemy that can through barrels using throwBarrel()
* Pauline : Character that marks the end of game if mario reaches her
* Barrel : Can be thrown by Donkey Kong, roll along platforms, and reduce Mario's lives
* Ladder : Allows Mario to climb up and down to different platform levels
* Platform: Other objects move along these platforms, including barrels and Mario

Interfaces:

* PlayerMovement : defines movement methods for player (Mario)
* UseHammer : defines smash() ability for players holding hammers