class Theatre extends Place{

    private Boolean balcony, orchestra_pit;


    Theatre(String name, String capacity, String event, Boolean have_b, Boolean have_o){

        super(name, capacity, event);
        this.balcony = have_b;
        this.orchestra_pit = have_o;

    }
    public void display(){

    }
}
