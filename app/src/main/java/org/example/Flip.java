public class Flip {

  public int[] modelFlips(int steps, int trials, int prob) { 
    int[] positions = new int[trials];
    for (int i = 0; i < trials; i++){
      int currentPosition = 0;
      for(int j = 0; j < steps; j++){
        int direction = (int) Math.round(Math.random()*1000);
        if(direction > (prob*1000))
        if(direction == 0) {
          currentPosition--;
        } else {
          currentPosition++;
        }
      }
      positions[i] = currentPosition;
    }
    return positions;
  }
}
