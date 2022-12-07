package principles.lsp.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hugo Gois
 */

/*
 As you can see, using inheritance, in this case, wasn't a good idea. This code will throw an exception that we
 defined in the playRandomAd() method causing our app to crash.

 So, the Liskov Substitution principle, forces us to think twice before using inheritance within our classes. It also says
 that our classes shouldn't be extended only based on the fact that they share something in common.
 */

public class VideoRunner {

    public static void main(String[] args){

        List<Video> videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new PremiumVideo());

        videos.forEach(video -> {
            try {
                video.playRandomAd();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}
