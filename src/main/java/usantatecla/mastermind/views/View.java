package usantatecla.mastermind.views;

public abstract class View {

    public void interact() {
        do {
            this.start();
            boolean finished;
            do {
                finished = this.play();
            } while (!finished);
        } while (this.isNewGame());
    }

    protected abstract void start();
    protected abstract boolean play();
    protected abstract boolean isNewGame();

}
