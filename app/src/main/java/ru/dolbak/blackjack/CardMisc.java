package ru.dolbak.blackjack;

public class CardMisc {

    static int[] clubs = {R.drawable.ace_of_clubs, R.drawable.two_of_clubs, R.drawable.three_of_clubs,
            R.drawable.four_of_clubs, R.drawable.five_of_clubs, R.drawable.six_of_clubs,
            R.drawable.seven_of_clubs, R.drawable.eight_of_clubs, R.drawable.nine_of_clubs,
            R.drawable.ten_of_clubs, R.drawable.jack_of_clubs, R.drawable.queen_of_clubs, R.drawable.king_of_clubs};
    static int[] diamonds = {R.drawable.ace_of_diamonds, R.drawable.two_of_diamonds, R.drawable.three_of_diamonds,
            R.drawable.four_of_diamonds, R.drawable.five_of_diamonds, R.drawable.six_of_diamonds,
            R.drawable.seven_of_diamonds, R.drawable.eight_of_diamonds, R.drawable.nine_of_diamonds,
            R.drawable.ten_of_diamonds, R.drawable.jack_of_diamonds, R.drawable.queen_of_diamonds, R.drawable.king_of_diamonds};
    static int[] spades = {R.drawable.ace_of_spades, R.drawable.two_of_spades, R.drawable.three_of_spades,
            R.drawable.four_of_spades, R.drawable.five_of_spades, R.drawable.six_of_spades,
            R.drawable.seven_of_spades, R.drawable.eight_of_spades, R.drawable.nine_of_spades,
            R.drawable.ten_of_spades, R.drawable.jack_of_spades, R.drawable.queen_of_spades, R.drawable.king_of_spades};
    static int[] hearts = {R.drawable.ace_of_hearts, R.drawable.two_of_hearts, R.drawable.three_of_hearts,
            R.drawable.four_of_hearts, R.drawable.five_of_hearts, R.drawable.six_of_hearts,
            R.drawable.seven_of_hearts, R.drawable.eight_of_hearts, R.drawable.nine_of_hearts,
            R.drawable.ten_of_hearts, R.drawable.jack_of_hearts, R.drawable.queen_of_hearts, R.drawable.king_of_hearts};



    static int CardToImageID(Card card){
        int[] cardArray = new int[10];
        switch (card.suit){
            case Clubs:
                cardArray = CardMisc.clubs;
                break;
            case Diamonds:
                cardArray = CardMisc.diamonds;
                break;
            case Spades:
                cardArray = CardMisc.spades;
                break;
            case Hearts:
                cardArray = CardMisc.hearts;
                break;
        }
        switch (card.rate){
            case ACE:
                return cardArray[0];
            case TWO:
                return cardArray[1];
            case THREE:
                return cardArray[2];
            case FOUR:
                return cardArray[3];
            case FIVE:
                return cardArray[4];
            case SIX:
                return cardArray[5];
            case SEVEN:
                return cardArray[6];
            case EIGHT:
                return cardArray[7];
            case NINE:
                return cardArray[8];
            case TEN:
                return cardArray[9];
            case JACK:
                return cardArray[10];
            case QUEEN:
                return cardArray[11];
            case KING:
                return cardArray[12];
            default:
                return 0;
        }
    }
}
