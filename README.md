Design a class named Fan to represent a fan. The class contains:

The Fan class

Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
A private int data field named speed that specifies the speed of the fan (the default is SLOW).
A private boolean data field named on that specifies whether the fan is on (the default is false).
A private double data field named radius that specifies the radius of the fan (the default is 5.0).
A private String data field named color that specifies the color of the fan (the default is "blue").
Accessor and mutator methods for the speed and on data attributes (2 and 3 above).
A default (no-arg) constructor that creates a default fan (default values provided above).
A parameterized constructor that takes the radius and color as arguments in the order specified. The remaining attributes should be set to the default values above.
A method named toString() that returns a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string. NOTE: See the output for details on formatting.
Draw the UML diagram for the class then implement the class. Add this UML diagram to the replit project.
Write a test program that instantiates two Fan objects. Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the second object. Display the objects by invoking their toString method.
