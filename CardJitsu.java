import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class CardJitsu {

    static Scanner input = new Scanner(System.in);

    static int xp = 0;
    String cardName;
    String cardType;
    static int numOfCards = 69;
    int cardLevel;
    // Fire = 1 // Water = 2 // Snow = 3
    int cardNumberType;
    String cardColor;

    CardJitsu(String cardName, String cardType, int cardLevel, int cardNumberType, String cardColor){

        this.cardName = cardName;
        this.cardType = cardType;
        this.cardLevel = cardLevel;
        this.cardNumberType = cardNumberType;
        this.cardColor = cardColor;

    }

    public String getCardName(){
        return cardName;
    }

    public String getCardType(){
        return cardType;
    }

    public int getCardLevel(){
        return cardLevel;
    }

    public int getCardNumberType(){
        return cardNumberType;
    }

    public String getCardColor(){
        return cardColor;
    }

    public static void main(String[] args) {

        ArrayList<CardJitsu> allCards = new ArrayList<CardJitsu>();
        ArrayList<CardJitsu> player1Cards = new ArrayList<CardJitsu>();
        ArrayList<CardJitsu> player2Cards = new ArrayList<CardJitsu>();
        ArrayList<CardJitsu> cpuCards = new ArrayList<CardJitsu>();
        allCards = initializeCards(allCards);
        player1Cards = initializeP1Cards(allCards, player1Cards);
        player2Cards = initializeP2Cards(allCards, player2Cards);
        cpuCards = initializeCpuCards(allCards, cpuCards);

        System.out.println("Welcome to CardJitsu... select one of the options below: ");
        System.out.println("1: CardJitsu VS CPU");
        System.out.println("2: CardJitsu VS Local Player");
        System.out.println("3: Options");

        int menuSelection = input.nextInt();

        if (menuSelection == 1){
            cardVsCpu(allCards, player1Cards, cpuCards);
        }
        if (menuSelection == 2){
            pvp(allCards, player1Cards, player2Cards);
        }
        if (menuSelection == 3){
            Options();
        }
        if (menuSelection == 4){
            gameRules();
        }


    }

    public static ArrayList<CardJitsu> initializeP1Cards(ArrayList<CardJitsu> allCards, ArrayList<CardJitsu> player1Cards){

        Random rand = new Random();

        // trying to add random cards to player deck

        int num1 = rand.nextInt(numOfCards);
        int num2 = rand.nextInt(numOfCards);
        int num3 = rand.nextInt(numOfCards);
        int num4 = rand.nextInt(numOfCards); // change nums
        
        CardJitsu playerCard1 = allCards.get(num1);
        CardJitsu playerCard2 = allCards.get(num2);
        CardJitsu playerCard3 = allCards.get(num3);
        CardJitsu playerCard4 = allCards.get(num4);

        ArrayList<CardJitsu> userCards = new ArrayList<CardJitsu>();
        userCards.add(playerCard1);
        userCards.add(playerCard2);
        userCards.add(playerCard3);
        userCards.add(playerCard4);

        return userCards;
    }

    public static ArrayList<CardJitsu> initializeP2Cards(ArrayList<CardJitsu> allCards, ArrayList<CardJitsu> player2Cards){

        Random rand = new Random();

        // trying to add random cards to player deck

        int num1 = rand.nextInt(numOfCards);
        int num2 = rand.nextInt(numOfCards);
        int num3 = rand.nextInt(numOfCards);
        int num4 = rand.nextInt(numOfCards); // change nums
        
        CardJitsu playerCard1 = allCards.get(num1);
        CardJitsu playerCard2 = allCards.get(num2);
        CardJitsu playerCard3 = allCards.get(num3);
        CardJitsu playerCard4 = allCards.get(num4);

        ArrayList<CardJitsu> user2Cards = new ArrayList<CardJitsu>();
        user2Cards.add(playerCard1);
        user2Cards.add(playerCard2);
        user2Cards.add(playerCard3);
        user2Cards.add(playerCard4);

        return user2Cards;
    }

    public static ArrayList<CardJitsu> initializeCpuCards(ArrayList<CardJitsu> allCards, ArrayList<CardJitsu> cpuCards){

        Random rand = new Random();

        // trying to add random cards to player deck

        int num5 = rand.nextInt(numOfCards);
        int num6 = rand.nextInt(numOfCards);
        int num7 = rand.nextInt(numOfCards);
        int num8 = rand.nextInt(numOfCards); // change nums
        
        CardJitsu cpuCard1 = allCards.get(num5);
        CardJitsu cpuCard2 = allCards.get(num6);
        CardJitsu cpuCard3 = allCards.get(num7);
        CardJitsu cpuCard4 = allCards.get(num8);

        ArrayList<CardJitsu> cpuCard = new ArrayList<CardJitsu>();
        cpuCard.add(cpuCard1);
        cpuCard.add(cpuCard2);
        cpuCard.add(cpuCard3);
        cpuCard.add(cpuCard4);

        return cpuCard;
    }

    public static ArrayList<CardJitsu> initializeCards(ArrayList<CardJitsu> allCards){

        // Fire 2 Cards
        CardJitsu beanCounters = new CardJitsu("Bean Counters", "Fire", 2, 1, "Blue");
        CardJitsu camera = new CardJitsu("Camera", "Fire", 2, 1, "Orange");
        CardJitsu constructionWorker = new CardJitsu("Construction Worker", "Fire", 2, 1, "Yellow");
        // Water 2 Cards
        CardJitsu baseball = new CardJitsu("Baseball", "Water", 2, 2, "Green");
        CardJitsu iceFishing = new CardJitsu("Ice Fishing", "Water", 2, 2, "Yellow");
        CardJitsu summerParty = new CardJitsu("Summer Party", "Water", 2, 2, "Blue");
        // Snow 2 Cards
        CardJitsu bluePuffle = new CardJitsu("Blue Puffle", "Snow", 2, 3, "Blue");
        CardJitsu skiHill = new CardJitsu("Ski Hill", "Snow", 2, 3, "Red");
        CardJitsu snowForts = new CardJitsu("Snow Forts", "Snow", 2, 3, "Yellow");
        //----------------------------------------------------------------------------
        // Fire 3 Cards
        CardJitsu cartSurfer = new CardJitsu("Cart Surfer", "Fire", 3, 1, "Blue");
        CardJitsu herbertBear = new CardJitsu("Herbert P. Bear", "Fire", 3, 1, "Red");
        CardJitsu knight = new CardJitsu("Knight", "Fire", 3, 1, "Purple");
        // Water 3 Cards
        CardJitsu lifeRing = new CardJitsu("Life Ring", "Water", 3, 2, "Purple");
        CardJitsu waterBalloons = new CardJitsu("Water Balloons", "Water", 3, 2, "Yellow");
        CardJitsu undergroundFlood = new CardJitsu("Underground Flood", "Water", 3, 2, "Red");
        // Snow 3 Cards
        CardJitsu petShop = new CardJitsu("Pet Shop", "Snow", 3, 3, "Orange");
        CardJitsu secretAgent = new CardJitsu("Secret Agent", "Snow", 3, 3, "Red");
        CardJitsu snowyNight = new CardJitsu("Snowy Night", "Snow", 3, 3, "Purple");
        //----------------------------------------------------------------------------
        // Fire 4 Cards
        CardJitsu scroll = new CardJitsu("Scroll", "Fire", 4, 1, "Yellow");
        CardJitsu anvilSmith = new CardJitsu("Anvil Smith", "Fire", 4, 1, "Green");
        CardJitsu landingPad = new CardJitsu("Landing Pad", "Fire", 4, 1, "Purple");
        // Water 4 Cards
        CardJitsu fishCostume = new CardJitsu("Fish Costume", "Water", 4, 2, "Yellow");
        CardJitsu grayFish = new CardJitsu("Gray Fish", "Water", 4, 2, "Green");
        CardJitsu iceCream = new CardJitsu("Ice Cream", "Water", 4, 2, "Orange");
        // Snow 4 Cards
        CardJitsu stadium = new CardJitsu("Stadium", "Snow", 4, 3, "Blue");
        CardJitsu ticketBooth = new CardJitsu("Ticket Booth", "Snow", 4, 3, "Orange");
        CardJitsu theFair = new CardJitsu("The Fair", "Snow", 4, 3, "Orange");
        //----------------------------------------------------------------------------
        // Fire 5 Cards
        CardJitsu blackPuffle = new CardJitsu("Black Puffle", "Fire", 5, 1, "Red");
        CardJitsu buoys = new CardJitsu("Buoys", "Fire", 5, 1, "Green");
        CardJitsu yarr = new CardJitsu("Yarr", "Fire", 5, 1, "Green");

        // Water 5 Cards
        CardJitsu theDocks = new CardJitsu("The Docks", "Water", 5, 2, "Orange");
        CardJitsu pop = new CardJitsu("Pop", "Water", 5, 2, "Purple");
        CardJitsu fishBait = new CardJitsu("Fish Bait", "Water", 5, 2, "Purple");

        // Snow 5 Cards
        CardJitsu pinkPuffle = new CardJitsu("Pink Puffle", "Snow", 5, 3, "Blue");
        CardJitsu musicJam = new CardJitsu("Music Jam", "Snow", 5, 3, "Purple");
        CardJitsu hockeyGear = new CardJitsu("Hockey Gear", "Snow", 5, 3, "Purple");
        //----------------------------------------------------------------------------
        // Fire 6 Cards
        CardJitsu gary = new CardJitsu("Gary", "Fire", 6, 1, "Blue");
        CardJitsu petShopStaff = new CardJitsu("Pet Shop Staff", "Fire", 6, 1, "Yellow");
        CardJitsu pizzaChef = new CardJitsu("Pizza Chef", "Fire", 6, 1, "Purple");
        // Water 6 Cards
        CardJitsu orangePuffle = new CardJitsu("Orange Puffle", "Water", 6, 2, "Blue");
        CardJitsu franky = new CardJitsu("Franky", "Water", 6, 2, "Orange");
        CardJitsu theMigrator = new CardJitsu("The Migrator", "Water", 6, 2, "Blue");
        // Snow 6 Cards
        CardJitsu hiddenPins = new CardJitsu("Hidden Pins", "Snow", 6, 3, "Green");
        CardJitsu puffleShow = new CardJitsu("Puffle Show", "Snow", 6, 3, "Green");
        CardJitsu clockTower = new CardJitsu("Clock Tower", "Snow", 6, 3, "Green");
        //----------------------------------------------------------------------------
        // Fire 7 Cards
        CardJitsu hotSauce = new CardJitsu("Hot Sauce", "Fire", 7, 1, "Yellow");
        CardJitsu blast = new CardJitsu("Blast", "Fire", 7, 1, "Orange");
        CardJitsu astroBarrier = new CardJitsu("Astro Barrier", "Fire", 7, 1, "Green");
        // Water 7 Cards
        CardJitsu hydroHopper = new CardJitsu("Hydro Hopper", "Water", 7, 2, "Blue");
        CardJitsu orangeSky = new CardJitsu("Orange Sky", "Water", 7, 2, "Red");
        CardJitsu shark = new CardJitsu("Shark", "Water", 7, 2, "Yellow");
        // Snow 7 Cards
        CardJitsu whitePuffles = new CardJitsu("White Puffles", "Snow", 7, 3, "Yellow");
        CardJitsu christmasParty = new CardJitsu("Christmas Party", "Snow", 7, 3, "Green");
        CardJitsu auntArctic = new CardJitsu("Aunt Arctic", "Snow", 7, 3, "Green");
        //----------------------------------------------------------------------------
        // Fire 8 Cards
        CardJitsu klutzy = new CardJitsu("Klutzy", "Fire", 8, 1, "Purple");
        CardJitsu flare = new CardJitsu("Flare", "Fire", 8, 1, "Red");
        CardJitsu gBilly = new CardJitsu("G Billy", "Fire", 8, 1, "Red");
        // Water 8 Cards
        CardJitsu giantSquid = new CardJitsu("Giant Squid", "Water", 8, 2, "Blue");
        CardJitsu mullet = new CardJitsu("Mullet", "Water", 8, 2, "Purple");
        CardJitsu iceberg = new CardJitsu("Iceberg", "Water", 8, 2, "Blue");
        // Snow 8 Cards
        CardJitsu dj3k = new CardJitsu("DJ3K", "Snow", 8, 3, "Green");
        CardJitsu propellerCap = new CardJitsu("Propeller Cap", "Snow", 8, 3, "Green");
        CardJitsu dojoCourtyard = new CardJitsu("Dojo Courtyard", "Snow", 8, 3, "Green");
        //----------------------------------------------------------------------------
        // Fire Power Cards
        CardJitsu dojoSketch = new CardJitsu("* Dojo Sketch *", "Fire", 10, 1, "Yellow");
        CardJitsu jetPack = new CardJitsu("* Jet Pack *", "Fire", 10, 1, "Orange");
        // Water Power Cards
        CardJitsu ninja = new CardJitsu("* Ninja *", "Water", 12, 2, "Yellow");
        CardJitsu waterParty = new CardJitsu("* Water Party *", "Water", 9, 2, "Red");
        // Snow Power Cards
        CardJitsu sledRacing = new CardJitsu("* Sled Racing *", "Snow", 10, 3, "Green");
        CardJitsu ac3000 = new CardJitsu("* AC 3000 *", "Snow", 11, 3, "Purple");
        //-----------------------------------------------------------------------------
        CardJitsu bair = new CardJitsu("Bairly Good Card", "Fire", 15, 1, "Blue");

        allCards.add(beanCounters);
        allCards.add(camera);
        allCards.add(constructionWorker);
        allCards.add(baseball);
        allCards.add(iceFishing);
        allCards.add(summerParty);
        allCards.add(bluePuffle);
        allCards.add(skiHill);
        allCards.add(snowForts);
        allCards.add(cartSurfer);
        allCards.add(herbertBear);
        allCards.add(knight);
        allCards.add(lifeRing);
        allCards.add(waterBalloons);
        allCards.add(undergroundFlood);
        allCards.add(petShop);
        allCards.add(secretAgent);
        allCards.add(snowyNight);
        allCards.add(scroll);
        allCards.add(anvilSmith);
        allCards.add(landingPad);
        allCards.add(fishCostume);
        allCards.add(grayFish);
        allCards.add(iceCream);
        allCards.add(stadium);
        allCards.add(ticketBooth);
        allCards.add(theFair);
        allCards.add(hotSauce);
        allCards.add(blast);
        allCards.add(astroBarrier);
        allCards.add(hydroHopper);
        allCards.add(orangeSky);
        allCards.add(shark);
        allCards.add(whitePuffles);
        allCards.add(christmasParty);
        allCards.add(auntArctic);
        allCards.add(dojoSketch);
        allCards.add(jetPack);
        allCards.add(ninja);
        allCards.add(waterParty);
        allCards.add(sledRacing);
        allCards.add(ac3000);
        allCards.add(blackPuffle);
        allCards.add(buoys);
        allCards.add(yarr);
        allCards.add(theDocks);
        allCards.add(pop);
        allCards.add(fishBait);
        allCards.add(pinkPuffle);
        allCards.add(musicJam);
        allCards.add(hockeyGear);
        allCards.add(gary);
        allCards.add(petShopStaff);
        allCards.add(pizzaChef);
        allCards.add(orangePuffle);
        allCards.add(franky);
        allCards.add(theMigrator);
        allCards.add(hiddenPins);
        allCards.add(puffleShow);
        allCards.add(clockTower);
        allCards.add(klutzy);
        allCards.add(flare);
        allCards.add(gBilly);
        allCards.add(giantSquid);
        allCards.add(mullet);
        allCards.add(iceberg);
        allCards.add(dj3k);
        allCards.add(propellerCap);
        allCards.add(dojoCourtyard);
        allCards.add(bair);

        return allCards;
    }

    public static boolean cardVsCpu(ArrayList<CardJitsu> allCards, ArrayList<CardJitsu> player1Cards, ArrayList<CardJitsu> cpuCards){

        Random rand = new Random();
        String[] cpuNames = {"Pepper", "Benji", "Maximus", "Winston", "Moo"};
        String nameOfCpu = cpuNames[rand.nextInt(4)];
        int userWins = 0;
        int cpuWins = 0;
        int numOfWins = 0;
        int numOfLosses = 0;
        //String[] colorCards;

        boolean inBattle = true;
        while (inBattle){
            while (userWins < 3 && cpuWins < 3){
                // for loop to print user's cards
                int cardNum = 0;
                System.out.println("\nYour Cards: \n");
                for (int q = 0; q < 4; q++){
                    System.out.println("(" + (cardNum + 1) + ") " + player1Cards.get(cardNum).cardName + " || Type: " + player1Cards.get(cardNum).cardType 
                    + " || Level: " + player1Cards.get(cardNum).cardLevel + " || Color: " + player1Cards.get(cardNum).cardColor + "\n");
                    cardNum++;
                }

                System.out.println("Score: " + userWins + " - " + cpuWins);
                System.out.println("Choose a card: ");
                int cardSelection = input.nextInt() - 1;
                int cpuCardSelection = 0;
                for (int w = 0; w < 3; w++){
                    if(cpuCards.get(w).getCardLevel() >= 9){
                        cpuCardSelection = w;
                    }
                    else{
                        cpuCardSelection = rand.nextInt(4);
                    }
                }

                // used for testing and seeing cpu's cards
                // System.out.println(player1Cards.get(cardSelection).getCardName());
                //  System.out.println(cpuCards.get(0).getCardName());
                // System.out.println(cpuCards.get(1).getCardName());
                // System.out.println(cpuCards.get(2).getCardName());
                // System.out.println(cpuCards.get(3).getCardName());

                // prints user chosen card as well as cpu chosen card
                System.out.println("==========================================\n");
                System.out.println("Your Card: " + player1Cards.get(cardSelection).cardName + " || Type: " + player1Cards.get(cardSelection).cardType 
                + " || Level: " + player1Cards.get(cardSelection).cardLevel + " || Color: " + player1Cards.get(cardSelection).cardColor + "\n");
                System.out.println(nameOfCpu + "'s Card: " + cpuCards.get(cpuCardSelection).getCardName() + " || Type: " + cpuCards.get(cpuCardSelection).cardType 
                + " || Level: " + cpuCards.get(cpuCardSelection).cardLevel + " || Color: " + cpuCards.get(cpuCardSelection).cardColor + "\n");
                System.out.println("==========================================");
                
                // if else statements to determine each winner of round
                if (player1Cards.get(cardSelection).getCardType() == "Fire" && cpuCards.get(cpuCardSelection).getCardType() == "Water"){
                    System.out.println("You Lost this Round!, Water beats Fire...");
                    cpuWins++;
                }
                else if (player1Cards.get(cardSelection).getCardType() == "Water" && cpuCards.get(cpuCardSelection).getCardType() == "Snow"){
                    System.out.println("You Lost this Round!, Snow beats Water...");
                    cpuWins++;
                }
                else if (player1Cards.get(cardSelection).getCardType() == "Snow" && cpuCards.get(cpuCardSelection).getCardType() == "Fire"){
                    System.out.println("You Lost this Round! Fire beats Snow...");
                    cpuWins++;
                }
                else if (cpuCards.get(cpuCardSelection).getCardType() == "Fire" && player1Cards.get(cardSelection).getCardType() == "Water"){
                    System.out.println("You Won this Round! Water beats Fire...");
                    userWins++;
                }
                else if (cpuCards.get(cpuCardSelection).getCardType() == "Water" && player1Cards.get(cardSelection).getCardType() == "Snow"){
                    System.out.println("You Won this Round! Snow beats Water...");
                    userWins++;
                }
                else if (cpuCards.get(cpuCardSelection).getCardType() == "Snow" && player1Cards.get(cardSelection).getCardType() == "Fire"){
                    System.out.println("You Won this Round! Fire beats Snow...");
                    userWins++;
                }
                else{
                    if(player1Cards.get(cardSelection).getCardLevel() > cpuCards.get(cpuCardSelection).getCardLevel()){
                        System.out.println("You Won this Round! You had the higher level card!");
                        userWins++;
                    }
                    else if(player1Cards.get(cardSelection).getCardLevel() == cpuCards.get(cpuCardSelection).getCardLevel()){
                        System.out.println("You Tied this Round! Your cards were the same type & level");
                    }
                    else{
                        System.out.println("You Lost this Round!, " + nameOfCpu + " had a higher level card");
                        cpuWins++;
                    }
                    

                }

                // changes the card that was just used
                player1Cards.set(cardSelection, allCards.get(rand.nextInt(numOfCards)));
                cpuCards.set(cpuCardSelection, allCards.get(rand.nextInt(numOfCards)));

            }
            // tells who wons and final score as well as +/- xp
            if (userWins > cpuWins){
                System.out.println("You Won!");
                numOfWins++;
                xp += 100;
            }
            else{
                System.out.println("You Lost!");
                numOfLosses++;
                xp -= 50;
            }
            System.out.println("Final Score: User(" + userWins + ") - " + nameOfCpu + "(" + cpuWins + ")");
            System.out.println("Your Record: " + numOfWins + " - " + numOfLosses);

            // belts 
            String userBelt;
            String[] belts = {"White Belt", "Yellow Belt", "Orange Belt", "Green Belt", 
            "Blue Belt", "Red Belt", "Purple Belt", "Brown Belt", " * Black Belt *"};
        
            if (xp >= 5000){
                userBelt = belts[8];
            }
            else if(xp >= 4500){
                userBelt = belts[7];
            }
            else if(xp >= 4000){
                userBelt = belts[6];
            }
            else if(xp >= 3500){
                userBelt = belts[5];
            }
            else if(xp >= 3000){
                userBelt = belts[4];
            }
            else if(xp >= 2500){
                userBelt = belts[3];
            }
            else if(xp >= 2000){
                userBelt = belts[2];
            }
            else if(xp >= 1500){
                userBelt = belts[1];
            }
            else{
                userBelt = belts[0];
            }

            System.out.println("Your Belt: " + userBelt + " (xp: " + xp + ")");
            System.out.println("");
            System.out.println("");

            System.out.println("Would you like to play again? \n(1) Yes \n(2) No");
            int playAgain = input.nextInt();
            if (playAgain == 1){
                userWins = 0;
                cpuWins = 0;
                continue;
            }
            else{
                System.out.println("Bye");
                input.close();
                break;
            }
            
        }

        // Then add battle system.... Win conditions are as follows...
        // First, players could have the same type of card (such as Snow, Water or Fire), but three in different colors, 
        //such as Red, Blue, Green, etc. Alternatively, you could have one of each card, in different colors.

        // manage to implement power cards :D
        // manage to change cpu ai to use power card if has (might work)
        // don't allow card duplicates
        // add more cards
        // implement for loop to display all cards < Done

        return true;

    }

    public static void gameRules(){
        System.out.println("In CardJitsu, to win you need to be the first one to score 3 points \n, " + 
        "you can score points by having a counter to your oppenents card.. or if you have the same element, \n" +
        "the higher level wins.....");
        System.out.println("Fire beats Snow \n Snow beats Water \n Water beats Fire");
    }

    public static boolean pvp(ArrayList<CardJitsu> allCards, ArrayList<CardJitsu> player1Cards, ArrayList<CardJitsu> player2Cards){
        Random rand = new Random();
        boolean inBattle = true;
        int player1Wins = 0;
        int player2Wins = 0;
            while (inBattle){
                while (player1Wins < 3 && player2Wins < 3){
                    int cardNum = 0;
                    System.out.println("\nPlayer 1 Cards: \n");
                    for (int q = 0; q < 4; q++){
                        System.out.println("(" + (cardNum + 1) + ") " + player1Cards.get(cardNum).cardName + " || Type: " + player1Cards.get(cardNum).cardType 
                        + " || Level: " + player1Cards.get(cardNum).cardLevel + " || Color: " + player1Cards.get(cardNum).cardColor + "\n");
                        cardNum++;
                    }

                    System.out.println("Score: " + player1Wins + " - " + player2Wins);
                    System.out.println("Choose a card: ");
                    int player1cardSelection = input.nextInt() - 1;
                    System.out.println("\n\n\n-----------------\n\n\n\n\n\n\n\n\n");
                    int numCard = 0;
                    System.out.println("\nPlayer 2 Cards: \n");
                    for (int q = 0; q < 4; q++){
                        System.out.println("(" + (numCard+ 1) + ") " + player2Cards.get(numCard).cardName + " || Type: " + player2Cards.get(numCard).cardType 
                        + " || Level: " + player2Cards.get(numCard).cardLevel + " || Color: " + player2Cards.get(numCard).cardColor + "\n");
                        numCard++;
                    }

                    System.out.println("Score: " + player1Wins + " - " + player2Wins);
                    System.out.println("Choose a card: ");
                    int player2CardSelection = input.nextInt() - 1;

                    System.out.println("==========================================\n");
                    System.out.println("Your Card: " + player1Cards.get(player1cardSelection).cardName + " || Type: " + player1Cards.get(player1cardSelection).cardType 
                    + " || Level: " + player1Cards.get(player1cardSelection).cardLevel + " || Color: " + player1Cards.get(player1cardSelection).cardColor + "\n");
                    System.out.println("Player 2's Card: " + player2Cards.get(player2CardSelection).getCardName() + " || Type: " + player2Cards.get(player2CardSelection).cardType 
                    + " || Level: " + player2Cards.get(player2CardSelection).cardLevel + " || Color: " + player2Cards.get(player2CardSelection).cardColor + "\n");
                    System.out.println("==========================================");
                    
                    // if else statements to determine each winner of round
                    if (player1Cards.get(player1cardSelection).getCardType() == "Fire" && player2Cards.get(player2CardSelection).getCardType() == "Water"){
                        System.out.println("You Lost this Round!, Water beats Fire...");
                        player2Wins++;
                    }
                    else if (player1Cards.get(player1cardSelection).getCardType() == "Water" && player2Cards.get(player2CardSelection).getCardType() == "Snow"){
                        System.out.println("You Lost this Round!, Snow beats Water...");
                        player2Wins++;
                    }
                    else if (player1Cards.get(player1cardSelection).getCardType() == "Snow" && player2Cards.get(player2CardSelection).getCardType() == "Fire"){
                        System.out.println("You Lost this Round! Fire beats Snow...");
                        player2Wins++;
                    }
                    else if (player2Cards.get(player2CardSelection).getCardType() == "Fire" && player1Cards.get(player1cardSelection).getCardType() == "Water"){
                        System.out.println("You Won this Round! Water beats Fire...");
                        player1Wins++;
                    }
                    else if (player2Cards.get(player2CardSelection).getCardType() == "Water" && player1Cards.get(player1cardSelection).getCardType() == "Snow"){
                        System.out.println("You Won this Round! Snow beats Water...");
                        player1Wins++;
                    }
                    else if (player2Cards.get(player2CardSelection).getCardType() == "Snow" && player1Cards.get(player1cardSelection).getCardType() == "Fire"){
                        System.out.println("You Won this Round! Fire beats Snow...");
                        player1Wins++;
                    }
                    else{
                        if(player1Cards.get(player1cardSelection).getCardLevel() > player2Cards.get(player2CardSelection).getCardLevel()){
                            System.out.println("You Won this Round! You had the higher level card!");
                            player1Wins++;
                        }
                        else if(player1Cards.get(player1cardSelection).getCardLevel() == player2Cards.get(player2CardSelection).getCardLevel()){
                            System.out.println("You Tied this Round! Your cards were the same type & level");
                        }
                        else{
                            System.out.println("You Lost this Round!, Player 2 had a higher level card");
                            player2Wins++;
                        }
                        
    
                    }

                // might delete later... but to add a delay
                try {
                    TimeUnit.SECONDS.sleep(5);
                }
                catch(InterruptedException e){
                    System.err.format("IOException: %s%n", e);
                }
                    

                    // changes the card that was just used
                    player1Cards.set(player1cardSelection, allCards.get(rand.nextInt(numOfCards)));
                    player2Cards.set(player2CardSelection, allCards.get(rand.nextInt(numOfCards)));

                }

                // tells who wons and final score as well as +/- xp
            if (player1Wins > player2Wins){
                System.out.println("You Won!");
                xp += 100;
            }
            else{
                System.out.println("You Lost!");
                xp -= 50;
            }
            System.out.println("Final Score: Player1(" + player1Wins + ") - Player2(" + player2Wins + ")");
        }
        return true;
    }

    public static void Options(){
        System.out.println("Work in POGress");
    }
}

