package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.StartController;

public class StartView {

    private StartController startController;

    StartView(StartController startController){
        this.startController = startController;
    }

    void interact() {
        new SecretCombinationView().writeln();
        new GameView(startController).write();
    }
}

