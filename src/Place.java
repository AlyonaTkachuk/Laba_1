abstract class Place {//абстрактный класс, "прородитель" всех остальных классов

    private String name;
    private String capacity;
    private String event;
    private String address;

    public String getName() { return name; }
    public void setName(String name){
        this.name=name;
    }
    public String getCapacity() { return capacity; }
    public void setCapacity(String capacity){
        this.capacity=capacity;
    }
    public String getEvent() { return event; }
    public void setEvent(String event) { this.event=event; }
    public String getAddress() { return address; }
    public void setAddress(String address){
        this.address=address;
    }

    public Place(){//конструктор без параметров
        this.name="Земля";
        this.capacity="8 млрд";
        this.event="Жизнь";
        this.address="Млечный путь";
    }

    public Place(String name, String capacity, String event, String address){ //конструктор с параметрами
        this.name=name;
        this.capacity=capacity;
        this.event=event;
        this.address=address;
    }

    public Place(Place tyt) { //конструктор копирования
        this.name=tyt.name;
        this.capacity=tyt.capacity;
        this.event=tyt.event;
        this.address=tyt.address;
    }
    public abstract void display();
    public abstract void print_info();
    protected void destructor() {
    }//деструктор
}

