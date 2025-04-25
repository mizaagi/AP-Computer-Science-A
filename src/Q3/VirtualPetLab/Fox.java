package Q3.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {
        super.setEnergy(super.getEnergy() + 10);
        super.setHappiness(super.getHappiness() + 20);
        super.setHunger(super.getHunger() - 20);

        if (super.getEnergy() > 100) super.setEnergy(100);
        if (super.getHappiness() > 100) super.setHappiness(100);
        if (super.getHunger() < 0) super.setHunger(0);
    }

    @Override
    public void play() {
        super.setEnergy(super.getEnergy() + 20);
        super.setHappiness(super.getHappiness() + 20);
        super.setHunger(super.getHunger() + 20);

        if (super.getEnergy() < 0) super.setEnergy(0);
        if (super.getHappiness() > 100) super.setHappiness(100);
        if (super.getHunger() > 100) super.setHunger(100);
    }

    @Override
    public void sleep() {
        super.setEnergy(super.getEnergy() + 10);
        super.setHappiness(super.getHappiness() + 10);

        if (super.getEnergy() > 100) super.setEnergy(100);
        if (super.getHappiness() > 100) super.setHappiness(100);
        if (super.getHunger() < 0) super.setHunger(0);

    }
}
