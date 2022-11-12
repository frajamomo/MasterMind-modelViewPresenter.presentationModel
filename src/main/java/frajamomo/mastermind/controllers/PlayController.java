package frajamomo.mastermind.controllers;

import frajamomo.mastermind.models.Game;
import frajamomo.mastermind.models.ProposedCombination;
import frajamomo.mastermind.models.Result;
import frajamomo.mastermind.models.SecretCombination;

public class PlayController extends Controller{
    public PlayController(Game game) {
        super(game);
    }

    public int getAttemps(){
        return this.game.getAttempts();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
    }

    public Result getResult(int position) {
        return this.game.getResult(position);
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public SecretCombination getSecretCombination() {
        return this.game.getSecretCombination();
    }
}