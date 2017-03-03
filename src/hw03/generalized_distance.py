def distance(SortedSet... sets):
    # the minimum distance
    min_distance = infinity
    # loop while each set still has elements
    while not(set.isEmpty() for set in sets):
        # get all the first elements from each set, and store as a SortedSet
        first_elements = SortedSet(set.first() for set in sets)
        # determine the max of all the first elements, which is last - first
        current_distance = first_elements.last() - first_elements.first()
        # update the recorded distance if necessary
        if current_distance < min_distance:
            min_distance = current_distance
        # the set which will be farthest, temporarily null
        set_with_furthest_value = None
        # the "farthest" value will be at either the smallest or largest end
        # remember the set corresponding to the farthest value
        if distance - first_elements.first()
            > distance - first_elements.last():
            set_with_furthest_value = sets.get(first_elements.first())
        else:
            set_with_furthest_value = sets.get(first_elements.last())
        # remove aforementioned "farthest" value from that set
        set_with_furthest_value.first().remove()