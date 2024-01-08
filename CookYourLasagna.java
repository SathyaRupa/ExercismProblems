public class Lasagna {
    int expectedMinutes = 40;
    int preparationTime;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return expectedMinutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        int remainingMinutes;
        return (expectedMinutes - actualMinutes);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int NumberOfLayers){
        int MinutesForEachLayer = 2;
        preparationTime = (NumberOfLayers * MinutesForEachLayer);
        return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int NumberOfLayers, int actualMinutesInOven){
        return ((NumberOfLayers * 2) + actualMinutesInOven);
    }
    
}