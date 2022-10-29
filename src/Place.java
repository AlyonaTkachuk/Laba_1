abstract class Place {//абстрактный класс под наименованием "Место", "прородитель" всех остальных классов
    //в данном классе есть 4 переменные, а именно: название, вместительность, мероприятие и адрес.
    //данные переменные являются общими для всех наследующих классив и чтобы не повторяться были занесенв сюда
    //также определены методы, которые потом используются в остальных классах
    private String name;
    private String capacity;
    private String event;
    private String address;

    public String getName() { return name; }//т.к. класс абстрактный, то просто так обращаться и переприсваивать
    // его переменные нельзя, но можно возвращать эти переменные и уже с ними взаимодействовать
    public void setName(String name){
        this.name=name;
    }
    public String getCapacity() { return capacity; }//т.к. переменные являются приватными, то за пределами класса
    // не получится обратиться напрямую. метод геттер предоставляет доступ к полю
    // сеттер же может менять значение данного поля
    public void setCapacity(String capacity){
        this.capacity=capacity;
    }
    public String getEvent() { return event; }
    public void setEvent(String event) { this.event=event; }
    public String getAddress() { return address; }
    public void setAddress(String address){
        this.address=address;
    }

    //все три конструктора аналогичны в остальных классах
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

