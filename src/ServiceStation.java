public class ServiceStation {
    public void check(Maintainable[] vehicles) {
        for (Maintainable vehicle: vehicles) {
            vehicle.service();
        }
    }
}
