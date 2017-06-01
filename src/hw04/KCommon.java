package hw04;

import java.util.*;
import java.util.stream.Collectors;


public class KCommon {
	private SortedMap<String, Integer> pageToVisits;

	public KCommon(SortedMap<String, Integer> map) {
		pageToVisits = map;
	}

	class Entry{
		int timestamp;
		String page;

		public Entry(int timestamp, String page) {
			this.timestamp = timestamp;
			this.page = page;
		}
	}

	public void add(Entry p) {
		// extract relevant information from p and store it in the mapUsedAsBuildingBlock
		Integer originalAmount = pageToVisits.get(p.page);
		if (originalAmount == null) {
			pageToVisits.put(p.page, 1);
		} else {
			pageToVisits.put(p.page, ++originalAmount);
		}
	}

//	JK this doesn't work. forgot the map is ordered by Page Names instead of value
//	public List<String> commonBST(int k) {
//		List<String> top3 = new LinkedList<>();
//		for (int i = 0; i < 3; i++) {
//			top3.add(pageToVisits.max()); // log n
//			pageToVisits.remove(pageToVisits.max()); // log n
//		}
//		return top3;
//	}

public List<String> commonHash(int k) {
	// a priority queue for the top 3 entries, stored in ascending order
	PriorityQueue<Map.Entry<Integer, String>> top3 = new PriorityQueue<>(Map.Entry.comparingByKey());

	// must iterate through every entry. takes O(n) time
	for (Map.Entry<String, Integer> e : pageToVisits.entrySet()) {
		int minOfTop3 = top3.peek().getKey(); // get the "minimum" of the top 3
		if (e.getValue() > minOfTop3) {
			// replace the top 3 value
			top3.remove(minOfTop3);
			top3.add(new AbstractMap.SimpleEntry<Integer,String>(e.getValue(), e.getKey()));
		}
	}

	return top3.stream().map(Map.Entry::getValue).collect(Collectors.toList());
}
}
