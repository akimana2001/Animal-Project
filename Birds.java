class Birds extends Animal{

    public Birds(String name, String sound) {
        super(name, sound);
    }
    public void fly(){
        System.out.println("Bird " + getterName() + "does : Flying ");
    }
    @Override
    public void makeSound() {
        System.out.println(" Birds " + getterName() + "Says " + getterSound());
    }

}
