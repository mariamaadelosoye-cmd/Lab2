public class Blocksneed {
   public int  amountOfBricks= 75;
   public int containercapacity=4;
    public void main(){
        // this returns full containers (integer part of the number)
      int fullContainers= amountOfBricks/containercapacity;
      System.out.println("There are "+fullContainers+" full containers");

        // this returns the remainder of blocks
      int blocksInPartial = amountOfBricks%containercapacity;
        System.out.println("There are "+blocksInPartial+ " blocks in the partially full container");

        // this returns the total number of containers, by adding 1 to make up for the last container that is partially full
        int totalContainers= fullContainers+ 1;
        System.out.println("There are "+totalContainers+" total number of containers needed.");
    }
}
