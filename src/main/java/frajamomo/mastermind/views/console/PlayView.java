package frajamomo.mastermind.views.console;

import frajamomo.mastermind.controllers.PlayController;
import frajamomo.mastermind.models.ProposedCombination;

class PlayView {

    private PlayController playController;

    PlayView(PlayController playController){
        this.playController = playController;
    }

    boolean interact() {
        
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        
        this.playController.addProposedCombination(proposedCombination);
        
        Message.SEPARATOR.writeln();		
        Message.ATTEMPTS.writeln(this.playController.getAttempts());		
        for (int i = 0; i < this.playController.getAttempts(); i++) {
            new ProposedCombinationView(this.playController.getProposedCombination(i)).write();
            new ResultView(this.playController.getResult(i)).writeln();
        }

        new SecretCombinationView().writeln();

        if (this.playController.isWinner()) {
            Message.WINNER.writeln();
            return true;
        } else if (this.playController.isLooser()) {
            Message.LOOSER.writeln();
            return true;
        }
        return false;
    }
}
