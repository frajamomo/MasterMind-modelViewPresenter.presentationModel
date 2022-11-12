package frajamomo.mastermind.views.console;

import frajamomo.mastermind.controllers.PlayController;
import frajamomo.mastermind.controllers.ResumeController;
import frajamomo.mastermind.controllers.StartController;

public class View extends frajamomo.mastermind.views.View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(StartController startController, PlayController playController, ResumeController resumeController){
        this.startView = new StartView(startController);
        this.playView = new PlayView(playController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    protected void start(){
        this.startView.interact();
    }

    @Override
    protected boolean play(){
        return this.playView.interact();
    }

    @Override
    protected boolean isNewGame(){
        return this.resumeView.interact();
    }

}
