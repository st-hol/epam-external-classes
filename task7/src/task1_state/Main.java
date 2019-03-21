package task1_state;

class Human {

    private State simpleMan;
    private State hunter;
    private State mushroomer;
    private State fisher;

    private State state;

    public Human() {
        this.simpleMan = new OnNormalConditionState(this);
        this.hunter = new SeesTheBeastState(this);
        this.mushroomer = new OnMushroomGladeState(this);
        this.fisher = new OnTheRiverBankState(this);

        state = simpleMan;
    }

    public void whoAmI() {
        state.whoAmI();
    }

    public void seeTheBeast() {
        state.seeTheBeast();
    }

    public void goToNormalCondition() {
        state.goToNormalCondition();
    }

    public void goToRiverBanks() {
        state.goToRiverBanks();
    }

    public void goToMushroomsGlade() {
        state.goToMushroomsGlade();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }


    public State getHunterState() {
        return hunter;
    }

    public State getMushroomerState() {
        return mushroomer;
    }

    public State getFisherState() {
        return fisher;
    }

    public State getSimpleManState() {
        return simpleMan;
    }


    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nI am a human.");
        result.append("Now i am " + state + "\n");
        return result.toString();
    }
}

class OnTheRiverBankState implements State {

    private Human human;

    public OnTheRiverBankState(Human human) {
        this.human = human;
    }

    public void whoAmI() {
        System.out.println("i am fisher now");
    }

    @Override
    public void seeTheBeast() {
        System.out.println("i see the beast");
        human.setState(human.getHunterState());
    }

    @Override
    public void goToNormalCondition() {
        System.out.println("i go to normal cond.");
        human.setState(human.getSimpleManState());
    }

    @Override
    public void goToRiverBanks() {
        System.out.println("i am going to the river banks");
        human.setState(human.getFisherState());
    }

    @Override
    public void goToMushroomsGlade() {
        System.out.println("i am going to the mushroom glade");
        human.setState(human.getMushroomerState());
    }

    public String toString() {
        return "On The River Bank";
    }
}
class OnNormalConditionState implements State {

    private Human human;

    public OnNormalConditionState(Human human) {
        this.human = human;
    }

    public void whoAmI() {
        System.out.println("i am simple man");
    }

    @Override
    public void seeTheBeast() {
        System.out.println("i see the beast");
        human.setState(human.getHunterState());
    }

    @Override
    public void goToNormalCondition() {
        System.out.println("i am already in normal cond.");
    }

    @Override
    public void goToRiverBanks() {
        System.out.println("i am going to the river");
        human.setState(human.getFisherState());
    }

    @Override
    public void goToMushroomsGlade() {
        System.out.println("i am going to the mushroom glade");
        human.setState(human.getMushroomerState());
    }

    public String toString() {
        return "On Normal Condition State";
    }
}
class SeesTheBeastState implements State {

    private Human human;

    public SeesTheBeastState(Human human) {
        this.human = human;
    }

    public void whoAmI() {
        System.out.println("i am hunter");
    }

    @Override
    public void seeTheBeast() {
        System.out.println("i am already is looking on the beast");
    }

    @Override
    public void goToNormalCondition() {
        System.out.println("i go to normal cond.");
        human.setState(human.getSimpleManState());
    }

    @Override
    public void goToRiverBanks() {
        System.out.println("i am going to the river");
        human.setState(human.getFisherState());
    }

    @Override
    public void goToMushroomsGlade() {
        System.out.println("i am going to the river");
        human.setState(human.getMushroomerState());
    }

    public String toString() {
        return " See The Beast";
    }
}
class OnMushroomGladeState implements State {

    private Human human;

    public OnMushroomGladeState(Human human) {
        this.human = human;
    }

    public void whoAmI() {
        System.out.println("i am mushroomer");
    }

    @Override
    public void seeTheBeast() {
        System.out.println("i see the beast");
        human.setState(human.getHunterState());
    }

    @Override
    public void goToNormalCondition() {
        System.out.println("i go to normal cond.");
        human.setState(human.getSimpleManState());
    }

    @Override
    public void goToRiverBanks() {
        System.out.println("i am going to the river");
        human.setState(human.getFisherState());
    }

    @Override
    public void goToMushroomsGlade() {
        System.out.println("i am already on mushrooms glade");
    }


    public String toString() {
        return "On Mushroom Glade";
    }
}

interface State {
    void seeTheBeast();
    void goToMushroomsGlade();
    void goToNormalCondition();
    void goToRiverBanks();

    void whoAmI();
}

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        System.out.println(human);
        human.whoAmI();
        System.out.println("-------------------------");

        human.goToRiverBanks();
        System.out.println(human);
        human.whoAmI();
        System.out.println("-------------------------");

        human.goToMushroomsGlade();
        System.out.println(human);
        human.whoAmI();
        System.out.println("-------------------------");

        human.goToNormalCondition();
        System.out.println(human);
        human.whoAmI();
        System.out.println("-------------------------");

        human.seeTheBeast();
        System.out.println(human);
        human.whoAmI();
        System.out.println("-------------------------");




        human.seeTheBeast();
        System.out.println(human);
        human.whoAmI();
        System.out.println("-------------------------");


    }
}


