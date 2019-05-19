//Max Chow
//This game is a quest to save the princess

import java.util.*;
import java.io.*;

public class KnightsoftheRealm {
    public static void main(String[] args) throws FileNotFoundException {
        //Variables/Scanners/Randoms
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean nameCheck = false;
        boolean classCheck = false;
        boolean game = true;
        boolean firstEncounter = true;

        int extractInitial = 0;

        String initialLetter;

        int heroClassNum = 1;
        KnightsoftheRealmCreator mainPlayer = new KnightsoftheRealmCreator();
        mainPlayer.setPlayerHealth(10);
        int playerHealth = mainPlayer.getPlayerHealth();

        int damage;

        Object mainWep;
        Object secWep;
        boolean eastCheck = true;
        boolean westCheck = true;

        List ArcherKit = new ArrayList();
        ArcherKit.add("bow");
        ArcherKit.add("dagger");

        List KnightKit = new ArrayList();
        KnightKit.add("sword");
        KnightKit.add("bomb");

        int playerPosition = 43;
        int playerNorth = 33;
        int playerSouth = 53;
        int playerEast = 44;
        int playerWest = 42;
        int playerX = 3;
        int playerY = 1;

        int treePosition1 = 0;
        int treePosition2 = 0;
        int treePosition3 = 0;
        int treePosition4 = 0;
        int treePosition5 = 0;
        int treePosition6 = 0;

        //Battlefield variables
        String pos1 = " ";
        String pos2 = " ";
        String pos3 = " ";
        String pos4 = " ";
        String pos5 = " ";
        String pos11 = " ";
        String pos12 = " ";
        String pos13 = " ";
        String pos14 = " ";
        String pos15 = " ";
        String pos21 = " ";
        String pos22 = " ";
        String pos23 = " ";
        String pos24 = " ";
        String pos25 = " ";
        String pos31 = " ";
        String pos32 = " ";
        String pos33 = " ";
        String pos34 = " ";
        String pos35 = " ";
        String pos41 = " ";
        String pos42 = " ";
        String pos43 = " ";
        String pos44 = " ";
        String pos45 = " ";

        KnightsoftheRealmCreator bot1 = new KnightsoftheRealmCreator();
        bot1.setBotHealth(3);
        int bot1Health = bot1.getBotHealth();
        bot1.setBotName("B");
        String bot1Name = bot1.getBotName();
        int bot1Position = 1;
        int bot1North = 100;
        int bot1South = 100;
        int bot1East = 100;
        int bot1West = 100;
        int botX = 100;
        int botY = 100;

        //Initializes program
//        File fileInput = new File("C:\\Users\\maxch\\IdeaProjects\\TheMainProgram\\src\\KnightsoftheRealmIntro");
//        Scanner fileScan = new Scanner(fileInput);
//        System.out.println(fileScan);

        //Creates userName + Initial (for combat)
        while (game == true) {
            while (nameCheck == false) {
                System.out.println("What is your name?");
                String userName = scanner.next();
                System.out.println("Are you sure your name is " + userName + "? (yes or no)");
                String isName = scanner.next();
                isName = isName.toLowerCase();
                if (isName.equals("yes") || isName.equals("y")) {
                    //extracting name
                    userName = userName.toUpperCase();
                    String initial = userName.substring(0, 1);
//                    System.out.println(initial);
                    while (true) {
                        if (initial.equals("A")) {
                            extractInitial = 1;
                            break;
                        } else if (initial.equals("B")) {
                            extractInitial = 2;
                            break;
                        } else if (initial.equals("C")) {
                            extractInitial = 3;
                            break;
                        } else if (initial.equals("D")) {
                            extractInitial = 4;
                            break;
                        } else if (initial.equals("E")) {
                            extractInitial = 5;
                            break;
                        } else if (initial.equals("F")) {
                            extractInitial = 6;
                            break;
                        } else if (initial.equals("G")) {
                            extractInitial = 7;
                            break;
                        } else if (initial.equals("H")) {
                            extractInitial = 8;
                            break;
                        } else if (initial.equals("I")) {
                            extractInitial = 9;
                            break;
                        } else if (initial.equals("J")) {
                            extractInitial = 10;
                            break;
                        } else if (initial.equals("K")) {
                            extractInitial = 11;
                            break;
                        } else if (initial.equals("L")) {
                            extractInitial = 12;
                            break;
                        } else if (initial.equals("M")) {
                            extractInitial = 13;
                            break;
                        } else if (initial.equals("N")) {
                            extractInitial = 14;
                            break;
                        } else if (initial.equals("O")) {
                            extractInitial = 15;
                            break;
                        } else if (initial.equals("P")) {
                            extractInitial = 16;
                            break;
                        } else if (initial.equals("Q")) {
                            extractInitial = 17;
                            break;
                        } else if (initial.equals("R")) {
                            extractInitial = 18;
                            break;
                        } else if (initial.equals("S")) {
                            extractInitial = 19;
                            break;
                        } else if (initial.equals("T")) {
                            extractInitial = 20;
                            break;
                        } else if (initial.equals("U")) {
                            extractInitial = 21;
                            break;
                        } else if (initial.equals("V")) {
                            extractInitial = 22;
                            break;
                        } else if (initial.equals("W")) {
                            extractInitial = 23;
                            break;
                        } else if (initial.equals("X")) {
                            extractInitial = 24;
                            break;
                        } else if (initial.equals("Y")) {
                            extractInitial = 25;
                            break;
                        } else if (initial.equals("Z")) {
                            extractInitial = 26;
                            break;
                        }
                    }
                    nameCheck = true;
                } else {
                    nameCheck = false;
                }
            }
            if (extractInitial == 1) {
                initialLetter = "A";
            } else if (extractInitial == 2) {
                initialLetter = "B";
            } else if (extractInitial == 3) {
                initialLetter = "C";
            } else if (extractInitial == 4) {
                initialLetter = "D";
            } else if (extractInitial == 5) {
                initialLetter = "E";
            } else if (extractInitial == 6) {
                initialLetter = "F";
            } else if (extractInitial == 7) {
                initialLetter = "G";
            } else if (extractInitial == 8) {
                initialLetter = "H";
            } else if (extractInitial == 9) {
                initialLetter = "I";
            } else if (extractInitial == 10) {
                initialLetter = "J";
            } else if (extractInitial == 11) {
                initialLetter = "K";
            } else if (extractInitial == 12) {
                initialLetter = "L";
            } else if (extractInitial == 13) {
                initialLetter = "M";
            } else if (extractInitial == 14) {
                initialLetter = "N";
            } else if (extractInitial == 15) {
                initialLetter = "O";
            } else if (extractInitial == 16) {
                initialLetter = "P";
            } else if (extractInitial == 17) {
                initialLetter = "Q";
            } else if (extractInitial == 18) {
                initialLetter = "R";
            } else if (extractInitial == 19) {
                initialLetter = "S";
            } else if (extractInitial == 20) {
                initialLetter = "T";
            } else if (extractInitial == 21) {
                initialLetter = "U";
            } else if (extractInitial == 22) {
                initialLetter = "V";
            } else if (extractInitial == 23) {
                initialLetter = "W";
            } else if (extractInitial == 24) {
                initialLetter = "X";
            } else if (extractInitial == 25) {
                initialLetter = "Y";
            } else {
                initialLetter = "Z";
            }

            System.out.println();

            //Ask what class Archer or Knight
            while (classCheck == false) {
                System.out.println("What class do you choose: ARCHER(A) or KNIGHT(K)");
                String heroClass = scanner.next();
                System.out.println("So you chose " + heroClass + "? (yes or no)");
                String isClass = scanner.next();
                isClass = isClass.toLowerCase();
                if (isClass.equals("yes") || isClass.equals("y")) {
                    heroClass = heroClass.toUpperCase();
                    if (heroClass.equals("ARCHER") || heroClass.equals("A")) {
                        heroClassNum = 1;
                        mainPlayer.setPlayerHealth(8);
                        playerHealth = mainPlayer.getPlayerHealth();
                        classCheck = true;
                    } else {
                        heroClassNum = 2;
                        mainPlayer.setPlayerHealth(5);
                        playerHealth = mainPlayer.getPlayerHealth();
                        classCheck = true;
                    }
                } else {
                    heroClassNum = 1;
                    classCheck = false;
                }
            }

            System.out.println();

            //Setting player/bot/trees locations
            pos43 = initialLetter;

            int botLocation = random.nextInt(5);
//            System.out.println(botLocation);
            for (int i = 0; i < 5; i++) {
                if (botLocation == i) {
                    switch (i) {
                        case 1:
                            pos1 = bot1Name;
                            bot1Position = 1;
                            bot1North = -11;
                            bot1South = 11;
                            bot1East = 2;
                            bot1West = 0;
                            botX = 1;
                            botY = 5;
                            break;

                        case 2:
                            pos2 = bot1Name;
                            bot1Position = 2;
                            bot1North = -12;
                            bot1South = 12;
                            bot1East = 3;
                            bot1West = 1;
                            botX = 2;
                            botY = 5;
                            break;

                        case 3:
                            pos3 = bot1Name;
                            bot1Position = 3;
                            bot1North = -13;
                            bot1South = 13;
                            bot1East = 4;
                            bot1West = 2;
                            botX = 3;
                            botY = 5;
                            break;

                        case 4:
                            pos4 = bot1Name;
                            bot1Position = 4;
                            bot1North = -14;
                            bot1South = 14;
                            bot1East = 5;
                            bot1West = 3;
                            botX = 4;
                            botY = 5;
                            break;

                        default:
                            pos5 = bot1Name;
                            bot1Position = 5;
                            bot1North = -15;
                            bot1South = 15;
                            bot1East = 6;
                            bot1West = 4;
                            botX = 5;
                            botY = 5;
                            break;
                    }
                }
            }

            System.out.print("BotPos:"+bot1Position);
            System.out.print(" North:"+bot1North);
            System.out.print(" South:"+bot1South);
            System.out.print(" East:"+bot1East);
            System.out.println(" West:"+bot1West);

            int amountOfTrees = random.nextInt(4);
            for (int i = 0; i < amountOfTrees; i++) {
                int treeLocation = random.nextInt(6);
                switch (treeLocation) {
                    case 1:
                        pos12 = "*";
                        treePosition1 = 12;
                        break;

                    case 2:
                        pos34 = "*";
                        treePosition2 = 34;
                        break;

                    case 3:
                        pos22 = "*";
                        treePosition3 = 22;
                        break;

                    case 4:
                        pos15 = "*";
                        treePosition4 = 15;
                        break;

                    case 5:
                        pos24 = "*";
                        treePosition5 = 24;
                        break;

                    default:
                        pos31 = "*";
                        treePosition6 = 31;
                        break;
                }
            }

            //First encounter (forest)
            while (firstEncounter == true) {
                    System.out.println(" ----- ");
                    System.out.println("|" + pos1 + pos2 + pos3 + pos4 + pos5 + "|");
                    System.out.println("|" + pos11 + pos12 + pos13 + pos14 + pos15 + "|");
                    System.out.println("|" + pos21 + pos22 + pos23 + pos24 + pos25 + "|");
                    System.out.println("|" + pos31 + pos32 + pos33 + pos34 + pos35 + "|");
                    System.out.println("|" + pos41 + pos42 + pos43 + pos44 + pos45 + "|");
                    System.out.println(" ----- ");

                    //Archer Case
                    if (heroClassNum == 1) {
                        mainWep = ArcherKit.get(0);
                        secWep = ArcherKit.get(1);
                    }
                    //Knight
                    else if (heroClassNum == 2) {
                        mainWep = KnightKit.get(0);
                        secWep = KnightKit.get(1);
                    } else {
                        mainWep = ArcherKit.get(0);
                        secWep = ArcherKit.get(1);
                    }
                    System.out.println(mainWep + ", " + secWep + ", move , end");
                    System.out.println("What do you wanna do?");
                    String playerDecision = scanner.next();
                    playerDecision = playerDecision.toLowerCase();

                    //Archer Dagger + Knight Sword
                    if (playerDecision.equals(ArcherKit.get(1)) || playerDecision.equals(KnightKit.get(0))) {
                        if (heroClassNum == 2) {
                            //Knight Attack
                            if (playerEast == bot1Position || playerWest == bot1Position || playerNorth == bot1Position || playerSouth == bot1Position) {
                                //Knight sword is at minimum 2 but at max is 6
                                damage = random.nextInt(4)+2;
                                bot1Health = bot1Health - damage;
                                System.out.println(bot1Health);
                                System.out.println("Successful Hit!");
                            } else {
                                System.out.println("Miss!");
                            }
                        } else {
                            //Dagger Attack
                            System.out.println("Successful Hit!");
                            //Dagger always 1 damage
                            bot1Health -= bot1Health;
                            if (playerPosition == 1) {
                                pos1 = " ";
                            } else if (playerPosition == 2) {
                                pos2 = " ";
                            } else if (playerPosition == 3) {
                                pos3 = " ";
                            } else if (playerPosition == 4) {
                                pos4 = " ";
                            } else if (playerPosition == 5) {
                                pos5 = " ";
                            } else if (playerPosition == 11) {
                                pos11 = " ";
                            } else if (playerPosition == 12) {
                                pos12 = " ";
                            } else if (playerPosition == 13) {
                                pos13 = " ";
                            } else if (playerPosition == 14) {
                                pos14 = " ";
                            } else if (playerPosition == 15) {
                                pos15 = " ";
                            } else if (playerPosition == 21) {
                                pos21 = " ";
                            } else if (playerPosition == 22) {
                                pos22 = " ";
                            } else if (playerPosition == 23) {
                                pos23 = " ";
                            } else if (playerPosition == 24) {
                                pos24 = " ";
                            } else if (playerPosition == 25) {
                                pos25 = " ";
                            } else if (playerPosition == 31) {
                                pos31 = " ";
                            } else if (playerPosition == 32) {
                                pos32 = " ";
                            } else if (playerPosition == 33) {
                                pos33 = " ";
                            } else if (playerPosition == 34) {
                                pos34 = " ";
                            } else if (playerPosition == 35) {
                                pos35 = " ";
                            } else if (playerPosition == 41) {
                                pos41 = " ";
                            } else if (playerPosition == 42) {
                                pos42 = " ";
                            } else if (playerPosition == 43) {
                                pos43 = " ";
                            } else if (playerPosition == 44) {
                                pos44 = " ";
                            } else {
                                pos45 = " ";
                            }
                            //After hitting a dagger attack, you take a square backwards
                            if (playerEast == bot1Position) {
                                for (int i = 0; i < 6; i++) {
                                    if (westCheck == true) {
                                        if (playerPosition - 1 == 10 * i) {
                                            System.out.println("No Fleeing Encounter!");
                                            westCheck = false;
                                        } else {
                                            westCheck = true;
                                        }
                                    }
                                }
                                if (westCheck == true) {
                                    playerPosition = playerPosition - 1;
                                    playerNorth -= 1;
                                    playerSouth -= 1;
                                    playerEast -= 1;
                                    playerWest -= 1;
                                    playerX--;
                                } else {
                                }
                            }
                            else if (playerWest == bot1Position) {
                                for (int i = 0; i < 6; i++) {
                                    if (eastCheck == true) {
                                        if (playerPosition + 1 == 6 + 10 * i) {
                                            System.out.println("No Fleeing Encounter!");
                                            eastCheck = false;
                                        } else {
                                            eastCheck = true;
                                        }
                                    }
                                }
                                if (eastCheck == true) {
                                    playerPosition = playerPosition + 1;
                                    playerNorth += 1;
                                    playerSouth += 1;
                                    playerEast += 1;
                                    playerWest += 1;
                                    playerX++;
                                } else {
                                }
                            }
                            else if (playerSouth == bot1Position) {
                                if (playerPosition - 10 < 0) {
                                    System.out.println("No Fleeing Encounter!");
                                } else {
                                    playerPosition = playerPosition - 10;
                                    playerNorth -= 10;
                                    playerSouth -= 10;
                                    playerEast -= 10;
                                    playerWest -= 10;
                                    playerY++;
                                }
                            }
                            else {
                                if (playerPosition + 10 > 50) {
                                    System.out.println("No Fleeing Encounter!");
                                } else {
                                    playerPosition = playerPosition + 10;
                                    playerNorth += 10;
                                    playerSouth += 10;
                                    playerEast += 10;
                                    playerWest += 10;
                                    playerY--;
                                }
                            }
                            System.out.println(bot1Health);
                        }
                    } else if (playerDecision.equals(ArcherKit.get(0)) || playerDecision.equals(KnightKit.get(1))) {
                        if (heroClassNum == 1) {
                            if (playerEast == bot1Position || playerWest == bot1Position || playerNorth == bot1Position || playerSouth == bot1Position) {
                                //Bomb attack
                                System.out.println("Successful Hit!");
                                damage = random.nextInt(2)-1;
                                bot1Health = bot1Health - damage;
                                System.out.println(bot1Health);
                                } else {
                                }
                        } else {
                            System.out.println("Successful Hit!");
                            damage = random.nextInt(3)+3;
                            bot1Health = bot1Health - damage;
                            System.out.println(bot1Health);
                        }
                    } else if (playerDecision.equals("move")) {
                        System.out.println("What direction? (north, south, east, west)");
                        String playerDirection = scanner.next();
                        playerDirection = playerDirection.toLowerCase();
//                        System.out.println(playerDirection);
//                        System.out.println(playerPosition);
                        if (playerPosition == 1) {
                            pos1 = " ";
                        } else if (playerPosition == 2) {
                            pos2 = " ";
                        } else if (playerPosition == 3) {
                            pos3 = " ";
                        } else if (playerPosition == 4) {
                            pos4 = " ";
                        } else if (playerPosition == 5) {
                            pos5 = " ";
                        } else if (playerPosition == 11) {
                            pos11 = " ";
                        } else if (playerPosition == 12) {
                            pos12 = " ";
                        } else if (playerPosition == 13) {
                            pos13 = " ";
                        } else if (playerPosition == 14) {
                            pos14 = " ";
                        } else if (playerPosition == 15) {
                            pos15 = " ";
                        } else if (playerPosition == 21) {
                            pos21 = " ";
                        } else if (playerPosition == 22) {
                            pos22 = " ";
                        } else if (playerPosition == 23) {
                            pos23 = " ";
                        } else if (playerPosition == 24) {
                            pos24 = " ";
                        } else if (playerPosition == 25) {
                            pos25 = " ";
                        } else if (playerPosition == 31) {
                            pos31 = " ";
                        } else if (playerPosition == 32) {
                            pos32 = " ";
                        } else if (playerPosition == 33) {
                            pos33 = " ";
                        } else if (playerPosition == 34) {
                            pos34 = " ";
                        } else if (playerPosition == 35) {
                            pos35 = " ";
                        } else if (playerPosition == 41) {
                            pos41 = " ";
                        } else if (playerPosition == 42) {
                            pos42 = " ";
                        } else if (playerPosition == 43) {
                            pos43 = " ";
                        } else if (playerPosition == 44) {
                            pos44 = " ";
                        } else {
                            pos45 = " ";
                        }
                        if (playerDirection.equals("north") || playerDirection.equals("n")) {
                            if (playerPosition - 10 < 0) {
                                System.out.println("No Fleeing Encounter!");
                            } else {
                                playerPosition = playerPosition - 10;
                                playerNorth -= 10;
                                playerSouth -= 10;
                                playerEast -= 10;
                                playerWest -= 10;
                                playerY++;
                                if (playerPosition == bot1Position) {
                                    playerPosition = playerPosition + 10;
                                    playerNorth += 10;
                                    playerSouth += 10;
                                    playerEast += 10;
                                    playerWest += 10;
                                    playerY--;
                                }
                                else {
                                }
                            }
                        } else if (playerDirection.equals("south") || playerDirection.equals("s")) {
                            if (playerPosition + 10 > 50) {
                                System.out.println("No Fleeing Encounter!");
                            } else {
                                playerPosition = playerPosition + 10;
                                playerNorth += 10;
                                playerSouth += 10;
                                playerEast += 10;
                                playerWest += 10;
                                playerY--;
                                if (playerPosition == bot1Position) {
                                    playerPosition = playerPosition - 10;
                                    playerNorth -= 10;
                                    playerSouth -= 10;
                                    playerEast -= 10;
                                    playerWest -= 10;
                                    playerY++;
                                    System.out.println("You ran into the orc!");
                                }
                                else {

                                }
                            }
                        } else if (playerDirection.equals("east") || playerDirection.equals("e")) {
                            for (int i = 0; i < 6; i++) {
                                if (eastCheck == true) {
                                    if (playerPosition + 1 == 6 + 10 * i) {
                                        System.out.println("No Fleeing Encounter!");
                                        eastCheck = false;
                                    } else {
                                        eastCheck = true;
                                    }
                                }
                            }
                            if (eastCheck == true) {
                                playerPosition = playerPosition + 1;
                                playerNorth += 1;
                                playerSouth += 1;
                                playerEast += 1;
                                playerWest += 1;
                                playerX++;
                                if (playerPosition == bot1Position) {
                                    playerPosition = playerPosition - 1;
                                    playerNorth -= 1;
                                    playerSouth -= 1;
                                    playerEast -= 1;
                                    playerWest -= 1;
                                    playerX--;
                                    System.out.println("You ran into the orc!");
                                }
                            } else {
                            }
                        } else if (playerDirection.equals("west") || playerDirection.equals("w")) {
                            for (int i = 0; i < 6; i++) {
                                if (westCheck == true) {
                                    if (playerPosition - 1 == 10 * i) {
                                        System.out.println("No Fleeing Encounter!");
                                        westCheck = false;
                                    } else {
                                        westCheck = true;
                                    }
                                }
                            }
                            if (westCheck == true) {
                                playerPosition = playerPosition - 1;
                                playerNorth -= 1;
                                playerSouth -= 1;
                                playerEast -= 1;
                                playerWest -= 1;
                                playerX--;
                                if (playerPosition == bot1Position) {
                                    playerPosition = playerPosition + 1;
                                    playerNorth += 1;
                                    playerSouth += 1;
                                    playerEast += 1;
                                    playerWest += 1;
                                    playerX++;
                                    System.out.println("You ran into the bot!");
                                }
                                else {

                                }
                            } else {
                            }
                        } else {
                        }
                    } else {
                        firstEncounter = false;
                        game = false;
                    }
                    if (playerPosition == 1) {
                        pos1 = initialLetter;
                    } else if (playerPosition == 2) {
                        pos2 = initialLetter;
                    } else if (playerPosition == 3) {
                        pos3 = initialLetter;
                    } else if (playerPosition == 4) {
                        pos4 = initialLetter;
                    } else if (playerPosition == 5) {
                        pos5 = initialLetter;
                    } else if (playerPosition == 11) {
                        pos11 = initialLetter;
                    } else if (playerPosition == 12) {
                        pos12 = initialLetter;
                    } else if (playerPosition == 13) {
                        pos13 = initialLetter;
                    } else if (playerPosition == 14) {
                        pos14 = initialLetter;
                    } else if (playerPosition == 15) {
                        pos15 = initialLetter;
                    } else if (playerPosition == 21) {
                        pos21 = initialLetter;
                    } else if (playerPosition == 22) {
                        pos22 = initialLetter;
                    } else if (playerPosition == 23) {
                        pos23 = initialLetter;
                    } else if (playerPosition == 24) {
                        pos24 = initialLetter;
                    } else if (playerPosition == 25) {
                        pos25 = initialLetter;
                    } else if (playerPosition == 31) {
                        pos31 = initialLetter;
                    } else if (playerPosition == 32) {
                        pos32 = initialLetter;
                    } else if (playerPosition == 33) {
                        pos33 = initialLetter;
                    } else if (playerPosition == 34) {
                        pos34 = initialLetter;
                    } else if (playerPosition == 35) {
                        pos35 = initialLetter;
                    } else if (playerPosition == 41) {
                        pos41 = initialLetter;
                    } else if (playerPosition == 42) {
                        pos42 = initialLetter;
                    } else if (playerPosition == 43) {
                        pos43 = initialLetter;
                    } else if (playerPosition == 44) {
                        pos44 = initialLetter;
                    } else {
                        pos45 = initialLetter;
                    }

                if (bot1Health <= 0) {
                    if (bot1Position == 1) {
                        pos1 = " ";
                    } else if (bot1Position == 2) {
                        pos2 = " ";
                    } else if (bot1Position == 3) {
                        pos3 = " ";
                    } else if (bot1Position == 4) {
                        pos4 = " ";
                    } else if (bot1Position == 5) {
                        pos5 = " ";
                    } else if (bot1Position == 11) {
                        pos11 = " ";
                    } else if (bot1Position == 12) {
                        pos12 = " ";
                    } else if (bot1Position == 13) {
                        pos13 = " ";
                    } else if (bot1Position == 14) {
                        pos14 = " ";
                    } else if (bot1Position == 15) {
                        pos15 = " ";
                    } else if (bot1Position == 21) {
                        pos21 = " ";
                    } else if (bot1Position == 22) {
                        pos22 = " ";
                    } else if (bot1Position == 23) {
                        pos23 = " ";
                    } else if (bot1Position == 24) {
                        pos24 = " ";
                    } else if (bot1Position == 25) {
                        pos25 = " ";
                    } else if (bot1Position == 31) {
                        pos31 = " ";
                    } else if (bot1Position == 32) {
                        pos32 = " ";
                    } else if (bot1Position == 33) {
                        pos33 = " ";
                    } else if (bot1Position == 34) {
                        pos34 = " ";
                    } else if (bot1Position == 35) {
                        pos35 = " ";
                    } else if (bot1Position == 41) {
                        pos41 = " ";
                    } else if (bot1Position == 42) {
                        pos42 = " ";
                    } else if (bot1Position == 43) {
                        pos43 = " ";
                    } else if (bot1Position == 44) {
                        pos44 = " ";
                    } else {
                        pos45 = " ";
                    }
                    System.out.println(" ----- ");
                    System.out.println("|" + pos1 + pos2 + pos3 + pos4 + pos5 + "|");
                    System.out.println("|" + pos11 + pos12 + pos13 + pos14 + pos15 + "|");
                    System.out.println("|" + pos21 + pos22 + pos23 + pos24 + pos25 + "|");
                    System.out.println("|" + pos31 + pos32 + pos33 + pos34 + pos35 + "|");
                    System.out.println("|" + pos41 + pos42 + pos43 + pos44 + pos45 + "|");
                    System.out.println(" ----- ");
                    System.out.println("YOU WIN!");
                    firstEncounter = false;
                    game = false;
                }
                else {

                }

//                System.out.print("Playerposition:" + playerPosition);
//                System.out.print(" North:" + playerNorth);
//                System.out.print(" South:" + playerSouth);
//                System.out.print(" East:" + playerEast);
//                System.out.println(" West:" + playerWest);

                System.out.println(" ----- ");
                System.out.println("|" + pos1 + pos2 + pos3 + pos4 + pos5 + "|");
                System.out.println("|" + pos11 + pos12 + pos13 + pos14 + pos15 + "|");
                System.out.println("|" + pos21 + pos22 + pos23 + pos24 + pos25 + "|");
                System.out.println("|" + pos31 + pos32 + pos33 + pos34 + pos35 + "|");
                System.out.println("|" + pos41 + pos42 + pos43 + pos44 + pos45 + "|");
                System.out.println(" ----- ");
//                    int botDecision = random.nextInt(1);
                int botDecision = random.nextInt(1);
                //Bot Moves

                if (botDecision == 0) {
                    if (bot1North == playerPosition || bot1South == playerPosition || bot1East == playerPosition || bot1West == playerPosition) {
                        System.out.print("The bot attacked!");
                        playerHealth = playerHealth - 1;
                        System.out.println(" "+initialLetter+" Health: "+playerHealth);
                    }
                    else {
                        if (bot1Position == 1) {
                            pos1 = " ";
                        } else if (bot1Position == 2) {
                            pos2 = " ";
                        } else if (bot1Position == 3) {
                            pos3 = " ";
                        } else if (bot1Position == 4) {
                            pos4 = " ";
                        } else if (bot1Position == 5) {
                            pos5 = " ";
                        } else if (bot1Position == 11) {
                            pos11 = " ";
                        } else if (bot1Position == 12) {
                            pos12 = " ";
                        } else if (bot1Position == 13) {
                            pos13 = " ";
                        } else if (bot1Position == 14) {
                            pos14 = " ";
                        } else if (bot1Position == 15) {
                            pos15 = " ";
                        } else if (bot1Position == 21) {
                            pos21 = " ";
                        } else if (bot1Position == 22) {
                            pos22 = " ";
                        } else if (bot1Position == 23) {
                            pos23 = " ";
                        } else if (bot1Position == 24) {
                            pos24 = " ";
                        } else if (bot1Position == 25) {
                            pos25 = " ";
                        } else if (bot1Position == 31) {
                            pos31 = " ";
                        } else if (bot1Position == 32) {
                            pos32 = " ";
                        } else if (bot1Position == 33) {
                            pos33 = " ";
                        } else if (bot1Position == 34) {
                            pos34 = " ";
                        } else if (bot1Position == 35) {
                            pos35 = " ";
                        } else if (bot1Position == 41) {
                            pos41 = " ";
                        } else if (bot1Position == 42) {
                            pos42 = " ";
                        } else if (bot1Position == 43) {
                            pos43 = " ";
                        } else if (bot1Position == 44) {
                            pos44 = " ";
                        } else {
                            pos45 = " ";
                        }

                        int xCompare = playerX - botX;
                        int yCompare = playerY - botY;
                        int absXCompare = Math.abs(xCompare);
                        int absYCompare = Math.abs(yCompare);

                        if (absXCompare >= absYCompare) {
                            System.out.print(xCompare);
                            System.out.println(yCompare);
                            if (xCompare < 0) {
                                //West
                                bot1Position = bot1Position - 1;
                                bot1North -= 1;
                                bot1South -= 1;
                                bot1East -= 1;
                                bot1West -= 1;
                                if (bot1Position == playerPosition) {
                                    bot1Position = bot1Position + 1;
                                    bot1North += 1;
                                    bot1South += 1;
                                    bot1East += 1;
                                    bot1West += 1;
                                } else {

                                }
                            } else {
                                //East
                                bot1Position = bot1Position + 1;
                                bot1North += 1;
                                bot1South += 1;
                                bot1East += 1;
                                bot1West += 1;
                                if (bot1Position == playerPosition) {
                                    bot1Position = bot1Position - 1;
                                    bot1North -= 1;
                                    bot1South -= 1;
                                    bot1East -= 1;
                                    bot1West -= 1;
                                } else {

                                }
                            }
                        } else {
                            System.out.print(xCompare);
                            System.out.println(yCompare);
                            if (yCompare < 0) {
                                //South
                                bot1Position = bot1Position + 10;
                                bot1North += 10;
                                bot1South += 10;
                                bot1East += 10;
                                bot1West += 10;
                                if (bot1Position == playerPosition) {
                                    bot1Position = bot1Position - 10;
                                    bot1North -= 10;
                                    bot1South -= 10;
                                    bot1East -= 10;
                                    bot1West -= 10;
                                } else {

                                }
                            } else {
                                //North
                                bot1Position = bot1Position - 10;
                                bot1North -= 10;
                                bot1South -= 10;
                                bot1East -= 10;
                                bot1West -= 10;
                                if (bot1Position == playerPosition) {
                                    bot1Position = bot1Position + 10;
                                    bot1North += 10;
                                    bot1South += 10;
                                    bot1East += 10;
                                    bot1West += 10;
                                } else {

                                }
                            }
                        }
                    }
//                    System.out.print("BotPos:"+bot1Position);
//                    System.out.print(" North:"+bot1North);
//                    System.out.print(" South:"+bot1South);
//                    System.out.print(" East:"+bot1East);
//                    System.out.println(" West:"+bot1West);
                    }
                else {
                        playerHealth -= playerHealth;
                        System.out.println(playerHealth);
                    }
                }


                        if (bot1Position == 1) {
                            pos1 = bot1Name;
                        } else if (bot1Position == 2) {
                            pos2 = bot1Name;
                        } else if (bot1Position == 3) {
                            pos3 = bot1Name;
                        } else if (bot1Position == 4) {
                            pos4 = bot1Name;
                        } else if (bot1Position == 5) {
                            pos5 = bot1Name;
                        } else if (bot1Position == 11) {
                            pos11 = bot1Name;
                        } else if (bot1Position == 12) {
                            pos12 = bot1Name;
                        } else if (bot1Position == 13) {
                            pos13 = bot1Name;
                        } else if (bot1Position == 14) {
                            pos14 = bot1Name;
                        } else if (bot1Position == 15) {
                            pos15 = bot1Name;
                        } else if (bot1Position == 21) {
                            pos21 = bot1Name;
                        } else if (bot1Position == 22) {
                            pos22 = bot1Name;
                        } else if (bot1Position == 23) {
                            pos23 = bot1Name;
                        } else if (bot1Position == 24) {
                            pos24 = bot1Name;
                        } else if (bot1Position == 25) {
                            pos25 = bot1Name;
                        } else if (bot1Position == 31) {
                            pos31 = bot1Name;
                        } else if (bot1Position == 32) {
                            pos32 = bot1Name;
                        } else if (bot1Position == 33) {
                            pos33 = bot1Name;
                        } else if (bot1Position == 34) {
                            pos34 = bot1Name;
                        } else if (bot1Position == 35) {
                            pos35 = bot1Name;
                        } else if (bot1Position == 41) {
                            pos41 = bot1Name;
                        } else if (bot1Position == 42) {
                            pos42 = bot1Name;
                        } else if (bot1Position == 43) {
                            pos43 = bot1Name;
                        } else if (bot1Position == 44) {
                            pos44 = bot1Name;
                        } else {
                            pos45 = bot1Name;
                        }

                        if (playerHealth == 0) {
                            if (playerPosition == 1) {
                                pos1 = " ";
                            } else if (playerPosition == 2) {
                                pos2 = " ";
                            } else if (playerPosition == 3) {
                                pos3 = " ";
                            } else if (playerPosition == 4) {
                                pos4 = " ";
                            } else if (playerPosition == 5) {
                                pos5 = " ";
                            } else if (playerPosition == 11) {
                                pos11 = " ";
                            } else if (playerPosition == 12) {
                                pos12 = " ";
                            } else if (playerPosition == 13) {
                                pos13 = " ";
                            } else if (playerPosition == 14) {
                                pos14 = " ";
                            } else if (playerPosition == 15) {
                                pos15 = " ";
                            } else if (playerPosition == 21) {
                                pos21 = " ";
                            } else if (playerPosition == 22) {
                                pos22 = " ";
                            } else if (playerPosition == 23) {
                                pos23 = " ";
                            } else if (playerPosition == 24) {
                                pos24 = " ";
                            } else if (playerPosition == 25) {
                                pos25 = " ";
                            } else if (playerPosition == 31) {
                                pos31 = " ";
                            } else if (playerPosition == 32) {
                                pos32 = " ";
                            } else if (playerPosition == 33) {
                                pos33 = " ";
                            } else if (playerPosition == 34) {
                                pos34 = " ";
                            } else if (playerPosition == 35) {
                                pos35 = " ";
                            } else if (playerPosition == 41) {
                                pos41 = " ";
                            } else if (playerPosition == 42) {
                                pos42 = " ";
                            } else if (playerPosition == 43) {
                                pos43 = " ";
                            } else if (playerPosition == 44) {
                                pos44 = " ";
                            } else {
                                pos45 = " ";
                            }
                            System.out.println(" ----- ");
                            System.out.println("|" + pos1 + pos2 + pos3 + pos4 + pos5 + "|");
                            System.out.println("|" + pos11 + pos12 + pos13 + pos14 + pos15 + "|");
                            System.out.println("|" + pos21 + pos22 + pos23 + pos24 + pos25 + "|");
                            System.out.println("|" + pos31 + pos32 + pos33 + pos34 + pos35 + "|");
                            System.out.println("|" + pos41 + pos42 + pos43 + pos44 + pos45 + "|");
                            System.out.println(" ----- ");
                            System.out.println("YOU DIED!");
                            firstEncounter = false;
                            game = false;
                        }
            }
        }

        //random number of encounters until castle gate
        //Third encounter (castle gate)
        //Final boss battle (inside castle)
    }