package usantatecla.mastermind;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {

    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;

    private View view;

    protected Mastermind() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(this.startController, this.playController, this.resumeController);
    }

    protected abstract View createView(StartController startController, PlayController playController, ResumeController resumeController);

    protected void play(){
        this.view.interact();
    }
}
