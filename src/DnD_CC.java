import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DnD_CC {

//stats
    static String cls;
    static String race;
    static int Str;
    static int Con;
    static int Int;
    static int Dex;
    static int Wis;
    static int Cha;
    static int[] abscores = new int[6];
    //menus
    public static void raceMenu() {
        System.out.println("""
                                    Dwarf (1)\s
                                    Elf (2)\s
                                    Halfling (3)\s
                                    Human (4)\s
                """);
    }
    public static void clsMenu() {
        System.out.println("""
                                    Barbarian (1)\s
                                    Fighter (2)\s
                                    Rogue (3)\s
                                    Wizard (4)\s
                """);
    }
    public static int getOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select your option: ");
        return sc.nextInt();
    }
    public static void chooseRace() {
        System.out.println("\nChoose your race");
        raceMenu();
        int option1 = getOption();
        switch (option1) {
            case 1 -> {
                race = "Dwarf";
                dwarf();
            }
            case 2 -> {
                race = "Elf";
                elf();
            }
            case 3 -> {
                race = "Halfling";
                halfling();
            }
            case 4 -> {
                race = "Human";
                human();
            }
            default -> {
                race = "Not an option";
                System.out.println(race);
                chooseRace();
            }
        }
    }

    //int cls 1 = barbarian??


    public static void chooseCls() {
        System.out.println("\nChoose your class");
        clsMenu();
        int option2 = getOption();
        switch (option2) {
            case 1 -> {
                cls = "Barbarian";
                barb();
            }
            case 2 -> {
                cls = "Fighter";
                fight();
            }
            case 3 -> {
                cls = "Rogue";
                rogue();
            }
            case 4 -> {
                cls = "Wizard";
                wiz();
            }
            default -> {
                cls = "Not an option";
                System.out.println(cls);
                clsMenu();
                chooseCls();
            }
        }
    }


    public static void option3(){
        System.out.format("\nYou have chosen %s %s",race,cls);
        System.out.println("""
                                    
                                    Roll ability dice (1)\s
                                    Start New Character (2)\s
                """);
        int option3 = getOption();
        switch (option3) {
            case 1 -> {
            }
            case 2 -> {
                chooseRace();
                chooseCls();
                option3();
            }
            default -> {
                System.out.println("Not an option");
                option3();
            }
        }
    }

    //races
    public static void dwarf() {
        System.out.println("\n~~~ Dwarf ~~~");
        System.out.println("Kingdoms rich in ancient grandeur, halls carved into the roots of mountains,\nthe echoing of picks and hammers in deep mines and blazing forges,\na commitment to clan and tradition, and a burning hatred of goblins and orcs\n—these common threads unite all dwarves.");
    }
    public static void elf() {
        System.out.println("\n~~~ Elf ~~~");
        System.out.println("Elves are a magical people of otherworldly grace, living in the world but not entirely part of it.\nThey live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light,\nwhere soft music drifts through the air and gentle fragrances waft on the breeze.\n Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.");

    }
    public static void halfling() {
        System.out.println("\n~~~ Halfling ~~~");
        System.out.println("");
    }
    public static void human() {
        System.out.println("\n~~~ Human ~~~");
    }

    //classes
    public static void barb() {
        System.out.println("\n~~~ Barbarian ~~~");
        System.out.println("Barbarians are fearless and relentless warriors,\nembracing their primal instincts to harness incredible strength and combat prowess.\nIn the heat of battle, they enter a state of Rage that grants them heightened abilities,\nmaking them formidable adversaries. With their signature unarmored combat style and resistance to damage,\nBarbarians epitomize raw power and resilience, making them essential assets to any adventuring party.");
    }
    public static void fight() {
        System.out.println("\n~~~ Fighter ~~~");
    }
    public static void rogue() {
        System.out.println("\n~~~ Rogue ~~~");
    }
    public static void wiz() {
        System.out.println("\n~~~ Wizard ~~~");
    }

    //dice roll maths
    public static int findHighestThree (int[] array) {
        //sort print and sum highest 3 numbers
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        return (array[1]+ array[2] + array[3]);
    }
    public static void abilityDice(){

        System.out.println("\nRolling Ability Scores...\n");
        Random rand = new Random();
        // create arrays for each dice set
        int[] diceset1 = new int[4];
        int[] diceset2 = new int[4];
        int[] diceset3 = new int[4];
        int[] diceset4 = new int[4];
        int[] diceset5 = new int[4];
        int[] diceset6 = new int[4];

//roll 4 dice for each set
        int i;
        for (i = 0; i <= 3; i++) {
            diceset1[i] = rand.nextInt(1, 7);
            diceset2[i] = rand.nextInt(1, 7);
            diceset3[i] = rand.nextInt(1, 7);
            diceset4[i] = rand.nextInt(1, 7);
            diceset5[i] = rand.nextInt(1, 7);
            diceset6[i] = rand.nextInt(1, 7);
        }

//print sum of highest 3 rolls
        int d1 = findHighestThree(diceset1);
        System.out.println(" Dice roll 1: " + d1);
        int d2 = findHighestThree(diceset2);
        System.out.println(" Dice roll 2: " + d2);
        int d3 = findHighestThree(diceset3);
        System.out.println(" Dice roll 3: " + d3);
        int d4 = findHighestThree(diceset4);
        System.out.println(" Dice roll 4: " + d4);
        int d5 = findHighestThree(diceset5);
        System.out.println(" Dice roll 5: " + d5);
        int d6 = findHighestThree(diceset6);
        System.out.println(" Dice roll 6: " + d6);

       abscores[0] = d1;
       abscores[1] = d2;
       abscores[2] = d3;
       abscores[3] = d4;
       abscores[4] = d5;
       abscores[5] = d6;
    }

    public static void abilityScore(){
        System.out.println("\nAssign each of your ability scores to Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma");
        Scanner sc = new Scanner(System.in);
        System.out.println("scores unassigned: "+ Arrays.toString(abscores));
        System.out.print("Strength: ");
        int Str = sc.nextInt();
        System.out.print("Dexterity: ");
        int Dex = sc.nextInt();
        System.out.print("Constitution: ");
        int Con = sc.nextInt();
        System.out.print("Intelligence: ");
        int Int = sc.nextInt();
        System.out.print("Wisdom: ");
        int Wis = sc.nextInt();
        System.out.print("Charisma: ");
        int Cha = sc.nextInt();
    }
    public static void abilityScore2() {
        System.out.println("Strength: " + Str);
        System.out.println("Dexterity: " + Dex);
        System.out.println("Constitution: " + Con);
        System.out.println("Intelligence: " + Int);
        System.out.println("Wisdom: " + Wis);
        System.out.println("Charisma:" + Cha);
    }

//𝕯&𝕯 𝕮𝖍𝖆𝖗𝖆𝖈𝖙𝖊𝖗 𝕮𝖗𝖊𝖆𝖙𝖔𝖗
    public static void main(String[] args) {
        String dnd = ("\uD835\uDD6F&\uD835\uDD6F \uD835\uDD6E\uD835\uDD8D\uD835\uDD86\uD835\uDD97\uD835\uDD86\uD835\uDD88\uD835\uDD99\uD835\uDD8A\uD835\uDD97 \uD835\uDD6E\uD835\uDD97\uD835\uDD8A\uD835\uDD86\uD835\uDD99\uD835\uDD94\uD835\uDD97");
        System.out.println("            [[");
        System.out.println("     ()xxxxx[[{:::::::::::::::::::::::::::::>");
        System.out.println("            [[     " + dnd);

//character char2 = new character();

chooseRace();
chooseCls();
option3();
abilityDice();
abilityScore();
abilityScore2();


            }
        }










