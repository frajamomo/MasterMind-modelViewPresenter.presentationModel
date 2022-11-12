package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

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
