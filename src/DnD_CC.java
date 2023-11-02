import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DnD_CC {

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
    public static void chooseCls() {
        System.out.println("\nChoose your class");
        clsMenu();
        String cls;
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
                chooseCls();
            }
        }
    }
    public static void chooseRace() {
        System.out.println("\nChoose your race");
        raceMenu();
        String race;
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
    public static void option3(){
        System.out.println("""
                                    
                                    Roll ability dice (1)\s
                                    Start Again (2)\s
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
        System.out.println("~~~ You have chosen Dwarf ~~~");
        System.out.println("""
                In mountains heart, where hammers fall,
                Dwarves toil and feast in ancient halls,
                With fulsome beards and hearts of stone,
                Around the world, their tales are known.

                They delve deep into earth's embrace,
                Seeking treasures in the darkest place,
                Resilient, proud, and stout they stand,
                In dwarves' strong grip, a mighty land.""");
    }
    public static void elf() {
        System.out.println("~~~ You have chosen Elf ~~~");
        System.out.println("Elves are a magical people of otherworldly grace, living in the world but not entirely part of it.\n They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light,\n where soft music drifts through the air and gentle fragrances waft on the breeze.\n Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.");

    }
    public static void halfling() {
        System.out.println("~~~ You have chosen Halfling ~~~");
        System.out.println("");
    }
    public static void human() {
        System.out.println("");
    }

    //classes
    public static void barb() {
        System.out.println("~~~ You have chosen Barbarian ~~~");
        System.out.println("Barbarians are fearless and relentless warriors,\nembracing their primal instincts to harness incredible strength and combat prowess.\nIn the heat of battle, they enter a state of Rage that grants them heightened abilities,\nmaking them formidable adversaries. With their signature unarmored combat style and resistance to damage,\nBarbarians epitomize raw power and resilience, making them essential assets to any adventuring party.");
    }
    public static void fight() {
        System.out.println("");
    }
    public static void rogue() {
        System.out.println("");
    }
    public static void wiz() {
        System.out.println("");
    }

    //dice roll maths
    public static int findHighestThree (int[] array) {
        //sort print and sum highest 3 numbers
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        return (array[1]+ array[2] + array[3]);
    }
    public static void abilitydice(){

        System.out.println("""
                "Rolling Ability Scores..."\s
                """);
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
        System.out.println(" Dice roll 1: " + findHighestThree(diceset1));
        System.out.println(" Dice roll 2: " + findHighestThree(diceset2));
        System.out.println(" Dice roll 3: " + findHighestThree(diceset3));
        System.out.println(" Dice roll 4: " + findHighestThree(diceset4));
        System.out.println(" Dice roll 5: " + findHighestThree(diceset5));
        System.out.println(" Dice roll 6: " + findHighestThree(diceset6));

    }

//𝕯&𝕯 𝕮𝖍𝖆𝖗𝖆𝖈𝖙𝖊𝖗 𝕮𝖗𝖊𝖆𝖙𝖔𝖗
    public static void main(String[] args) {
        String dnd = ("\uD835\uDD6F&\uD835\uDD6F \uD835\uDD6E\uD835\uDD8D\uD835\uDD86\uD835\uDD97\uD835\uDD86\uD835\uDD88\uD835\uDD99\uD835\uDD8A\uD835\uDD97 \uD835\uDD6E\uD835\uDD97\uD835\uDD8A\uD835\uDD86\uD835\uDD99\uD835\uDD94\uD835\uDD97");
        System.out.println("            [[");
        System.out.println("     ()xxxxx[[{:::::::::::::::::::::::::::::>");
        System.out.println("            [[     " + dnd);

chooseRace();
chooseCls();
option3();
abilitydice();


        //System.out.println("\nYou have chosen "+ race + cls);
//Now take your six numbers and write each number beside one of your character’s six abilities to assign scores to
// Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma.
        System.out.println("Assign each of your ability scores to Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma");
        //Scanner sc = new Scanner(System.in);
        System.out.println("Strength: ");
        //int Stre = sc.nextInt();
        System.out.println("Dexterity: ");
        //int Dex = sc.nextInt();
            }
        }










