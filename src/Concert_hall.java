class Concert_hall extends Place{
    //наследует переменные и методы от класса "Место", и имеет 2 свои переменные,
    // которые сообщают о наличии балкона и оркустровой ямы
    // описана реализация унаследованных методов

    public Boolean balcony, orchestra_pit;

    public Concert_hall(){
        this.balcony = false;
        this.orchestra_pit = true;
    }

    public Concert_hall(String name, String capacity, String event, String address, Boolean have_b, Boolean have_o){
        super(name, capacity, event, address);
        this.balcony = have_b;
        this.orchestra_pit = have_o;

    }
    public Concert_hall(Concert_hall concert_hall, String name, String capacity, String event, String address){
        super(name, capacity, event, address);
        this.balcony = concert_hall.balcony;
        this.orchestra_pit = concert_hall.orchestra_pit;
    }

    public void display(){
    }
    @Override
    public void print_info() {
        System.out.println("Concert_hall: " + getName());
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

