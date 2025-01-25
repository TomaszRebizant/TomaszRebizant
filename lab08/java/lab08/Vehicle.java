package lab08;

public class Vehicle {
   private String model;
   private String mileage;
   private String vin;

   public Vehicle(){
               if(Math.random() <0.3){
                    this.model = "BMW";
                }
                else if(Math.random() <0.6){
                     this.model = "Audi";
                }
                else{
                     this.model = "Chevrolet";
               }
                this.mileage = String.valueOf((int)(Math.random()*100000));
                this.vin = String.valueOf((int)(Math.random()*100000));
   }
   public String getVin(){
       return this.vin;
   }
    public String getModel(){
         return this.model;
    }
    public String getMileage(){
         return this.mileage;
    }
    public String toString(){
         return "Model: " + this.model + " Mileage: " + this.mileage + " VIN: " + this.vin;
    }
}
