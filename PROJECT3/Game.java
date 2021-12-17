import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void Ladder(int numPanels,Lives player){
        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        int[] panels = new int[numPanels * 2];
        // glass = 1 is tempered glass
        int glass = 0;
        char guess;
        int panelNum = 0;
        int panelAdd = 0;
        int counter = 0;
        for(int i = 0; i < panels.length; i+= 2){
            panels[i] = generator.nextInt(2);
            if(panels[i] == 1){
                panels[i + 1] = 0;
            }
            else if(panels[i] == 0){
                panels[i + 1] = 1;
            }
        }
        System.out.println("||||||  ---- Start");
        for(int i = 0; i < panels.length; i+= 2){
            System.out.println("|" + panels[i] + "||" + panels[i + 1] + "|");
        }
        System.out.println("||||||  ---- Finish");
        System.out.println();
        System.out.println("||||||  ---- Start");
        for(int i = 0; i < panels.length / 2; i++){
            System.out.println("| || |");
        }
        System.out.println("||||||  ---- Finish");
            
            
            while (player.lifes != 0 && numPanels != 0){
                
                System.out.println("Left or right l/r");
                guess = keyboard.next().charAt(0);
                if (guess == 'l' || guess == 'L'){
                    
                    if(panelNum == 0){
                        panelAdd = 0;
                    }
                    else{
                        panelAdd = 1;
                    }
                }
                else if (guess == 'r' || guess == 'R'){
                    if(panelNum == 0){
                        panelAdd = 1;
                    }
                    else{
                        panelAdd = 2;
                    }
                }
                
                if(panels[panelNum + panelAdd] == 1){
                    glass = 0;
                    panelNum = panelNum + panelAdd;
                    counter += 1;
                    System.out.println("Correct!");
                    numPanels -= 1;
                    if(panelNum % 2 == 0){
                        panelNum += 1;
                    }
                    
                    System.out.println("||||||  ---- Start");
                    for(int i = 0; i <= panelNum; i += 2){
                        System.out.println("|" + panels[i] + "||" + panels[i + 1] + "|");
                        if (i == panels.length - 1){
                            glass = -1;
                        }
                    }
                    
                        for(int i = panelNum + 2; i < panels.length; i += 2){
                        System.out.println("| || |");
                        
                        }
                        System.out.println("||||||  ---- Finish");
                }
                else if(panels[panelNum] == 0 || player.lifes != 0){
                    glass = 0;
                    System.out.println("Incorrect");
                    player.lifes -= 1;
                }
                
           
            }
            
        
        if(player.lifes == 0){
            System.out.println("YOU LOSE");
        }
        else{
            System.out.println("YOU WIN CONGRATULATIONS");
        }
    }
}

