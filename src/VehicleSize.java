enum VehicleSize {
    Compact(1),
    Large(2); // ? why use number

    private final int size;

    VehicleSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
