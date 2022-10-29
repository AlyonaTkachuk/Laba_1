class Night_club extends Place{
    //наследует переменные и методы от класса "Место", и имеет свою переменную,
    // которые сообщают о наличии второго этажа
    //  описана реализация унаследованных методов
    public Boolean second_floor;
    public Night_club(){
        this.second_floor = false;
    }
    public Night_club(String name, String capacity, String event, String address, Boolean have_s){
        super(name, capacity, event, address);
        this.second_floor = have_s;
    }
    public Night_club(String name, String capacity, String event, String address, Night_club night_club){
        super(name, capacity, event, address);
        this.second_floor = night_club.second_floor;
    }

    public void display(){}
    @Override
    public void print_info() {
        System.out.println("Night_club: " + getName() );
        System.out.println("Concert_hall: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Event: " + getEvent());
        if (!second_floor){
            System.out.println("second_floor: nope");}
        else {
            System.out.println("second_floor: have");
        }
    }
    @Override
    public void destructor() {
        System.gc();
    }
}
