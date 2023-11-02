public class chars {
    public static void main(String[] args){
//create two objects of the animal class

        character char1 = new character();
//setters
        char1.setRace("Dwarf");
        char1.setCls("Barbarian");

//getters
        System.out.println(char1.getCls()+char1.getRace());
    }
}

