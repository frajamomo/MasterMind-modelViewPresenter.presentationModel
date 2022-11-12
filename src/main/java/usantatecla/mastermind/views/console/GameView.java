package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Controller;

class GameView {
    private Controller controller;

    GameView(Controller controller) {
        this.controller = controller;
    }

    void write() {
        Message.TITLE.writeln();
        for (int i = 0; i < this.controller.getAttempts(); i++) {
            new ProposedCombinationView(this.controller.getProposedCombination(i)).write();
        }
    }
}
