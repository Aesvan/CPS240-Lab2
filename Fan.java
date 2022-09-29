class Fan {
  //CONSTANTS
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;

  private int speed;
  private boolean on;
  private double radius;
  private String color;
  
  public static void main(String[] args) {
   //Fan #1: FAST, 10, yellow, on
    Fan test1 = new Fan(10, "yellow");
    test1.setPower(true);
    test1.setSpeed(FAST);

   //Fan #2: MEDIUM, 5, blue, off 
    Fan test2 = new Fan();
    test2.setSpeed(MEDIUM);
      
    System.out.println(test1);
    System.out.print(test2);
      
  }

  public Fan (double radius, String color) {
    this.radius = radius;
    this.color = color;
    this.on = false;
    this.speed = SLOW;
  }

  public Fan(){
    //Defaults: slow, not on(false), radius of 5, blue
    this.speed = SLOW;
    this.on = false;
    this.radius = 5.0;
    this.color = "blue";
    
  }

  //Accessor + Mutator methods
  public String getSpeed() {
    if(this.speed == 1){
      return "SLOW";
    }
    else if(this.speed == 2){
      return "MEDIUM";
    }
    else{
      return "FAST";
    }
  }

  public void setSpeed (int speed) {
    this.speed = speed;
  }

  public String getPower () {
    if(this.on == false){
      return "off";
    }
    else{
      return "on";
    }
  }


  
  public void setPower (boolean on) {
    this.on = on;
  }



  public String toString (){
  //Format -- Speed: (SPEED), Radius: (RADIUS), Color: (COLOR), fan is (ON)
    
    return "Speed: " + this.getSpeed() + ", Radius: " + this.radius + ", Color: " + this.color + ", fan is " + this.getPower();


  }


  
}
