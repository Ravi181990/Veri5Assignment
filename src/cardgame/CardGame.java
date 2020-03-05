package cardgame;

import java.util.Scanner;

public class CardGame {
	
	public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        System.out.println("UnShuffeled Cards.");
        deck.showCards();
        deck.ShuffleCards();
        System.out.println("Shuffeled Cards.");
        deck.showCards();

        Scanner input = new Scanner(System.in);
        System.out.println("Player One...\nEnter Name:");
        Players player1 = new Players(input.nextLine());
        System.out.println("Player Two...\nEnter Name:");
        Players player2 = new Players(input.nextLine());
        System.out.println("Player Three...\nEnter Name:");
        Players player3 = new Players(input.nextLine());
        System.out.println("Player Four...\nEnter Name:");
        Players player4 = new Players(input.nextLine());

        deck.dealCards(player1, player2, player3, player4);
        System.out.println("---------------------------------------------");
        System.out.println(player1.getName());
        player1.ShowPlayerCards();
        System.out.println(player2.getName());
        player2.ShowPlayerCards();
        System.out.println(player3.getName());
        player3.ShowPlayerCards();
        System.out.println(player4.getName());
        player4.ShowPlayerCards();
    }

}
