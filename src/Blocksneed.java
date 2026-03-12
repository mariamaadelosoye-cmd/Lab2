public class Blocksneed {
   public int  amountOfBricks= 75;
   public int containercapacity=4;
    public void main(){

      int fullContainers= amountOfBricks/containercapacity;
      System.out.println("There are "+fullContainers+" full containers");


      int blocksInPartial = amountOfBricks%containercapacity;
        System.out.println("There are "+blocksInPartial+ " blocks in the partially full container");


        int totalContainers= fullContainers+ 1;
        System.out.println("There are "+totalContainers+" total number of containers needed.");
    }
}
