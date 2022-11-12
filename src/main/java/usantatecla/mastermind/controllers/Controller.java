package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.SecretCombination;

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
