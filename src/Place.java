abstract class Place {

    private String name;
    private String capacity;
    private String event;


    public String getName() { return name; }

    public void setName(String name){
        this.name=name;
    }

    public String getCapacity() { return capacity; }

    public void setCapacity(String capacity){
        this.capacity=capacity;
    }

    public String getEvent() { return event; }

    public void setEvent(String event){
        this.event=event;
    }

    public Place(String name, String capacity, String event){

        this.name=name;
        this.capacity=capacity;
        this.event=event;
    }
    public Place(){
        this.name="Земля";
        this.capacity="8 млрд";
        this.event="Жизнь";
    }
    public abstract void display();
}

