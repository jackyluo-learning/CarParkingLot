import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    @Test
    public void test() {
        ParkingLot lot = new ParkingLot(4, 10);
        List<Vehicle> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Vehicle v = i % 2 == 0 ? new Car() : new Truck();
            list.add(v);
            boolean hasSpot = lot.hasSpot(v);
            if (i < 40) {
                // make sure you enable assert if using it for test
                assert hasSpot;
                assert lot.park(v);
            } else {
                assert !hasSpot;
                assert !lot.park(v);
            }
        }
        assert list.size() == 50;
        int i = 0;
        for (Vehicle v : list) {
            assert i >= 40 || lot.leave(v);
            i++;
        }
    }
}
