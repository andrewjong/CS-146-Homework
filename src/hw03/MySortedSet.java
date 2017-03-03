package hw03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * Created by andrew on 2/23/17.
 */
public class MySortedSet implements SortedSet {
	ArrayList<Integer> integers = new ArrayList<>();

	MySortedSet(int... ints) {
		for (int i : ints) {
			integers.add(i);
		}
	}

	@Override
	public Comparable first() {
		return integers.get(0);
	}

	@Override
	public Comparable last() {
		return integers.get(integers.size() - 1);
	}

	@Override
	public Comparable floor(Comparable comparable) {
		return integers.get(integers.indexOf(comparable) - 1);
	}

	@Override
	public Comparable ceiling(Comparable comparable) {
		return integers.get(integers.indexOf(comparable) + 1);
	}

	@Override
	public boolean contains(Comparable comparable) {
		return integers.contains(comparable);
	}

	@Override
	public boolean isEmpty() {
		return integers.size() == 0;
	}

	@Override
	public int size() {
		return integers.size();
	}

	@Override
	public boolean add(Comparable comparable) {
		return integers.add((Integer) comparable);
	}

	@Override
	public boolean remove(Comparable comparable) {
		return integers.remove(comparable);
	}
}
