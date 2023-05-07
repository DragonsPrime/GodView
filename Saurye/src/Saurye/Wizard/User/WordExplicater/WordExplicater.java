package Saurye.Wizard.User.WordExplicater;

import Pinecone.Framework.Util.Summer.ArchConnection;
import Pinecone.Framework.Util.Summer.prototype.Wizard;
import Saurye.System.PredatorGenieBottle;

public class WordExplicater extends PredatorGenieBottle implements Wizard {
    public WordExplicater( ArchConnection connection ){
        super(connection);
    }

    public String prototypeName(){
        return this.getClass().getSuperclass().getSimpleName();
    }

}