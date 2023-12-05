package ru.dolbak.blackjack;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class Deck{
    static int pointer = 0;
    static Card[] cards = new Card[52];
    Rate[] rates = {Rate.TWO, Rate.THREE, Rate.FOUR, Rate.FIVE, Rate.SIX, Rate.SEVEN, Rate.EIGHT, Rate.NINE, Rate.TEN, Rate.JACK, Rate.QUEEN, Rate.KING, Rate.ACE};
    Suit[] suits = {Suit.Diamonds, Suit.Hearts, Suit.Spades, Suit.Clubs};
    static Card[] currentCards = new Card[52];
    public Deck() {
        for ( int i = 0; i < rates.length; i++){
            for ( int j = 0; j < suits.length; j++){
                cards[i * 4 + j] = new Card(rates[i], suits[j]);
            }
        }
        for (int i = 0; i < cards.length; i++) {
            Random rnd = new Random();
            int randomIndex = Math.abs(rnd.nextInt()) % (cards.length - 1);
            currentCards[i] = cards[randomIndex];
            cards[randomIndex] = cards[cards.length - i - 1];
        }
    }
    public static Card take(){
        pointer++;
        return currentCards[pointer - 1];
    }
    public static int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}

enum Suit{
    Diamonds,
    Hearts,
    Spades,
    Clubs
}

enum Rate{
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(1);
    private final int points;
    private Rate(int points){
        this.points = points;
    }
    public int getPoints(){
        return this.points;
    }
}

class Card{
    Rate rate;
    Suit suit;
    int points = 0;
    public Card(Rate rate, Suit suit){
        this.rate = rate;
        this.suit = suit;
    }

    //TODO: в points записать очки карты
}

class Game{
    //TODO переменные для очков игрока и крупье
    //методы для взятия карты игроком и крупье
    //метод для вывода очков игрока и крупье
    //метод для вывода карт игрока и крупье
    //определить, кто победил
}

