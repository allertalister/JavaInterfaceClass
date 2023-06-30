package org.allertalister;

public class Dog extends Animal implements Pet{

    public Dog(String name, String food){
        this.setName(name);
        this.setFood(food);
        this.setNumLegs(4);
    }

    public void sound(int length){
        String bark = "roof";

            for (int x = 0; x<length; x++){
                if (length > 0){
                System.out.println(bark);
            }
                else {
                    String noBark = "No roofs";
                    System.out.println(noBark);
                }
        }

    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
