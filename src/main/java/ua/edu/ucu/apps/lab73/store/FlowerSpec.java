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
    private FlowerColor color;
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
        return color.getColor();
    }

    /**
     * FlowerSpec init.
     *
     * @param amounter
     * @param colorer
     * @param flowersTypeser
     */
    public FlowerSpec(final int amounter, final FlowerColor colorer,
                      final List<String> flowersTypeser) {
        this.amount = amounter;
        this.color = colorer;
        this.flowersTypes = flowersTypeser;
    }
}
