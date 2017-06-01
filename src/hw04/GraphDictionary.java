package hw04;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 3/5/17.
 */
public class GraphDictionary {
	public void dictionaryRepresentation() {
		HashMap<Integer, List<Integer>> vertexToNeighbor = new HashMap<>();
		vertexToNeighbor.put(1, new ArrayList<Integer>() {{
			add(2);
			add(3);
		}});
		vertexToNeighbor.put(2, new ArrayList<Integer>() {{
			add(1);
		}});
		vertexToNeighbor.put(3, new ArrayList<Integer>() {
			{
				add(2);
				add(4);
			}
		});
		vertexToNeighbor.put(4, new ArrayList<Integer>() {{
			add(1);
			add(3);
		}});
	}

}
