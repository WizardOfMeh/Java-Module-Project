public class Race {
    String leaderCar = "";
    int leaderDist = 0;

    public void winner (Car car) {
        int dist = car.speed * 24;
        if (dist > leaderDist) {
            leaderDist = dist;
            leaderCar = car.name;
        }
    }
}
