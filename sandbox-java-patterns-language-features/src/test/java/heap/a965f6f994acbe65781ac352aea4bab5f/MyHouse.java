package heap.a965f6f994acbe65781ac352aea4bab5f;

class MyHouse {
    private boolean pizzaArrived = false;

    public void eatPizza() throws InterruptedException {
        synchronized(this){
            while(!pizzaArrived){
                wait();
            }
        }
        System.out.println("yumyum..");
    }

    public void pizzaGuy(){
        synchronized(this){
             this.pizzaArrived = true;
             notifyAll();
        }
    }
}
