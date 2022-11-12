package usantatecla.mastermind;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind{

    @Override
    protected View createView(StartController startController, PlayController playController, ResumeController resumeController){
        return new View(startController, playController, resumeController);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
