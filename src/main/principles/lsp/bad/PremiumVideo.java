package src.main.principles.lsp.bad;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Hugo Gois
 */

/*
  Let's say that now we will also have a premium video type, which allows to play the videos without being
  affected by advertisement. As the PremiumVideo class has the same attributes from its parent class (Video),
  we are going to use inheritance to extend these attributes and also their methods (Now, go to VideoRunner class).
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PremiumVideo extends Video{

    private int premiumId;

    @Override
    public void playRandomAd() throws Exception {
        throw new Exception("Premium videos don't execute ads!");
    }

}
