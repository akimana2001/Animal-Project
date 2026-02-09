public class Animal {
    private String  name;
    private String sound;

    public Animal(String name, String sound){
        this.name=name;
        this.sound=sound;

    }
    public void setterName(String name){
        this.name= name;

    }
    public void setterSound(String sound){
        this.sound= sound;

    }
    public String getterName(){
        return name;
    }
    public String getterSound(){
        return sound;
    }

    public  void makeSound(){
        System.out.println(" The animal is:" +name + "Then sound is:" + sound );
    }


    public static void main(String[] args) {
        Animal Dog = new Dog("bob", "bark");
        Animal Cat = new Cat("Ketty", "meow");
        Animal Birds = new Birds("parrok", "Chirp");

        Cat.makeSound();
        Birds.makeSound();
        Dog.makeSound();

    }
}
