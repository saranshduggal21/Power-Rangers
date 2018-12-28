
/**
 * Write a description of class RPG here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class RPG
{
    static String username,colour,city, country, language;
    static int userHealth = 75, enemyHealth = 75, age;//The user and enemy both have only 75 health.
    //This makes it fair and an easy number to work with in games.
    static int l = 1;
    static int w=0, z=0, t=0;
    public static void main (String args [])
    {
        File f = new File ("Music.wav");//Declaring a new object for the music file.
        //This music file is the Might Morphin Power Ranger theme song.
        sound (f);//Method for the music to play.
        System.out.println ("Hello there!");
        username = IBIO.inputString ("\nCreate a username for yourself:");
        //This gives the user flexibility in creating a username.
        String password = IBIO.inputString ("\nCreate a password for your account:");
        //This gives the user flexibility in creating a password.
        System.out.println ("Welcome to the adventure of the:");
        //ASCII Art #1
        System.out.println ("  __  __ _       _     _           __  __            _           _     ");  
        System.out.println (" |  \\/  (_)     | |   | |         |  \\/  |          | |         (_)       ");  
        System.out.println (" | \\  / |_  __ _| |__ | |_ _   _  | \\  / | ___  _ __| |__  _ __  _ _ __   ");  
        System.out.println (" | |\\/| | |/ _` | '_ \\| __| | | | | |\\/| |/ _ \\| '__| '_ \\| '_ \\| | '_ \\  ");   
        System.out.println (" | |  | | | (_| | | | | |_| |_| | | |  | | (_) | |  | | | | |_) | | | | | ");  
        System.out.println (" |_|  |_|_|\\__, |_| |_|\\__|\\__, | |_|  |_|\\___/|_|  |_| |_| .__/|_|_| |_| ");  
        System.out.println ("            __/ |           __/ |                         | |             ");  
        System.out.println ("  _____    |___/           |___/_____                     |_|             ");  
        System.out.println (" |  __ \\                       |  __ \\                                    ");  
        System.out.println (" | |__) |____      _____ _ __  | |__) |__ _ _ __   __ _  ___ _ __ ___     ");  
        System.out.println (" |  ___/ _ \\ \\ /\\ / / _ \\ '__| |  _  // _` | '_ \\ / _` |/ _ \\ '__/ __|    ");  
        System.out.println (" | |  | (_) \\ V  V /  __/ |    | | \\ \\ (_| | | | | (_| |  __/ |  \\__ \\    ");  
        System.out.println (" |_|   \\___/ \\_/\\_/ \\___|_|    |_|  \\_\\__,_|_| |_|\\__, |\\___|_|  |___/    ");  
        System.out.println ("                                                  __/  |                  ");  
        System.out.println ("                                                  |___/   ");  
        //The adventures of the Mighty Morpin Power Rangers is name of the game.
        String usernameVerify = IBIO.inputString ("\nPlease login by entering username:");
        //The user is logging in by first using Username. 
        while (!username.equals (usernameVerify))
        {
            //If the username is entered incorrectly.
            System.out.println ("Please try entering username again.");
            usernameVerify = IBIO.inputString ("\nPlease login by entering username:");
        }
    if (username.equals (usernameVerify)) 
    {
        System.out.println ("Now for your password!");
        //Moving on to passwords.
}
String passwordVerify = IBIO.inputString ("\nPlease login by entering password:");
//The user is logging in by first using Username. 
while (!password.equals (passwordVerify))

{
    //If the username is entered incorrectly.
    System.out.println ("Please try entering password again.");
    passwordVerify = IBIO.inputString ("\nPlease login by entering password:");
}
if (password.equals (passwordVerify))
{
    System.out.println ("Game begins in 3, 2, 1...");
    //The game is now about to begin.
}
        char exitGame = 'n';//Declared for the user if they want to play again.
           while (exitGame!='y')
       {
        partOne();
        partTwo();
        partThree();
        partFour();
        partFive();
    //Only if the user wants to start playing that, the 5 methods are called.
    char continueGame = IBIO.inputChar ("Congrats on finishing the game. Would you like to play again? (y/n)");
    //If the user wants to play again...Question will be asked after all 5 methods have been called.
    if (continueGame == 'n')
           {
               System.out.println ("It's alright. You did a great job! Have a great day!");
               //If the user does not want to play again.
            }
}
}
public static void sound (File f)
    {
        try {
            Clip C = AudioSystem.getClip();//Declaring object for the music file to store in.
            C.open (AudioSystem.getAudioInputStream(f));
            C.start();//The background music will begin here.
            C.loop(Clip.LOOP_CONTINUOUSLY);//This will loop the background music.
            //The video will take 1 or 2 sec at the end because of the MP3 file as downloaded.
}
catch (Exception error) {
    System.out.println ("File not found.");
    //This is only when the music file is not found. However, the only reason it is included is because of the try.
}
}

public static void partOne()//Method number 1 is the the introduction to the game.
{
    System.out.println ("Please press the Enter key to progress in game, unless adviced to input else wise.");
    //This is better to let the user focus on script. This also gives a more realistic feel to the game.
    //This also makes it similar to real life games.
    String birthday = IBIO.inputString ("\nTo continue, when is your birthday (month,date)" + username + "?");
    city = IBIO.inputString ("Which city are you from," + username + "?");
    age = IBIO.inputInt ("What is your age " + username + "?");
    country = IBIO.inputString ("\nWhich country are you from," + username + "?");
    language = IBIO.inputString ("What language do you speak," + username + "?");
    //The birthday, city and age is a part of the story. 
    //Priorly, it was randomly set but this will give the user a more connection.
System.out.println ("\n My life changed in the span of one sunny afternoon. It all began on my birthday of " + birthday + ".");
IBIO.input();//This is what I use so that the Enter key is used to progress in the script.
System.out.println ("This was the day I first heard the words, ‘Welcome to the Power Rangers', " + username + ".");
IBIO.input();
System.out.println ("A man, in a bright, fancy golden suit introduced himself as the Golden Ranger.");
IBIO.input();
System.out.println ("At first, my opinion of this ‘Golden Ranger’ was just a plain old weirdo who was not in his right mind.");
IBIO.input();
System.out.println ("Oh, and I thought he was very creepy!");
IBIO.input();
System.out.println ("Then he started to talk about how the elders have chosen ME as their new recruit for a group known as the Power Rangers.");
IBIO.input();
System.out.println ("Everyone in the city knew of the Power Rangers.");
IBIO.input();
System.out.println ("One thing that the Golden Ranger emphasized on was, how the Power Rangers are given mighty powers in order to serve the world.");
IBIO.input();
System.out.println ("Hence they could not be used for selfish reasons, and blah, blah, and more blah.");
IBIO.input();
System.out.println ("Finally the true question was asked, which was, if I wanted be a Power Ranger.");
IBIO.input();
System.out.println ("I was so confused...My life was a total mess because I didn't know what to do!");
IBIO.input();
//I have begun introducing characters.
char answer = IBIO.inputChar ("Make a wise decision...Would you like to be a part be a part of the team? (y/n)");
//Major decision in the user's life in the game.
if (answer == 'n')
{
    System.out.println ("Golden Ranger: Everyone makes mistakes, and we must have made one too. Bye and good luck!");
    //If the answer is no, nothing can be done to influence their opinion. Then the game quits.
}
else 
{
    System.out.println ("\n Of course I said YES! I still coudn't believe a " + age + " year old like myself has gotten a job like this!");
    IBIO.input();
    System.out.println ("Golden Ranger: Welcome to the team " + username + " ,and the first task is to choose a colour ranger.");
    IBIO.input();
    System.out.println ("Golden Ranger: You have a total of 5 options: Red, Blue, Black, Pink and Yellow. Choose well!");
    colour = IBIO.inputString (username + " which colour Ranger would you like to be? (Enter a colour):");
    System.out.println ("\nGolden Ranger: The " + colour + " Ranger is a great choice for yourself, " + username);
    IBIO.input();
    System.out.println ("Golden Ranger: As a Power Ranger, you get specific utilities and weapons. So, here they are:");
    IBIO.input();
//ASCII Art #2
System.out.println ("          ./~                  ");
System.out.println ("(=@@@@@@@=[}=================--");
System.out.println ("          `\\__                  ");
IBIO.input();
System.out.println ("\n No way, I got a sword! But there was more...!");
//Using the Enter key also helps build suspense for the user, as they don't see all the utilities provided.
IBIO.input();
//ASCII Art #3
System.out.println ("  |\\ _..--.._ /|");
System.out.println ("  |############|");
System.out.println ("   )##########(");
System.out.println ("._/##.'//\\'.##\\_.");
System.out.println (" .__)#((()))#(__.");
System.out.println ("  \\##'.\\//.'##/");
System.out.println ("   \\####\\/####/");
System.out.println ("   /,.######.,\\ ");
System.out.println ("  (  \\##__##/  )");
System.out.println ("      \"(\\/\\)\" ");
System.out.println ("        )(");
IBIO.input();
System.out.println ("\n And I got a shield!");
IBIO.input();
//ASCII Art #4
System.out.println ("_.-=\"\"_-         _");
System.out.println ("                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..");
System.out.println ("             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'");
System.out.println ("      __.--\"\"     __        ,'                   o \\           __        [__|");
System.out.println (" __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:");
System.out.println ("]       [w] : /        \\ : |========================|    : /        \\ :  [w] :");
System.out.println ("V___________:|          |: |========================|    :|          |:   _-\"");
System.out.println (" V__________: \\        / :_|=======================/_____: \\        / :__-\"");
System.out.println (" -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
IBIO.input();
System.out.println ("I got a Power Ranger vehicle as well!");
IBIO.input();
System.out.println ("As I was admiring my weapons and utilities, suddenly the Golden Ranger grabbed me and we disappeared.");
IBIO.input();
System.out.println ("That 'space' was exactly how Google said it was...A free, unoccupied and available area.");
IBIO.input();
System.out.println ("The depressing fact, was, I couldn't feel anyone's presence within the space.");
IBIO.input();
System.out.println ("And just in the blink of the eye, we were back out in daylight in front of a weird house.");
IBIO.input();
System.out.println ("The house looked like one of the Japanese culture, and had the shape of traditional Japanese dojos.");
IBIO.input();
System.out.println ("Then an old name came walking outside with a sense of tension on his face.");
IBIO.input();
System.out.println ("The Golden Ranger addressed him as 'Sensei'. Might I say, he was the most muscular 65-year old I had seen!");
IBIO.input();
System.out.println ("I felt that if 'Sensei' were to slap me, I would fly to Jupiter and never return.");
IBIO.input();
System.out.println ("Sensei: Good afternoon Golden Ranger and " + colour + " ranger. We have high expectations for you, new recruit.");
IBIO.input();
System.out.println ("Sensei: You may not like to hear this during the first day of the job " + colour + " ranger, however, a very large problem has occurred…");
IBIO.input();
System.out.println ("Golden Ranger: What seems to be the problem Sensei?");
IBIO.input();
System.out.println ("Sensei: Right before the 2 of you arrived, the ‘problem screen’ started blaring.");
IBIO.input();
System.out.println ("Golden: I'm guessing the evil activities of the villain Rita Repulsa, have begun to stir in the city?");
IBIO.input();
System.out.println ("Sensei: Yes. Therefore, the rest of the Power Rangers have gone to save the city from evil.");
IBIO.input();
System.out.println ("Sensei: However, the other Power Rangers were too overwhelmed by the number of enemies and hence were captured by our Rita.");
IBIO.input();
System.out.println ("Golden Ranger: As Power Rangers, it makes it our duty to rescue the others! I will teleport us.");
IBIO.input();
System.out.println ("For the longest time, I didn't know what to say. I was ready to bombard everyone with questions but I didn't.");
IBIO.input();
System.out.println ("Having been a Power Ranger for about 20 minutes, I knew it was my job to help save my “soon to be” friends and colleagues."); 
IBIO.input();
System.out.println ("Golden Ranger: Don't worry Sensei. We will defeat the enemies and bring back the others!");
IBIO.input();
System.out.println ("Sensei: Go forth my Power Rangers, and do the very best you can!");
IBIO.input();
System.out.println ("It was very annoying how the both of them were very overdramatic when talking. I was ready to resign from my new job...");
IBIO.input();
System.out.println ("But my inner gut told me not to...");
IBIO.input();
//There has been a progression in the game and story.
char gameContinue = IBIO.inputChar ("Golden Ranger: Are you ready, " + colour + " ranger? (y/n)");
if (gameContinue == 'n')
{
    System.out.println ("\nGolden Ranger: I know this is your first mission. Don't worry, I am with you. So, let's go!");
    IBIO.input();
    //Younger aged users would be scared of these kind of situations as they don't want to complete hard missions.
    //Thus these lines are for encouragement.
}
else 
{
    System.out.println ("Golden Ranger: You are so fearless. Let’s go," + colour + "ranger!");
    IBIO.input();
    //Another encouragement line to keep the user going.
}
}
}
public static void partTwo()//The stroy has progressed and is getting more interesting.
{
   System.out.println ("\n Golden Ranger: We have reached the spaceship of Rita Repulsa. We must be careful here.");
    IBIO.input(); 
//ASCII Art #5
System.out.println ("                /___.`--.____ .--. ____.--(");
System.out.println ("                      .'_.- (    ) -._'.");
System.out.println ("                     .'.'    |'..'|    '.'.");
System.out.println ("              .-.  .' /'--.__|____|__.--'\\ '.  .-.");
System.out.println ("             (O).)-| |  \\    |    |    /  | |-(.(O)");
System.out.println ("              `-'  '-'-._'-./      \\.-'_.-'-'  `-'");
System.out.println ("                 _ | |   '-.________.-'   | | _");
System.out.println ("              .' _ | |     |   __   |     | | _ '.");
System.out.println ("             / .' ''.|     | /    \\ |     |.'' '. \\");
System.out.println ("             | |( )| '.    ||      ||    .' |( )| |");
System.out.println ("             \\ '._.'   '.  | \\    / |  .'   '._.' /");
System.out.println ("              '.__ ______'.|__'--'__|.'______ __.'");
System.out.println ("             .'_.-|         |------|         |-._'.");
System.out.println ("            //\\  |         |--::--|         |  //\\");
System.out.println ("           //  \\ |         |--::--|         | //  \\");
System.out.println ("          //    \\|        /|--::--|\\        |//    \\");
System.out.println ("         / '._.-'/|_______/ |--::--| \\_______|\\`-._.' \\");
System.out.println ("        / __..--'        /__|--::--|__\\        `--..__ \\");
System.out.println ("       / /               '-.|--::--|.-'               \\ \\");
System.out.println ("      / /                   |--::--|                   \\ \\");
System.out.println ("     / /                    |--::--|                    \\ \\");
System.out.println (" _.-'  `-._                 _..||.._                  _.-` '-._");
System.out.println ("'--..__..--' LGB           '-.____.-'                '--..__..-'");
 IBIO.input();
System.out.println ("As soon as the Golden Ranger and I reach the spaceship, something happened...");
IBIO.input();
System.out.println("The problem meter on the Golden Ranger’s arm started to go, 'BRRING, BRRING, BRRING'");
IBIO.input();
System.out.println("Usually normal people ask, 'What happened?' but my first question was, 'What is that ringtone?'.");
IBIO.input();
//Humour in script also helps keep the user's interest.
System.out.println ("The Golden Ranger unfortunately gives my a cold stare.");
IBIO.input();
System.out.println("Golden Ranger: Oh no, it looks the minions of Rita are causing trouble in other parts of the city now.");
IBIO.input();
System.out.println ("We have to save the citizens of the city!");
IBIO.input();
System.out.println ("In return I said that we also had to save the other fellow Power Rangers! So what should we do?");
IBIO.input();
 double r= Math.random()*2+1;
        for (int i=1; i<=2; i++)//This is a variation of the Daisy Program
        {
            if (i % 2 == 0)
            {
              System.out.println("\nGolden Ranger: I should stay with you, Ranger. You are a new recuit.");
              System.out.println("Me: We will have to split Golden Ranger. I will save the Power Rangers. Don't worry!");
              System.out.println ("Golden Ranger: Good job " + colour + "ranger. I will try to be back as soon as possible!");
              System.out.println ("However, before you go, can I ask you 1 question?");
              System.out.println ("Me: For sure!");
      
              int question = IBIO.inputInt("\nAsk any question to the Golden Ranger:");
              //This is a variation of the Magic8Ball program.
         int number = (int) (Math.random () *8)+1;
         if (number == 1)
             System.out.println ("Golden Ranger: Outlook is not so good. But try your best!");
         else if (number == 2)
             System.out.println ("Golden Ranger: Don't count on it. Try your best! ");
         else if (number == 3)
             System.out.println ("Golden Ranger: My sources say no. But try your best!");
         else if (number == 4)
             System.out.println ("Golden Ranger: Without a doubt. You will do the best!");
         else if (number == 6)
             System.out.println ("Golden Ranger: It is certain. You will succeed!");
         else if (number == 7)
             System.out.println ("Golden Ranger: As I see it yes, you will succeed!");
         else if (number == 8)
            System.out.println ("Golden Ranger: Yes definitely. you will succeed!");
            
            System.out.println ("\n Thank you very much Golden Ranger! I promise you that I will complete this mission!");
            System.out.println ("Golden Ranger: That's what I would like to hear "  + colour +  " ranger! Bye!");
            System.out.println ("Bye Golden Ranger!");
            IBIO.input();
            break;//Which ever part of the Daisy program is printed, after that it breaks from loop.
            }
            
              else//Just like the Daisy program, there are 2 sides to each of them.
              //In this case, it's leaving the user alone and staying with the user.
              {
                  System.out.println("\nGolden Ranger: I should leave you Ranger. You will do good, don't worry.");  
                  System.out.println ("That's alright Golden Ranger. I will save the other Power Rangers!");
                  System.out.println ("Good job " + colour + " ranger. I will try to be back as soon as possible!");
                  System.out.println ("However, before you go, can I ask you 1 question?");
                  System.out.println ("For sure!");
      
              int question = IBIO.inputInt("\nAsk any question to the Golden Ranger:");
              //Same variation of the Magic8Ball program.
         int number = (int) (Math.random () *8)+1;
         if (number == 1)
             System.out.println ("Golden Ranger: Outlook not so good. But try your best!");
         else if (number == 2)
             System.out.println ("Golden Ranger: Don't count on it. But try your best! ");
         else if (number == 3)
             System.out.println ("Golden Ranger: My sources say no. But try your best!");
         else if (number == 4)
             System.out.println ("Golden Ranger: Without a doubt. You will do the best!");
         else if (number == 6)
             System.out.println ("Golden Ranger: It is certain that you will succeed!");
         else if (number == 7)
             System.out.println ("Golden Ranger: Try your best and you will succeed!");
         else if (number == 8)
            System.out.println ("Golden Ranger: Yes definitely. You will succeed!");
            
            System.out.println ("\n Thank you very much Golden Ranger! I promise you that I will complete this mission!");
            System.out.println ("Golden Ranger: That's what I would like to hear " + colour + " ranger! Bye!");
            System.out.println ("Bye Golden Ranger!");
            IBIO.input();
            break;//Which ever part of the Daisy program is printed, after that it breaks from loop.
            }
}
}
public static void partThree ()//The Golden Ranger has left and the user has to complete the mission alone.
{
    System.out.println ("\nTo say the truth, I was very scared completing this mission alone.");
    IBIO.input();
    System.out.println ("Just 1 hour ago, I was enjoying my birthday, preparing for my interview and ready for a date.");
    IBIO.input();
    System.out.println ("And now, in that span of 1 hour, I became a Power Ranger, was given powers and am on an ENEMY SHIP.");
    IBIO.input();
    System.out.println ("In the distance I could hear chatter in an unfamiliar language...");
    IBIO.input();
    System.out.println ("Perhaps Rita and her minions from not from " + country + "?");
    IBIO.input();
    System.out.println ("Anyways, I could see a hallway closeby and decided to start the rescue mission by going through there.");
    IBIO.input();
    System.out.println ("The hallway itself was very narrow and short, which was why I had to stoop low.");
    IBIO.input();
    System.out.println ("As soon as I reached the other side, an enemy saw me.");
    IBIO.input();
    System.out.println ("He yelled something I was not able to comprehend and charged towards me.");
    IBIO.input();
    System.out.println ("Until now, my biggest mistake was thinking that these enemies were 'humans'");
    IBIO.input();
    System.out.println ("There were 2 horns coming out of his hands, sharp teeth, had only 1 eye and his ear was on his skull.");
    IBIO.input();
    System.out.println ("His hair was surrounding his ear. Not to judge or discriminate, but the enemy really looked ugly.");
    IBIO.input();
    System.out.println ("Anyways, besides the horrid looks, the enemy was charging at me with a face full of hatred and aggression.");
    IBIO.input();
    System.out.println ("I summoned my sword and shield, looking at the enemy in the eyes, ready for a good fight.");
    IBIO.input();
    System.out.println ("I have gotten so much better at lying to myself! WOW, what an accomplishment!");
    IBIO.input();
    System.out.println ("In honesty, my hands were shaking so much while holding the sword and shield. I didn't know what to do!");
    IBIO.input();
    System.out.println ("The enemy scared me so much, that I was willing to crawl back into the hallway!");
    IBIO.input();
    System.out.println ("As soon as the enemy saw my sword and shield, he suddenly stopped himself.");
    IBIO.input();
    System.out.println ("Then he started to carve something on the floor of the ship, with the horns on his hands.");
    IBIO.input();
    System.out.println ("I was surprised at the fact that, what he was writing was in " + language + "!");
    IBIO.input();
    System.out.println ("Then he motioned for me to read what he wrote. I felt an emotion of relief! He was telling me the rules of CSS!");
    IBIO.input();
    System.out.println ("CSS (cannons, swords and shields) was basically Rock, Paper Scissors on Earth.");
    IBIO.input();
    System.out.println ("However, the only difference was, rock was substituted by cannons, scissors by swords and paper by the shield.");
    IBIO.input();
    System.out.println ("And the fact that, we were playing CSS for OUR LIVES! But if he wanted a game of CSS, I was going to give him one!");
    IBIO.input();
   
       char welcome = IBIO.inputChar ("\nAre you ready to defeat the enemy, " + username + " ? (y/n)");
       //In both answers, CSS is played. However, this gives the user more choice.
           if (welcome == 'y')
           {
           while (enemyHealth > 0)
           {
           playCSS ();//As either of their lives are greater than 0, the game runs.
           if (userHealth == 0)
           {
               System.out.println ("\nOh no! I have failed the Power Rangers! I am going to die!");
               char playAgainFive = IBIO.inputChar ("\nDo you want to play again? (y/n)");
               if (playAgainFive == 'y')
               {
                   System.out.println ("\nThat's the spirit! Let's go!");
               userHealth = 75;
               enemyHealth = 75;
               t=0;
               w=0;
               z=0;
               //Resetting values for all the required variables.
           }
           else {
           System.out.println ("I have done a great job so far! I hope to come back and save the Power Rangers!");
           break;
           //This is only if they want to quit the game, which is basically what they are doing.
        }
}
}
}

        else 
        {
            System.out.println ("\nAs a Power Ranger, I must defeat the enemy!");
             while (enemyHealth > 0)
           {
           playCSS ();//As either of their lives are greater than 0, the game runs.
        
           if (userHealth == 0)
           {
               System.out.println ("\nOh no! I have failed the Power Rangers! I am going to die!");
               char playAgainFive = IBIO.inputChar ("\nDo you want to play again? (y/n)");
               if (playAgainFive == 'y')
               {
               userHealth = 75;
               enemyHealth = 75;
               t=0;
               w=0;
               z=0;
               //Resetting values for all the required variables.
           }
           else {
           System.out.println ("I have done a great job so far! I hope to come back and save the Power Rangers!");
           break;
           //This is only if they want to quit the game, which is basically what they are doing.
        }
        } 

}
}
}
        public static void playCSS()//Variation of Rock,Paper,Scissors.
        {
         char userOption = IBIO.inputChar ("\nPlease choose one of the following, Cannon, Shield or Sword. (c/S/s)");
         int computerOption = (int) ((Math.random()*3)+1);//I have randomized the options.
         //This will make it more fun and harder for the user.
         if (computerOption == 1)
         {
             System.out.println ("The computer has chosen cannons.");
}
else if (computerOption == 2)
{
    System.out.println ("The computer has chosen shields.");
}
else 
{
    System.out.println ("The computer has chosen swords.");
}
if (userOption == 'c' && computerOption == 3 || userOption == 'S' && computerOption == 1 || userOption == 's' && computerOption == 2)
//These are all the ways for the user to win.
{
    System.out.println ("Wow! I have won this round!");
    w++;
    enemyHealth = enemyHealth-25;
    System.out.println ("The enemy is at, " + enemyHealth);
    System.out.println ("I am at, " + userHealth);
    System.out.println ("I have won:  " + w + " times!");
}
else if (userOption == 's' && computerOption == 1 || userOption == 'c' && computerOption == 2 || userOption == 'S' && computerOption == 3)
//These are all the ways for the computer or enemy to win.
{
    System.out.println ("Unfortunately, the enemy has won this round!");
    z++;
    userHealth = userHealth - 25;
    System.out.println ("The enemy is at, " + enemyHealth);
    System.out.println ("I am at, " + userHealth);
    System.out.println ("Unfortunately,I have lost: " + z + "  times!");
}
else if (userOption == 'c' && computerOption == 1 || userOption == 'S' && computerOption == 2 || userOption == 's' && computerOption == 3)
//These are all the ways for the user and enemy or computer to have a tie.
{
    System.out.println ("It is a tie this round.");
    t++;
    System.out.println ("The enemy is at, " + enemyHealth);
    System.out.println ("I am at, " + userHealth);
    System.out.println ("I have tied: " + t + " times!");
}
}
public static void partFour ()
{
    userHealth = 75;//The user health has gone back to 75 (if they lost health in the previous game).
    enemyHealth = 75;//The new enemy also has 75 health.
    System.out.println ("\nI defeated my very first enemy, as the " + colour + " ranger!");
    IBIO.input();
    System.out.println ("Even though I was exhausted from playing CSS, I knew I had a long way to go!");
    IBIO.input();
    System.out.println ("However the only confusing part of a 'long way' was navigation. I didn't know where to go!");
    IBIO.input();
    System.out.println ("From the surroundings, there were only 2 possible routes. Go left or right. Which way should I go?");
    IBIO.input();
    String path = IBIO.inputString ("Which way is the best to go? (left/right)");
    if (path.equals ("left"))
    {
    System.out.println ("\nMy instinct told me to go left.");
    IBIO.input();
    System.out.println ("I wasn't surprised when I crossed paths with an other dark hallway.");
    IBIO.input();
    System.out.println ("However, this time I wasn't scared of passing because, I knew my actions were for the good.");
    IBIO.input();
    System.out.println ("And because this hallway was twice the size of the previous one!");
    IBIO.input();
    //Describing my surroundings will indulge the user in the game.
    System.out.println ("As I comfortably walked through the tunnel, I was getting really nervous for no real reason.");
    IBIO.input();
    System.out.println ("Suddenly, I walk into a large room that had life-sized candles in the centre.");
    IBIO.input();
    System.out.println ("The candles were formed in the shape of a circle.");
    IBIO.input();
    System.out.println ("In the centre sat another enemy who looked quite different in nature to the previous one.");
    IBIO.input();
    System.out.println ("The opponent looked very calm and seemed like, was in the state of meditation.");
    IBIO.input();
    System.out.println ("Hence, I tried to avoid a fight by sneaking past him, towards the exit door on the opposite side.");
    IBIO.input();
    System.out.println ("Just as I was about to leave the room, the enemy says:");
    IBIO.input();
    System.out.println ("Enemy: That is not the way to go. The exit is behind me. To leave, you must defeat me.");
    IBIO.input();
    System.out.println ("I could not tell the appearance of the enemy but I could hear him clearly.");
    IBIO.input();
    System.out.println ("I was surprised at the fact that my enemy could speak English!");
    IBIO.input();
    System.out.print ("It seems as if the enemy read my mind when he said:");
    IBIO.input();
    System.out.println ("Enemy: Unlike the previous enemy you faced," + colour + "ranger, I, Gargill carry other abilities.");
    IBIO.input();
    System.out.println ("For example, the ability to talk to humans.");
    IBIO.input();
    System.out.println ("Then he said that I could not beat him by force because, I had to beat him using MATH.");
    IBIO.input();
    System.out.println ("Oh how I hated that subject in school! I knew this was going to be harder than CSS!");
    IBIO.input();
    System.out.println ("Enemy: I will give you 3 mathematical questions and you must answer all of them correctly to pass.");
    IBIO.input();
    System.out.println ("Enemy: For every question you answer incorrectly, death will be yours.");
    IBIO.input();
    System.out.println ("Enemy: And for every question you answer correctly, I lose health.");
    IBIO.input();
    System.out.println ("Luckily I had enough time to replenish my health to full, before talking to Gargill.");
    IBIO.input();
    //Health goes back to 75.
    char math = IBIO.inputChar ("Enemy: Are you ready for the questions? (y/n)");
    if (math == 'y')
    {
        while (l==1)
        {
            playMath ();//Method for my math game.
  if (l==0)//l only becomes 0 when the user gets a question wrong.
  //This means that to restart the loop and the math part, I have to make l = 0.
           {
             System.out.println ("Enemy: You have failed, " + colour + " ranger!");
             System.out.println ("Oh no, I have failed my job as a Power Ranger! I am going to die!");
             char playAgain = IBIO.inputChar ("\nDo you want to play again?");
             if (playAgain == 'y')
             {
                 System.out.println ("\nThat's the spirit! Let's go!");
                 l=1;//l was equal to 0, which is why it is in this if statement.
                 //Thus l also need to be 1 again.
                 userHealth = 75;//The user health has previously become 0, as they have died.
                 //Only happens when the question is wrong.
                 enemyHealth = 75;
    }

    else 
    {
       System.out.println ("I did a good job so far. I hope to see myself return and save the Power Rangers!");
        break;
        //This is only if they want to quit the game, which is basically what they are doing.
    }
}
}
}
else 
        {
System.out.println ("As a Power Ranger, I must defeat the enemy!");
while (l==1)
        {
            playMath ();//Method for my math game.
  if (l==0)//l only becomes 0 when the user gets a question wrong.
  //This means that to restart the loop and the math part, I have to make l = 0.
           {
             System.out.println ("Enemy: You have failed, " + colour + " ranger!");
             System.out.println ("Oh no, I have failed my job as a Power Ranger! I am going to die!");
             char playAgain = IBIO.inputChar ("\nDo you want to play again?");
             if (playAgain == 'y')
             {
                 l=1;//l was equal to 0, which is why it is in this if statement.
                 //Thus l also need to be 1 again.
                 userHealth = 75;//The user health has previously become 0, as they have died.
                 //Only happens when the question is wrong.
                 enemyHealth = 75;
    }

    else 
    {
       System.out.println ("I did a good job so far. I hope to see myself return!");
        break;
        //This is only if they want to quit the game, which is basically what they are doing.
    }
}
}
}
}
else 
{
   System.out.println ("\nMy instinct told me to go right.");//Same thing as the left option.
    IBIO.input();
    System.out.println ("I wasn't surprised when I crossed paths with an other dark hallway.");
    IBIO.input();
    System.out.println ("However, this time I wasn't scared of passing because, I knew my actions were for the good.");
    IBIO.input();
    System.out.println ("And because this hallway was twice the size of the previous one!");
    IBIO.input();
    System.out.println ("As I comfortably walked through the tunnel, I was getting really nervous for no real reason.");
    IBIO.input();
    System.out.println ("Suddenly, I walk into a large room that had life-sized candles in the centre.");
    IBIO.input();
    System.out.println ("The candles were formed in the shape of a circle.");
    IBIO.input();
    System.out.println ("In the centre sat another enemy who looked quite different in nature to the previous one.");
    IBIO.input();
    System.out.println ("The opponent looked very calm and seemed like, was in the state of meditation.");
    IBIO.input();
    System.out.println ("Hence, I tried to avoid a fight by sneaking past him, towardws the exit door on the opposite side.");
    IBIO.input();
    System.out.println ("Just as I was about to leave the room, the enemy says:");
    IBIO.input();
    System.out.println ("Enemy: That is not the way to go. The exit is behind. To leave, you must defeat me.");
    IBIO.input();
    System.out.println ("I could not tell the appearance of the enemy but I could hear him clearly.");
    IBIO.input();
    System.out.println ("I was surprised at the fact that my enemy could speak English!");
    IBIO.input();
    System.out.print ("It seems as if the enemy read my mind when he said:");
    IBIO.input();
    System.out.println ("Enemy: Unlike the previous enemy you faced," + colour + "ranger, I, Gargill carry other abilities");
    IBIO.input();
    System.out.println ("For example, the ability to talk to humans.");
    IBIO.input();
    System.out.println ("Then he said that I could not beat him by force because, I had to beat him using MATH.");
    IBIO.input();
    System.out.println ("Oh how I hated that subject in school! I knew this was going to be harder than CSS!");
    IBIO.input();
    System.out.println ("Enemy: I will give you 3 mathematical questions and you must answer all of them correctly to pass.");
    IBIO.input();
    //All 3 math questions need to be answered for the user to pass.
    System.out.println ("Enemy: For every question you answer incorrectly, death will be yours.");
    IBIO.input();
    System.out.println ("Enemy: And for every question you answer correctly, I lose health.");
    IBIO.input();
    System.out.println ("Luckily I had enough time to replenish my health to full, before talking to Gargill.");
    IBIO.input();
    char math = IBIO.inputChar ("Enemy: Are you ready for the questions? (y/n)");
 if (math == 'y')
    {
        while (l==1)
        {
            playMath ();//Method for my math game.
  if (l==0)//l only becomes 0 when the user gets a question wrong.
  //This means that to restart the loop and the math part, I have to make l = 0.
           {
             System.out.println ("Enemy: You have failed, " + colour + " ranger!");
             System.out.println ("Oh no, I have failed my job as a Power Ranger! I am going to die!");
             char playAgain = IBIO.inputChar ("\nDo you want to play again?");
             if (playAgain == 'y')
             {
                 l=1;//l was equal to 0, which is why it is in this if statement.
                 //Thus l also need to be 1 again.
                 userHealth = 75;//The user health has previously become 0, as they have died.
                 //Only happens when the question is wrong.
                 enemyHealth = 75;
    }

    else 
    {
       System.out.println ("I did a good job so far. I hope to see myself return!");
        break;
    }
}
}
}
else 
        {
System.out.println ("As a Power Ranger, I must defeat the enemy!");
while (l==1)
        {
            playMath ();//Method for my math game.
  if (l==0)//l only becomes 0 when the user gets a question wrong.
  //This means that to restart the loop and the math part, I have to make l = 0.
           {
             System.out.println ("Enemy: You have failed, " + colour + " ranger!");
             System.out.println ("Oh no, I have failed my job as a Power Ranger! I am going to die!");
             char playAgain = IBIO.inputChar ("\nDo you want to play again?");
             if (playAgain == 'y')
             {
                 l=1;//l was equal to 0, which is why it is in this if statement.
                 //Thus l also need to be 1 again.
                 userHealth = 75;//The user health has previously become 0, as they have died.
                 //Only happens when the question is wrong.
                 enemyHealth = 75;
    }

    else 
    {
       System.out.println ("I did a good job so far. I hope to see myself return and save the Power Ranger!");
        break;
    }
}
}
}
}
if (l==2)
{
    System.out.println ("\nEnemy: Very good job. Along with strength in combat, you also carry wits.");
    System.out.println ("Enemy: I, Gargill, give you permission to pass. May you survive what is to come next!");
    System.out.println ("I was so proud of defeating an enemy of such calibre! However, I still had more to do.");
    System.out.println ("I HAD TO FIND THE OTHER POWER RANGERS!");
    IBIO.input();
}
}
public static void playMath()//The method that is for the math questions.
{
        int questionOne = (int) ((Math.random()*3)+1);//Randomizes amongst 3 easy questions.
        if (questionOne == 1)
        {
            int answerOne = IBIO.inputInt ("\n Enemy: Your first question is: What's 21-21?");
            if (answerOne == 0)
            {
                enemyHealth = enemyHealth - 25;
                System.out.println ("I got my first question correct!");
                System.out.println ("I got 1 question correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}
}
else if (questionOne == 2)
        {
            int answerOne = IBIO.inputInt ("\n Enemy: Your first question is: What's (21+3)-4?");
            if (answerOne == 20)
            {
                enemyHealth = enemyHealth - 25;
                System.out.println ("I got my first question correct!");
                System.out.println ("I got 1 question correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}
}
else
        {
            int answerOne = IBIO.inputInt ("\n Enemy: Your first question is: What's 50+50?");
            if (answerOne == 100)
            {
                enemyHealth = enemyHealth - 25;
                System.out.println ("I got my first question correct!");
                System.out.println ("I got 1 question correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}
}
if (l==1)
{

int questionTwo = (int) ((Math.random()*3)+1); //Randomizes amongst 3 medium questions.
        if (questionTwo == 1)
{
    int answerTwo = IBIO.inputInt ("\n Enemy: Your second question is: What's 10*10?");
            if (answerTwo == 100)
            {
                enemyHealth = enemyHealth - 25;
                System.out.println ("I got the second question correct!");
                System.out.println ("I got 2 questions correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}
}
if (questionTwo == 2)
{
    int answerTwo = IBIO.inputInt ("\n Enemy: Your second question is: What's (100/10)*2?");
            if (answerTwo == 20)
            {
                enemyHealth = enemyHealth - 25;
                System.out.println ("I got the second question correct!");
                System.out.println ("I got 2 questions correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
}
else 
{
    userHealth = userHealth - 75;
    l=l-1;
}
}
if (questionTwo == 3)
{
    int answerTwo = IBIO.inputInt ("\n Enemy: Your second question is: What's 50/5?");
            if (answerTwo == 10)
            {
                enemyHealth = enemyHealth - 25;
                System.out.println ("I got the second question correct!");
                System.out.println ("I got 2 questions correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}
}
}
if (l==1)
{
int questionThree = (int) ((Math.random()*3)+1); //Randomizes amongst 3 hard questions.
        if (questionThree == 1)
{
    int answerThree = IBIO.inputInt ("\n Enemy: Your third question is: What's (5*5)-5?");
            if (answerThree == 20)
            {
                enemyHealth = 0;
                System.out.println ("I got the final question correct!");
                System.out.println ("I got 3 questions correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
                l=2;
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}
}
else if (questionThree == 2)
{
int answerThree = IBIO.inputInt ("\n Enemy: Your third question is: What's ((6+10)/4)*4?");
            if (answerThree == 16)
            {
                enemyHealth = 0;
                System.out.println ("I got the final question correct!");
                System.out.println ("I got 3 questions correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
                l=2;
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
} 
}   
else 
{
int answerThree = IBIO.inputInt ("\n Enemy: Your third question is: What's (10-10)*4?");
            if (answerThree == 0)
            {
                enemyHealth = 0;
                System.out.println ("I got the final question correct!");
                System.out.println ("I got 3 questions correct!");
                System.out.println ("The enemy is at, " + enemyHealth + " health.");
                System.out.println ("I am still at, " + userHealth + " health.");
                l=2;
}
else 
{
    userHealth = userHealth - 75;
    l = l - 1;
}    
}
}
}
public static void partFive ()//This is the last part of the story and the climax as well.
{
    System.out.println ("\nExiting the dark room led to another corridor which was quite different from the other 2.");
    IBIO.input();
    System.out.println ("In other words, it's shape and size were quite distinct is areas of shape and size.");
    IBIO.input();
    System.out.println ("Another fact was, it had a dim light that I could see at the end.");
    IBIO.input();
    //More descriptions of the surroundings.
    System.out.println ("I was quite creeped out and felt like I was walking into a trap.");
    IBIO.input();
    System.out.println ("However, I went on because my mission was to find the Power Rangers.");
    IBIO.input();
    System.out.println ("Once I made it through, I couldn't believe what I saw!");
    IBIO.input();
    System.out.println ("It was the mistress Rita along with the other Power Rangers!");
    IBIO.input();
    System.out.println ("I could see her talking to the Power Rangers, however, could not hear her.");
    IBIO.input();
    System.out.println ("Rita was dressed in all black with a golden crown on her head.");
    IBIO.input();
    System.out.println ("She carried a long rod with a bright blue gem on the top, in her right hand.");
    IBIO.input();
    System.out.println ("Her skin was the colour of milk chocolate, with sky blue eyes.");
    IBIO.input();
    //Character description of the villain.
    System.out.println ("Might I say, this room was the 4 times the size of my school, and in the shape of a dome.");
    IBIO.input();
    System.out.println ("On the opposite side of the room, there was a large chest, that had the shape of a trident printed on it.");
    IBIO.input();
    System.out.println ("I don’t why but my instincts told me to open up that chest."); 
    IBIO.input();
    System.out.println ("As quietly as I could, I made my way towards the chest.");
    IBIO.input();
    System.out.println ("My heart began racing at the speed of lighting as I moved.");
    IBIO.input();
    System.out.println ("By the time I reached the chest, my heart sped up to the speed of light! I was so nervous!");
    IBIO.input();
    System.out.println ("Oddly enough, there was a shape of a hand carved on the chest.");
    IBIO.input();
    System.out.println ("As soon as I rested my hand on the chest, the chest released a large amount of smoke.");
    IBIO.input();
    System.out.println ("Suddenly I heard a loud and distinct, 'Nooooo' in the distance.");
    IBIO.input();
    System.out.println ("As the smoke cleared, I could see a holographic image of a man waiting with arms crossed.");
    IBIO.input();
    System.out.println ("This man was dressed as if he was about to meet the Prime Minister of " + country + "!");
    IBIO.input();
    System.out.println ("In other words, he was so formally dressed. He looked like the same age as, 'Sensei'.");
    IBIO.input();
    System.out.println ("Not as much muscle as 'Sensei' but he still looked really strong.");
    IBIO.input();
    System.out.println ("His wrinkles and scars on this arms told me that he had survived through a lot of hardships.");
    IBIO.input();
    System.out.println ("Out of his mouth did not come a name or introduction, but only a question.");
    IBIO.input();
    System.out.print ("In the most robotic voice, he says:");
    IBIO.input();
    System.out.println ("Holographic Man: If you answer incorrectly, you shall die!");
    IBIO.input();
    System.out.println ("Then he asks:");
    IBIO.input();
    String riddleOne = IBIO.inputString ("Holographic Man: I have 3 points, and am used by the God of Sea. I can be lethal but can also aid anyone in need. What am I? (Hint:Shape printed on Chest)");
    //This is the 1st riddle. It must be answered correctly to progress in story.
    int k=0,m=0;//Variable for the trident program and for restarting the loop if riddle is answered wrong.
    if (riddleOne.toLowerCase().equals ("trident"))//Whatever the user inputs, it converts to lower case.
    //If it matches "trident" in the lower case form, it will continue.
    {
        k=1;
        System.out.println ("Everything just seemed like a blur. I remember answering the riddle correctly.");
        System.out.println ("And then the holographic man asked: 'How big do you want the trident to be?'");
      int tineLength = IBIO.inputInt ("What would you like the length to be?");
      int tineSpacing = IBIO.inputInt ("What would you like the spacing to be?");
      int handleLength = IBIO.inputInt ("What would you like the length of the handle to be?");
      //tineLength, tineSpacing and handleLength are variables and user inputs for trident program.
      int i,s;
        System.out.println ("\nI don't even remember what I said. So I just told him some random numbers.");
        System.out.println ("Then, in a sudden flash standing with a trident in my right hand.");
        IBIO.input();
        for (i=0; i<tineLength; i++)//Trident Program
      {
          System.out.print("*");
          //Spacing between prongs
          for (k=0; k < tineSpacing; k++)
          {
              System.out.print (" ");
            }
            System.out.print ("*");
            for (k=0; k < tineSpacing; k++)
            {
                System.out.print (" ");
            }
            System.out.println ("*");
        }
          for (int j = 0; j<=((tineSpacing*2)+2); j++)
          {
              System.out.print("*");
}
System.out.println();
//Printing Handle
for (int l = 0; l< handleLength; ++l)
{
 System.out.print (" ");
 for (int d = 0; d<=tineSpacing-1; d++)
 {
     System.out.print (" ");
}
System.out.println ("*");
}
System.out.println ("\nIt was somehow, exactly, as the measurements, I had given it.");
IBIO.input();
System.out.println ("It was in the colour of turquoise-blue and had 3 points that looked very sharp.");
IBIO.input();
System.out.println ("The points were a darker blue than the rest of the trident.");
IBIO.input();
//Description of the trident to amuse the user.
System.out.println ("Suddenly, I could hear and see Rita marching to me, with the intent to kill.");
IBIO.input();
System.out.println ("I was about to run, when the holographic man says:");
IBIO.input();
System.out.println ("Holographic Man: Rita can be killed with the Trident.");
IBIO.input();
System.out.println ("Holographic Man: All you have to do was answer the riddle.");
IBIO.input();
System.out.println ("Holographic Man: If you answer it correctly, you can use the Trident and stop Rita, once and for all.");
IBIO.input();
System.out.println ("I agreed and his question was:");
IBIO.input();
}
else
{
while (k == 0)
{
   System.out.println ("\nOh no! I have failed the Power Rangers! I am going to die!");
   char playAgain = IBIO.inputChar ("\n Do you want to play again? (y/n)");
   if (playAgain == 'y')
   {
       System.out.println ("\nI am faithfully following the role of a Power Ranger!");
   riddleOne = IBIO.inputString ("I have 3 points, and am used by the God of Sea. I can be lethal but can also aid anyone in need. What am I? (Hint:Shape printed on Chest)");
   if (riddleOne.toLowerCase().equals ("trident"))
   {
       k=1;
       System.out.println ("\nEverything just seemed like a blur. I remember answering the riddle correctly.");
        System.out.println ("And then the holographic man asked: 'How big do you want the trident to be?'");
      int tineLength = IBIO.inputInt ("What would you like the length to be?");
      int tineSpacing = IBIO.inputInt ("What would you like the spacing to be?");
      int handleLength = IBIO.inputInt ("What would you like the length of the handle to be?");
      int i,s;
        System.out.println ("I don't even remember what I said. So I just told him some random numbers.");
        System.out.println ("Then, in a sudden flash standing with a trident in my right hand.");
        IBIO.input();
        for (i=0; i<tineLength; i++)
      {
          System.out.print("*");
          //Spacing between prongs
          for (k=0; k < tineSpacing; k++)
          {
              System.out.print (" ");
            }
            System.out.print ("*");
            for (k=0; k < tineSpacing; k++)
            {
                System.out.print (" ");
            }
            System.out.println ("*");
        }
          for (int j = 0; j<=((tineSpacing*2)+2); j++)
          {
              System.out.print("*");
}
System.out.println();
//Printing Handle
for (int l = 0; l< handleLength; ++l)
{
 System.out.print (" ");
 for (int d = 0; d<=tineSpacing-1; d++)
 {
     System.out.print (" ");
}
System.out.println ("*");
}
System.out.println ("\nIt was somehow, exactly, as the measurements, I had given it.");
IBIO.input();
System.out.println ("It was in the colour of turquoise-blue and had 3 points that looked very sharp.");
IBIO.input();
System.out.println ("The points were a darker blue than the rest of the trident.");
IBIO.input();
System.out.println ("Suddenly, I could hear and see Rita marching to me, with the intent to kill.");
IBIO.input();
System.out.println ("I was about to run, when the holographic man says:");
IBIO.input();
System.out.println ("Holographic Man: Rita can be killed with the Trident.");
IBIO.input();
System.out.println ("Holographic Man: All you have to do was answer the riddle.");
IBIO.input();
System.out.println ("Holographic Man: If you answer it correctly, you can use the Trident and stop Rita, once and for all.");
IBIO.input();
System.out.println ("I agreed and his question was:");
IBIO.input();
}
else 
{
    k=0;
}
}
else 
{
    System.out.println ("I did a good job so far. I hope to see myself return and save the Power Ranger!");
        break;
}
}
}
String riddleTwo = IBIO.inputString ("\nHolographic Man: What has 4 legs as a baby, 2 legs as an adult and 3 legs when it is old?(Hint:What are you?)");
//Riddle number 2
if (riddleTwo.toLowerCase().equals("humans"))
{
    m=1;
    System.out.println ("\nI don't know how I got the answer correct, but I did and that's all that matters.");
    IBIO.input();
    System.out.println ("Holographic Man: Throw the trident the best you can at Rita.");
    IBIO.input();
    System.out.println ("Holographic Man: After the one shot, the trident will disappear. So if you miss it, you will die!");
    IBIO.input();
    System.out.println ("This holographic man was the most blunt person I had ever met!");
    IBIO.input();
    System.out.println ("I was really nervous because, the lives of the other Power Rangers and mine depended on this one shot.");
    IBIO.input();
    System.out.println ("However, I built my courage and took the best shot I could at Rita.");
    IBIO.input();
    System.out.println ("Surprisingly, it hit.");
    IBIO.input();
    System.out.println ("As soon as the trident hit Rita, both of them dissipated into nothing.");
    IBIO.input();
    System.out.println ("I ran over to my 'soon-to-be' friends, the other Power Rangers and freed them from their ties.");
    IBIO.input();
    System.out.println ("There were a total of 4 other Power Rangers.");
    IBIO.input();
    System.out.println ("Strangely, their eyes started to glow white and in unison, they said, 'Thank you,' " + colour + " ranger.");
    IBIO.input();
    System.out.println ("But you must go, YOU MUST WAKE UP!");
    IBIO.input();
    System.out.println ("I wanted to be modest but...");
    IBIO.input();
    System.out.println ("'Wait what? I am standing right infront of you', I told the others.");
    IBIO.input();
    System.out.println ("Once again, in unison they said, 'Goodbye Ranger. It was nice meeting you.'");
    IBIO.input();
    System.out.println ("I was so confused!");
    IBIO.input();
    System.out.println ("\nSuddenly my eyes opened in my bedroom, in my rental apartment.");
    IBIO.input();
    System.out.println ("It was a small 500 square-foot apartment, in which my bedroom was the biggest.");
    IBIO.input();
    System.out.println ("As soon as I looked around, I realized what a mess it was!");
    IBIO.input();
    System.out.println ("There was food, clothing and accessories everywhere!");
    IBIO.input();
    System.out.println ("Anyways, everything made sense now. All that I just saw was just a dream.");
    IBIO.input();
    System.out.println ("I mean who would choose me, of all people to be a Power Ranger?");
    IBIO.input();
    System.out.println ("Oh no! I just remembered about the meeting I had at 7 PM.");
    IBIO.input();
    System.out.println ("I looked at the alarm clock on my night table and saw that it was already 6:30 PM!");
    IBIO.input();
    System.out.println ("I freshened up as fast as I could and headed outside.");
    IBIO.input();
    System.out.println ("As soon as I ran outside, I stopped dead in my tracks because of what I saw.");
    IBIO.input();
    System.out.println ("It was a vehicle just parked outside my apartment.");
    IBIO.input();
    System.out.println ("It was none other than my Power Ranger vehicle...");
    IBIO.input();
    System.out.println ("\n TO BE CONTINUED...");
    IBIO.input();
    //That's the end of the story. It is good because, it leaves the user amused and ends with a cliffhanger.
}
else
{
while (m == 0)//This is to make the user play again, if they get the riddles wrong
{
   System.out.println ("\nOh no! I have failed the Power Rangers! I am going to die!");
   char playAgainTwo = IBIO.inputChar ("\n Do you want to play again? (y/n)");
   if (playAgainTwo == 'y')
   {
       System.out.println ("\nI am faithfully following the role of a Power Ranger!");
   riddleTwo = IBIO.inputString ("Holographic Man: What has 4 legs as a baby, 2 legs as an adult and 3 legs when it is old?(Hint:What are you?)");
if (riddleTwo.toLowerCase().equals("humans"))
   {
       m=1;
       System.out.println ("\nI don't know how I got the answer correct, but I did and that's all that matters.");
    System.out.println ("Holographic Man: Thow the trident the best you can at Rita.");
    System.out.println ("Holographic Man: After the one shot, the trident will disappear. So if you miss it, you will die!");
    System.out.println ("This holographic man was the most blunt person I had ever met!");
    System.out.println ("I was really nervous because, the lives of the other Power Rangers and mine depended on this one shot.");
    System.out.println ("However, I built my courage and took the best shot I could at Rita.");
    System.out.println ("Surprisingly, it hit.");
    System.out.println ("As soon as the trident hit Rita, both of them dissipated into nothing.");
    System.out.println ("I ran over to my 'soon-to-be' friends, the other Power Rangers and freed them from their ties.");
    System.out.println ("There were a total of 4 other Power Rangers.");
    System.out.println ("Strangely, their eyes started to glow white and in unison, they said, 'Thank you,' " + colour + "ranger.");
    System.out.println ("But you must go, YOU MUST WAKE UP!");
    System.out.println ("I wanted to be modest but...");
    System.out.println ("'Wait what? I am standing right infront of you', I told the others.");
    System.out.println ("Once again, in unison they said, 'Goodbye Ranger. It was nice meeting you.'");
    System.out.println ("I was so confused!");
    System.out.println ("\nSuddenly my eyes opened in my bedroom, in my rental apartment.");
    System.out.println ("It was a small 500 square-foot apartment, in which my bedroom was the biggest.");
    System.out.println ("As soon as I looked around, I realized what a mess it was!");
    System.out.println ("There was food, clothing and accessories everywhere!");
    System.out.println ("Anyways, everything made sense now. All that I just saw was just a dream.");
    System.out.println ("I mean who would choose me, of all people to be a Power Ranger?");
    System.out.println ("Oh no! I just remembered about the meeting I had at 7 PM.");
    System.out.println ("I looked at the alarm clock on my night table and saw that it was already 6:30 PM!");
    System.out.println ("I freshened up as fast as I could and headed outside.");
    System.out.println ("As soon as I ran outside, I stopped dead in my tracks because of what I saw.");
    System.out.println ("It was a vehicle just parked outside my apartment.");
    System.out.println ("It was none other than my Power Ranger vehicle...");
    System.out.println ("\n To be continued...");
    //I have left the story at a cliffhanger to make it a more interesting game.
}
else 
{
    m=0;//Starts the loop again.
}
}
else 
{
   System.out.println ("I did a good job so far. I hope to see myself return and save the Power Ranger!");
        break;
}
}
}
}
}




