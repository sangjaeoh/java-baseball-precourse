package baseball;

public class Umpires {

    private Rule rule;

    public Umpires(Rule rule) {
        this.rule = rule;
    }

    private void shout(final int ball, final int strike) {
        StringBuffer voices = new StringBuffer();
        if (nothing(ball, strike)) {
            voices.append(Call.NOTHING.voice);
        }
        if (hasBall(ball)) {
            voices.append(ball + Call.BALL.voice + " ");
        }
        if (hasStrike(strike)) {
            voices.append(strike + Call.STRIKE.voice);
        }
        System.out.println(voices.toString().trim());
    }

    private boolean nothing(final int ball, final int strike) {
        return ball == 0 && strike == 0;
    }

    private boolean hasBall(final int ball) {
        return ball > 0;
    }

    private boolean hasStrike(final int strike) {
        return strike > 0;
    }


    enum Call {
        NOTHING("낫싱"),
        BALL("볼"),
        STRIKE("스트라이크");

        Call(String voice) {
            this.voice = voice;
        }

        private String voice;
    }

}