class BirdWatcher {
    private int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }
    public int getToday() {
        if(this.birdsPerDay.length == 0){
            return 0;
        }
        return this.birdsPerDay[this.birdsPerDay.length-1];
    }
    public int incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
        return birdsPerDay[birdsPerDay.length - 1];
        
    }
    public boolean hasDayWithoutBirds() {
       for(int i = 0; i<this.birdsPerDay.length; i++){
           if(this.birdsPerDay[i] == 0){
               return true;
           }
       }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int num = 0;
        if(numberOfDays>this.birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
       
        for(int i = 0; i<numberOfDays; i++){
            num = num + this.birdsPerDay[i];
        } 
        
        return num;      
    }
    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i<this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] >= 5){
                count++;
            }
        }
        return count;
    }
}