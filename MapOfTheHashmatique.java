import java.util.HashMap;
import java.util.Set;
public class MapOfTheHashmatique{

    public static void SongList(){
    HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Wagon Driver", "I was in my wagon...driving driving driving driving");
        songMap.put("Playground", "Walking thru the park, kids very far, on the playground");
        songMap.put("Sky Is Blue", "Clouds, planes, and birds, all when the sky is blue");
        songMap.put("Credit", "Build your credit, or you'll end up like us...oooohhhh");
        
        String hitSingle = songMap.get("Playground");
        System.out.println("This is our Hit Single: "+hitSingle);

        Set<String> songs = songMap.keySet();
        for(String key : songs) {
            System.out.println(key+" : "+songMap.get(key));    
        }
    }
}
