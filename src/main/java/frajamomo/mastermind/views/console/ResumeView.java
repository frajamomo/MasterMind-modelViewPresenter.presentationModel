package frajamomo.mastermind.views.console;

import frajamomo.mastermind.controllers.ResumeController;
import frajamomo.utils.YesNoDialog;

class ResumeView {

    private ResumeController resumeController;

    ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    boolean interact() {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.resumeController.clear();
        }
        return newGame;
    }

}
