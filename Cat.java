class Cat extends Animal{

    public Cat(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getterName() + "Says " + getterSound());
    }
}
