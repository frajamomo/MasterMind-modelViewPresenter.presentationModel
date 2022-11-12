package frajamomo.mastermind;

import frajamomo.mastermind.controllers.PlayController;
import frajamomo.mastermind.controllers.ResumeController;
import frajamomo.mastermind.controllers.StartController;
import frajamomo.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind{

    @Override
    protected View createView(StartController startController, PlayController playController, ResumeController resumeController){
        return new View(startController, playController, resumeController);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
