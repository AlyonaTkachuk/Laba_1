class Concert_hall extends Place{

    public Boolean balcon, orchestra_pi;

    public Concert_hall(){
        this.balcon = false;
        this.orchestra_pi = true;
    }

    public Concert_hall(String name, String capacity, String event, String address, Boolean have_b, Boolean have_o){
        super(name, capacity, event, address);
        this.balcon = have_b;
        this.orchestra_pi = have_o;

    }
    public Concert_hall(Concert_hall concert_hall, String name, String capacity, String event, String address){
        super(name, capacity, event, address);
        this.balcon = concert_hall.balcon;
        this.orchestra_pi = concert_hall.orchestra_pi;
    }

    public void display(){
    }
    @Override
    public void print_info() {
        System.out.println("Concert_hall: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Event: " + getEvent());
        if (!balcon){
            System.out.println("balcony: nope");}
        else {
            System.out.println("balcony: have");
        }
        if (!orchestra_pi){
            System.out.println("orchestra_pity: nope");}
        else {
            System.out.println("orchestra_pit: have");
        }
    }
    @Override
    public void destructor() {
        System.gc();
    }
}

