
package wordfrequency;

/**
 *
 * @author Mohamad Hammoud
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class WordFrequency {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
       
      
      String line;

try (
    InputStream fis = new FileInputStream("words.txt");
    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
    BufferedReader br = new BufferedReader(isr);
) {
    while ((line = br.readLine()) != null) {
         String[] words = line.split(" ");
           for (int i = 0; i < words.length; i++) {
                   if (hmap.get(words[i]) == null) {
                        hmap.put(words[i], 1);
                    } else {
                        int frequency = Integer.valueOf(String.valueOf(hmap.get(words[i])));
                        frequency++;
                        hmap.put(words[i], frequency);
    }
    
    }
  
    
    
    
}
          Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("Word is: "+ mentry.getKey() + " & Frequency is: ");
         System.out.println(mentry.getValue());
      }
        
    }
    
}
}