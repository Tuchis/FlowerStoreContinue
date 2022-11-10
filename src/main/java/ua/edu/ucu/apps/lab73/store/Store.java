package ua.edu.ucu.apps.lab73.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    /**
     * Store class.
     */
    private List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    /**
     * Store init.
     */
    public Store() {
    }

    /**
     * Add.
     *
     * @param flowerBucket
     */
    public void add(final FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    /**
     * Search function.
     *
     * @param flowerSpec
     * @return boolean
     */
    public boolean search(final FlowerSpec flowerSpec) {
        for (FlowerBucket flowerBucket : flowerBuckets) {
            if (flowerBucket.isDesirable(flowerSpec)) {
                return true;
            }
        }
        return false;
    }
}
