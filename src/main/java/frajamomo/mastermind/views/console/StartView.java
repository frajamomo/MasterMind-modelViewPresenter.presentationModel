package frajamomo.mastermind.views.console;

import frajamomo.mastermind.controllers.StartController;

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

