package frajamomo.mastermind.controllers;

import frajamomo.mastermind.models.Game;
import frajamomo.mastermind.models.ProposedCombination;
import frajamomo.mastermind.models.SecretCombination;

public abstract class Controller {
    
    protected Game game;

    Controller(Game game){
        this.game = game;
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.game.getProposedCombination(position);
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }
    
    public SecretCombination getSecretCombination(){
        return this.game.getSecretCombination();
    }
}
