class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }

            else {
                if (bills[i] == 10) {
                    if (five > 0) {
                        five--;
                        ten++;
                    }

                    else {
                        return false;
                    }
                }

                if (bills[i] == 20) {
                    if (ten > 0 && five > 0) {
                        ten--;
                        five--;
                    }

                    else if (five >= 3) {
                        five = five - 3;

                    }

                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna