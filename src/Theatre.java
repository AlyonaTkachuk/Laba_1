class Theatre extends Place{

    public Boolean balcony, orchestra_pit;

    public Theatre(){
        this.balcony = true;
        this.orchestra_pit = false;
    }

    public Theatre(String name, String capacity, String event, String address, Boolean have_b, Boolean have_o){
        super(name, capacity, event, address);
        this.balcony = have_b;
        this.orchestra_pit = have_o;

    }
    public Theatre(Theatre theatre, String name, String capacity, String event, String address){
        super(name, capacity, event, address);
        this.balcony = theatre.balcony;
        this.orchestra_pit = theatre.orchestra_pit;
    }

    public void display(){
    }
    @Override
    public void print_info() {
        System.out.println("Theatre: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Event: " + getEvent());
        if (!balcony){
        System.out.println("balcony: nope");}
        else {
            System.out.println("balcony: have");
        }
        if (!orchestra_pit){
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
