import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); // Sort folders lexicographically
        List<String> result = new ArrayList<>();
        
        String prev = ""; // To keep track of the last added folder
        for (String f : folder) {
            // If the current folder is not a subfolder of the previous folder, add it
            if (prev.isEmpty() || !f.startsWith(prev + "/")) {
                result.add(f);
                prev = f; // Update prev to the latest added folder
            }
        }
        
        return result;
    }
}
