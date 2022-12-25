package ua.edu.ucu.apps.lab73.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FlowerSpec {
    /**
     * FlowerSpec.
     */
    private int amount;
    /**
     * FlowerColor.
     */
    private String color;
    /**
     * FlowersTypes.
     */
    private List<String> flowersTypes = new ArrayList<String>();

    /**
     * GetColor.
     *
     * @return String
     */
    public String getColor() {
        return this.color;
    }

    /**
     * FlowerSpec init.
     *
     * @param amounter
     * @param colorer
     * @param flowersTypeser
     */
    public FlowerSpec(final int amounter, final String colorer,
                      final List<String> flowersTypeser) {
        this.amount = amounter;
        this.color = colorer;
        this.flowersTypes = flowersTypeser;
    }
}
