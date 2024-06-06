class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        //frequency of each card.
        Map<Integer, Integer> cardCount = new HashMap<>();
        for (int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }
        Arrays.sort(hand);
        for (int card : hand) {
            if (cardCount.get(card) == 0) continue;
            for (int i = 0; i < groupSize; i++) {
                int currentCard = card + i;
                if (cardCount.getOrDefault(currentCard, 0) == 0) {
                    return false; // Invalid frp
                }
                //freq of card-- as its used
                cardCount.put(currentCard, cardCount.get(currentCard) - 1);
            }
        }

        return true;
    }
}